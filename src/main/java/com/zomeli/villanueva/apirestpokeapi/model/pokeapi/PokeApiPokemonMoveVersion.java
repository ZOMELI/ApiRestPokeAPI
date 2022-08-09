package com.zomeli.villanueva.apirestpokeapi.model.pokeapi;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PokeApiPokemonMoveVersion implements Serializable {
    private PokeApiNamedApiResource move_learn_method;
    private PokeApiNamedApiResource version_group;
    private Integer level_learned_at;
}
