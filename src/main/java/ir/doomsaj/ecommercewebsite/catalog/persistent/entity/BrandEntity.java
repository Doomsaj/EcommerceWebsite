package ir.doomsaj.ecommercewebsite.catalog.persistent.entity;

import ir.doomsaj.starter.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "brands")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BrandEntity extends BaseEntity {
    private String title;
    private String slug;
    private String description;
    @OneToMany
    private Set<ProductEntity> products;
}
