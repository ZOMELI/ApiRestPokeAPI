package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiNatureStatAffectSets implements Serializable {
    private List<PokeApiNamedApiResource> increase;
    private List<PokeApiNamedApiResource> decrease;
}
