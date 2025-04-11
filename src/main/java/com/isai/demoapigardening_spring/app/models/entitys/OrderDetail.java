package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrderDetail;

    @ManyToOne
    @JoinColumn(
            name = "code_order"
    )
    private Order order;

    @ManyToOne
    @JoinColumn(
            name = "code_product",
            columnDefinition = "varchar(15)"
    )
    private Product product;

    @NotNull
    private Integer quantity;

    @NotNull
    private BigDecimal priceQuantity;

    @NotNull
    @Size(max = 6)
    private Integer lineNumber;
}
