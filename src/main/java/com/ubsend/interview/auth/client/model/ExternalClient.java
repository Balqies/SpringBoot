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
 * Represents an external client.
 */
@ApiModel(description = "Represents an external client.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
public class ExternalClient {
  @JsonProperty("externalOrigin")
  private String externalOrigin = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("externalParentClientId")
  private String externalParentClientId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("billingInfo")
  private BillingInfo billingInfo = null;

  public ExternalClient externalOrigin(String externalOrigin) {
    this.externalOrigin = externalOrigin;
    return this;
  }

   /**
   * The external origin identifies the owner of the client.
   * @return externalOrigin
  **/
  @ApiModelProperty(required = true, value = "The external origin identifies the owner of the client.")
  public String getExternalOrigin() {
    return externalOrigin;
  }

  public void setExternalOrigin(String externalOrigin) {
    this.externalOrigin = externalOrigin;
  }

  public ExternalClient externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The unique identifier of the client in the system it originated from.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the client in the system it originated from.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ExternalClient externalParentClientId(String externalParentClientId) {
    this.externalParentClientId = externalParentClientId;
    return this;
  }

   /**
   * The unique identifier of the parent client in the system it originated from.
   * @return externalParentClientId
  **/
  @ApiModelProperty(value = "The unique identifier of the parent client in the system it originated from.")
  public String getExternalParentClientId() {
    return externalParentClientId;
  }

  public void setExternalParentClientId(String externalParentClientId) {
    this.externalParentClientId = externalParentClientId;
  }

  public ExternalClient name(String name) {
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

  public ExternalClient address(Address address) {
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

  public ExternalClient billingInfo(BillingInfo billingInfo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalClient externalClient = (ExternalClient) o;
    return Objects.equals(this.externalOrigin, externalClient.externalOrigin) &&
        Objects.equals(this.externalId, externalClient.externalId) &&
        Objects.equals(this.externalParentClientId, externalClient.externalParentClientId) &&
        Objects.equals(this.name, externalClient.name) &&
        Objects.equals(this.address, externalClient.address) &&
        Objects.equals(this.billingInfo, externalClient.billingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalOrigin, externalId, externalParentClientId, name, address, billingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalClient {\n");
    
    sb.append("    externalOrigin: ").append(toIndentedString(externalOrigin)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalParentClientId: ").append(toIndentedString(externalParentClientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
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

