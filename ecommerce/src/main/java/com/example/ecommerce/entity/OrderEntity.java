package com.example.ecommerce.entity;

import com.example.ecommerce.enums.OrderStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public OrderEntity() {}

    public OrderEntity(double totalAmount, OrderStatus status) {
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getId() { return id; }
    public double getTotalAmount() { return totalAmount; }
    public OrderStatus getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public void setStatus(OrderStatus status) { this.status = status; }
}
