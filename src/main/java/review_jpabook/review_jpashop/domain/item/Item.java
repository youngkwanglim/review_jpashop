package review_jpabook.review_jpashop.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import review_jpabook.review_jpashop.domain.Category;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private String price;
    private String stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> caregories = new ArrayList<>();

}
