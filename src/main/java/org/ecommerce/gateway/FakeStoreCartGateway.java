package org.ecommerce.gateway;

import org.ecommerce.dto.CartDto;
import org.ecommerce.dto.FakeStoreCartDto;
import org.ecommerce.dto.ItemDto;
import org.ecommerce.dto.ProductDto;
import org.ecommerce.gateway.api.FakeStoreCartApi;
import org.ecommerce.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class FakeStoreCartGateway implements ICartGateway {

    private final FakeStoreCartApi fakeStoreCartApi;

    FakeStoreCartGateway(FakeStoreCartApi fakeStoreCartApi) {
        this.fakeStoreCartApi = fakeStoreCartApi;
    }


    @Override
    public List<CartDto> getAllCarts() throws IOException {
        List<FakeStoreCartDto> res=fakeStoreCartApi.getCarts().execute().body();

        if(res==null)
            throw new IOException("Failed to retrieve carts");

        return res.stream().map(cart-> CartDto.builder()
                .products(cart.getProducts().stream().map(item->
                        ItemDto.builder()
                                .productId(item.getProductId())
                                .quantity(item.getQuantity())
                                .build()).toList())
                .build()).toList();
    }
}
