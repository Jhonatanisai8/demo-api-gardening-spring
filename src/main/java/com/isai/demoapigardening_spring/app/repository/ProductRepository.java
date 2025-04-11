package com.isai.demoapigardening_spring.app.repository;

import com.isai.demoapigardening_spring.app.models.entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, String> {
}
