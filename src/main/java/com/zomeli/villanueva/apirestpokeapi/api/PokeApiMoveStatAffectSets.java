package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiMoveStatAffectSets implements Serializable {
    private List<PokeApiMoveStatAffect> increase;
    private List<PokeApiMoveStatAffect> decrease;
}
