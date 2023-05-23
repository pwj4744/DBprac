package com.example.fastcampusmysql.domain.member.service;

import com.example.fastcampusmysql.domain.member.dto.RegisterMemberCommand;
import com.example.fastcampusmysql.domain.member.entity.Member;
import com.example.fastcampusmysql.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberWriteService {
    final private MemberRepository memberRepository;

    public Member create(RegisterMemberCommand command) {
        /*
               1. (sudo 코드) 목표 - 회원정보(이메일, 닉네임, 생년월일)을 등록한다.
               파라미터 - memberRegisterCommand


               memberRepository.save()
         */

        var member = Member.builder()
                .nickname(command.nickname())
                .email(command.email())
                .birthday(command.birthdate())
                .build();
        return memberRepository.save(member);

    }
}
