package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiTypePokemon implements Serializable {
    private Integer slot;
    private PokeApiNamedApiResource pokemon;
}
