package com.side_project.daily_assistant.service;

import com.side_project.daily_assistant.adapter.in.MemberAdapter;
import com.side_project.daily_assistant.application.port.in.RegisterMemberUseCase;
import com.side_project.daily_assistant.application.port.out.RegisterMemberPort;
import com.side_project.daily_assistant.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService implements RegisterMemberUseCase {

    private final RegisterMemberPort registerMemberPort;

    @Override
    public Member registerMember(MemberAdapter.RegisterMember registerMember) {
        return registerMemberPort.registerMember(registerMember);
    }

    //    private final MemberRepository memberRepository;
////    private final PasswordEncoder passwordEncoder;
//
//    @Transactional
//    public MemberResDto signup(MemberReqDto memberReqDto) {
//
////        memberReqDto.setEncodePwd(passwordEncoder.encode(memberReqDto.getPassword()));
//
//        Member member = Member.builder()
//                .userId(memberReqDto.getUserId())
//                .password(memberReqDto.getPassword())
//                .build();
//
//        memberRepository.save(member);
//        return new MemberResDto("Success signup", HttpStatus.OK.value());
//
//    }
//
//    public MemberResDto login(LoginReqDto loginReqDto) {
//
//        Optional<Member> byUserId = memberRepository.findByUserId(loginReqDto.getUserId());
//
//        // 암호화된 비밀번호와 같은지 체크하는 로직이 있어야함
//
//        return new MemberResDto("Success Login", HttpStatus.OK.value());
//    }
}
