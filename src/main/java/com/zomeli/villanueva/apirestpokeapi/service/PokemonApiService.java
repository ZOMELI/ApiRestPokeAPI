package com.zomeli.villanueva.apirestpokeapi.service;


import com.zomeli.villanueva.apirestpokeapi.api.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiResponse;
import io.reactivex.Maybe;
import org.springframework.http.ResponseEntity;

public interface PokemonApiService {

    Maybe<ResponseEntity<PokeApiResponse>> getPokemonList(int limit, int offset);

}
