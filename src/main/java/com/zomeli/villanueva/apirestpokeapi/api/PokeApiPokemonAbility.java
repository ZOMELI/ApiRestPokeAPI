package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonAbility implements Serializable {
    private boolean is_hidden;
    private Integer slot;
    private PokeApiNamedApiResource ability;
}
