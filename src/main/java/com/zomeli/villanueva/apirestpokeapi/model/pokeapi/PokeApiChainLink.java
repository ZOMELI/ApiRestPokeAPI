package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class PokeApiChainLink implements Serializable {
    private boolean is_baby;
    private PokeApiNamedApiResource species;
    private List<PokeApiEvolutionDetail> evolves_to;

}
