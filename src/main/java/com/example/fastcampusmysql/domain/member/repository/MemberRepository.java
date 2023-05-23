package com.example.fastcampusmysql.domain.member.repository;

import com.example.fastcampusmysql.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;


@RequiredArgsConstructor
@Repository
public class MemberRepository {

    final private NamedParameterJdbcTemplate jdbcTemplate;
    public Member save(Member member) {
        /*
                member id 를 보고 갱신 또는 삽입
                반환값은 id를 담아서 반환한다.
         */
        return member;
    }


    private Member insert(Member member) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate.getJdbcTemplate())
                .withSchemaName("Member")//이름설정
                .usingGeneratedKeyColumns("id");


    }

    private Member update(Member member) {

        return member;
    }
}
