package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiFlavorBerryMap implements Serializable {
    private Integer potency;
    private PokeApiNamedApiResource berry;
}
