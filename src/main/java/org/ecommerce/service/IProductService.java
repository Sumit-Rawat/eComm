package org.ecommerce.service;

import org.ecommerce.dto.ProductDto;

import java.io.IOException;
import java.util.List;


public interface IProductService {
    List<ProductDto> getAllProducts() throws IOException;
}
