package hello.core.member;

public interface MemberService {
    // 요구사항1: 회원을 가입하고 조회할 수 있다.

    void join(Member member);

    Member findMember(Long memberId);
}
