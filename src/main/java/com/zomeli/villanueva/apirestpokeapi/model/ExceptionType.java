package com.zomeli.villanueva.apirestpokeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ExceptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder
@Data
public class ExceptionType   {
  @JsonProperty("exceptionId")
  private String exceptionId;

  @JsonProperty("exceptionText")
  private String exceptionText;

  @JsonProperty("moreInfo")
  private String moreInfo;

  @JsonProperty("userMessage")
  private String userMessage;

  @JsonProperty("exceptionDetails")
  @Valid
  private List<ExceptionDetailsType> exceptionDetails = null;

  public ExceptionType exceptionId(String exceptionId) {
    this.exceptionId = exceptionId;
    return this;
  }

  /**
   * Identifier of the exception
   * @return exceptionId
  */
  @ApiModelProperty(required = true, value = "Identifier of the exception")
  @NotNull


  public String getExceptionId() {
    return exceptionId;
  }

  public void setExceptionId(String exceptionId) {
    this.exceptionId = exceptionId;
  }

  public ExceptionType exceptionText(String exceptionText) {
    this.exceptionText = exceptionText;
    return this;
  }

  /**
   * Human readable description of the associated error, including some specific variables
   * @return exceptionText
  */
  @ApiModelProperty(required = true, value = "Human readable description of the associated error, including some specific variables")
  @NotNull


  public String getExceptionText() {
    return exceptionText;
  }

  public void setExceptionText(String exceptionText) {
    this.exceptionText = exceptionText;
  }

  public ExceptionType moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  /**
   * A URI where more information about the exception is provided
   * @return moreInfo
  */
  @ApiModelProperty(value = "A URI where more information about the exception is provided")


  public String getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  public ExceptionType userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * A message that can be shown to the user of the Application implementing the API Client
   * @return userMessage
  */
  @ApiModelProperty(value = "A message that can be shown to the user of the Application implementing the API Client")


  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  public ExceptionType exceptionDetails(List<ExceptionDetailsType> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
    return this;
  }

  public ExceptionType addExceptionDetailsItem(ExceptionDetailsType exceptionDetailsItem) {
    if (this.exceptionDetails == null) {
      this.exceptionDetails = new ArrayList<>();
    }
    this.exceptionDetails.add(exceptionDetailsItem);
    return this;
  }

  /**
   * List of error details
   * @return exceptionDetails
  */
  @ApiModelProperty(value = "List of error details")

  @Valid

  public List<ExceptionDetailsType> getExceptionDetails() {
    return exceptionDetails;
  }

  public void setExceptionDetails(List<ExceptionDetailsType> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionType exceptionType = (ExceptionType) o;
    return Objects.equals(this.exceptionId, exceptionType.exceptionId) &&
        Objects.equals(this.exceptionText, exceptionType.exceptionText) &&
        Objects.equals(this.moreInfo, exceptionType.moreInfo) &&
        Objects.equals(this.userMessage, exceptionType.userMessage) &&
        Objects.equals(this.exceptionDetails, exceptionType.exceptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionId, exceptionText, moreInfo, userMessage, exceptionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionType {\n");
    
    sb.append("    exceptionId: ").append(toIndentedString(exceptionId)).append("\n");
    sb.append("    exceptionText: ").append(toIndentedString(exceptionText)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    exceptionDetails: ").append(toIndentedString(exceptionDetails)).append("\n");
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

