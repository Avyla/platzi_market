package com.platzi_market.persistence.mapper;

import com.platzi_market.domain.BuysModel;
import com.platzi_market.persistence.entities.BuysEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BuysProductMapper.class})
public interface BuysMapper {
    @Mappings({
            @Mapping(source = "idBuys", target = "idBuys"),
            @Mapping(source = "idCustomer", target = "idCustomer"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "paymentMethod", target = "paymentMethod"),
            @Mapping(source = "comments", target = "comments"),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "buysProductEntities", target = "products"),
    })
    BuysModel toBuysModel(BuysEntity buysEntity);
    List<BuysModel> toBuysModels(List<BuysEntity> buysEntities);

    @InheritInverseConfiguration
    @Mapping(target = "customerEntity", ignore = true)
    BuysEntity toBuysEntity(BuysModel buysModel);
}
