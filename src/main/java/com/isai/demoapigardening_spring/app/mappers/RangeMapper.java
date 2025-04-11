package com.isai.demoapigardening_spring.app.mappers;

import com.isai.demoapigardening_spring.app.models.dtos.RangeResponse;
import com.isai.demoapigardening_spring.app.models.entitys.Range;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RangeMapper {
    RangeResponse toRangeResponse(Range range);
}
