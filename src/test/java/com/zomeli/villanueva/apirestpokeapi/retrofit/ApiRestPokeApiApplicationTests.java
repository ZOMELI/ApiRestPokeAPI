package com.zomeli.villanueva.apirestpokeapi.retrofit;

import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiEvolutionChain;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiPokemon;
import com.zomeli.villanueva.apirestpokeapi.proxy.contract.ServiceHttpClientPokeApi;
import io.reactivex.Single;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;
import org.springframework.http.HttpStatus;
import reactor.test.StepVerifier;
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

        Single<Response<PokeApiNamedResourceList>> retrofitCallListPokemon = service.list(5,0);
        Single<PokeApiPokemon> retrofitCallPokemon = service.getPokemon("8");
        Single<Response<PokeApiEvolutionChain>> retrofitCallEvolution = service.getEvolution("10");

        retrofitCallListPokemon.subscribe(m -> System.out.println(m.body()));
        retrofitCallPokemon.subscribe(m -> System.out.println(m));
        retrofitCallEvolution.subscribe(m -> System.out.println(m.body()));
    }

}
