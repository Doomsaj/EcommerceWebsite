package ir.doomsaj.ecommercewebsite.catalog.persistent.entity;

import ir.doomsaj.starter.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products_attributes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductAttributeEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private AttributeEntity attribute;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    private String value;
}
