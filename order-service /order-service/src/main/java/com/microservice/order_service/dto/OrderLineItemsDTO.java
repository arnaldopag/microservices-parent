package com.microservice.order_service.dto;

import com.microservice.order_service.model.OrderLineItems;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderLineItemsDTO(UUID id,
                                String skuCode,
                                BigDecimal price,
                                Integer quantity) {


    public static OrderLineItems orderLineToEntity(OrderLineItemsDTO dto){
        return new OrderLineItems(dto.quantity(),dto.price(),dto.skuCode());
    }
}