package com.isai.demoapigardening_spring.app.models.dtos;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RangeResponse {

    @Size(max = 50)
    private String nameRange;

    private String description;

    private String getDescriptionHTML;

    private String image;
}
