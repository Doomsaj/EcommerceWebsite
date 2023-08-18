package ir.doomsaj.ecommercewebsite.catalog.persistent.entity;

import ir.doomsaj.starter.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CommentEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    private String body;
    private boolean status = false;
}
