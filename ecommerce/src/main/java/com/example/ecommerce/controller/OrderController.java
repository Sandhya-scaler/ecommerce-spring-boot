package com.example.ecommerce.controller;

import com.example.ecommerce.entity.OrderEntity;
import com.example.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderEntity createOrder(@RequestParam double amount) {
        return service.createOrder(amount);
    }
}
