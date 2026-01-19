package com.example.ecommerce.service;

import com.example.ecommerce.entity.OrderEntity;
import com.example.ecommerce.enums.OrderStatus;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public OrderEntity createOrder(double amount) {
        return repo.save(new OrderEntity(amount, OrderStatus.CREATED));
    }

    public OrderEntity markOrderPaid(Long orderId) {
        OrderEntity order = repo.findById(orderId).orElseThrow();
        order.setStatus(OrderStatus.PAID);
        return repo.save(order);
    }
}
