package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PokeApiEvolutionChain implements Serializable {
    private Integer id;
    private PokeApiChainLink chain;
}
