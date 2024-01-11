package com.platzi_market.persistence.mapper;

import com.platzi_market.domain.ProductModel;
import com.platzi_market.persistence.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct", target = "productId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "idCategory", target = "categoryId"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "state", target = "active"),
            @Mapping(source = "categoryEntity", target = "categoryModel")
    })
    ProductModel toProductModel(ProductEntity productEntity);
    List<ProductModel> toProducts(List<ProductEntity> productsEntities);

    @InheritInverseConfiguration
    @Mapping(target = "barcode", ignore = true)
    ProductEntity toProductEntity(ProductModel productModel);
}
