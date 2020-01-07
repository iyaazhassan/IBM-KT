package com.example.rabbitMQConsumer.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;


import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single member record
 */

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

@NoArgsConstructor
@AllArgsConstructor

public class Member   {
	
  
@Id
@JsonProperty("memberId")
  private String memberId = null;

  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("suffix")
  private String suffix = null;

  @JsonProperty("dob")
  //private LocalDate dob = null;
  private String dob = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("ssn")
  private String ssn = null;

  @JsonProperty("horizonEmployeeIndicator")
  private Boolean horizonEmployeeIndicator = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public Member memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Member Id. Unique Member identifier. Note: This is a transient value   This is needed to call other APIs
   * @return memberId
  **/
  
  @NotNull


  public String getMemberId() {
    return memberId;
  }

  public Boolean gethorizonEmployeeIndicator() {
	    return horizonEmployeeIndicator;
	  }
  
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public Member personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * **Internal Only:** MDM Original GUID generated by MDM .Its unique at an individual level .
   * @return personId
  **/
  //@ApiModelProperty(required = true, value = "**Internal Only:** MDM Original GUID generated by MDM .Its unique at an individual level .")
  @NotNull


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Member prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Member name prefix
   * @return prefix
  **/
  //@ApiModelProperty(value = "Member name prefix")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Member firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Member's first name
   * @return firstName
  **/
  //@ApiModelProperty(required = true, value = "Member's first name")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Member middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Member's middle name
   * @return middleName
  **/
  //@ApiModelProperty(value = "Member's middle name")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Member lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Member's last name
   * @return lastName
  **/
 // @ApiModelProperty(required = true, value = "Member's last name")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Member suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Member name suffix
   * @return suffix
  **/
 // @ApiModelProperty(value = "Member name suffix")


  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  //changed Localedte here also
  public Member dob(String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Member's Date of Birth. Format  ISO 8601 date in the format yyyy-MM-dd
   * @return dob
  **/
 // @ApiModelProperty(required = true, value = "Member's Date of Birth. Format  ISO 8601 date in the format yyyy-MM-dd")
  @NotNull

  @Valid

  //changed Localedte here also
  public String getDob() {
    return dob;
  }

  //changed Localedte here also
  public void setDob(String dob) {
    this.dob = dob;
  }

  public Member gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Member's gender.   Values: * Female * Male * Ambiguous * Not Applicable * Other * Unknown  Note: The API will handle Gender filtration for Male and Female only
   * @return gender
  **/
  //@ApiModelProperty(required = true, value = "Member's gender.   Values: * Female * Male * Ambiguous * Not Applicable * Other * Unknown  Note: The API will handle Gender filtration for Male and Female only")
  @NotNull


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Member ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * **Internal Only:** Member's SSN.   Format nnnnnnnnn.
   * @return ssn
  **/
  //@ApiModelProperty(value = "**Internal Only:** Member's SSN.   Format nnnnnnnnn.")


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Member horizonEmployeeIndicator(Boolean horizonEmployeeIndicator) {
    this.horizonEmployeeIndicator = horizonEmployeeIndicator;
    return this;
  }

  /**
   * Indicates if Member is a Horizon employee. Will only be returned when True.
   * @return horizonEmployeeIndicator
  **/
//  @ApiModelProperty(value = "Indicates if Member is a Horizon employee. Will only be returned when True.")


  public Boolean isHorizonEmployeeIndicator() {
    return horizonEmployeeIndicator;
  }

  public void setHorizonEmployeeIndicator(Boolean horizonEmployeeIndicator) {
    this.horizonEmployeeIndicator = horizonEmployeeIndicator;
  }

  public Member links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Member addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Collection of links
   * @return links
  **/
//  @ApiModelProperty(value = "Collection of links")

  @Valid

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.memberId, member.memberId) &&
        Objects.equals(this.personId, member.personId) &&
        Objects.equals(this.prefix, member.prefix) &&
        Objects.equals(this.firstName, member.firstName) &&
        Objects.equals(this.middleName, member.middleName) &&
        Objects.equals(this.lastName, member.lastName) &&
        Objects.equals(this.suffix, member.suffix) &&
        Objects.equals(this.dob, member.dob) &&
        Objects.equals(this.gender, member.gender) &&
        Objects.equals(this.ssn, member.ssn) &&
        Objects.equals(this.horizonEmployeeIndicator, member.horizonEmployeeIndicator) &&
        Objects.equals(this.links, member.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, personId, prefix, firstName, middleName, lastName, suffix, dob, gender, ssn, horizonEmployeeIndicator, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    horizonEmployeeIndicator: ").append(toIndentedString(horizonEmployeeIndicator)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  public String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

