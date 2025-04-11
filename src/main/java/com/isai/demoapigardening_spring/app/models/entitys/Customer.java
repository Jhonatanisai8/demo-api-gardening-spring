package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeCustomer;

    @NotEmpty
    @Size(max = 50)
    private String firstNameCustomer;

    @Size(max = 30)
    private String nameContact;

    @Size(max = 30)
    private String lastNameContact;

    @NotEmpty
    @Size(max = 15)
    private String phone;

    @NotEmpty
    @Size(max = 15)
    private String fax;

    @NotEmpty
    @Size(max = 50)
    private String lineAddress1;

    @Size(max = 50)
    private String lineAddress2;

    @NotEmpty
    @Size(max = 50)
    private String city;

    @Size(max = 50)
    private String region;

    @Size(max = 50)
    private String country;

    @Size(max = 10)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "code_employee_sales")
    private Employee codeEmployeeSales;

    private BigDecimal creditLimit;
}
