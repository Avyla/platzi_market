package com.platzi_market.domain.service;

import com.platzi_market.domain.ProductModel;
import com.platzi_market.domain.repository.ProductModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductModelRepository productModelRepository;

    public List<ProductModel> getAll() {
        return productModelRepository.getAll();
    }

    public Optional<List<ProductModel>> getByCategory(Integer categoryId) {
        return productModelRepository.getByCategory(categoryId);
    }

    public Optional<List<ProductModel>> getScarseProducts(Integer quantity) {
        return productModelRepository.getScarseProducts(quantity);
    }

    public Optional<ProductModel> getProduct(Integer productId) {
        return productModelRepository.getProduct(productId);
    }

    public ProductModel save(ProductModel productModel) {
        return productModelRepository.save(productModel);
    }

    public Boolean delete(Integer productId) {
        return getProduct(productId).map(productModel -> {
            productModelRepository.delete(productId);
            return true;
        }).orElse(false);
    }


}
