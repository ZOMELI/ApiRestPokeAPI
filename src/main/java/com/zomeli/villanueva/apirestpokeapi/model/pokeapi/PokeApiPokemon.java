package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class PokeApiPokemon implements Serializable {
    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;
    private Integer weight;
    private List<PokeApiPokemonAbility> abilities;
    private List<PokeApiNamedApiResource> forms;
    private List<PokeApiPokemonMove> moves;
    private PokeApiNamedApiResource species;
    private List<PokeApiPokemonStat> stats;
    private List<PokeApiPokemonType> types;
}
