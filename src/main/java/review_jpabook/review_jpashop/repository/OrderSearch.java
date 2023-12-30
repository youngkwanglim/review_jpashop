package review_jpabook.review_jpashop.repository;

import lombok.Getter;
import lombok.Setter;
import review_jpabook.review_jpashop.domain.OrderStatus;

@Getter
@Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;
}
