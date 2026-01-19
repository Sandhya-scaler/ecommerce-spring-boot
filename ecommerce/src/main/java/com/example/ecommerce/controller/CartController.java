package com.example.ecommerce.controller;

import com.example.ecommerce.entity.CartItem;
import com.example.ecommerce.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public CartItem add(@RequestBody CartItem item) {
        return service.addToCart(item);
    }

    @GetMapping
    public List<CartItem> view(@RequestParam String userId) {
        return service.getCart(userId);
    }
}
