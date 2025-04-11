package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeEmployeeSales;

    @NotEmpty
    @Size(max = 50)
    private String firstName;

    @NotEmpty
    @Size(max = 50)
    private String lastName1;

    @Size(max = 50)
    private String lastName2;

    @Size(max = 10)
    private String extension;

    @NotEmpty
    @Size(max = 10)
    private String email;

    @ManyToOne
    @JoinColumn(name = "code_office")
    private Office codeOffice;

    @ManyToOne
    @JoinColumn(name = "code_boss")
    private Employee codeBoss;

    @Size(max = 50)
    private String puesto;
}
