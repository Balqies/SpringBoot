/*
 * Monty Relais Colis Parcel Shop Connector
 * This connector can retrieve parcel shop information for Relais Colis
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@sendasyou.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ubsend.interview.parcel_shop.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A Geo search result
 */
@ApiModel(description = "A Geo search result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T15:12:17.756+01:00")
public class GeoResult {
  @JsonProperty("parcelShop")
  private ParcelShop parcelShop = null;

  @JsonProperty("distance")
  private Integer distance = null;

  public GeoResult parcelShop(ParcelShop parcelShop) {
    this.parcelShop = parcelShop;
    return this;
  }

   /**
   * A parcel shop
   * @return parcelShop
  **/
  @ApiModelProperty(value = "A parcel shop")
  public ParcelShop getParcelShop() {
    return parcelShop;
  }

  public void setParcelShop(ParcelShop parcelShop) {
    this.parcelShop = parcelShop;
  }

  public GeoResult distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Distance in meters from a geo search point.
   * @return distance
  **/
  @ApiModelProperty(value = "Distance in meters from a geo search point.")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoResult geoResult = (GeoResult) o;
    return Objects.equals(this.parcelShop, geoResult.parcelShop) &&
        Objects.equals(this.distance, geoResult.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parcelShop, distance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoResult {\n");
    
    sb.append("    parcelShop: ").append(toIndentedString(parcelShop)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

