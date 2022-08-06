package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiNaturePokeathlonStatAffect implements Serializable {
    private Integer max_change;
    private PokeApiNamedApiResource nature;
}
