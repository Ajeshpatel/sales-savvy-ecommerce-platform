package com.example.jwtToken.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtToken.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}