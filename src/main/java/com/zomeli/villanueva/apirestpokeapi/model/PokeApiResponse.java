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
public class PokeApiResponse   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("results")
  @Valid
  private List<PokeApiPokemon> results = null;

  public PokeApiResponse count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * count.
   * @return count
  */
  @ApiModelProperty(example = "1154", value = "count.")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PokeApiResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * next.
   * @return next
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokemon?offset=6&limit=5", value = "next.")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PokeApiResponse previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * previous.
   * @return previous
  */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=1", value = "previous.")


  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public PokeApiResponse results(List<PokeApiPokemon> results) {
    this.results = results;
    return this;
  }

  public PokeApiResponse addResultsItem(PokeApiPokemon resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of PokeApiNamedApiResource.
   * @return results
  */
  @ApiModelProperty(value = "List of PokeApiNamedApiResource.")

  @Valid

  public List<PokeApiPokemon> getResults() {
    return results;
  }

  public void setResults(List<PokeApiPokemon> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeApiResponse pokeApiResponse = (PokeApiResponse) o;
    return Objects.equals(this.count, pokeApiResponse.count) &&
        Objects.equals(this.next, pokeApiResponse.next) &&
        Objects.equals(this.previous, pokeApiResponse.previous) &&
        Objects.equals(this.results, pokeApiResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeApiResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

