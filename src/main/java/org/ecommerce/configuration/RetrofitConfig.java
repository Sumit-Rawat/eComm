package org.ecommerce.configuration;

import org.ecommerce.gateway.api.FakeStoreCartApi;
import org.ecommerce.gateway.api.FakeStoreProductApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${gatewayUrl}")
    private String gatewayUrl;

    @Bean
    public Retrofit retrofit() {

        return new Retrofit.Builder()
                .baseUrl(gatewayUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi() {
        return retrofit().create(FakeStoreProductApi.class);
    }

    @Bean
    public FakeStoreCartApi fakeStoreCartApi() {
        return retrofit().create(FakeStoreCartApi.class);
    }
}
