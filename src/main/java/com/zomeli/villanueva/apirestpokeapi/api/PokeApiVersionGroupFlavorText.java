package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiVersionGroupFlavorText implements Serializable {
    private String text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version_group;
}
