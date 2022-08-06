package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiEffect implements Serializable {
    private String effect;
    private PokeApiNamedApiResource language;
}
