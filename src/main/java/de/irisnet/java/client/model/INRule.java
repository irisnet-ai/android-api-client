/**
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses.By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package de.irisnet.java.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Describes the rules applied and the count of objects found for the given classification.
 **/
@ApiModel(description = "Describes the rules applied and the count of objects found for the given classification.")
public class INRule {
  
  @SerializedName("inClass")
  private String inClass = null;
  @SerializedName("inGroup")
  private String inGroup = null;
  @SerializedName("found")
  private Integer found = null;
  @SerializedName("min")
  private Integer min = null;
  @SerializedName("max")
  private Integer max = null;

  /**
   * The classification of the recognized object.
   **/
  @ApiModelProperty(value = "The classification of the recognized object.")
  public String getInClass() {
    return inClass;
  }
  public void setInClass(String inClass) {
    this.inClass = inClass;
  }

  /**
   * The group of the classification.
   **/
  @ApiModelProperty(value = "The group of the classification.")
  public String getInGroup() {
    return inGroup;
  }
  public void setInGroup(String inGroup) {
    this.inGroup = inGroup;
  }

  /**
   * The count of how many instances of the classification object were found.
   **/
  @ApiModelProperty(value = "The count of how many instances of the classification object were found.")
  public Integer getFound() {
    return found;
  }
  public void setFound(Integer found) {
    this.found = found;
  }

  /**
   * The minimum allowed instances of the classification object.
   **/
  @ApiModelProperty(value = "The minimum allowed instances of the classification object.")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }

  /**
   * The maximum allowed instances of the classification object.
   **/
  @ApiModelProperty(value = "The maximum allowed instances of the classification object.")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INRule iNRule = (INRule) o;
    return (this.inClass == null ? iNRule.inClass == null : this.inClass.equals(iNRule.inClass)) &&
        (this.inGroup == null ? iNRule.inGroup == null : this.inGroup.equals(iNRule.inGroup)) &&
        (this.found == null ? iNRule.found == null : this.found.equals(iNRule.found)) &&
        (this.min == null ? iNRule.min == null : this.min.equals(iNRule.min)) &&
        (this.max == null ? iNRule.max == null : this.max.equals(iNRule.max));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.inClass == null ? 0: this.inClass.hashCode());
    result = 31 * result + (this.inGroup == null ? 0: this.inGroup.hashCode());
    result = 31 * result + (this.found == null ? 0: this.found.hashCode());
    result = 31 * result + (this.min == null ? 0: this.min.hashCode());
    result = 31 * result + (this.max == null ? 0: this.max.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class INRule {\n");
    
    sb.append("  inClass: ").append(inClass).append("\n");
    sb.append("  inGroup: ").append(inGroup).append("\n");
    sb.append("  found: ").append(found).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
