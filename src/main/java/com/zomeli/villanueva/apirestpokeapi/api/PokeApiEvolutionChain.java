package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiEvolutionChain implements Serializable {
    private Integer id;
    private PokeApiNamedApiResource baby_trigger_item;
    private PokeApiChainLink chain;
}
