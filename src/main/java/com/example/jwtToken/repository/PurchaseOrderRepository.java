package com.example.jwtToken.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtToken.entity.PurchaseOrder;
import com.example.jwtToken.entity.User;


public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    Optional<PurchaseOrder> findByIdAndUser(Long id, User user);
}