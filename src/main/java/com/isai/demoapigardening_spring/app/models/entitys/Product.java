package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "products")
public class Product {

    @Id
    @Size(max = 15)
    private String codeProduct;

    @NotEmpty
    @Size(max = 70)
    private String nameProduct;

    @ManyToOne
    @JoinColumn(name = "name_range")
    private Range rangeProduct;

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
