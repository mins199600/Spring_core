package hello.core.member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Primary
@Component
//컴포넌트 스캔으로 인해 빈 자동등록
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
