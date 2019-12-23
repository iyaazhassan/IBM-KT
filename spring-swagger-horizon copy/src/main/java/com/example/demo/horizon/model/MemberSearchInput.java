package com.example.demo.horizon.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Input for a member search. * Conditional search of ssn or personId or firstName and lastName (together) are the minimum search parameters.  * When subGroupNumber is passed mainGroupNumber is required.
 */
@ApiModel(description = "Input for a member search. * Conditional search of ssn or personId or firstName and lastName (together) are the minimum search parameters.  * When subGroupNumber is passed mainGroupNumber is required.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class MemberSearchInput   {
  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dob")
  private LocalDate dob = null;

  @JsonProperty("ssn")
  private String ssn = null;

  @JsonProperty("gender")
  private String gender = null;

  public MemberSearchInput personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Member's unique identifier.   MDM Original GUID generated by MDM .Its unique at an individual level .   Conditional search of personId or firstName, lastName and dob are the minimum search parameters
   * @return personId
  **/
  @ApiModelProperty(value = "Member's unique identifier.   MDM Original GUID generated by MDM .Its unique at an individual level .   Conditional search of personId or firstName, lastName and dob are the minimum search parameters")


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public MemberSearchInput firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Member’s first name - Exact match or wildcard search.  Conditional search of personId or firstName, lastName and dob are the minimum search parameters. For wildcard search client will pass name with wildcard '%’. Wildcard search only happen when client pass wildcard end of string. Wildcard search must have at least a 1 character limit before the ‘%’ for a wild card search.
   * @return firstName
  **/
  @ApiModelProperty(value = "Member’s first name - Exact match or wildcard search.  Conditional search of personId or firstName, lastName and dob are the minimum search parameters. For wildcard search client will pass name with wildcard '%’. Wildcard search only happen when client pass wildcard end of string. Wildcard search must have at least a 1 character limit before the ‘%’ for a wild card search.")

@Size(min=1) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MemberSearchInput middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Member's middle name.  This will be a wildcard search so that a single letter can be sent in to match a middle inital or full middle name.
   * @return middleName
  **/
  @ApiModelProperty(value = "Member's middle name.  This will be a wildcard search so that a single letter can be sent in to match a middle inital or full middle name.")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public MemberSearchInput lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Member’s last name - Exact match or wildcard search.  Conditional search of personId or firstName, lastName and dob are the minimum search parameters.  For wildcard search client will pass name with wildcard '%’. Wildcard search only happen when client pass wildcard end of string. Wildcard search must have at least a 1 character limit before the ‘%’ for a wild card search.
   * @return lastName
  **/
  @ApiModelProperty(value = "Member’s last name - Exact match or wildcard search.  Conditional search of personId or firstName, lastName and dob are the minimum search parameters.  For wildcard search client will pass name with wildcard '%’. Wildcard search only happen when client pass wildcard end of string. Wildcard search must have at least a 1 character limit before the ‘%’ for a wild card search.")

@Size(min=1) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MemberSearchInput dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Member's Date of Birth - exact match.   **Format ISO 8601 date in the format yyyy-MM-dd**  Conditional search of memberId or firstName, lastName and dob are the minimum search parameters
   * @return dob
  **/
  @ApiModelProperty(value = "Member's Date of Birth - exact match.   **Format ISO 8601 date in the format yyyy-MM-dd**  Conditional search of memberId or firstName, lastName and dob are the minimum search parameters")

  @Valid

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public MemberSearchInput ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Member's ssn.   Format nnnnnnnnn. When passed must not be blank or  have any of the below combinations:  * 000000000 * 111111111 * 123456789 * 222222222 * 333333333 * 444444444 * 555555555 * 666666666 * 777777777 * 888888888 * 999999999 * 987654321
   * @return ssn
  **/
  @ApiModelProperty(value = "Member's ssn.   Format nnnnnnnnn. When passed must not be blank or  have any of the below combinations:  * 000000000 * 111111111 * 123456789 * 222222222 * 333333333 * 444444444 * 555555555 * 666666666 * 777777777 * 888888888 * 999999999 * 987654321")


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public MemberSearchInput gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Member's gender.   Values: * Female * Male * Ambiguous * Not Applicable * Other * Unknown
   * @return gender
  **/
  @ApiModelProperty(value = "Member's gender.   Values: * Female * Male * Ambiguous * Not Applicable * Other * Unknown")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSearchInput memberSearchInput = (MemberSearchInput) o;
    return Objects.equals(this.personId, memberSearchInput.personId) &&
        Objects.equals(this.firstName, memberSearchInput.firstName) &&
        Objects.equals(this.middleName, memberSearchInput.middleName) &&
        Objects.equals(this.lastName, memberSearchInput.lastName) &&
        Objects.equals(this.dob, memberSearchInput.dob) &&
        Objects.equals(this.ssn, memberSearchInput.ssn) &&
        Objects.equals(this.gender, memberSearchInput.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, firstName, middleName, lastName, dob, ssn, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSearchInput {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

