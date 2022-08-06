package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiItemHolderPokemon implements Serializable {
    private PokeApiNamedApiResource pokemon;
    private List<PokeApiItemHolderPokemonVersionDetail> version_details;
}
