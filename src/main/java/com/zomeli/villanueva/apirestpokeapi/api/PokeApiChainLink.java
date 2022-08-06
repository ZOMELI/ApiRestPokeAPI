package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiChainLink implements Serializable {
    private boolean is_baby;
    private PokeApiNamedApiResource species;
    private List<PokeApiBerryFlavorMap> flavors;
    private List<PokeApiEvolutionDetail> evolves_to;
}
