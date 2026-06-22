package com.example.jwtToken.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtToken.entity.PaymentTransaction;


public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Long> {
}