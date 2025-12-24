package org.ecommerce.controller;


import org.ecommerce.dto.CartDto;
import org.ecommerce.service.ICartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    private final ICartService cartService;

    CartController(ICartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping
    List<CartDto> getCarts() throws IOException {
        return cartService.getAllCarts();
    }
}
