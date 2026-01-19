package com.example.ecommerce.controller;

import com.example.ecommerce.enums.PaymentStatus;
import com.example.ecommerce.service.OrderService;
import com.example.ecommerce.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhooks")
public class WebhookController {

    private final PaymentService paymentService;
    private final OrderService orderService;

    public WebhookController(PaymentService paymentService,
                             OrderService orderService) {
        this.paymentService = paymentService;
        this.orderService = orderService;
    }

    @PostMapping("/payment")
    public String handlePaymentWebhook(@RequestParam Long orderId,
                                       @RequestParam PaymentStatus status) {

        if (status == PaymentStatus.SUCCESS) {
            orderService.markPaid(orderId);
        }

        return "Webhook processed";
    }
}
