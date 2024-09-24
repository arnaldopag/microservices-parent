package com.microservice.product_service.dto;

import com.microservice.product_service.model.Product;

import java.math.BigDecimal;

public record ProductRequestDTO(String name, String description, BigDecimal price) {

    public static Product toEntity(ProductRequestDTO dto) {
        return new Product(dto.name(), dto.description(), dto.price());
    }
}
