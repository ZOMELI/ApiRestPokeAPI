package com.zomeli.villanueva.apirestpokeapi.service;


import com.zomeli.villanueva.apirestpokeapi.model.PokeApiEvolutionResponse;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiGetPokemon;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiPokemonResponse;
import io.reactivex.Maybe;
import org.springframework.http.ResponseEntity;

public interface PokemonApiService {
    Maybe<ResponseEntity<PokeApiPokemonResponse>> getPokemonList(int limit, int offset);
    Maybe<ResponseEntity<PokeApiEvolutionResponse>> getPokemonEvolutionList(String id);
    Maybe<ResponseEntity<PokeApiGetPokemon>> getPokemonDetailList(String id);

}
