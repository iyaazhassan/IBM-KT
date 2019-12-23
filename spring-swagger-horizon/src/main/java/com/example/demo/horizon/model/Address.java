package com.example.demo.horizon.model;

import java.util.Objects;
import com.example.demo.horizon.model.AddressType;
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
 * addressType is required together with a minimum of street or city or state or zipCode
 */
@ApiModel(description = "addressType is required together with a minimum of street or city or state or zipCode")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class Address   {
  @JsonProperty("addressType")
  @Valid
  private List<AddressType> addressType = new ArrayList<AddressType>();

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public Address addressType(List<AddressType> addressType) {
    this.addressType = addressType;
    return this;
  }

  public Address addAddressTypeItem(AddressType addressTypeItem) {
    this.addressType.add(addressTypeItem);
    return this;
  }

  /**
   * List of addressType(s) to search. Values are as follows:  * Home Address * Alternate Address * Billing Address * Temporary Address * Primary Address future use * Permanent Address future use * Contact Address future use * Mailing Address future use * ID Card Mailing Address future use * Correspondance and Mailing Address future use * Correspondance and Billing future use * Personal Representative Address future use
   * @return addressType
  **/
  @ApiModelProperty(required = true, value = "List of addressType(s) to search. Values are as follows:  * Home Address * Alternate Address * Billing Address * Temporary Address * Primary Address future use * Permanent Address future use * Contact Address future use * Mailing Address future use * ID Card Mailing Address future use * Correspondance and Mailing Address future use * Correspondance and Billing future use * Personal Representative Address future use")
  @NotNull

  @Valid
@Size(min=1) 
  public List<AddressType> getAddressType() {
    return addressType;
  }

  public void setAddressType(List<AddressType> addressType) {
    this.addressType = addressType;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * 1st thru 3rd  lines of the member's address
   * @return street
  **/
  @ApiModelProperty(example = "street=123 Main street APT 1A", value = "1st thru 3rd  lines of the member's address")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "city=Newark", value = "City")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
  **/
  @ApiModelProperty(example = "state=NJ", value = "State")

@Size(min=2,max=2) 
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * 5 digit zip code of member's address
   * @return zipCode
  **/
  @ApiModelProperty(example = "zipCode=07101", value = "5 digit zip code of member's address")

@Size(min=5,max=5) 
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, street, city, state, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

