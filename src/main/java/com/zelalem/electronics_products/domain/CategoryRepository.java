package com.zelalem.electronics_products.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByName(String name);
}