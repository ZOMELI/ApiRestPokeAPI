package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiEncounterCondition implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiName> names;
    private List<PokeApiNamedApiResource> values;
}
