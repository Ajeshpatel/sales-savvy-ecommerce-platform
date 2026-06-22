package com.example.jwtToken.dto;

public record AuthResponse(
        String token,
        String tokenType,
        String username,
        String role
) {
}