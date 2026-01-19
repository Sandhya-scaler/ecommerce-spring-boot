package com.example.ecommerce.service;

import com.example.ecommerce.entity.Payment;
import com.example.ecommerce.enums.PaymentStatus;
import com.example.ecommerce.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repo;

    public PaymentService(PaymentRepository repo) {
        this.repo = repo;
    }

    public Payment makePayment(Long orderId) {
        return repo.save(new Payment(orderId, PaymentStatus.SUCCESS));
    }
}
