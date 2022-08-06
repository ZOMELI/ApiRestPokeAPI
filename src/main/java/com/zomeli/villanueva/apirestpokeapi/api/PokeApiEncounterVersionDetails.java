package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiEncounterVersionDetails implements Serializable {
    private Integer rate;
    private PokeApiNamedApiResource version;
}
