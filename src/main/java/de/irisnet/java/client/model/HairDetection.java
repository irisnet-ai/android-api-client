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

import de.irisnet.java.client.model.BaseDetection;
import de.irisnet.java.client.model.HairAttribute;
import de.irisnet.java.client.model.IdDocumentSubChecks;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Contains further characteristics particular to _hair_ detection.
 **/
@ApiModel(description = "Contains further characteristics particular to _hair_ detection.")
public class HairDetection extends BaseDetection {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("attributes")
  private List<HairAttribute> attributes = null;
  @SerializedName("subDetections")
  private List<BaseDetection> subDetections = null;
  @SerializedName("checkId")
  private String checkId = null;
  @SerializedName("hasOfficialDocument")
  private Boolean hasOfficialDocument = null;
  @SerializedName("comparable")
  private Boolean comparable = null;
  @SerializedName("faceSimilarity")
  private Integer faceSimilarity = null;
  @SerializedName("faceLivenessCheckScore")
  private Integer faceLivenessCheckScore = null;
  @SerializedName("documentFrontLivenessScore")
  private Integer documentFrontLivenessScore = null;
  @SerializedName("documentBackLivenessScore")
  private Integer documentBackLivenessScore = null;
  @SerializedName("processedChecks")
  private IdDocumentSubChecks processedChecks = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Contains attributes for the _hair_ classification.
   **/
  @ApiModelProperty(value = "Contains attributes for the _hair_ classification.")
  public List<HairAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<HairAttribute> attributes) {
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

  /**
   * The id of the check that lead to the detection
   **/
  @ApiModelProperty(value = "The id of the check that lead to the detection")
  public String getCheckId() {
    return checkId;
  }
  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }

  /**
   * Indicates whether the identified document is official
   **/
  @ApiModelProperty(value = "Indicates whether the identified document is official")
  public Boolean getHasOfficialDocument() {
    return hasOfficialDocument;
  }
  public void setHasOfficialDocument(Boolean hasOfficialDocument) {
    this.hasOfficialDocument = hasOfficialDocument;
  }

  /**
   * Indicates whether the provided selfie-image is comparable to the document
   **/
  @ApiModelProperty(value = "Indicates whether the provided selfie-image is comparable to the document")
  public Boolean getComparable() {
    return comparable;
  }
  public void setComparable(Boolean comparable) {
    this.comparable = comparable;
  }

  /**
   * Indicates the similarity-level of whether two faces belong to the same person
   **/
  @ApiModelProperty(value = "Indicates the similarity-level of whether two faces belong to the same person")
  public Integer getFaceSimilarity() {
    return faceSimilarity;
  }
  public void setFaceSimilarity(Integer faceSimilarity) {
    this.faceSimilarity = faceSimilarity;
  }

  /**
   * Indicates the liveness score of the selfie image
   **/
  @ApiModelProperty(value = "Indicates the liveness score of the selfie image")
  public Integer getFaceLivenessCheckScore() {
    return faceLivenessCheckScore;
  }
  public void setFaceLivenessCheckScore(Integer faceLivenessCheckScore) {
    this.faceLivenessCheckScore = faceLivenessCheckScore;
  }

  /**
   * Indicates the liveness score of the front side image of the document
   **/
  @ApiModelProperty(value = "Indicates the liveness score of the front side image of the document")
  public Integer getDocumentFrontLivenessScore() {
    return documentFrontLivenessScore;
  }
  public void setDocumentFrontLivenessScore(Integer documentFrontLivenessScore) {
    this.documentFrontLivenessScore = documentFrontLivenessScore;
  }

  /**
   * Indicates the liveness score of the back side image of the document
   **/
  @ApiModelProperty(value = "Indicates the liveness score of the back side image of the document")
  public Integer getDocumentBackLivenessScore() {
    return documentBackLivenessScore;
  }
  public void setDocumentBackLivenessScore(Integer documentBackLivenessScore) {
    this.documentBackLivenessScore = documentBackLivenessScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public IdDocumentSubChecks getProcessedChecks() {
    return processedChecks;
  }
  public void setProcessedChecks(IdDocumentSubChecks processedChecks) {
    this.processedChecks = processedChecks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HairDetection hairDetection = (HairDetection) o;
    return (this.type == null ? hairDetection.type == null : this.type.equals(hairDetection.type)) &&
        (this.attributes == null ? hairDetection.attributes == null : this.attributes.equals(hairDetection.attributes)) &&
        (this.subDetections == null ? hairDetection.subDetections == null : this.subDetections.equals(hairDetection.subDetections)) &&
        (this.checkId == null ? hairDetection.checkId == null : this.checkId.equals(hairDetection.checkId)) &&
        (this.hasOfficialDocument == null ? hairDetection.hasOfficialDocument == null : this.hasOfficialDocument.equals(hairDetection.hasOfficialDocument)) &&
        (this.comparable == null ? hairDetection.comparable == null : this.comparable.equals(hairDetection.comparable)) &&
        (this.faceSimilarity == null ? hairDetection.faceSimilarity == null : this.faceSimilarity.equals(hairDetection.faceSimilarity)) &&
        (this.faceLivenessCheckScore == null ? hairDetection.faceLivenessCheckScore == null : this.faceLivenessCheckScore.equals(hairDetection.faceLivenessCheckScore)) &&
        (this.documentFrontLivenessScore == null ? hairDetection.documentFrontLivenessScore == null : this.documentFrontLivenessScore.equals(hairDetection.documentFrontLivenessScore)) &&
        (this.documentBackLivenessScore == null ? hairDetection.documentBackLivenessScore == null : this.documentBackLivenessScore.equals(hairDetection.documentBackLivenessScore)) &&
        (this.processedChecks == null ? hairDetection.processedChecks == null : this.processedChecks.equals(hairDetection.processedChecks));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    result = 31 * result + (this.subDetections == null ? 0: this.subDetections.hashCode());
    result = 31 * result + (this.checkId == null ? 0: this.checkId.hashCode());
    result = 31 * result + (this.hasOfficialDocument == null ? 0: this.hasOfficialDocument.hashCode());
    result = 31 * result + (this.comparable == null ? 0: this.comparable.hashCode());
    result = 31 * result + (this.faceSimilarity == null ? 0: this.faceSimilarity.hashCode());
    result = 31 * result + (this.faceLivenessCheckScore == null ? 0: this.faceLivenessCheckScore.hashCode());
    result = 31 * result + (this.documentFrontLivenessScore == null ? 0: this.documentFrontLivenessScore.hashCode());
    result = 31 * result + (this.documentBackLivenessScore == null ? 0: this.documentBackLivenessScore.hashCode());
    result = 31 * result + (this.processedChecks == null ? 0: this.processedChecks.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HairDetection {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  subDetections: ").append(subDetections).append("\n");
    sb.append("  checkId: ").append(checkId).append("\n");
    sb.append("  hasOfficialDocument: ").append(hasOfficialDocument).append("\n");
    sb.append("  comparable: ").append(comparable).append("\n");
    sb.append("  faceSimilarity: ").append(faceSimilarity).append("\n");
    sb.append("  faceLivenessCheckScore: ").append(faceLivenessCheckScore).append("\n");
    sb.append("  documentFrontLivenessScore: ").append(documentFrontLivenessScore).append("\n");
    sb.append("  documentBackLivenessScore: ").append(documentBackLivenessScore).append("\n");
    sb.append("  processedChecks: ").append(processedChecks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
