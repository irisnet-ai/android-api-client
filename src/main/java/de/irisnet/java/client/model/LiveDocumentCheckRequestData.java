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

import de.irisnet.java.client.model.Callback;
import java.net.URI;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Data containing neccessary information to handle the enduser live check.
 **/
@ApiModel(description = "Data containing neccessary information to handle the enduser live check.")
public class LiveDocumentCheckRequestData {
  
  @SerializedName("callback")
  private Callback callback = null;
  @SerializedName("statusUrl")
  private URI statusUrl = null;
  @SerializedName("endUserRedirectUrl")
  private URI endUserRedirectUrl = null;
  @SerializedName("tokenValidityInSeconds")
  private Long tokenValidityInSeconds = null;
  @SerializedName("documentHolderId")
  private String documentHolderId = null;
  @SerializedName("minimumAcceptedAge")
  private Integer minimumAcceptedAge = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Callback getCallback() {
    return callback;
  }
  public void setCallback(Callback callback) {
    this.callback = callback;
  }

  /**
   * The URL to send the intermediate status requests to. If not set, no intermediate status requests will be sent.
   **/
  @ApiModelProperty(value = "The URL to send the intermediate status requests to. If not set, no intermediate status requests will be sent.")
  public URI getStatusUrl() {
    return statusUrl;
  }
  public void setStatusUrl(URI statusUrl) {
    this.statusUrl = statusUrl;
  }

  /**
   * If set the enduser is being redirected to this URL after the check is finished.
   **/
  @ApiModelProperty(value = "If set the enduser is being redirected to this URL after the check is finished.")
  public URI getEndUserRedirectUrl() {
    return endUserRedirectUrl;
  }
  public void setEndUserRedirectUrl(URI endUserRedirectUrl) {
    this.endUserRedirectUrl = endUserRedirectUrl;
  }

  /**
   * The validity duration of a started ident process in seconds. Defaults to 3600 seconds = 60 minutes.
   **/
  @ApiModelProperty(value = "The validity duration of a started ident process in seconds. Defaults to 3600 seconds = 60 minutes.")
  public Long getTokenValidityInSeconds() {
    return tokenValidityInSeconds;
  }
  public void setTokenValidityInSeconds(Long tokenValidityInSeconds) {
    this.tokenValidityInSeconds = tokenValidityInSeconds;
  }

  /**
   * The documentHolderId from a previous successful live identification.
   **/
  @ApiModelProperty(value = "The documentHolderId from a previous successful live identification.")
  public String getDocumentHolderId() {
    return documentHolderId;
  }
  public void setDocumentHolderId(String documentHolderId) {
    this.documentHolderId = documentHolderId;
  }

  /**
   * The minimum age in years accepted for a check, if applicable. Defaults to 18 if not specified.
   **/
  @ApiModelProperty(value = "The minimum age in years accepted for a check, if applicable. Defaults to 18 if not specified.")
  public Integer getMinimumAcceptedAge() {
    return minimumAcceptedAge;
  }
  public void setMinimumAcceptedAge(Integer minimumAcceptedAge) {
    this.minimumAcceptedAge = minimumAcceptedAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveDocumentCheckRequestData liveDocumentCheckRequestData = (LiveDocumentCheckRequestData) o;
    return (this.callback == null ? liveDocumentCheckRequestData.callback == null : this.callback.equals(liveDocumentCheckRequestData.callback)) &&
        (this.statusUrl == null ? liveDocumentCheckRequestData.statusUrl == null : this.statusUrl.equals(liveDocumentCheckRequestData.statusUrl)) &&
        (this.endUserRedirectUrl == null ? liveDocumentCheckRequestData.endUserRedirectUrl == null : this.endUserRedirectUrl.equals(liveDocumentCheckRequestData.endUserRedirectUrl)) &&
        (this.tokenValidityInSeconds == null ? liveDocumentCheckRequestData.tokenValidityInSeconds == null : this.tokenValidityInSeconds.equals(liveDocumentCheckRequestData.tokenValidityInSeconds)) &&
        (this.documentHolderId == null ? liveDocumentCheckRequestData.documentHolderId == null : this.documentHolderId.equals(liveDocumentCheckRequestData.documentHolderId)) &&
        (this.minimumAcceptedAge == null ? liveDocumentCheckRequestData.minimumAcceptedAge == null : this.minimumAcceptedAge.equals(liveDocumentCheckRequestData.minimumAcceptedAge));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.callback == null ? 0: this.callback.hashCode());
    result = 31 * result + (this.statusUrl == null ? 0: this.statusUrl.hashCode());
    result = 31 * result + (this.endUserRedirectUrl == null ? 0: this.endUserRedirectUrl.hashCode());
    result = 31 * result + (this.tokenValidityInSeconds == null ? 0: this.tokenValidityInSeconds.hashCode());
    result = 31 * result + (this.documentHolderId == null ? 0: this.documentHolderId.hashCode());
    result = 31 * result + (this.minimumAcceptedAge == null ? 0: this.minimumAcceptedAge.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveDocumentCheckRequestData {\n");
    
    sb.append("  callback: ").append(callback).append("\n");
    sb.append("  statusUrl: ").append(statusUrl).append("\n");
    sb.append("  endUserRedirectUrl: ").append(endUserRedirectUrl).append("\n");
    sb.append("  tokenValidityInSeconds: ").append(tokenValidityInSeconds).append("\n");
    sb.append("  documentHolderId: ").append(documentHolderId).append("\n");
    sb.append("  minimumAcceptedAge: ").append(minimumAcceptedAge).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
