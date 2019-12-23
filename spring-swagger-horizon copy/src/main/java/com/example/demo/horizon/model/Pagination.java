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
 * Pagination
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class Pagination   {
  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageLimit")
  private Integer pageLimit = null;

  @JsonProperty("total")
  private Integer total = null;

  public Pagination pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Page number being returned
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number being returned")


  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Pagination pageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
    return this;
  }

  /**
   * Total number of allowed records per pager
   * @return pageLimit
  **/
  @ApiModelProperty(value = "Total number of allowed records per pager")


  public Integer getPageLimit() {
    return pageLimit;
  }

  public void setPageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
  }

  public Pagination total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of underlying records (not just the ones returned for the current page)
   * @return total
  **/
  @ApiModelProperty(value = "Total number of underlying records (not just the ones returned for the current page)")


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.pageNumber, pagination.pageNumber) &&
        Objects.equals(this.pageLimit, pagination.pageLimit) &&
        Objects.equals(this.total, pagination.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageLimit, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageLimit: ").append(toIndentedString(pageLimit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

