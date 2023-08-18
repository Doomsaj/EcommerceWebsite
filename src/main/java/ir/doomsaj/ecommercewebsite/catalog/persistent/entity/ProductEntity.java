package ir.doomsaj.ecommercewebsite.catalog.persistent.entity;

import ir.doomsaj.ecommercewebsite.catalog.persistent.types.ProductType;
import ir.doomsaj.starter.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductEntity extends BaseEntity {
    private String title;
    @Column(name = "title_en")
    private String titleEn;
    private String slug;
    private String description;
    @Column(name = "short_description")
    private String shortDescription;
    private String image;
    private Integer weight;
    @Enumerated(EnumType.STRING)
    private ProductType type;
    private boolean published;
    @ManyToMany(mappedBy = "products")
    private Set<CategoryEntity> categories;
    @OneToMany(mappedBy = "product")
    private Set<CommentEntity> comments;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @OneToMany(mappedBy = "product")
    private Set<ProductAttributeEntity> attributes;
}
