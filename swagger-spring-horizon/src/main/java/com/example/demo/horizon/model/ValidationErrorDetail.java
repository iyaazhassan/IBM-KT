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
 * A single validation error detail
 */
@ApiModel(description = "A single validation error detail")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class ValidationErrorDetail   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public ValidationErrorDetail field(String field) {
    this.field = field;
    return this;
  }

  /**
   * field that failed validation
   * @return field
  **/
  @ApiModelProperty(required = true, value = "field that failed validation")
  @NotNull


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ValidationErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * description of the failed validation
   * @return message
  **/
  @ApiModelProperty(required = true, value = "description of the failed validation")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationErrorDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the api that has the validation error
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the api that has the validation error")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ValidationErrorDetail value(String value) {
    this.value = value;
    return this;
  }

  /**
   * value that failed the validation
   * @return value
  **/
  @ApiModelProperty(required = true, value = "value that failed the validation")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorDetail validationErrorDetail = (ValidationErrorDetail) o;
    return Objects.equals(this.field, validationErrorDetail.field) &&
        Objects.equals(this.message, validationErrorDetail.message) &&
        Objects.equals(this.name, validationErrorDetail.name) &&
        Objects.equals(this.value, validationErrorDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorDetail {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

