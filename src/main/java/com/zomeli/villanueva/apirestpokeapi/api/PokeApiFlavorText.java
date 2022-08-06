package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiFlavorText implements Serializable {
    private String flavor_text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version;
}
