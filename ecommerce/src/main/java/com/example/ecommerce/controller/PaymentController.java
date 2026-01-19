package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Payment;
import com.example.ecommerce.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public Payment pay(@RequestParam Long orderId) {
        return service.makePayment(orderId);
    }
}
