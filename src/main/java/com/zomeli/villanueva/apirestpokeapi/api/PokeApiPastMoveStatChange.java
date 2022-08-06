package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiPastMoveStatChange implements Serializable {
    private Integer change;
    private PokeApiNamedApiResource stat;
}
