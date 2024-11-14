package com.yys.yyshw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 현재 실력으로 만들수 있는게 많이 없어서
// 추천해주신 강의 5-9 실습을 통해 한번 더 작성해보았습니다..
// 5-9 실습은 Memo 클래스 설계입니다

// 1. 깃연동 실패 및 재시도중
// 커밋 및 푸쉬 성공 왜 main이랑 master로 나뉘었는지 모르겠다 2개가 되어버려서 헷갈리지만 일단 넘어가기로..
// 이번엔 post man도 어느정도 작동? 성공한것 같습니다
// 모든 코드를 정확히 이해한건 아니지만 테스트 결과가 알맞게 나왔던것 같습니다
// delete 후 500 error 까지 확인완료 하였습니다
// 서버가 종료된 후 다시 켜지면 모든 데이터가 초기화된다


@SpringBootApplication
public class Yyshw1Application {

    public static void main(String[] args) {
        SpringApplication.run(Yyshw1Application.class, args);
    }

}
