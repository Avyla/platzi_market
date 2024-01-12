package com.platzi_market.persistence.mapper;

import com.platzi_market.domain.BuysProductModel;
import com.platzi_market.persistence.entities.BuysProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface BuysProductMapper {
    @Mappings({
            @Mapping(source = "id.idProduct", target = "productId")
    })
    BuysProductModel toBuysProductModel(BuysProductEntity buysProductEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "buys", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.idBuys", ignore = true)
    })
    BuysProductEntity toBuysProductEntity(BuysProductModel buysProductModel);

}
