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

import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Attributes qualifying the _idDocument_ classification.
 **/
@ApiModel(description = "Attributes qualifying the _idDocument_ classification.")
public class IdDocumentAttribute {
  
  @SerializedName("type")
  private String type = null;
  public enum DocumentTypeEnum {
     passport,  driving_license,  national_identity_card,  residence_permit,  visa,  unknown, 
  };
  @SerializedName("documentType")
  private DocumentTypeEnum documentType = null;
  @SerializedName("documentNumber")
  private String documentNumber = null;
  @SerializedName("isTwoSided")
  private Boolean isTwoSided = null;
  @SerializedName("issuingAuthority")
  private String issuingAuthority = null;
  @SerializedName("issuingDate")
  private Date issuingDate = null;
  @SerializedName("issuingCountry")
  private String issuingCountry = null;
  @SerializedName("expirationDate")
  private Date expirationDate = null;
  @SerializedName("accessNumber")
  private String accessNumber = null;
  @SerializedName("firstNames")
  private List<String> firstNames = null;
  @SerializedName("lastNames")
  private List<String> lastNames = null;
  @SerializedName("birthName")
  private String birthName = null;
  @SerializedName("dateOfBirth")
  private Date dateOfBirth = null;
  @SerializedName("placeOfBirth")
  private String placeOfBirth = null;
  @SerializedName("nationality")
  private String nationality = null;
  public enum GenderEnum {
     male,  female,  other, 
  };
  @SerializedName("gender")
  private GenderEnum gender = null;
  @SerializedName("height")
  private String height = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("machineReadableZone")
  private List<String> machineReadableZone = null;

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
   * The type of the document
   **/
  @ApiModelProperty(value = "The type of the document")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  /**
   * The number of the document
   **/
  @ApiModelProperty(value = "The number of the document")
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   * Indicates whether the document is two-sided
   **/
  @ApiModelProperty(value = "Indicates whether the document is two-sided")
  public Boolean getIsTwoSided() {
    return isTwoSided;
  }
  public void setIsTwoSided(Boolean isTwoSided) {
    this.isTwoSided = isTwoSided;
  }

  /**
   * The issuing authority
   **/
  @ApiModelProperty(value = "The issuing authority")
  public String getIssuingAuthority() {
    return issuingAuthority;
  }
  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  /**
   * The issuing date
   **/
  @ApiModelProperty(value = "The issuing date")
  public Date getIssuingDate() {
    return issuingDate;
  }
  public void setIssuingDate(Date issuingDate) {
    this.issuingDate = issuingDate;
  }

  /**
   * The document's country in ISO 3166-1 alpha-2 format
   **/
  @ApiModelProperty(value = "The document's country in ISO 3166-1 alpha-2 format")
  public String getIssuingCountry() {
    return issuingCountry;
  }
  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }

  /**
   * The expiration date
   **/
  @ApiModelProperty(value = "The expiration date")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * The access number
   **/
  @ApiModelProperty(value = "The access number")
  public String getAccessNumber() {
    return accessNumber;
  }
  public void setAccessNumber(String accessNumber) {
    this.accessNumber = accessNumber;
  }

  /**
   * The document holder's first name(s)
   **/
  @ApiModelProperty(value = "The document holder's first name(s)")
  public List<String> getFirstNames() {
    return firstNames;
  }
  public void setFirstNames(List<String> firstNames) {
    this.firstNames = firstNames;
  }

  /**
   * The document holder's last name(s)
   **/
  @ApiModelProperty(value = "The document holder's last name(s)")
  public List<String> getLastNames() {
    return lastNames;
  }
  public void setLastNames(List<String> lastNames) {
    this.lastNames = lastNames;
  }

  /**
   * The document holder's birth name
   **/
  @ApiModelProperty(value = "The document holder's birth name")
  public String getBirthName() {
    return birthName;
  }
  public void setBirthName(String birthName) {
    this.birthName = birthName;
  }

  /**
   * The document holder's date of birth
   **/
  @ApiModelProperty(value = "The document holder's date of birth")
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The document holder's place of birth
   **/
  @ApiModelProperty(value = "The document holder's place of birth")
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }
  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  /**
   * The document holder's nationality in ISO 3166-1 alpha-2 format
   **/
  @ApiModelProperty(value = "The document holder's nationality in ISO 3166-1 alpha-2 format")
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * The document holder's gender
   **/
  @ApiModelProperty(value = "The document holder's gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  /**
   * The document holder's height
   **/
  @ApiModelProperty(value = "The document holder's height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * The document holder's address
   **/
  @ApiModelProperty(value = "The document holder's address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The document's machine readable zone (MRZ), at most 3 lines
   **/
  @ApiModelProperty(value = "The document's machine readable zone (MRZ), at most 3 lines")
  public List<String> getMachineReadableZone() {
    return machineReadableZone;
  }
  public void setMachineReadableZone(List<String> machineReadableZone) {
    this.machineReadableZone = machineReadableZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdDocumentAttribute idDocumentAttribute = (IdDocumentAttribute) o;
    return (this.type == null ? idDocumentAttribute.type == null : this.type.equals(idDocumentAttribute.type)) &&
        (this.documentType == null ? idDocumentAttribute.documentType == null : this.documentType.equals(idDocumentAttribute.documentType)) &&
        (this.documentNumber == null ? idDocumentAttribute.documentNumber == null : this.documentNumber.equals(idDocumentAttribute.documentNumber)) &&
        (this.isTwoSided == null ? idDocumentAttribute.isTwoSided == null : this.isTwoSided.equals(idDocumentAttribute.isTwoSided)) &&
        (this.issuingAuthority == null ? idDocumentAttribute.issuingAuthority == null : this.issuingAuthority.equals(idDocumentAttribute.issuingAuthority)) &&
        (this.issuingDate == null ? idDocumentAttribute.issuingDate == null : this.issuingDate.equals(idDocumentAttribute.issuingDate)) &&
        (this.issuingCountry == null ? idDocumentAttribute.issuingCountry == null : this.issuingCountry.equals(idDocumentAttribute.issuingCountry)) &&
        (this.expirationDate == null ? idDocumentAttribute.expirationDate == null : this.expirationDate.equals(idDocumentAttribute.expirationDate)) &&
        (this.accessNumber == null ? idDocumentAttribute.accessNumber == null : this.accessNumber.equals(idDocumentAttribute.accessNumber)) &&
        (this.firstNames == null ? idDocumentAttribute.firstNames == null : this.firstNames.equals(idDocumentAttribute.firstNames)) &&
        (this.lastNames == null ? idDocumentAttribute.lastNames == null : this.lastNames.equals(idDocumentAttribute.lastNames)) &&
        (this.birthName == null ? idDocumentAttribute.birthName == null : this.birthName.equals(idDocumentAttribute.birthName)) &&
        (this.dateOfBirth == null ? idDocumentAttribute.dateOfBirth == null : this.dateOfBirth.equals(idDocumentAttribute.dateOfBirth)) &&
        (this.placeOfBirth == null ? idDocumentAttribute.placeOfBirth == null : this.placeOfBirth.equals(idDocumentAttribute.placeOfBirth)) &&
        (this.nationality == null ? idDocumentAttribute.nationality == null : this.nationality.equals(idDocumentAttribute.nationality)) &&
        (this.gender == null ? idDocumentAttribute.gender == null : this.gender.equals(idDocumentAttribute.gender)) &&
        (this.height == null ? idDocumentAttribute.height == null : this.height.equals(idDocumentAttribute.height)) &&
        (this.address == null ? idDocumentAttribute.address == null : this.address.equals(idDocumentAttribute.address)) &&
        (this.machineReadableZone == null ? idDocumentAttribute.machineReadableZone == null : this.machineReadableZone.equals(idDocumentAttribute.machineReadableZone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.documentType == null ? 0: this.documentType.hashCode());
    result = 31 * result + (this.documentNumber == null ? 0: this.documentNumber.hashCode());
    result = 31 * result + (this.isTwoSided == null ? 0: this.isTwoSided.hashCode());
    result = 31 * result + (this.issuingAuthority == null ? 0: this.issuingAuthority.hashCode());
    result = 31 * result + (this.issuingDate == null ? 0: this.issuingDate.hashCode());
    result = 31 * result + (this.issuingCountry == null ? 0: this.issuingCountry.hashCode());
    result = 31 * result + (this.expirationDate == null ? 0: this.expirationDate.hashCode());
    result = 31 * result + (this.accessNumber == null ? 0: this.accessNumber.hashCode());
    result = 31 * result + (this.firstNames == null ? 0: this.firstNames.hashCode());
    result = 31 * result + (this.lastNames == null ? 0: this.lastNames.hashCode());
    result = 31 * result + (this.birthName == null ? 0: this.birthName.hashCode());
    result = 31 * result + (this.dateOfBirth == null ? 0: this.dateOfBirth.hashCode());
    result = 31 * result + (this.placeOfBirth == null ? 0: this.placeOfBirth.hashCode());
    result = 31 * result + (this.nationality == null ? 0: this.nationality.hashCode());
    result = 31 * result + (this.gender == null ? 0: this.gender.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.machineReadableZone == null ? 0: this.machineReadableZone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdDocumentAttribute {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  documentType: ").append(documentType).append("\n");
    sb.append("  documentNumber: ").append(documentNumber).append("\n");
    sb.append("  isTwoSided: ").append(isTwoSided).append("\n");
    sb.append("  issuingAuthority: ").append(issuingAuthority).append("\n");
    sb.append("  issuingDate: ").append(issuingDate).append("\n");
    sb.append("  issuingCountry: ").append(issuingCountry).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  accessNumber: ").append(accessNumber).append("\n");
    sb.append("  firstNames: ").append(firstNames).append("\n");
    sb.append("  lastNames: ").append(lastNames).append("\n");
    sb.append("  birthName: ").append(birthName).append("\n");
    sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
    sb.append("  placeOfBirth: ").append(placeOfBirth).append("\n");
    sb.append("  nationality: ").append(nationality).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  machineReadableZone: ").append(machineReadableZone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
