package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PokeApiPokemonType implements Serializable {
    private Integer slot;
    private PokeApiNamedApiResource type;
}
