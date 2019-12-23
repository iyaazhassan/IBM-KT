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
 * FederalExchangeIndicators
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class FederalExchangeIndicators   {
  @JsonProperty("americanIndian")
  private Boolean americanIndian = null;

  @JsonProperty("alaskanNative")
  private Boolean alaskanNative = null;

  public FederalExchangeIndicators americanIndian(Boolean americanIndian) {
    this.americanIndian = americanIndian;
    return this;
  }

  /**
   * Indicator if the member is an American Indian.  Required for different exchange plans.
   * @return americanIndian
  **/
  @ApiModelProperty(required = true, value = "Indicator if the member is an American Indian.  Required for different exchange plans.")
  @NotNull


  public Boolean isAmericanIndian() {
    return americanIndian;
  }

  public void setAmericanIndian(Boolean americanIndian) {
    this.americanIndian = americanIndian;
  }

  public FederalExchangeIndicators alaskanNative(Boolean alaskanNative) {
    this.alaskanNative = alaskanNative;
    return this;
  }

  /**
   * Indicator if the member is an Alaskan Native.  Required for different exchange plans.
   * @return alaskanNative
  **/
  @ApiModelProperty(required = true, value = "Indicator if the member is an Alaskan Native.  Required for different exchange plans.")
  @NotNull


  public Boolean isAlaskanNative() {
    return alaskanNative;
  }

  public void setAlaskanNative(Boolean alaskanNative) {
    this.alaskanNative = alaskanNative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederalExchangeIndicators federalExchangeIndicators = (FederalExchangeIndicators) o;
    return Objects.equals(this.americanIndian, federalExchangeIndicators.americanIndian) &&
        Objects.equals(this.alaskanNative, federalExchangeIndicators.alaskanNative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(americanIndian, alaskanNative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederalExchangeIndicators {\n");
    
    sb.append("    americanIndian: ").append(toIndentedString(americanIndian)).append("\n");
    sb.append("    alaskanNative: ").append(toIndentedString(alaskanNative)).append("\n");
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

