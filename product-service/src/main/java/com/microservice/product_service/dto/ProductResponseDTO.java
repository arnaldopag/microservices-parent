package com.microservice.product_service.dto;

import com.microservice.product_service.model.Product;

import java.math.BigDecimal;

public record ProductResponseDTO(String id, String name, String description, BigDecimal price) {

    public static ProductResponseDTO fromEntity(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}