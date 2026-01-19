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

    public OrderEntity create(OrderEntity order) {
        order.setStatus(OrderStatus.CREATED);
        return repo.save(order);
    }

    public OrderEntity get(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void markPaid(Long id) {
        OrderEntity o = get(id);
        o.setStatus(OrderStatus.PAID);
        repo.save(o);
    }
}
