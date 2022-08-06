package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPokemonMove implements Serializable {
    private PokeApiNamedApiResource move;
    private List<PokeApiPokemonMoveVersion> version_group_details;
}
