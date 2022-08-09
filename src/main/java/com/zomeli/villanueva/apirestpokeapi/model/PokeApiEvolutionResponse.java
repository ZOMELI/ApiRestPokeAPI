package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class PokeApiEvolutionResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("pokemon")
    private String pokemon;

    @JsonProperty("url")
    private String url;

    @JsonProperty("evolutions")
    @Valid
    private List<PokeApiGetEvolution> evolutions;

}
