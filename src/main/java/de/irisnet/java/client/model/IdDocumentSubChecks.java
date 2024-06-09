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
 * Contains information on idDocument sub-checks
 **/
@ApiModel(description = "Contains information on idDocument sub-checks")
public class IdDocumentSubChecks {
  
  public enum MrzChecksumEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("mrzChecksum")
  private MrzChecksumEnum mrzChecksum = null;
  public enum MrzFormatEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("mrzFormat")
  private MrzFormatEnum mrzFormat = null;
  public enum MrzConsistencyEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("mrzConsistency")
  private MrzConsistencyEnum mrzConsistency = null;
  public enum ExpirationDateEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("expirationDate")
  private ExpirationDateEnum expirationDate = null;
  public enum SecurityElementsEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("securityElements")
  private SecurityElementsEnum securityElements = null;
  public enum PhotoLocationEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("photoLocation")
  private PhotoLocationEnum photoLocation = null;
  public enum BlacklistCheckEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("blacklistCheck")
  private BlacklistCheckEnum blacklistCheck = null;
  public enum PhotocopyCheckEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("photocopyCheck")
  private PhotocopyCheckEnum photocopyCheck = null;
  public enum SpecimenCheckEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("specimenCheck")
  private SpecimenCheckEnum specimenCheck = null;
  public enum DocumentModelIdentificationEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("documentModelIdentification")
  private DocumentModelIdentificationEnum documentModelIdentification = null;
  public enum DocumentLivenessCheckEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("documentLivenessCheck")
  private DocumentLivenessCheckEnum documentLivenessCheck = null;
  public enum SpoofedImageAnalysisEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("spoofedImageAnalysis")
  private SpoofedImageAnalysisEnum spoofedImageAnalysis = null;
  public enum FaceLivenessCheckEnum {
     passed,  failed,  not_processed, 
  };
  @SerializedName("faceLivenessCheck")
  private FaceLivenessCheckEnum faceLivenessCheck = null;

  /**
   * Indicates whether the MRZ checksum is correct
   **/
  @ApiModelProperty(value = "Indicates whether the MRZ checksum is correct")
  public MrzChecksumEnum getMrzChecksum() {
    return mrzChecksum;
  }
  public void setMrzChecksum(MrzChecksumEnum mrzChecksum) {
    this.mrzChecksum = mrzChecksum;
  }

  /**
   * Indicates whether the MRZ format is correct
   **/
  @ApiModelProperty(value = "Indicates whether the MRZ format is correct")
  public MrzFormatEnum getMrzFormat() {
    return mrzFormat;
  }
  public void setMrzFormat(MrzFormatEnum mrzFormat) {
    this.mrzFormat = mrzFormat;
  }

  /**
   * Indicates whether the MRZ is consistent with the document type
   **/
  @ApiModelProperty(value = "Indicates whether the MRZ is consistent with the document type")
  public MrzConsistencyEnum getMrzConsistency() {
    return mrzConsistency;
  }
  public void setMrzConsistency(MrzConsistencyEnum mrzConsistency) {
    this.mrzConsistency = mrzConsistency;
  }

  /**
   * Indicates whether the expirationDate is valid
   **/
  @ApiModelProperty(value = "Indicates whether the expirationDate is valid")
  public ExpirationDateEnum getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(ExpirationDateEnum expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * Indicates whether the document's security elements are valid
   **/
  @ApiModelProperty(value = "Indicates whether the document's security elements are valid")
  public SecurityElementsEnum getSecurityElements() {
    return securityElements;
  }
  public void setSecurityElements(SecurityElementsEnum securityElements) {
    this.securityElements = securityElements;
  }

  /**
   * Indicates whether the photo is in the correct location for a given document type
   **/
  @ApiModelProperty(value = "Indicates whether the photo is in the correct location for a given document type")
  public PhotoLocationEnum getPhotoLocation() {
    return photoLocation;
  }
  public void setPhotoLocation(PhotoLocationEnum photoLocation) {
    this.photoLocation = photoLocation;
  }

  /**
   * Indicates whether a competent authority deny-listed the ID document
   **/
  @ApiModelProperty(value = "Indicates whether a competent authority deny-listed the ID document")
  public BlacklistCheckEnum getBlacklistCheck() {
    return blacklistCheck;
  }
  public void setBlacklistCheck(BlacklistCheckEnum blacklistCheck) {
    this.blacklistCheck = blacklistCheck;
  }

  /**
   * Indicates whether the document is a photocopy
   **/
  @ApiModelProperty(value = "Indicates whether the document is a photocopy")
  public PhotocopyCheckEnum getPhotocopyCheck() {
    return photocopyCheck;
  }
  public void setPhotocopyCheck(PhotocopyCheckEnum photocopyCheck) {
    this.photocopyCheck = photocopyCheck;
  }

  /**
   * Indicates whether the document has been copied from the Internet
   **/
  @ApiModelProperty(value = "Indicates whether the document has been copied from the Internet")
  public SpecimenCheckEnum getSpecimenCheck() {
    return specimenCheck;
  }
  public void setSpecimenCheck(SpecimenCheckEnum specimenCheck) {
    this.specimenCheck = specimenCheck;
  }

  /**
   * Indicates whether the document model has been identified
   **/
  @ApiModelProperty(value = "Indicates whether the document model has been identified")
  public DocumentModelIdentificationEnum getDocumentModelIdentification() {
    return documentModelIdentification;
  }
  public void setDocumentModelIdentification(DocumentModelIdentificationEnum documentModelIdentification) {
    this.documentModelIdentification = documentModelIdentification;
  }

  /**
   * Indicates if the document image is genuine and not a photo of an image or of a screen
   **/
  @ApiModelProperty(value = "Indicates if the document image is genuine and not a photo of an image or of a screen")
  public DocumentLivenessCheckEnum getDocumentLivenessCheck() {
    return documentLivenessCheck;
  }
  public void setDocumentLivenessCheck(DocumentLivenessCheckEnum documentLivenessCheck) {
    this.documentLivenessCheck = documentLivenessCheck;
  }

  /**
   * Indicates whether the selfie image is spoofed, copied from the Internet, or is a known deny-listed image
   **/
  @ApiModelProperty(value = "Indicates whether the selfie image is spoofed, copied from the Internet, or is a known deny-listed image")
  public SpoofedImageAnalysisEnum getSpoofedImageAnalysis() {
    return spoofedImageAnalysis;
  }
  public void setSpoofedImageAnalysis(SpoofedImageAnalysisEnum spoofedImageAnalysis) {
    this.spoofedImageAnalysis = spoofedImageAnalysis;
  }

  /**
   * Indicates if the selfie image is genuine and not a photo of an image or of a screen
   **/
  @ApiModelProperty(value = "Indicates if the selfie image is genuine and not a photo of an image or of a screen")
  public FaceLivenessCheckEnum getFaceLivenessCheck() {
    return faceLivenessCheck;
  }
  public void setFaceLivenessCheck(FaceLivenessCheckEnum faceLivenessCheck) {
    this.faceLivenessCheck = faceLivenessCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdDocumentSubChecks idDocumentSubChecks = (IdDocumentSubChecks) o;
    return (this.mrzChecksum == null ? idDocumentSubChecks.mrzChecksum == null : this.mrzChecksum.equals(idDocumentSubChecks.mrzChecksum)) &&
        (this.mrzFormat == null ? idDocumentSubChecks.mrzFormat == null : this.mrzFormat.equals(idDocumentSubChecks.mrzFormat)) &&
        (this.mrzConsistency == null ? idDocumentSubChecks.mrzConsistency == null : this.mrzConsistency.equals(idDocumentSubChecks.mrzConsistency)) &&
        (this.expirationDate == null ? idDocumentSubChecks.expirationDate == null : this.expirationDate.equals(idDocumentSubChecks.expirationDate)) &&
        (this.securityElements == null ? idDocumentSubChecks.securityElements == null : this.securityElements.equals(idDocumentSubChecks.securityElements)) &&
        (this.photoLocation == null ? idDocumentSubChecks.photoLocation == null : this.photoLocation.equals(idDocumentSubChecks.photoLocation)) &&
        (this.blacklistCheck == null ? idDocumentSubChecks.blacklistCheck == null : this.blacklistCheck.equals(idDocumentSubChecks.blacklistCheck)) &&
        (this.photocopyCheck == null ? idDocumentSubChecks.photocopyCheck == null : this.photocopyCheck.equals(idDocumentSubChecks.photocopyCheck)) &&
        (this.specimenCheck == null ? idDocumentSubChecks.specimenCheck == null : this.specimenCheck.equals(idDocumentSubChecks.specimenCheck)) &&
        (this.documentModelIdentification == null ? idDocumentSubChecks.documentModelIdentification == null : this.documentModelIdentification.equals(idDocumentSubChecks.documentModelIdentification)) &&
        (this.documentLivenessCheck == null ? idDocumentSubChecks.documentLivenessCheck == null : this.documentLivenessCheck.equals(idDocumentSubChecks.documentLivenessCheck)) &&
        (this.spoofedImageAnalysis == null ? idDocumentSubChecks.spoofedImageAnalysis == null : this.spoofedImageAnalysis.equals(idDocumentSubChecks.spoofedImageAnalysis)) &&
        (this.faceLivenessCheck == null ? idDocumentSubChecks.faceLivenessCheck == null : this.faceLivenessCheck.equals(idDocumentSubChecks.faceLivenessCheck));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mrzChecksum == null ? 0: this.mrzChecksum.hashCode());
    result = 31 * result + (this.mrzFormat == null ? 0: this.mrzFormat.hashCode());
    result = 31 * result + (this.mrzConsistency == null ? 0: this.mrzConsistency.hashCode());
    result = 31 * result + (this.expirationDate == null ? 0: this.expirationDate.hashCode());
    result = 31 * result + (this.securityElements == null ? 0: this.securityElements.hashCode());
    result = 31 * result + (this.photoLocation == null ? 0: this.photoLocation.hashCode());
    result = 31 * result + (this.blacklistCheck == null ? 0: this.blacklistCheck.hashCode());
    result = 31 * result + (this.photocopyCheck == null ? 0: this.photocopyCheck.hashCode());
    result = 31 * result + (this.specimenCheck == null ? 0: this.specimenCheck.hashCode());
    result = 31 * result + (this.documentModelIdentification == null ? 0: this.documentModelIdentification.hashCode());
    result = 31 * result + (this.documentLivenessCheck == null ? 0: this.documentLivenessCheck.hashCode());
    result = 31 * result + (this.spoofedImageAnalysis == null ? 0: this.spoofedImageAnalysis.hashCode());
    result = 31 * result + (this.faceLivenessCheck == null ? 0: this.faceLivenessCheck.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdDocumentSubChecks {\n");
    
    sb.append("  mrzChecksum: ").append(mrzChecksum).append("\n");
    sb.append("  mrzFormat: ").append(mrzFormat).append("\n");
    sb.append("  mrzConsistency: ").append(mrzConsistency).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  securityElements: ").append(securityElements).append("\n");
    sb.append("  photoLocation: ").append(photoLocation).append("\n");
    sb.append("  blacklistCheck: ").append(blacklistCheck).append("\n");
    sb.append("  photocopyCheck: ").append(photocopyCheck).append("\n");
    sb.append("  specimenCheck: ").append(specimenCheck).append("\n");
    sb.append("  documentModelIdentification: ").append(documentModelIdentification).append("\n");
    sb.append("  documentLivenessCheck: ").append(documentLivenessCheck).append("\n");
    sb.append("  spoofedImageAnalysis: ").append(spoofedImageAnalysis).append("\n");
    sb.append("  faceLivenessCheck: ").append(faceLivenessCheck).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
