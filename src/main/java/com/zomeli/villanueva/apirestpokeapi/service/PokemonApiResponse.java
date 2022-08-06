package com.zomeli.villanueva.apirestpokeapi.service;


import com.zomeli.villanueva.apirestpokeapi.api.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import retrofit2.Response;

@Component
public class PokemonApiResponse {

    public ResponseEntity<PokeApiResponse> processResponse(
            Response<PokeApiNamedResourceList> response) {

        return ResponseEntity.ok( PokeApiResponse.builder().count(response.body().getCount()).build());
    }
}
