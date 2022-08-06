package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiItemFlingEffect implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiEffect> effect_entries;
    private List<PokeApiNamedApiResource> items;
}
