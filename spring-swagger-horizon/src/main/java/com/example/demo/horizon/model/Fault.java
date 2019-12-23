package com.example.demo.horizon.model;

import java.util.Objects;
import com.example.demo.horizon.model.ErrorDetail;
import com.example.demo.horizon.model.ValidationErrorDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single fault structure
 */
@ApiModel(description = "A single fault structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class Fault   {
  @JsonProperty("errorLevel")
  private String errorLevel = null;

  @JsonProperty("httpErrorCode")
  private Integer httpErrorCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("payloadErrorCode")
  private String payloadErrorCode = null;

  @JsonProperty("retryable")
  private Boolean retryable = null;

  @JsonProperty("errorDetails")
  @Valid
  private List<ErrorDetail> errorDetails = null;

  @JsonProperty("validationErrorDetails")
  @Valid
  private List<ValidationErrorDetail> validationErrorDetails = null;

  public Fault errorLevel(String errorLevel) {
    this.errorLevel = errorLevel;
    return this;
  }

  /**
   * Error level of the response.  Values include: VALIDATION, ERROR, WARNING, INFORMATIONAL. If there are multiple errors returned, this will be the most severe error level.
   * @return errorLevel
  **/
  @ApiModelProperty(required = true, value = "Error level of the response.  Values include: VALIDATION, ERROR, WARNING, INFORMATIONAL. If there are multiple errors returned, this will be the most severe error level.")
  @NotNull


  public String getErrorLevel() {
    return errorLevel;
  }

  public void setErrorLevel(String errorLevel) {
    this.errorLevel = errorLevel;
  }

  public Fault httpErrorCode(Integer httpErrorCode) {
    this.httpErrorCode = httpErrorCode;
    return this;
  }

  /**
   * HTTP Error Code as defined in the Operation.
   * @return httpErrorCode
  **/
  @ApiModelProperty(required = true, value = "HTTP Error Code as defined in the Operation.")
  @NotNull


  public Integer getHttpErrorCode() {
    return httpErrorCode;
  }

  public void setHttpErrorCode(Integer httpErrorCode) {
    this.httpErrorCode = httpErrorCode;
  }

  public Fault message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Text of the error
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Text of the error")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Fault payloadErrorCode(String payloadErrorCode) {
    this.payloadErrorCode = payloadErrorCode;
    return this;
  }

  /**
   * High level error code of the API.  This is a unique code defined by the API.
   * @return payloadErrorCode
  **/
  @ApiModelProperty(required = true, value = "High level error code of the API.  This is a unique code defined by the API.")
  @NotNull


  public String getPayloadErrorCode() {
    return payloadErrorCode;
  }

  public void setPayloadErrorCode(String payloadErrorCode) {
    this.payloadErrorCode = payloadErrorCode;
  }

  public Fault retryable(Boolean retryable) {
    this.retryable = retryable;
    return this;
  }

  /**
   * Defines if the type of error is transient and the request could be retried.
   * @return retryable
  **/
  @ApiModelProperty(required = true, value = "Defines if the type of error is transient and the request could be retried.")
  @NotNull


  public Boolean isRetryable() {
    return retryable;
  }

  public void setRetryable(Boolean retryable) {
    this.retryable = retryable;
  }

  public Fault errorDetails(List<ErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  public Fault addErrorDetailsItem(ErrorDetail errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new ArrayList<ErrorDetail>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

  /**
   * List of general errors
   * @return errorDetails
  **/
  @ApiModelProperty(value = "List of general errors")

  @Valid

  public List<ErrorDetail> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(List<ErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Fault validationErrorDetails(List<ValidationErrorDetail> validationErrorDetails) {
    this.validationErrorDetails = validationErrorDetails;
    return this;
  }

  public Fault addValidationErrorDetailsItem(ValidationErrorDetail validationErrorDetailsItem) {
    if (this.validationErrorDetails == null) {
      this.validationErrorDetails = new ArrayList<ValidationErrorDetail>();
    }
    this.validationErrorDetails.add(validationErrorDetailsItem);
    return this;
  }

  /**
   * List of validation errors
   * @return validationErrorDetails
  **/
  @ApiModelProperty(value = "List of validation errors")

  @Valid

  public List<ValidationErrorDetail> getValidationErrorDetails() {
    return validationErrorDetails;
  }

  public void setValidationErrorDetails(List<ValidationErrorDetail> validationErrorDetails) {
    this.validationErrorDetails = validationErrorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fault fault = (Fault) o;
    return Objects.equals(this.errorLevel, fault.errorLevel) &&
        Objects.equals(this.httpErrorCode, fault.httpErrorCode) &&
        Objects.equals(this.message, fault.message) &&
        Objects.equals(this.payloadErrorCode, fault.payloadErrorCode) &&
        Objects.equals(this.retryable, fault.retryable) &&
        Objects.equals(this.errorDetails, fault.errorDetails) &&
        Objects.equals(this.validationErrorDetails, fault.validationErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorLevel, httpErrorCode, message, payloadErrorCode, retryable, errorDetails, validationErrorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fault {\n");
    
    sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
    sb.append("    httpErrorCode: ").append(toIndentedString(httpErrorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    payloadErrorCode: ").append(toIndentedString(payloadErrorCode)).append("\n");
    sb.append("    retryable: ").append(toIndentedString(retryable)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    validationErrorDetails: ").append(toIndentedString(validationErrorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

