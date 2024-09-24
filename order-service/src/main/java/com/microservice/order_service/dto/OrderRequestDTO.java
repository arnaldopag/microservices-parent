package com.microservice.order_service.dto;


import com.microservice.order_service.model.Order;
import com.microservice.order_service.model.OrderLineItems;

import java.util.List;
import java.util.UUID;

public record OrderRequestDTO(UUID number, List<OrderLineItemsDTO> orderLineItemsList) {

    public OrderRequestDTO(UUID number, List<OrderLineItemsDTO> orderLineItemsList){
        this.number = number != null ?  number : UUID.randomUUID();
        this.orderLineItemsList = orderLineItemsList;
    }

    public static Order toEntity(OrderRequestDTO dto) {
        return new Order(dto.number(), orderLineItemsDTOEntity(dto.orderLineItemsList()));
    }

    public static List<OrderLineItems> orderLineItemsDTOEntity(List<OrderLineItemsDTO> lineItemsDTOS) {
        return lineItemsDTOS.stream()
                .map(OrderLineItemsDTO::orderLineToEntity)
                .toList();
    }
}