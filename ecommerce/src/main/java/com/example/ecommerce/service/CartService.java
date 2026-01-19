package com.example.ecommerce.service;

import com.example.ecommerce.entity.Cart;
import com.example.ecommerce.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository repo;

    public CartService(CartRepository repo) {
        this.repo = repo;
    }

    public Cart addToCart(Cart cart) {
        return repo.save(cart);
    }

    public List<Cart> getCartItems() {
        return repo.findAll();
    }

    public void clearCart() {
        repo.deleteAll();
    }
}
