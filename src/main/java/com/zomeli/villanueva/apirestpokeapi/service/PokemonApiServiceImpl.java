package com.zomeli.villanueva.apirestpokeapi.service;


import com.zomeli.villanueva.apirestpokeapi.api.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.config.APIConfiguration;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiResponse;
import com.zomeli.villanueva.apirestpokeapi.proxy.contract.ServiceHttpClientPokeApi;
import io.reactivex.Maybe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static io.reactivex.schedulers.Schedulers.io;

@Slf4j
@Service
public class PokemonApiServiceImpl implements APIConfiguration, PokemonApiService {

    @Autowired
    private PokemonApiResponse reponse;
    private ServiceHttpClientPokeApi service;

    public PokemonApiServiceImpl(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        service = retrofit.create(ServiceHttpClientPokeApi.class);
    }

    @Override
    public Maybe<ResponseEntity<PokeApiResponse>> getPokemonList(int limit, int offset) {
        return  service.list(limit,offset)
                .map(r -> reponse.processResponse(r))
                .doOnSuccess(m ->  log.info("[PokemonApiServiceImpl-getPokemonList : ]"+ m.getBody()))
                .toMaybe()
                .subscribeOn(io());
    }



}
