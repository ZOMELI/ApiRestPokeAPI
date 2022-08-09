package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class PokeApiNamedApiResource implements Serializable {
    private String name;
    private String url;
}
