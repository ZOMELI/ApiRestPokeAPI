package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PokeApiPokemonStat implements Serializable {
    private PokeApiNamedApiResource stat;
    private Integer effort;
    private Integer base_stat;
}
