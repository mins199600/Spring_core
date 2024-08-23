package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L,"memberA",Grade.VIP);
        //이 멤버 서비스가 회원가입에 주어졌을때

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
