package com.example.jwtToken.controller;


import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.jwtToken.dto.AddToCartRequest;
import com.example.jwtToken.dto.CartResponse;
import com.example.jwtToken.dto.UpdateCartRequest;
import com.example.jwtToken.service.CartService;


@RestController
@RequestMapping("/customer/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> addToCart(@Valid @RequestBody AddToCartRequest request) {
        String message = cartService.addToCart(request);
        return ResponseEntity.ok(Map.of("message", message));
    }

    @GetMapping
    public ResponseEntity<CartResponse> getCart() {
        return ResponseEntity.ok(cartService.getCart());
    }

    @PutMapping("/{cartItemId}")
    public ResponseEntity<Map<String, String>> updateCartItem(@PathVariable("cartItemId") Long cartItemId,
                                                              @Valid @RequestBody UpdateCartRequest request) {
        String message = cartService.updateCartItem(cartItemId, request);
        return ResponseEntity.ok(Map.of("message", message));
    }

    @DeleteMapping("/{cartItemId}")
    public ResponseEntity<Map<String, String>> removeCartItem(@PathVariable("cartItemId") Long cartItemId) {
        String message = cartService.removeCartItem(cartItemId);
        return ResponseEntity.ok(Map.of("message", message));
    }
}