package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiMoveStatAffect implements Serializable {
    private Integer change;
    private PokeApiNamedApiResource move;
}
