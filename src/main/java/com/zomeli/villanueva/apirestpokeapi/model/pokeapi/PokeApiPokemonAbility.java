package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PokeApiPokemonAbility implements Serializable {
    private boolean is_hidden;
    private Integer slot;
    private PokeApiNamedApiResource ability;
}
