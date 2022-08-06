package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMoveTarget implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiDescription> descriptions;
    private List<PokeApiNamedApiResource> moves;
    private List<PokeApiName> names;
}
