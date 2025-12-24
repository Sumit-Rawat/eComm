package org.ecommerce.gateway;

import org.ecommerce.dto.CartDto;
import org.ecommerce.dto.FakeStoreCartDto;

import java.io.IOException;
import java.util.List;

public interface ICartGateway {

    List<CartDto> getAllCarts() throws IOException;
}
