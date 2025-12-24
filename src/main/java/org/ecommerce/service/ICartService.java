package org.ecommerce.service;


import org.ecommerce.dto.CartDto;

import java.io.IOException;
import java.util.List;

public interface ICartService {
    List<CartDto> getAllCarts() throws IOException;
}
