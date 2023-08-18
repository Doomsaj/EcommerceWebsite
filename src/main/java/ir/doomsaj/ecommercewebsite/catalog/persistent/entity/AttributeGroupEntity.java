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
@Table(name = "attribute_groups")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AttributeGroupEntity extends BaseEntity {
    private String title;
    @OneToMany
    private Set<AttributeEntity> attributes;
}
