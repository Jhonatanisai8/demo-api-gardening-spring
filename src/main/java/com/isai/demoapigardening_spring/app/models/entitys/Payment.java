package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @Size(max = 50)
    private String idPayment;

    @Size(max = 40)
    private String formaPago;

    @NotNull
    private Date datePayment;

    @NotNull
    private BigDecimal amount;

}
