package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiItemPocket implements Serializable {
    private Integer id;
    private String name;
    private List<PokeApiNamedApiResource> categories;
    private List<PokeApiName> names;
}
