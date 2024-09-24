package com.microservice.order_service.repository;

import com.microservice.order_service.model.OrderLineItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems, UUID> {
}
