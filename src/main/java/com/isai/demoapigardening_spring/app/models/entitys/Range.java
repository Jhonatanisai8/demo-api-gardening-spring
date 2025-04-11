package com.isai.demoapigardening_spring.app.models.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ranges")
public class Range {

    @Id
    @Size(max = 50)
    private String nameRange;

    private String description;

    private String getDescriptionHTML;

    private String image;
}
