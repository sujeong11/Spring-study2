package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 생성자를 통해 구현체를 지정해준다. -> 추상화에만 의존 (DIP을 지킴)
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
