package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiAbilityFlavorText implements Serializable {
    private String flavor_text;
    private PokeApiNamedApiResource language;
    private PokeApiNamedApiResource version_group;
}
