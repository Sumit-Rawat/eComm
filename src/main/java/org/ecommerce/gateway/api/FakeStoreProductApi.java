package org.ecommerce.gateway.api;

import org.ecommerce.dto.FakeStoreProductDto;
import org.ecommerce.dto.ProductDto;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FakeStoreProductApi {

    @GET("products")
    Call<List<FakeStoreProductDto>> getProducts();
}
