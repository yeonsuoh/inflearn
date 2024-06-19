[실전! Querydsl 강의링크](https://www.inflearn.com/course/querydsl-%EC%8B%A4%EC%A0%84/dashboard)

### JPQL이 제공하는 모든 검색 조건
```java
member.username.eq("member1") // username = 'member1'
member.username.ne("member1") // username != 'member1'
member.username.eq("member1").not() // username != 'member1'

member.username.isNotNull() // 이름이 is not null

member.age.in(10, 20)
member.age.notIn(10, 20)
member.age.between(10, 20)

member.age.goe(30) // age >= 30
member.age.gt(30) // age > 30
member.age.loe(30) // age <= 30
member.age.lt(30) // age < 30

member.username.like("member%") // like 검색
member.username.contains("member") // like '%member%' 검색
member.username.startsWith("member") // like 'member%' 검색
```


---
## 결과 조회
* fetch(): 리스트 조회, 데이터 없으면 빈 리스트 반환
* fetchOne(): 단 건 조회
  * 결과가 없으면 : null
  * 결과가 둘 이상이면 : com.querydsl.core.NonUniqueResultException
* fetchFirst(): limit(1).fetchOne()
* fetchResults(): 페이징 정보 포함, total count 쿼리 추가 실행
* fetchCount(): count 쿼리로 변경해서 count 수 조회

---
## Querydsl Web 지원
**한계점**
* 단순한 조건만 가능
* 조건을 커믓텀하는 기능이 복잡하고 명시적이지 않음
* 컨트롤러가 Querydsl에 의존
* 복잡한 실무환경에서 사용하기에는 한계가 명확

---
## 리포지토리 지원 - QuerydslRepositorySupport
**장점**
* 스프링 데이터가 제공하는 페이징을 Querydsl로 변환 가능 (단 Sort는 오류 발생)
* EntityManager 제공

**단점**
* select로 시작할 수 없음
* QueryFactory를 제공하지 않음
* Sort 기능이 정상 동작하지 않음