/**
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in real-time. This is an interactive documentation where you can quickly look up the endpoints and their schemas, while having the opportunity to try things out for yourself.  In the list below, you can see the available endpoints of the API, which can be expanded by clicking on them. Each expanded endpoint lists the request parameters (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail.  Additionally you'll find a 'Try it out' button that allows you to enter your custom parameters and custom body and execute that against the API. <b>Be sure to enter your license key to authorize the requests before using this documentation interactively.</b>  The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. If you click on the right arrow, you can expand the model and get a description of the model and the model parameters. For nested models, you can keep clicking the right arrow for further details.  Clicking the link below the title at the top of this page opens the [OpenAPI specification](https://swagger.io/specification/) (OAS3) in JSON format. The OAS3 Spec allows the generation of clients in many programming languages. There are several free client generators available that can be used to get started easily.
 *
 * The version of the OpenAPI document: v2
 * Contact: info@irisnet.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package de.irisnet.java.client.model;

import de.irisnet.java.client.model.Param;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A set of parameters/rules that describe how the AI should behave.
 **/
@ApiModel(description = "A set of parameters/rules that describe how the AI should behave.")
public class ParamSet {
  
  @SerializedName("thresh")
  private Float thresh = 0.5;
  @SerializedName("grey")
  private Integer grey = 127;
  @SerializedName("minDuration")
  private Integer minDuration = 100;
  @SerializedName("abortOnSeverity")
  private Integer abortOnSeverity = -1;
  @SerializedName("params")
  private List<Param> params = null;

  /**
   * Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives.
   * minimum: 0.0
   * maximum: 1.0
   **/
  @ApiModelProperty(value = "Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives.")
  public Float getThresh() {
    return thresh;
  }
  public void setThresh(Float thresh) {
    this.thresh = thresh;
  }

  /**
   * A grey scale color to use for frame or masking. '0' will represent black, while the maximum '255' will be white.
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "A grey scale color to use for frame or masking. '0' will represent black, while the maximum '255' will be white.")
  public Integer getGrey() {
    return grey;
  }
  public void setGrey(Integer grey) {
    this.grey = grey;
  }

  /**
   * Set the overall minimum duration in milliseconds for a rule to be broken in moving images.
   * minimum: 50
   * maximum: 250
   **/
  @ApiModelProperty(value = "Set the overall minimum duration in milliseconds for a rule to be broken in moving images.")
  public Integer getMinDuration() {
    return minDuration;
  }
  public void setMinDuration(Integer minDuration) {
    this.minDuration = minDuration;
  }

  /**
   * Set a severity on which to automatically stop the check operation. Works with moving images.Use '-1' to ignore this option.
   * minimum: -1
   **/
  @ApiModelProperty(value = "Set a severity on which to automatically stop the check operation. Works with moving images.Use '-1' to ignore this option.")
  public Integer getAbortOnSeverity() {
    return abortOnSeverity;
  }
  public void setAbortOnSeverity(Integer abortOnSeverity) {
    this.abortOnSeverity = abortOnSeverity;
  }

  /**
   * A list of parameter sets that describe the rules of the objects.
   **/
  @ApiModelProperty(value = "A list of parameter sets that describe the rules of the objects.")
  public List<Param> getParams() {
    return params;
  }
  public void setParams(List<Param> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamSet paramSet = (ParamSet) o;
    return (this.thresh == null ? paramSet.thresh == null : this.thresh.equals(paramSet.thresh)) &&
        (this.grey == null ? paramSet.grey == null : this.grey.equals(paramSet.grey)) &&
        (this.minDuration == null ? paramSet.minDuration == null : this.minDuration.equals(paramSet.minDuration)) &&
        (this.abortOnSeverity == null ? paramSet.abortOnSeverity == null : this.abortOnSeverity.equals(paramSet.abortOnSeverity)) &&
        (this.params == null ? paramSet.params == null : this.params.equals(paramSet.params));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.thresh == null ? 0: this.thresh.hashCode());
    result = 31 * result + (this.grey == null ? 0: this.grey.hashCode());
    result = 31 * result + (this.minDuration == null ? 0: this.minDuration.hashCode());
    result = 31 * result + (this.abortOnSeverity == null ? 0: this.abortOnSeverity.hashCode());
    result = 31 * result + (this.params == null ? 0: this.params.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamSet {\n");
    
    sb.append("  thresh: ").append(thresh).append("\n");
    sb.append("  grey: ").append(grey).append("\n");
    sb.append("  minDuration: ").append(minDuration).append("\n");
    sb.append("  abortOnSeverity: ").append(abortOnSeverity).append("\n");
    sb.append("  params: ").append(params).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
