[강의정보 :: 토비의 스프링 부트 - 이해와 원리](https://www.inflearn.com/course/%ED%86%A0%EB%B9%84-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%9D%B4%ED%95%B4%EC%99%80%EC%9B%90%EB%A6%AC/dashboard)

---
## HTTP
웹 Request와 Response의 기본 구조
### Request
* Request Line: Method, Path, HTTP Version 
* Headers 
* Message Body
### Response
* Status Line: HTTP Version, Status Code, Status Text 
* Headers 
* Message Body

---

### 매핑과 바인딩
* 매핑 : 프론트 컨트롤러가 HTTP 요청을 처리할 핸들러를 결정하고 연동하는 작업
* 바인딩 : 핸들러에게 웹 요청 정보를 추출하고 의미있는 오브젝트에 담아서 전달하는 작업
> 매핑과 바인딩은 세밀한 규칙을 부여하면 매번 코드를 작성하지 않고도 공통 코드를 이용해서 이를 처리할 수 있도록 만들 수 있다. 