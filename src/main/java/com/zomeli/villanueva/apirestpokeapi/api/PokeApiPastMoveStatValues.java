package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiPastMoveStatValues implements Serializable {
    private Integer accuracy;
    private Integer effect_chance;
    private Integer power;
    private Integer pp;
    private List<PokeApiVerboseEffect> effect_entries;
    private PokeApiNamedApiResource ailment;
    private PokeApiNamedApiResource category;
}
