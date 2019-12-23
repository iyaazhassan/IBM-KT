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
 * AddressType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class AddressType   {
  @JsonProperty("addressType")
  private String addressType = null;

  public AddressType addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * List of values are  * Home Address * Alternate Address * Billing Address * Temporary Address * Primary Address future use * Permanent Address future use * Contact Address future use * Mailing Address future use * ID Card Mailing Address future use * Correspondance and Mailing Address future use * Correspondance and Billing future use * Personal Representative Address future use
   * @return addressType
  **/
  @ApiModelProperty(value = "List of values are  * Home Address * Alternate Address * Billing Address * Temporary Address * Primary Address future use * Permanent Address future use * Contact Address future use * Mailing Address future use * ID Card Mailing Address future use * Correspondance and Mailing Address future use * Correspondance and Billing future use * Personal Representative Address future use")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressType addressType = (AddressType) o;
    return Objects.equals(this.addressType, addressType.addressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressType {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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

