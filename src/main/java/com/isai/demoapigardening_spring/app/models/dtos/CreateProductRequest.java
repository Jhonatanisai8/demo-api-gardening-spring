package com.isai.demoapigardening_spring.app.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class CreateProductRequest {

    @NotEmpty
    @Size(max = 15)
    private String codeProduct;

    @NotEmpty
    @Size(max = 70)
    private String nameProduct;

    @NotEmpty
    @Size(max = 50)
    private String rangeProduct;

    @Size(max = 25)
    private String dimensions;

    @Size(max = 50)
    private String supplier;

    @NotNull
    private Integer stockQuantity;

    @NotNull
    private BigDecimal unitPrice;

    private BigDecimal priceSuppliers;
}
