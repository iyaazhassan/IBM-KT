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
 * a single plan record for the member search. 
 */
@ApiModel(description = "a single plan record for the member search. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class Plan   {
  @JsonProperty("homePlanCode")
  private String homePlanCode = null;

  @JsonProperty("homePlanName")
  private String homePlanName = null;

  public Plan homePlanCode(String homePlanCode) {
    this.homePlanCode = homePlanCode;
    return this;
  }

  /**
   * 3 digit Plan Code of participating other BCBSA Home Plan where the member is enrolled
   * @return homePlanCode
  **/
  @ApiModelProperty(value = "3 digit Plan Code of participating other BCBSA Home Plan where the member is enrolled")


  public String getHomePlanCode() {
    return homePlanCode;
  }

  public void setHomePlanCode(String homePlanCode) {
    this.homePlanCode = homePlanCode;
  }

  public Plan homePlanName(String homePlanName) {
    this.homePlanName = homePlanName;
    return this;
  }

  /**
   * The plan name of participating  other BCBSA home plan where the member is enrolled
   * @return homePlanName
  **/
  @ApiModelProperty(value = "The plan name of participating  other BCBSA home plan where the member is enrolled")


  public String getHomePlanName() {
    return homePlanName;
  }

  public void setHomePlanName(String homePlanName) {
    this.homePlanName = homePlanName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.homePlanCode, plan.homePlanCode) &&
        Objects.equals(this.homePlanName, plan.homePlanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePlanCode, homePlanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    homePlanCode: ").append(toIndentedString(homePlanCode)).append("\n");
    sb.append("    homePlanName: ").append(toIndentedString(homePlanName)).append("\n");
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

