package org.ecommerce.service;

import org.ecommerce.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }
}
