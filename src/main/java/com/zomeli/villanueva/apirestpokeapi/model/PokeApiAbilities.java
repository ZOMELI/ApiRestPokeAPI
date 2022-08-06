package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * PokeApiAbilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class PokeApiAbilities   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("url")
  private String url = null;

  public PokeApiAbilities name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name abilities.
   * @return name
  */
  @ApiModelProperty(example = "overgrow", value = "name abilities.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeApiAbilities description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description abilities.
   * @return description
  */
  @ApiModelProperty(example = "Potencia los ataques de tipo Planta en un apuro.", value = "description abilities.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PokeApiAbilities url(String url) {
    this.url = url;
    return this;
  }

  /**
   * url abilities.
   * @return url
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/ability/65/", value = "url abilities.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeApiAbilities pokeApiAbilities = (PokeApiAbilities) o;
    return Objects.equals(this.name, pokeApiAbilities.name) &&
        Objects.equals(this.description, pokeApiAbilities.description) &&
        Objects.equals(this.url, pokeApiAbilities.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeApiAbilities {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

