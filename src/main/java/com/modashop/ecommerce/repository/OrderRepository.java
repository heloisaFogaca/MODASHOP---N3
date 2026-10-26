package com.modashop.ecommerce.repository;

import com.modashop.ecommerce.enums.OrderStatus;
import java.util.List;
import com.modashop.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);

    List<Order> findByStatus(OrderStatus status);
}
