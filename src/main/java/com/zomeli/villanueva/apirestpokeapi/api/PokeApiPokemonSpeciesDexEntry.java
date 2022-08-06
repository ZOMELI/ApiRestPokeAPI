package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonSpeciesDexEntry implements Serializable {
    private Integer entry_number;
    private PokeApiNamedApiResource pokedex;
}
