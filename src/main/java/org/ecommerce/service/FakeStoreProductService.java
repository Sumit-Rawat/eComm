package org.ecommerce.service;

import org.ecommerce.dto.ProductDto;
import org.ecommerce.gateway.IProductGateway;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



import java.io.IOException;
import java.util.List;

@Component
@Primary
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;

    FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }


    @Override
    public List<ProductDto> getAllProducts() throws IOException {
        return productGateway.getAllProducts();
    }
}
