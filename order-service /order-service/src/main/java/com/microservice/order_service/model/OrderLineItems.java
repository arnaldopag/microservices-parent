package com.microservice.order_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String skuCode;

    private BigDecimal price;

    private Integer quantity;

    public OrderLineItems(Integer quantity, BigDecimal price, String skuCode) {
        this.quantity = quantity;
        this.price = price;
        this.skuCode = skuCode;
    }
}
