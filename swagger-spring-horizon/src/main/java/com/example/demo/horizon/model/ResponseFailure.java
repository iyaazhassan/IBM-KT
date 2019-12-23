package com.example.demo.horizon.model;

import java.util.Objects;
import com.example.demo.horizon.model.Fault;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response payload on a failure
 */
@ApiModel(description = "The response payload on a failure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class ResponseFailure   {
  @JsonProperty("fault")
  private Fault fault = null;

  public ResponseFailure fault(Fault fault) {
    this.fault = fault;
    return this;
  }

  /**
   * Get fault
   * @return fault
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Fault getFault() {
    return fault;
  }

  public void setFault(Fault fault) {
    this.fault = fault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFailure responseFailure = (ResponseFailure) o;
    return Objects.equals(this.fault, responseFailure.fault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFailure {\n");
    
    sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
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

