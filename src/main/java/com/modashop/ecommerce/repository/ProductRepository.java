package com.modashop.ecommerce.repository;

import java.util.List;
import com.modashop.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByActiveTrue();

    List<Product> findByCategoriesId(Long categoryId);

    List<Product> findByNameContainingIgnoreCase(String name);
}
