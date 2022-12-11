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

import java.io.File;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Contains the resulting media as base64 encoded string or an URL to download that media.
 **/
@ApiModel(description = "Contains the resulting media as base64 encoded string or an URL to download that media.")
public class Encoded {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("data")
  private File data = null;
  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  /**
   * The original filename of the image or video.
   **/
  @ApiModelProperty(value = "The original filename of the image or video.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The encoded media in base64 format.
   **/
  @ApiModelProperty(value = "The encoded media in base64 format.")
  public File getData() {
    return data;
  }
  public void setData(File data) {
    this.data = data;
  }

  /**
   * A one time URL to download the resulting media. The URL is only valid for 24 hours.
   **/
  @ApiModelProperty(value = "A one time URL to download the resulting media. The URL is only valid for 24 hours.")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Encoded encoded = (Encoded) o;
    return (this.name == null ? encoded.name == null : this.name.equals(encoded.name)) &&
        (this.data == null ? encoded.data == null : this.data.equals(encoded.data)) &&
        (this.downloadUrl == null ? encoded.downloadUrl == null : this.downloadUrl.equals(encoded.downloadUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.downloadUrl == null ? 0: this.downloadUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encoded {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  downloadUrl: ").append(downloadUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
