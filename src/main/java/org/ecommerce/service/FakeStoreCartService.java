package org.ecommerce.service;


import lombok.Getter;
import org.ecommerce.dto.CartDto;
import org.ecommerce.gateway.ICartGateway;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCartService implements ICartService {

    private final ICartGateway cartGateway;

    FakeStoreCartService(ICartGateway cartGateway){
        this.cartGateway = cartGateway;
    }


    @Override
    public List<CartDto> getAllCarts() throws IOException {
        return cartGateway.getAllCarts();
    }
}
