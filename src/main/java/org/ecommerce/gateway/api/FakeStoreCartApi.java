package org.ecommerce.gateway.api;

import org.ecommerce.dto.FakeStoreCartDto;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FakeStoreCartApi {

    @GET("carts")
    Call<List<FakeStoreCartDto>> getCarts();
}
