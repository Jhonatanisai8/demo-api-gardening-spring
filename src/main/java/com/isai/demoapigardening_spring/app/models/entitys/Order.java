package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeOrder;

    @NotNull
    private Date dateOrder;

    @NotNull
    private Date dateExpected;

    private Date dateArrival;

    @NotNull
    @Size(max = 15)
    private String statusOrder;

    @Size(max = 80)
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "code_customer")
    private Customer codeCustomer;

}
