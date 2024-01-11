package com.platzi_market.persistence.crud;

import com.platzi_market.persistence.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    List<ProductEntity> findByIdCategoryOrderByNameAsc(Integer idCategoria);
    Optional<List<ProductEntity>> findByStockLessThanAndState(Integer stock, Boolean state);
}
