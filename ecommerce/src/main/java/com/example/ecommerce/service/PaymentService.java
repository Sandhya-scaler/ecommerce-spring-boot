package com.example.ecommerce.service;

import com.example.ecommerce.entity.Payment;
import com.example.ecommerce.enums.PaymentStatus;
import com.example.ecommerce.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repo;
    private final OrderService orderService;

    public PaymentService(PaymentRepository repo, OrderService orderService) {
        this.repo = repo;
        this.orderService = orderService;
    }

    public Payment create(Long orderId, double amount) {
        Payment p = new Payment();
        p.setOrderId(orderId);
        p.setAmount(amount);
        p.setStatus(PaymentStatus.SUCCESS);
        orderService.markPaid(orderId);
        return repo.save(p);
    }
}
