package com.platzi_market.persistence.mapper;

import com.platzi_market.domain.CategoryModel;
import com.platzi_market.persistence.entities.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Indica que esta interfaz es un Mapper de MapStruct y se integra con Spring.
 * MapStruct se encarga de generar automáticamente la implementación de esta interfaz.
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    /**
     * Convierte una entidad CategoryEntity a un modelo CategoryModel.
     * Los atributos de CategoryEntity se mapean a los correspondientes en CategoryModel.
     * Por ejemplo, 'idCategory' en CategoryEntity se mapea a 'categoryId' en CategoryModel.
     *
     * @param categoryEntity Objeto CategoryEntity a convertir.
     * @return CategoryModel resultante de la conversión.
     */
    @Mappings({
            @Mapping(source = "idCategory", target = "categoryId"),
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "state", target = "active")
    })
    CategoryModel toCategory(CategoryEntity categoryEntity);

    /**
     * Realiza el mapeo inverso al método toCategory (CategoryEntity a CategoryModel).
     * InheritInverseConfiguration indica que este método hereda la configuración inversa
     * del mapeo definido en toCategory.
     * El atributo 'productEntities' en CategoryEntity se ignora durante el mapeo.
     *
     * @param categoryModel Objeto CategoryModel a convertir.
     * @return CategoryEntity resultante de la conversión.
     */
    @InheritInverseConfiguration
    @Mapping(target = "productEntities", ignore = true)
    CategoryEntity toCategoryEntity(CategoryModel categoryModel);
}

