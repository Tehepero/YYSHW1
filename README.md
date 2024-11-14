# [Spring 7기] CH 3 일정 관리 앱 Develop 

------

실제 과제는 해당 과제이나 본인의 실력부족 및 이해도 부족으로


전 5주차 강의의 실습과정을 복기 및 코드를 작성하였습니다


또한 검색을 통하여 README 의 글 작성 및 수정을 인텔리제이에서
해보았습니다



------

- 설계 순서
  - ( HTTP Method )
      - POST : CREATE
      - GET : READ
      - PUT, PATCH : UPDATE
      - DELETE : DELETE

-----
- 메모 생성
    - POST
    - /memos
- 메모 단건 조회
    - GET
    - /memos/{id}
- 메모 수정(전체)
    - PUT
    - /memos/{id}
- 메모 삭제
    - DELETE
    - /memos/{id}
-----
 
마치며

- 궁금한 점  
  - (프로젝트 생성 후 깃허브와 연동, 커밋과 푸쉬 후에 나중에 GITHUB에서 README를 생성 한 후에 PULL로 댕겨와서 READEME를
  인텔리제이에서 수정하는 방법을 사용하였는대 이게 맞는지....)
  
  - Github에 새로운 레포지토리를 만들었는대 연동 후 확인해보니 브렌치가 main이랑 master 브렌치로 나뉘어져 있었습니다.
    (해결을 위해 프로젝트 삭제 및 깃 허브 레포지토리도 삭제하고 재생성 해보았으나 상황은 똑같았습니다. 이유가 있는지 해결이 가능한건인지)

- 좋았던 점
  - 튜터님께서는 Post man은 일종의 테스트라고 말씀해주셨는대 이제야 약간 이해가 가는듯 합니다. 정확한 역활과 사용법을 알지 못하여 매번 강의 때마다
    궁금하였는대 이제 어느정도 느낌을 알 수 있는것 같습니다
  
- 부족한 점
  - API 명세 + ERD 등은 아직도 개념이 정확하게 잡혀있지 않고 아직도 나올때마다 헷갈리기에 더 공부가 필요하다고 생각합니다.
  - 또한 아직 Database랑 Gradle쪽도 이해가 전무하여 복습과 실습, 또 관련한 질문이 많이 필요하다고 생각했습니다
