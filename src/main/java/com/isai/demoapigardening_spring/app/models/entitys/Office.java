package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeOffice;

    @Size(max = 30)
    @NotEmpty
    private String city;

    @Size(max = 50)
    @NotEmpty
    private String country;

    @Size(max = 50)
    private String region;

    @Size(max = 10)
    private String zipCode;

    @NotEmpty
    @Size(max = 20)
    private String telephone;

    @NotEmpty
    @Size(max = 50)
    private String lineAddress1;

    @Size(max = 50)
    private String lineAddress2;

}
