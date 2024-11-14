package com.yys.yyshw1.dto;

import com.yys.yyshw1.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {

    private Long id;

    private String title;

    private String contents;
    // 이번엔 실제로 저장될 거기 때문에 id 포함 3개 다 가져옴

    public MemoResponseDto(Memo memo) {
        // 생성자가 없어서 만들어 줄거임
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }
}
