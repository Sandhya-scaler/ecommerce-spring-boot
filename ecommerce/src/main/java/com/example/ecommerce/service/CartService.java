package com.example.ecommerce.service;

import com.example.ecommerce.entity.CartItem;
import com.example.ecommerce.repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartItemRepository repo;

    public CartService(CartItemRepository repo) {
        this.repo = repo;
    }

    public CartItem addToCart(CartItem item) {
        return repo.save(item);
    }

    public List<CartItem> getCart(String userId) {
        return repo.findByUserId(userId);
    }

    public void clearCart(String userId) {
        repo.deleteAll(repo.findByUserId(userId));
    }
}
