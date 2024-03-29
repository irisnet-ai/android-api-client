/**
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
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
 * A single parameter set for one object, for example face, describing the behaviour of the AI. Each object has default parameters that are set if these are empty.
 **/
@ApiModel(description = "A single parameter set for one object, for example face, describing the behaviour of the AI. Each object has default parameters that are set if these are empty.")
public class INParam {
  
  public enum InClassEnum {
     face,  hand,  foot,  footwear,  chest,  breast,  vulva,  penis,  vagina,  buttocks,  anus,  oral,  penetration,  toy,  child,  adult,  senior,  pose,  female,  male,  hair,  hairless,  beard,  moustache,  headpiece,  glasses,  sunglasses,  mask,  noNipple,  hasNipple,  nudityCheck,  ageVerification,  ageEstimation,  illegalSymbols,  textRecognition,  attributesCheck,  nippleCheck, 
  };
  @SerializedName("inClass")
  private InClassEnum inClass = null;
  @SerializedName("min")
  private Integer min = null;
  @SerializedName("max")
  private Integer max = null;
  @SerializedName("severity")
  private Integer severity = 100;
  @SerializedName("drawMode")
  private Integer drawMode = null;
  @SerializedName("grey")
  private Integer grey = 127;
  @SerializedName("scale")
  private Float scale = 1.0;

  /**
   * The classification of the object, that the element refers to. The following is a tree representation of the prototypes and their containing classifications. Default parameter values are defined per classification object. The default values of 'min', 'max' and 'drawMode' are witten after the name of the classification object in that order. Use the prototype names to set parameters to all of the containing classifications. ##### nudityCheck > _A prototype containing classifications for basic human attributes and sexual contents. This prototype and the containing classifications are activated by default_ * _face_ _(1, 3, 0)_ * _hand_ _(0, -1, 0)_ * _foot_ _(0, -1, 0)_ * _footwear_ _(0, -1, 0)_ * _chest_ _(0, -1, 0)_ * _breast_ _(0, 0, 2)_ * _vulva_ _(0, 0, 2)_ * _penis_ _(0, 0, 2)_ * _vagina_ _(0, 0, 2)_ * _buttocks_ _(0, 0, 2)_ * _anus_ _(0, 0, 2)_ * _toy_ _(0, -1, 0)_ * _oral_ _(0, 0, 2)_ * _penetration_ _(0, 0, 2)_ ##### ageEstimation > _Contains classification objects for estimating the age of a human face. This prototype activates nudityCheck_ * _child (*)_ _(0, 0, 6)_ * _adult (*)_ _(0, -1, 0)_ * _senior (*)_ _(0, -1, 0)_ * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. ##### attributesCheck > _Contains classification objects for various attributes of the human face. This prototype activates nudityCheck_ * _female (*)_ _(0, -1, 0)_ * _male (*)_ _(0, -1, 0)_ * _hair_ _(0, -1, 0)_ * _hairless_ _(0, -1, 0)_ * _beard_ _(0, -1, 0)_ * _moustache_ _(0, -1, 0)_ * _headpiece_ _(0, -1, 0)_ * _glasses_ _(0, -1, 0)_ * _sunglasses_ _(0, -1, 0)_ * _mask_ _(0, -1, 0)_ ##### nippleCheck > _Contains classifications for determining if the object recognized as breast has a nipple. This prototype activates nudityCheck_ * _noNipple_ _(0, 0, 0)_ * _hasNipple_ _(0, 0, 0)_ ##### illegalSymbols > _Contains various classification objects of symbols that are prohibited in Germany (e.g. Hakenkreuz, SS, etc). These are grouped under a single name_ * _illegalSymbols_ _(0, 0, 1)_ ##### textRecognition > _Contains letters, numbers and some symbols (e.g. @, #, etc) as classification objects. These are grouped under a single name_ * _textRecognition_ _(0, 6, 6)_  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._
   **/
  @ApiModelProperty(value = "The classification of the object, that the element refers to. The following is a tree representation of the prototypes and their containing classifications. Default parameter values are defined per classification object. The default values of 'min', 'max' and 'drawMode' are witten after the name of the classification object in that order. Use the prototype names to set parameters to all of the containing classifications. ##### nudityCheck > _A prototype containing classifications for basic human attributes and sexual contents. This prototype and the containing classifications are activated by default_ * _face_ _(1, 3, 0)_ * _hand_ _(0, -1, 0)_ * _foot_ _(0, -1, 0)_ * _footwear_ _(0, -1, 0)_ * _chest_ _(0, -1, 0)_ * _breast_ _(0, 0, 2)_ * _vulva_ _(0, 0, 2)_ * _penis_ _(0, 0, 2)_ * _vagina_ _(0, 0, 2)_ * _buttocks_ _(0, 0, 2)_ * _anus_ _(0, 0, 2)_ * _toy_ _(0, -1, 0)_ * _oral_ _(0, 0, 2)_ * _penetration_ _(0, 0, 2)_ ##### ageEstimation > _Contains classification objects for estimating the age of a human face. This prototype activates nudityCheck_ * _child (*)_ _(0, 0, 6)_ * _adult (*)_ _(0, -1, 0)_ * _senior (*)_ _(0, -1, 0)_ * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. ##### attributesCheck > _Contains classification objects for various attributes of the human face. This prototype activates nudityCheck_ * _female (*)_ _(0, -1, 0)_ * _male (*)_ _(0, -1, 0)_ * _hair_ _(0, -1, 0)_ * _hairless_ _(0, -1, 0)_ * _beard_ _(0, -1, 0)_ * _moustache_ _(0, -1, 0)_ * _headpiece_ _(0, -1, 0)_ * _glasses_ _(0, -1, 0)_ * _sunglasses_ _(0, -1, 0)_ * _mask_ _(0, -1, 0)_ ##### nippleCheck > _Contains classifications for determining if the object recognized as breast has a nipple. This prototype activates nudityCheck_ * _noNipple_ _(0, 0, 0)_ * _hasNipple_ _(0, 0, 0)_ ##### illegalSymbols > _Contains various classification objects of symbols that are prohibited in Germany (e.g. Hakenkreuz, SS, etc). These are grouped under a single name_ * _illegalSymbols_ _(0, 0, 1)_ ##### textRecognition > _Contains letters, numbers and some symbols (e.g. @, #, etc) as classification objects. These are grouped under a single name_ * _textRecognition_ _(0, 6, 6)_  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._")
  public InClassEnum getInClass() {
    return inClass;
  }
  public void setInClass(InClassEnum inClass) {
    this.inClass = inClass;
  }

  /**
   * The minimum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.
   **/
  @ApiModelProperty(value = "The minimum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }

  /**
   * The maximum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.
   **/
  @ApiModelProperty(value = "The maximum amount of objects allowed on the source media. Setting the value to -1 will cause the AI to ignore this rule.")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  /**
   * Set a value to define the severity of a broken rule of the given classification object.
   * minimum: 0
   * maximum: 1000
   **/
  @ApiModelProperty(value = "Set a value to define the severity of a broken rule of the given classification object.")
  public Integer getSeverity() {
    return severity;
  }
  public void setSeverity(Integer severity) {
    this.severity = severity;
  }

  /**
   * The draw mode that will be used for the creating the media.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur).
   * minimum: 0
   * maximum: 7
   **/
  @ApiModelProperty(value = "The draw mode that will be used for the creating the media.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur).")
  public Integer getDrawMode() {
    return drawMode;
  }
  public void setDrawMode(Integer drawMode) {
    this.drawMode = drawMode;
  }

  /**
   * A grey scale color to use for masking. '0' will represent black, while the maximum '255' will be white.
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "A grey scale color to use for masking. '0' will represent black, while the maximum '255' will be white.")
  public Integer getGrey() {
    return grey;
  }
  public void setGrey(Integer grey) {
    this.grey = grey;
  }

  /**
   * Scale of the draw rectangle around the classification object. Specify a value to increase or decrease the size of the border.
   * minimum: 0.5
   * maximum: 2.0
   **/
  @ApiModelProperty(value = "Scale of the draw rectangle around the classification object. Specify a value to increase or decrease the size of the border.")
  public Float getScale() {
    return scale;
  }
  public void setScale(Float scale) {
    this.scale = scale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INParam iNParam = (INParam) o;
    return (this.inClass == null ? iNParam.inClass == null : this.inClass.equals(iNParam.inClass)) &&
        (this.min == null ? iNParam.min == null : this.min.equals(iNParam.min)) &&
        (this.max == null ? iNParam.max == null : this.max.equals(iNParam.max)) &&
        (this.severity == null ? iNParam.severity == null : this.severity.equals(iNParam.severity)) &&
        (this.drawMode == null ? iNParam.drawMode == null : this.drawMode.equals(iNParam.drawMode)) &&
        (this.grey == null ? iNParam.grey == null : this.grey.equals(iNParam.grey)) &&
        (this.scale == null ? iNParam.scale == null : this.scale.equals(iNParam.scale));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.inClass == null ? 0: this.inClass.hashCode());
    result = 31 * result + (this.min == null ? 0: this.min.hashCode());
    result = 31 * result + (this.max == null ? 0: this.max.hashCode());
    result = 31 * result + (this.severity == null ? 0: this.severity.hashCode());
    result = 31 * result + (this.drawMode == null ? 0: this.drawMode.hashCode());
    result = 31 * result + (this.grey == null ? 0: this.grey.hashCode());
    result = 31 * result + (this.scale == null ? 0: this.scale.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class INParam {\n");
    
    sb.append("  inClass: ").append(inClass).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  severity: ").append(severity).append("\n");
    sb.append("  drawMode: ").append(drawMode).append("\n");
    sb.append("  grey: ").append(grey).append("\n");
    sb.append("  scale: ").append(scale).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
