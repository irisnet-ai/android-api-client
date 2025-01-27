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

import de.irisnet.java.client.model.AgeEstimationAttribute;
import de.irisnet.java.client.model.AgeEstimationSubChecks;
import de.irisnet.java.client.model.Coordinates;
import de.irisnet.java.client.model.Detection;
import de.irisnet.java.client.model.KnownFace;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Contains further characteristics particular to _ageEstimation_ detection.
 **/
@ApiModel(description = "Contains further characteristics particular to _ageEstimation_ detection.")
public class AgeEstimationDetection extends Detection {
  
  @SerializedName("type")
  private String type = null;
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
  @SerializedName("attributes")
  private List<AgeEstimationAttribute> attributes = null;
  @SerializedName("subDetections")
  private List<Detection> subDetections = null;
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
  private AgeEstimationSubChecks processedChecks = null;
  @SerializedName("documentHolderId")
  private String documentHolderId = null;
  @SerializedName("knownFaces")
  private List<KnownFace> knownFaces = null;

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
   * Attributes of the _idDocument_ detection.
   **/
  @ApiModelProperty(value = "Attributes of the _idDocument_ detection.")
  public List<AgeEstimationAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<AgeEstimationAttribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype.
   **/
  @ApiModelProperty(value = "A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype.")
  public List<Detection> getSubDetections() {
    return subDetections;
  }
  public void setSubDetections(List<Detection> subDetections) {
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
  public AgeEstimationSubChecks getProcessedChecks() {
    return processedChecks;
  }
  public void setProcessedChecks(AgeEstimationSubChecks processedChecks) {
    this.processedChecks = processedChecks;
  }

  /**
   * The id of the documentHolder
   **/
  @ApiModelProperty(value = "The id of the documentHolder")
  public String getDocumentHolderId() {
    return documentHolderId;
  }
  public void setDocumentHolderId(String documentHolderId) {
    this.documentHolderId = documentHolderId;
  }

  /**
   * A list of known faces, describing which other documentHolders match this documentHolder with a certain similarity
   **/
  @ApiModelProperty(value = "A list of known faces, describing which other documentHolders match this documentHolder with a certain similarity")
  public List<KnownFace> getKnownFaces() {
    return knownFaces;
  }
  public void setKnownFaces(List<KnownFace> knownFaces) {
    this.knownFaces = knownFaces;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeEstimationDetection ageEstimationDetection = (AgeEstimationDetection) o;
    return (this.type == null ? ageEstimationDetection.type == null : this.type.equals(ageEstimationDetection.type)) &&
        (this.classification == null ? ageEstimationDetection.classification == null : this.classification.equals(ageEstimationDetection.classification)) &&
        (this.group == null ? ageEstimationDetection.group == null : this.group.equals(ageEstimationDetection.group)) &&
        (this.id == null ? ageEstimationDetection.id == null : this.id.equals(ageEstimationDetection.id)) &&
        (this.probability == null ? ageEstimationDetection.probability == null : this.probability.equals(ageEstimationDetection.probability)) &&
        (this.coordinates == null ? ageEstimationDetection.coordinates == null : this.coordinates.equals(ageEstimationDetection.coordinates)) &&
        (this.attributes == null ? ageEstimationDetection.attributes == null : this.attributes.equals(ageEstimationDetection.attributes)) &&
        (this.subDetections == null ? ageEstimationDetection.subDetections == null : this.subDetections.equals(ageEstimationDetection.subDetections)) &&
        (this.checkId == null ? ageEstimationDetection.checkId == null : this.checkId.equals(ageEstimationDetection.checkId)) &&
        (this.hasOfficialDocument == null ? ageEstimationDetection.hasOfficialDocument == null : this.hasOfficialDocument.equals(ageEstimationDetection.hasOfficialDocument)) &&
        (this.comparable == null ? ageEstimationDetection.comparable == null : this.comparable.equals(ageEstimationDetection.comparable)) &&
        (this.faceSimilarity == null ? ageEstimationDetection.faceSimilarity == null : this.faceSimilarity.equals(ageEstimationDetection.faceSimilarity)) &&
        (this.faceLivenessCheckScore == null ? ageEstimationDetection.faceLivenessCheckScore == null : this.faceLivenessCheckScore.equals(ageEstimationDetection.faceLivenessCheckScore)) &&
        (this.documentFrontLivenessScore == null ? ageEstimationDetection.documentFrontLivenessScore == null : this.documentFrontLivenessScore.equals(ageEstimationDetection.documentFrontLivenessScore)) &&
        (this.documentBackLivenessScore == null ? ageEstimationDetection.documentBackLivenessScore == null : this.documentBackLivenessScore.equals(ageEstimationDetection.documentBackLivenessScore)) &&
        (this.processedChecks == null ? ageEstimationDetection.processedChecks == null : this.processedChecks.equals(ageEstimationDetection.processedChecks)) &&
        (this.documentHolderId == null ? ageEstimationDetection.documentHolderId == null : this.documentHolderId.equals(ageEstimationDetection.documentHolderId)) &&
        (this.knownFaces == null ? ageEstimationDetection.knownFaces == null : this.knownFaces.equals(ageEstimationDetection.knownFaces));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.classification == null ? 0: this.classification.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.probability == null ? 0: this.probability.hashCode());
    result = 31 * result + (this.coordinates == null ? 0: this.coordinates.hashCode());
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
    result = 31 * result + (this.documentHolderId == null ? 0: this.documentHolderId.hashCode());
    result = 31 * result + (this.knownFaces == null ? 0: this.knownFaces.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEstimationDetection {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  classification: ").append(classification).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  probability: ").append(probability).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
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
    sb.append("  documentHolderId: ").append(documentHolderId).append("\n");
    sb.append("  knownFaces: ").append(knownFaces).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
