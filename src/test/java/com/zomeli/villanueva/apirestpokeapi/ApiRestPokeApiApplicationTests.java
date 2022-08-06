package com.zomeli.villanueva.apirestpokeapi;

import com.zomeli.villanueva.apirestpokeapi.api.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.proxy.contract.ServiceHttpClientPokeApi;
import io.reactivex.Single;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@ExtendWith(MockitoExtension.class)
public class ApiRestPokeApiApplicationTests {

    @Spy
    private ServiceHttpClientPokeApi service;

    @Test
    @DisplayName("test consumer service pokeapi with retrofit2")
    public void testRetrofitServicePokeAPI() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
				.addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        service = retrofit.create(ServiceHttpClientPokeApi.class);

        Single<Response<PokeApiNamedResourceList>> retrofitCall = service.list(5,0);

        retrofitCall.subscribe(m -> System.out.println(m.body()));
        System.out.println(retrofitCall);

    }

}
