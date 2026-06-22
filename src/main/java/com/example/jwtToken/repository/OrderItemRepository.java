package com.example.jwtToken.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtToken.entity.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}