package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

public record RegisterMemberCommand(
        String email,
        String nickname,
        LocalDate birthdate
) { // 데이터 트랜스퍼 객체는 Record를 이용
    // 레코드를 선언하면 게터세터를 자동으로 만들어줌 , 그것을 프로퍼티 형식으로도 사용가능

}
