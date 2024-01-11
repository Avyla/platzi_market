package com.platzi_market.web.controller;

import com.platzi_market.domain.ProductModel;
import com.platzi_market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public List<ProductModel> getAll(){
        return productService.getAll();
    }

    public Optional<ProductModel> getProduct(Integer productId){
        return productService.getProduct(productId);
    }

    public Optional<List<ProductModel>> getByCategory(Integer categoryId){
        return productService.getByCategory(categoryId);
    }

    public Optional<List<ProductModel>> getScarseProducts(Integer quantity) {
        return productService.getScarseProducts(quantity);
    }

    public ProductModel save(ProductModel productModel) {
        return productService.save(productModel);
    }

    public Boolean delete(Integer productId) {
        return productService.delete(productId);
    }
}
