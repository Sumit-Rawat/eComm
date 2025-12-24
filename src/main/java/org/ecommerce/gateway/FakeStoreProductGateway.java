package org.ecommerce.gateway;

import org.ecommerce.dto.FakeStoreProductDto;
import org.ecommerce.dto.ProductDto;
import org.ecommerce.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }


    @Override
    public List<ProductDto> getAllProducts() throws IOException {
        List<FakeStoreProductDto> res=fakeStoreProductApi.getProducts().execute().body();

        if(res==null)
        {
            throw new IOException("Failed to fetch products");
        }

        return res.stream().map(product ->  ProductDto.builder()
                        .id(product.getId())
                        .category(product.getCategory())
                        .price(product.getPrice())
                        .description(product.getDescription())
                        .title(product.getTitle())
                        .build())
                .toList();
    }
}
