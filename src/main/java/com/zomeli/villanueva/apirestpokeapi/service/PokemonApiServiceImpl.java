package com.zomeli.villanueva.apirestpokeapi.service;

import static com.zomeli.villanueva.apirestpokeapi.utils.Constants.*;
import static io.reactivex.schedulers.Schedulers.io;

import com.zomeli.villanueva.apirestpokeapi.exeption.InvalidParameterException;
import com.zomeli.villanueva.apirestpokeapi.exeption.MissingMandatoryParameterException;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiNamedApiResource;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiEvolutionResponse;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiGetPokemon;
import com.zomeli.villanueva.apirestpokeapi.config.APIConfiguration;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiPokemonResponse;
import com.zomeli.villanueva.apirestpokeapi.proxy.contract.ServiceHttpClientPokeApi;
import io.reactivex.Maybe;
import io.reactivex.exceptions.Exceptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@Service
public class PokemonApiServiceImpl implements APIConfiguration, PokemonApiService {
    @Autowired
    private PokemonApiResponse response;
    private final ServiceHttpClientPokeApi service;
    public PokemonApiServiceImpl(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        service = retrofit.create(ServiceHttpClientPokeApi.class);
    }
    @Override
    public Maybe<ResponseEntity<PokeApiPokemonResponse>> getPokemonList(int limit, int offset) {
        List<PokeApiGetPokemon> pokeApiPokemonList = new ArrayList<>();

        if(limit==0){
            limit=5;
        }
            return service.list(limit, offset)
                    .map(m -> {
                        List<PokeApiNamedApiResource> results = m.body().getResults();
                        if (!results.isEmpty()) {
                            results.forEach(p -> {
                                String url = p.getUrl();
                                service.getPokemon(url
                                                .replace(URL.concat(PATH_POKEMON), "")
                                                .replace(SLASH, EMPTY)
                                        )
                                        .map(r -> response.buildPokeApiPokemon(url, r))
                                        .subscribe(l -> pokeApiPokemonList.add(l));
                            });
                        }
                        return response.processPokemonResponse(m.body(), pokeApiPokemonList);
                    })
                    .toMaybe()
                    .subscribeOn(io());
    }
    @Override
    public Maybe<ResponseEntity<PokeApiGetPokemon>> getPokemonDetailList(String id) {
        return service.getPokemon(id)
                .map(r-> ResponseEntity.ok( response.buildPokeApiPokemon(r.getSpecies().getUrl(),r)))
                .doOnSuccess(m ->  log.info("[PokemonApiServiceImpl-getPokemonDetailList : ]"+ m))
                .toMaybe()
                .subscribeOn(io());
    }
    @Override
    public Maybe<ResponseEntity<PokeApiEvolutionResponse>> getPokemonEvolutionList(String id) {
        return service.getEvolution(id)
                .map(r-> response.processEvolutionResponse(r))
                .doOnSuccess(m ->  log.info("[PokemonApiServiceImpl-getPokemonDetailList : ]"+ m))
                .toMaybe()
                .subscribeOn(io());
    }

}
