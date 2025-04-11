package com.isai.demoapigardening_spring.app.mappers;

import com.isai.demoapigardening_spring.app.models.dtos.ProductResponse;
import com.isai.demoapigardening_spring.app.models.entitys.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = RangeMapper.class)
public interface ProductMapper {
    ProductResponse toProductResponse(Product product);
}
