package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //가입을 하고 회원 찾을때 쓰는 구현클래스

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
