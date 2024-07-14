package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoryV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 트랜잭션 - 파라미터 연동, 풀을 고려한 종료
 */
@RequiredArgsConstructor
@Slf4j
public class MemberServiceV2 {

    private final DataSource dataSource;
    private final MemberRepositoryV2 memberRepository;

    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        Connection con = dataSource.getConnection();
        try {
            con.setAutoCommit(false); // 트랜잭션 시작
            // 비즈니스 로직
            bizLogic(con, fromId, toId, money);
            // 커밋
            con.commit(); // 성공시 커밋
        } catch (Exception e) {
            con.rollback(); // 실패시 롤백
            throw new IllegalStateException(e);
        } finally {
            release(con);
        }



    }

    private void bizLogic(Connection con, String fromId, String toId, int money) throws SQLException {
        Member fromMember = memberRepository.findById(con, fromId);
        Member toMember = memberRepository.findById(con, toId);

        memberRepository.update(con, fromId, fromMember.getMoney() - money);
        validation(toMember);
        memberRepository.update(con, toId, toMember.getMoney() + money);
    }

    private static void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }

    private static void release(Connection con) {
        if (con != null) {
            try {
                con.setAutoCommit(true); // 커넥션 풀 고려
                // 커넥션 풀을 사용하면 커넥션이 종료되는 것이 아니라 풀에 반납됨
                // 현재 수동 커밋 모드로 동작하기 때문에 돌려주기 전에 기본 값인 자동 커밋 모드로 변경하는 것이 안전함
                // (보통은 직접 하지 않고 프레임워크가 하지만 ... 이렇게 직접 사용할 때 주의해야)
                con.close();
            } catch (Exception e) {
                log.info("error", e);
            }
        }
    }
}
