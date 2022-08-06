package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiContestType implements Serializable {
    private Integer id;
    private String name;
    private PokeApiNamedApiResource berry_flavor;
    private List<PokeApiContestName> names;
}
