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
 * Describes the current balance of the given license key. A key has a certain amount of credits that can be used for any kind of AI recognition. The license key is invalid, when all of the credits have been used.
 **/
@ApiModel(description = "Describes the current balance of the given license key. A key has a certain amount of credits that can be used for any kind of AI recognition. The license key is invalid, when all of the credits have been used.")
public class LicenseInfo {
  
  @SerializedName("creditsUsed")
  private Integer creditsUsed = null;
  @SerializedName("creditsRemaining")
  private Integer creditsRemaining = null;
  @SerializedName("totalCredits")
  private Integer totalCredits = null;

  /**
   * Credits used for the license key.
   **/
  @ApiModelProperty(value = "Credits used for the license key.")
  public Integer getCreditsUsed() {
    return creditsUsed;
  }
  public void setCreditsUsed(Integer creditsUsed) {
    this.creditsUsed = creditsUsed;
  }

  /**
   * Credits remaining for the license key.
   **/
  @ApiModelProperty(value = "Credits remaining for the license key.")
  public Integer getCreditsRemaining() {
    return creditsRemaining;
  }
  public void setCreditsRemaining(Integer creditsRemaining) {
    this.creditsRemaining = creditsRemaining;
  }

  /**
   * Total credits contained within the license.
   **/
  @ApiModelProperty(value = "Total credits contained within the license.")
  public Integer getTotalCredits() {
    return totalCredits;
  }
  public void setTotalCredits(Integer totalCredits) {
    this.totalCredits = totalCredits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseInfo licenseInfo = (LicenseInfo) o;
    return (this.creditsUsed == null ? licenseInfo.creditsUsed == null : this.creditsUsed.equals(licenseInfo.creditsUsed)) &&
        (this.creditsRemaining == null ? licenseInfo.creditsRemaining == null : this.creditsRemaining.equals(licenseInfo.creditsRemaining)) &&
        (this.totalCredits == null ? licenseInfo.totalCredits == null : this.totalCredits.equals(licenseInfo.totalCredits));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.creditsUsed == null ? 0: this.creditsUsed.hashCode());
    result = 31 * result + (this.creditsRemaining == null ? 0: this.creditsRemaining.hashCode());
    result = 31 * result + (this.totalCredits == null ? 0: this.totalCredits.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseInfo {\n");
    
    sb.append("  creditsUsed: ").append(creditsUsed).append("\n");
    sb.append("  creditsRemaining: ").append(creditsRemaining).append("\n");
    sb.append("  totalCredits: ").append(totalCredits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
