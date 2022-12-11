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

import de.irisnet.java.client.model.BaseAttribute;
import de.irisnet.java.client.model.BaseDetection;
import de.irisnet.java.client.model.Coordinates;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Contains further characteristics particular to _face_ detection.
 **/
@ApiModel(description = "Contains further characteristics particular to _face_ detection.")
public class FaceDetection extends BaseDetection {
  
  @SerializedName("classification")
  private String classification = null;
  @SerializedName("group")
  private String group = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("probability")
  private Integer probability = null;
  @SerializedName("coordinates")
  private Coordinates coordinates = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("attributes")
  private List<BaseAttribute> attributes = null;
  @SerializedName("subDetections")
  private List<BaseDetection> subDetections = null;

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
   * The id of the detection object.
   **/
  @ApiModelProperty(value = "The id of the detection object.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The probability that the object found matches the classification.
   **/
  @ApiModelProperty(value = "The probability that the object found matches the classification.")
  public Integer getProbability() {
    return probability;
  }
  public void setProbability(Integer probability) {
    this.probability = probability;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Coordinates getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  /**
   * Used as a type discriminator for json to object conversion.
   **/
  @ApiModelProperty(value = "Used as a type discriminator for json to object conversion.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Attributes characterizing the _face_ detection. Mainly contains attributes that were activated with the _ageEstimation_ prototype.
   **/
  @ApiModelProperty(value = "Attributes characterizing the _face_ detection. Mainly contains attributes that were activated with the _ageEstimation_ prototype.")
  public List<BaseAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<BaseAttribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype.
   **/
  @ApiModelProperty(value = "A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype.")
  public List<BaseDetection> getSubDetections() {
    return subDetections;
  }
  public void setSubDetections(List<BaseDetection> subDetections) {
    this.subDetections = subDetections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceDetection faceDetection = (FaceDetection) o;
    return (this.classification == null ? faceDetection.classification == null : this.classification.equals(faceDetection.classification)) &&
        (this.group == null ? faceDetection.group == null : this.group.equals(faceDetection.group)) &&
        (this.id == null ? faceDetection.id == null : this.id.equals(faceDetection.id)) &&
        (this.probability == null ? faceDetection.probability == null : this.probability.equals(faceDetection.probability)) &&
        (this.coordinates == null ? faceDetection.coordinates == null : this.coordinates.equals(faceDetection.coordinates)) &&
        (this.type == null ? faceDetection.type == null : this.type.equals(faceDetection.type)) &&
        (this.attributes == null ? faceDetection.attributes == null : this.attributes.equals(faceDetection.attributes)) &&
        (this.subDetections == null ? faceDetection.subDetections == null : this.subDetections.equals(faceDetection.subDetections));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.classification == null ? 0: this.classification.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.probability == null ? 0: this.probability.hashCode());
    result = 31 * result + (this.coordinates == null ? 0: this.coordinates.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    result = 31 * result + (this.subDetections == null ? 0: this.subDetections.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceDetection {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  classification: ").append(classification).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  probability: ").append(probability).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  subDetections: ").append(subDetections).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
