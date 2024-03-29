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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Describes an event that lead to a broken rule.
 **/
@ApiModel(description = "Describes an event that lead to a broken rule.")
public class Event {
  
  @SerializedName("classification")
  private String classification = null;
  @SerializedName("group")
  private String group = null;
  @SerializedName("start")
  private Float start = null;
  @SerializedName("duration")
  private Float duration = null;
  @SerializedName("severity")
  private Integer severity = null;

  /**
   * The classification of the recognized object.
   **/
  @ApiModelProperty(value = "The classification of the recognized object.")
  public String getClassification() {
    return classification;
  }
  public void setClassification(String classification) {
    this.classification = classification;
  }

  /**
   * The group of the classification.
   **/
  @ApiModelProperty(value = "The group of the classification.")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * The start in seconds where the classification object is found.
   **/
  @ApiModelProperty(value = "The start in seconds where the classification object is found.")
  public Float getStart() {
    return start;
  }
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * The duration of the event in seconds until the classification object is no longer in frame. The current event is ongoing if the duration is not set.
   **/
  @ApiModelProperty(value = "The duration of the event in seconds until the classification object is no longer in frame. The current event is ongoing if the duration is not set.")
  public Float getDuration() {
    return duration;
  }
  public void setDuration(Float duration) {
    this.duration = duration;
  }

  /**
   * The severity of the classification object set while configuring the AI.
   **/
  @ApiModelProperty(value = "The severity of the classification object set while configuring the AI.")
  public Integer getSeverity() {
    return severity;
  }
  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return (this.classification == null ? event.classification == null : this.classification.equals(event.classification)) &&
        (this.group == null ? event.group == null : this.group.equals(event.group)) &&
        (this.start == null ? event.start == null : this.start.equals(event.start)) &&
        (this.duration == null ? event.duration == null : this.duration.equals(event.duration)) &&
        (this.severity == null ? event.severity == null : this.severity.equals(event.severity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.classification == null ? 0: this.classification.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.start == null ? 0: this.start.hashCode());
    result = 31 * result + (this.duration == null ? 0: this.duration.hashCode());
    result = 31 * result + (this.severity == null ? 0: this.severity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("  classification: ").append(classification).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  severity: ").append(severity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
