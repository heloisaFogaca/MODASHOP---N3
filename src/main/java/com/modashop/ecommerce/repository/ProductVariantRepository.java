package com.modashop.ecommerce.repository;

import java.util.List;
import java.util.Optional;
import com.modashop.ecommerce.entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantRepository extends JpaRepository<ProductVariant, Long> {
    Optional<ProductVariant> findBySku(String sku);

    List<ProductVariant> findByProductId(Long productId);
}
