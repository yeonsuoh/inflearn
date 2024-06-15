package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

    // 스프링 데이터 페이징 활용1 - Querydsl 페이징 연동
    // 스프링 데이터의 Page, Pageable을 활용해보자.
    // 전체 카운트를 한번에 조회하는 단순한 방법
    // 데이터 내용과 전체 카운터를 별도로 조회하는 방법

    // 사용자 정의 인터페이스에 페이징 2가지 추가
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
