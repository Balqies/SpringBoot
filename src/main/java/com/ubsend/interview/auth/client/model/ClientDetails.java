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
 * Represents the full details of a client.
 */
@ApiModel(description = "Represents the full details of a client.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
public class ClientDetails {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("level")
  private ClientLevel level = null;

  @JsonProperty("clientType")
  private ClientType clientType = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("billingInfo")
  private BillingInfo billingInfo = null;

  @JsonProperty("userCount")
  private Integer userCount = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("externalOrigin")
  private String externalOrigin = null;

  public ClientDetails id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the client.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the client.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ClientDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the client.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the client.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientDetails level(ClientLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Indicates the level of the client within the client hierarchy.
   * @return level
  **/
  @ApiModelProperty(value = "Indicates the level of the client within the client hierarchy.")
  public ClientLevel getLevel() {
    return level;
  }

  public void setLevel(ClientLevel level) {
    this.level = level;
  }

  public ClientDetails clientType(ClientType clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Indicates the type of the client within the client hierarchy.
   * @return clientType
  **/
  @ApiModelProperty(value = "Indicates the type of the client within the client hierarchy.")
  public ClientType getClientType() {
    return clientType;
  }

  public void setClientType(ClientType clientType) {
    this.clientType = clientType;
  }

  public ClientDetails address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the client.
   * @return address
  **/
  @ApiModelProperty(value = "The address of the client.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ClientDetails billingInfo(BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
    return this;
  }

   /**
   * Billing information of the client.
   * @return billingInfo
  **/
  @ApiModelProperty(value = "Billing information of the client.")
  public BillingInfo getBillingInfo() {
    return billingInfo;
  }

  public void setBillingInfo(BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }

  public ClientDetails userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * The number of users that can access this client directly through the linked roles.
   * @return userCount
  **/
  @ApiModelProperty(value = "The number of users that can access this client directly through the linked roles.")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public ClientDetails externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The unique identifier of the client in the system it originated from
   * @return externalId
  **/
  @ApiModelProperty(value = "The unique identifier of the client in the system it originated from")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ClientDetails externalOrigin(String externalOrigin) {
    this.externalOrigin = externalOrigin;
    return this;
  }

   /**
   * The external origin identifies the owner of the client.
   * @return externalOrigin
  **/
  @ApiModelProperty(value = "The external origin identifies the owner of the client.")
  public String getExternalOrigin() {
    return externalOrigin;
  }

  public void setExternalOrigin(String externalOrigin) {
    this.externalOrigin = externalOrigin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDetails clientDetails = (ClientDetails) o;
    return Objects.equals(this.id, clientDetails.id) &&
        Objects.equals(this.name, clientDetails.name) &&
        Objects.equals(this.level, clientDetails.level) &&
        Objects.equals(this.clientType, clientDetails.clientType) &&
        Objects.equals(this.address, clientDetails.address) &&
        Objects.equals(this.billingInfo, clientDetails.billingInfo) &&
        Objects.equals(this.userCount, clientDetails.userCount) &&
        Objects.equals(this.externalId, clientDetails.externalId) &&
        Objects.equals(this.externalOrigin, clientDetails.externalOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, level, clientType, address, billingInfo, userCount, externalId, externalOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalOrigin: ").append(toIndentedString(externalOrigin)).append("\n");
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

