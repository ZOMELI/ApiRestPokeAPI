package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiTypeRelations implements Serializable {
    private List<PokeApiNamedApiResource> no_damage_to;
    private List<PokeApiNamedApiResource> half_damage_to;
    private List<PokeApiNamedApiResource> double_damage_to;
    private List<PokeApiNamedApiResource> no_damage_from;
    private List<PokeApiNamedApiResource> half_damage_from;
    private List<PokeApiNamedApiResource> double_damage_from;
}
