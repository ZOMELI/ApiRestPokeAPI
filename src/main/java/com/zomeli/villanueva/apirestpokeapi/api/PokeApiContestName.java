package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiContestName implements Serializable {
    private String name;
    private String color;
    private PokeApiNamedApiResource language;
}
