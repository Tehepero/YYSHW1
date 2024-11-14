package com.yys.yyshw1.entity;


import com.yys.yyshw1.dto.MemoRequestDto;
import com.yys.yyshw1.dto.MemoResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memo {

    private Long id; // 애는 서버에서 관리하면 되서 아래 두개만 클라이언트로부터 전달받아야함
    private String title;
    private String contents;

    // 업데이트라는 메소드를 만들어서 사용할거임
    public void update(MemoRequestDto dto) {
        this.title = dto.getTitle();
        this.contents = dto.getContents();
    }
}
