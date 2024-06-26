package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DBConnectionUtilTest {

    @Test
    void connection() {
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
     // 실행 결과를 보면 class = class org.h2.jdbc.JdbcConnection 부분을 확인할 수 있다.
    // H2 데이터베이스가 제공하는 H2 전용 커넥션이다. JDBC 표준 인터페이스인 java.sql.Connection 인터페이스를 구현하고 있다.

}
