/*
 * Monty Authentication API
 * Authentication service for the Monty API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@sendasyou.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ubsend.interview.auth.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a role associated with a user Only contains the basic information of the role 
 */
@ApiModel(description = "Represents a role associated with a user Only contains the basic information of the role ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
public class BasicRole {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public BasicRole id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the role.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the role.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BasicRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the role.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicRole basicRole = (BasicRole) o;
    return Objects.equals(this.id, basicRole.id) &&
        Objects.equals(this.name, basicRole.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
