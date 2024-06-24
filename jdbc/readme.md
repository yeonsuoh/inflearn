* H2 데이터베이스 설정하기
  * 사용자명 : sa
  * JDBC URL : jdbc:h2:~/test (최초 한번)
  * ~/test.mv.db 파일 생성 확인
  * 이후부터는 jdbc:h2:tcp://localhost/~/test 이렇게 접속


* H2 데이터베이스에서 테이블 생성하기

```sql
drop table member if exists cascade;
create table member (
                        member_id varchar(10),
                        money integer not null default 0,
                        primary key (member_id)
);

insert into member(member_id, money) values ('hi1',10000);
insert into member(member_id, money) values ('hi2',20000);
```

---
### JDBC 이해
클라이언트가 애플리케이션 서버를 통해 데이터를 저장하거나 조회하면, 
애플리케이션 서버는 다음 과정을 통해서 데이터 베이스를 사용한다.
1. 커넥션 연결 : 주로 TCP/IP를 사용해서 커넥션을 연결한다.
2. SQL 전달 : 애플리케이션 서버는 DB가 이해할 수 있는 SQL을 연결된 커넥션을 통해 DB에 전달한다.
3. 결과 응답: DB는 전달된 SQL을 수행하고 그 결과를 응답한다. 애플리케이션 서버는 응답 결과를 활용한다.

**JDBC 표준 인터페이스**
대표적으로 다음 3가지 기능을 표준 인터페이스로 정의해서 제공한다.
* java.sql.Connection - 연결
* java.sql.Statement - SQL을 담은 내용
* java.sql.ResultSet - SQL 요청 응답  

자바는 이렇게 표준 인터페이스를 정의해두었다. 
이 JDBC 인터페이스를 각각의 DB 벤더(회사)에서 자신의 DB에 맞도록
구현해서 라이브러리로 제공하는데, 이것을 JDBC 드라이버라 한다. 
---
### JDBC와 최신 데이터 접근 기술

**SQL Mapper**
* 장점: JDBC를 편리하게 사용하도록 도와준다.
  * SQL 응답 결과를 객체로 편리하게 변환해준다.
  * JDBC의 반복 코드를 제거해 준다.
* 단점 : 개발자가 SQL을 직접 작성해야 한다.
* 대표 기술: 스프링 JdbcTemplate, MyBatis

**ORM 기술**
* ORM은 객체를 관걔형 데이터베이스 테이블과 매핑해주는 기술이다.
* 이 기술 덕분에 개발자는 반복적인 SQL을 직접 작성하지 않고, ORM 기술이 개발자 대신에 SQL을 동적으로 만들어 실행해준다.
* 추가로 각각의 데이터베이스마다 다른 SQL을 사용하는 문제도 중간에서 해결해준다.
* 대표 기술: JPA, 하이버네이트, 이클립스링크

**SQL Mapper vs ORM 기술**
* SQL Mapper는 SQL만 작성할 줄 알면 나머지 번거로운 일은 SQL Mapper가 대신 해결해준다.
* ORM은 개발 생산성이 매우 높아지지만 러닝 커브가 있다. 
