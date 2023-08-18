package ir.doomsaj.ecommercewebsite.catalog.persistent.repository;

import ir.doomsaj.ecommercewebsite.catalog.persistent.entity.CategoryEntity;
import ir.doomsaj.starter.repository.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends IBaseRepository<CategoryEntity> {
}
