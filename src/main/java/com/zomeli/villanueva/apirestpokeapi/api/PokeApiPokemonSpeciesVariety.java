package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPokemonSpeciesVariety implements Serializable {
    private String is_default;
    private PokeApiNamedApiResource pokemon;
}
