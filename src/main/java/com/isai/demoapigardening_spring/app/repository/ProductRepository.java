package com.isai.demoapigardening_spring.app.repository;

import com.isai.demoapigardening_spring.app.models.dtos.ProductResponse;
import com.isai.demoapigardening_spring.app.models.entitys.Product;
import com.isai.demoapigardening_spring.app.models.entitys.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository
        extends JpaRepository<Product, String> {
    List<Product> findAllByRange(Range range);
}
