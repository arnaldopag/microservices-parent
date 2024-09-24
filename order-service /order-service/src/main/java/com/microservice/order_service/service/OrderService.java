package com.microservice.order_service.service;


import com.microservice.order_service.dto.OrderRequestDTO;
import com.microservice.order_service.model.Order;
import com.microservice.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

   private final OrderRepository orderRepository;

    public void placeOrder(OrderRequestDTO data){
        Order order = OrderRequestDTO.toEntity(data);
        orderRepository.save(order);
    }
}
