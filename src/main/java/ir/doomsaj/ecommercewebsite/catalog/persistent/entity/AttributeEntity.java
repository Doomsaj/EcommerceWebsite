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
@Table(name = "attributes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AttributeEntity extends BaseEntity {
    private String title;
    @ManyToOne
    @JoinColumn(name = "attribute_group_id")
    private AttributeGroupEntity attributeGroup;
}
