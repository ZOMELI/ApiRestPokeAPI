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
public class PokeApiPokemon   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("types")
  @Valid
  private List<PokeApiType> types = null;

  @JsonProperty("abilities")
  @Valid
  private List<PokeApiAbilities> abilities = null;

  @JsonProperty("weight")
  private String weight = null;

  public PokeApiPokemon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name Pokemon.
   * @return name
  */
  @ApiModelProperty(example = "ivysaur", value = "name Pokemon.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeApiPokemon url(String url) {
    this.url = url;
    return this;
  }

  /**
   * url Pokemon.
   * @return url
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokemon/2/", value = "url Pokemon.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PokeApiPokemon types(List<PokeApiType> types) {
    this.types = types;
    return this;
  }

  public PokeApiPokemon addTypesItem(PokeApiType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * List of types Pokemon.
   * @return types
  */
  @ApiModelProperty(value = "List of types Pokemon.")

  @Valid

  public List<PokeApiType> getTypes() {
    return types;
  }

  public void setTypes(List<PokeApiType> types) {
    this.types = types;
  }

  public PokeApiPokemon abilities(List<PokeApiAbilities> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokeApiPokemon addAbilitiesItem(PokeApiAbilities abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * List of abilities Pokemon.
   * @return abilities
  */
  @ApiModelProperty(value = "List of abilities Pokemon.")

  @Valid

  public List<PokeApiAbilities> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<PokeApiAbilities> abilities) {
    this.abilities = abilities;
  }

  public PokeApiPokemon weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * weight Pokemon.
   * @return weight
  */
  @ApiModelProperty(value = "weight Pokemon.")


  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeApiPokemon pokeApiPokemon = (PokeApiPokemon) o;
    return Objects.equals(this.name, pokeApiPokemon.name) &&
        Objects.equals(this.url, pokeApiPokemon.url) &&
        Objects.equals(this.types, pokeApiPokemon.types) &&
        Objects.equals(this.abilities, pokeApiPokemon.abilities) &&
        Objects.equals(this.weight, pokeApiPokemon.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, types, abilities, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeApiPokemon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

