package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PokeApiResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class PokeApiPokemonResponse {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("previous")
  private String previous;
  @JsonProperty("next")
  private String next;
  @JsonProperty("pokemons")
  @Valid
  private List<PokeApiGetPokemon> pokemons;

}

