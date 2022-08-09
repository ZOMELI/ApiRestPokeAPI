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
 * PokeApiPokemon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class PokeApiGetPokemon {

  @JsonProperty("id")
  private String id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("url")
  private String url;

  @JsonProperty("weight")
  private String weight;
  @JsonProperty("types")
  @Valid
  private List<PokeApiType> types;
  @JsonProperty("abilities")
  @Valid
  private List<PokeApiAbilities> abilities ;

}

