package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiVersionEncounterDetail implements Serializable {
    private PokeApiNamedApiResource version;
    private Integer max_chance;
    private List<PokeApiVersionEncounter> encounter_details;
}
