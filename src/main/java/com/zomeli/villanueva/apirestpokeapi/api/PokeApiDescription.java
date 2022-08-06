package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiDescription implements Serializable {
    private String description;
    private PokeApiNamedApiResource language;
}
