package com.example.demo.horizon.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single error detail structure
 */
@ApiModel(description = "A single error detail structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class ErrorDetail   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorLevel")
  private String errorLevel = null;

  @JsonProperty("message")
  private String message = null;

  public ErrorDetail errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * **for internal use** error code from the backend system(s)
   * @return errorCode
  **/
  @ApiModelProperty(value = "**for internal use** error code from the backend system(s)")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorDetail errorLevel(String errorLevel) {
    this.errorLevel = errorLevel;
    return this;
  }

  /**
   * **for internal use** error level.  Values include: ERROR, WARNING, INFORMATIONAL
   * @return errorLevel
  **/
  @ApiModelProperty(required = true, value = "**for internal use** error level.  Values include: ERROR, WARNING, INFORMATIONAL")
  @NotNull


  public String getErrorLevel() {
    return errorLevel;
  }

  public void setErrorLevel(String errorLevel) {
    this.errorLevel = errorLevel;
  }

  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * **for internal use**  the error text from the backend system(s)
   * @return message
  **/
  @ApiModelProperty(required = true, value = "**for internal use**  the error text from the backend system(s)")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.errorCode, errorDetail.errorCode) &&
        Objects.equals(this.errorLevel, errorDetail.errorLevel) &&
        Objects.equals(this.message, errorDetail.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorLevel, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

