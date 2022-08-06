package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPalParkEncounterArea implements Serializable {
    private Integer base_score;
    private Integer rate;
    private PokeApiNamedApiResource area;
}
