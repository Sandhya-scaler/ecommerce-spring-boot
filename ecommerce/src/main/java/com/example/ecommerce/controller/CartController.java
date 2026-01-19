package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Cart;
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
    public Cart addToCart(@RequestBody Cart cart) {
        return service.addToCart(cart);
    }

    @GetMapping
    public List<Cart> viewCart() {
        return service.getCartItems();
    }
}
