package hello.core.member;

import hello.core.AppConfig;
import org.junit.jupiter.api.BeforeEach;

class MemberServiceTest {

    MemberService memberService;
        Member member = new Member(1L,"memberA",Grade.VIP);
        //이 멤버 서비스가 회원가입에 주어졌을때

        @BeforeEach
        public void beforeEach() {
            AppConfig appConfig = new AppConfig();
            memberService = appConfig.memberService();

    }
}
