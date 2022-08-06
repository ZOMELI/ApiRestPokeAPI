package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ExceptionDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class ExceptionDetailsType   {
  @JsonProperty("component")
  private String component;

  @JsonProperty("description")
  private String description;

  public ExceptionDetailsType component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Component in which the error occurs
   * @return component
  */
  @ApiModelProperty(required = true, value = "Component in which the error occurs")
  @NotNull


  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public ExceptionDetailsType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the error detail
   * @return description
  */
  @ApiModelProperty(value = "Description of the error detail")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionDetailsType exceptionDetailsType = (ExceptionDetailsType) o;
    return Objects.equals(this.component, exceptionDetailsType.component) &&
        Objects.equals(this.description, exceptionDetailsType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionDetailsType {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

