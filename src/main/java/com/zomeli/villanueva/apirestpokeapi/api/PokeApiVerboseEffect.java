package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiVerboseEffect implements Serializable {
    private String name;
    private String short_effect;
    private PokeApiNamedApiResource language;
}
