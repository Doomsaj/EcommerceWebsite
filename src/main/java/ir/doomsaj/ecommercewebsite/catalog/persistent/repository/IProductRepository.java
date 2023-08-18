package ir.doomsaj.ecommercewebsite.catalog.persistent.repository;

import ir.doomsaj.ecommercewebsite.catalog.persistent.entity.ProductEntity;
import ir.doomsaj.starter.repository.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends IBaseRepository<ProductEntity> {
}
