package ir.doomsaj.ecommercewebsite.catalog.persistent.repository;

import ir.doomsaj.ecommercewebsite.catalog.persistent.entity.CommentEntity;
import ir.doomsaj.starter.repository.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends IBaseRepository<CommentEntity> {
}
