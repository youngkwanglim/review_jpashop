package review_jpabook.review_jpashop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import review_jpabook.review_jpashop.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 함수명을 보고 sql문 자동으로 생성해줌
    List<Member> findByName(String name);
}
