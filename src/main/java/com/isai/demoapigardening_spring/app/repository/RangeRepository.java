package com.isai.demoapigardening_spring.app.repository;

import com.isai.demoapigardening_spring.app.models.entitys.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RangeRepository
        extends JpaRepository<Range, String> {
}
