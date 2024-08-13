package com.zelalem.electronics_products.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods can be added as needed
    List<Product> findByNameIgnoreCase(String name);
    List<Product> findByCategoryId(Long categoryId);
}