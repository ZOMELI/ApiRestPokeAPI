package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PokeApiLocationAreaEncounter implements Serializable {
    private PokeApiNamedApiResource location_area;
    private List<PokeApiVersionEncounterDetail> version_details;
}
