package org.ecommerce.gateway;

import org.ecommerce.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {

    List<ProductDto> getAllProducts() throws IOException;
}
