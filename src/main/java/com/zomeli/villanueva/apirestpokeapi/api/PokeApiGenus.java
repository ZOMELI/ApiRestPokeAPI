package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PokeApiGenus implements Serializable {
    private String genus;
    private PokeApiNamedApiResource language;
}
