package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * PokeApiType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class PokeApiType   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  public PokeApiType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name type.
   * @return name
  */
  @ApiModelProperty(example = "grass", value = "name type.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeApiType url(String url) {
    this.url = url;
    return this;
  }

  /**
   * url type.
   * @return url
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/type/12/", value = "url type.")


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
    PokeApiType pokeApiType = (PokeApiType) o;
    return Objects.equals(this.name, pokeApiType.name) &&
        Objects.equals(this.url, pokeApiType.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeApiType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

