package com.isai.demoapigardening_spring.app.models.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.isai.demoapigardening_spring.app.models.entitys.Range;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {
    private String codeProduct;

    private String nameProduct;

    private Range rangeProduct;

    private String dimensions;

    private String supplier;

    private Integer stockQuantity;

    private BigDecimal unitPrice;

    private BigDecimal priceSuppliers;
}
