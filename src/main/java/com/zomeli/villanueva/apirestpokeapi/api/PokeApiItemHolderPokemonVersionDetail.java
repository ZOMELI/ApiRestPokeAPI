package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiItemHolderPokemonVersionDetail implements Serializable {
    private Integer rarity;
    private PokeApiNamedApiResource version;
}
