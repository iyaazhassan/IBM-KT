package com.example.demo.horizon.model;

import java.util.Objects;
import com.example.demo.horizon.model.Link;
import com.example.demo.horizon.model.MemberElastic;
import com.example.demo.horizon.model.Pagination;
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
 * A response structure for a member search.  
 */
@ApiModel(description = "A response structure for a member search.  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-24T01:15:28.003+05:30")

public class ResponseMembersElastic   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("members")
  @Valid
  private List<MemberElastic> members = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public ResponseMembersElastic pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public ResponseMembersElastic members(List<MemberElastic> members) {
    this.members = members;
    return this;
  }

  public ResponseMembersElastic addMembersItem(MemberElastic membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<MemberElastic>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * A list of members
   * @return members
  **/
  @ApiModelProperty(value = "A list of members")

  @Valid

  public List<MemberElastic> getMembers() {
    return members;
  }

  public void setMembers(List<MemberElastic> members) {
    this.members = members;
  }

  public ResponseMembersElastic links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ResponseMembersElastic addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * A list of links
   * @return links
  **/
  @ApiModelProperty(value = "A list of links")

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
    ResponseMembersElastic responseMembersElastic = (ResponseMembersElastic) o;
    return Objects.equals(this.pagination, responseMembersElastic.pagination) &&
        Objects.equals(this.members, responseMembersElastic.members) &&
        Objects.equals(this.links, responseMembersElastic.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, members, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMembersElastic {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

