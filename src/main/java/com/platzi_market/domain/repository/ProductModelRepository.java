package com.platzi_market.domain.repository;

import com.platzi_market.domain.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductModelRepository {
    List<ProductModel> getAll();

    Optional<List<ProductModel>> getByCategory(Integer categoryId);

    Optional<List<ProductModel>> getScarseProducts(Integer quantity);

    Optional<ProductModel> getProduct(Integer productId);

    ProductModel save(ProductModel productModel);

    void delete(Integer productId);
}
