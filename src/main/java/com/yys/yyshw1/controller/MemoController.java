package com.yys.yyshw1.controller;

import com.yys.yyshw1.dto.MemoRequestDto;
import com.yys.yyshw1.dto.MemoResponseDto;
import com.yys.yyshw1.entity.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController //JSON 으로 받기위함
@RequestMapping("/memos") // url 임 배운대로
public class MemoController {

    private final Map<Long, Memo> memoList = new HashMap<>();
    // 왜 빨간줄이고 하니 임포트를 안했다 다시 하니까 빨간줄 해결완료

    // 생성이기 때문에 포스트매핑 어노테이션 사용
    @PostMapping
    public MemoResponseDto createMemo(@RequestBody MemoRequestDto dto) {

        // 식별자가 1씩 증가 하도록 만듦
        Long memoId = memoList.isEmpty() ? 1 : Collections.max(memoList.keySet()) + 1;
                // 키 값을 다 꺼내서 그 최댓값을 반환해 줌 근대 왜 빨간줄 해결완료
                // Key 에서 k를 대문자로 적었더니 빨간줄

        // 요청받은 데이터로 메모를 생성 (객체)
        Memo memo = new Memo(memoId, dto.getTitle(), dto.getContents());

        // 인메모리 데이터 베이스에 Memo 메모
        memoList.put(memoId, memo);

        return new MemoResponseDto(memo);
    }

    // 조회이기 때문에 get 매핑을 쓸거에요
    @GetMapping("/{id}")
    public MemoResponseDto findMemoById(@PathVariable Long id) {

        Memo memo = memoList.get(id);

        return new MemoResponseDto(memo);
        // 또 api 호출을 위해 post man으로 가서 테스트
        // 작동이 된다 정확하게 까진 모르겠지만 약간은 알거같기도?
    }

    //이번에도 메소드 생성 전체 수정을 할거기 때문에 풋매핑
    @PutMapping("/{id}")
    public MemoResponseDto updateMemoById(
            @PathVariable Long id,
            @RequestBody MemoRequestDto dto
    ) {
        Memo memo = memoList.get(id);

        memo.update(dto);

        return new MemoResponseDto(memo);
    }

    @DeleteMapping("/{id}")
    public void deleteMemo(@PathVariable Long id) {

        memoList.remove(id);

    }

}
