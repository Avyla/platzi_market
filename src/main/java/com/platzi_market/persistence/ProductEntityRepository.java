package com.platzi_market.persistence;

import com.platzi_market.domain.ProductModel;
import com.platzi_market.domain.repository.ProductModelRepository;
import com.platzi_market.persistence.crud.ProductCrudRepository;
import com.platzi_market.persistence.entities.ProductEntity;
import com.platzi_market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ProductEntityRepository implements ProductModelRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductModel> getAll() {
        List<ProductEntity> productsEntities = (List<ProductEntity>) productCrudRepository.findAll();
        return productMapper.toProducts(productsEntities);
    }

    @Override
    public Optional<List<ProductModel>> getByCategory(Integer categoryId) {
        List<ProductEntity> productsEntities = productCrudRepository.findByIdCategoryOrderByNameAsc(categoryId);
        return Optional.of(productMapper.toProducts(productsEntities));
    }

    @Override
    public Optional<List<ProductModel>> getScarseProducts(Integer quantity) {
        Optional<List<ProductEntity>> productsEntities = productCrudRepository.findByStockLessThanAndState(quantity, true);
        return productsEntities.map(list ->
                list.stream()
                        .map(productMapper::toProductModel)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public Optional<ProductModel> getProduct(Integer productId) {
        return productCrudRepository.findById(productId).map(product -> productMapper.toProductModel(product));
    }

    @Override
    public ProductModel save(ProductModel productModel) {
        return productMapper.toProductModel(productMapper.toProductEntity(productModel));
    }

    @Override
    public void delete(Integer productId) {
        productCrudRepository.deleteById(productId);
    }
}
