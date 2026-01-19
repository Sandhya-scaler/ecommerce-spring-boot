package com.example.ecommerce.entity;

import com.example.ecommerce.enums.PaymentStatus;
import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    public Payment() {}

    public Payment(Long orderId, PaymentStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public Long getId() { return id; }
    public Long getOrderId() { return orderId; }
    public PaymentStatus getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public void setStatus(PaymentStatus status) { this.status = status; }
}
