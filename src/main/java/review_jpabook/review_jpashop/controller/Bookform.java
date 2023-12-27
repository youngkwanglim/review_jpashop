package review_jpabook.review_jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bookform {

    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;
}
