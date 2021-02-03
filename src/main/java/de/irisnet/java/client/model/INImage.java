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
 * Configures your detection. As there are literally hundreds of parameters, INDefine uses prototypes to get usefull behaviour. This includes a default setting for parameters and rules that should be applied to images. You can combine multiple detections by using more than 1 prototype
 **/
@ApiModel(description = "Configures your detection. As there are literally hundreds of parameters, INDefine uses prototypes to get usefull behaviour. This includes a default setting for parameters and rules that should be applied to images. You can combine multiple detections by using more than 1 prototype")
public class INImage {
  
  public enum ProtoEnum {
     nudityCheck,  ageVerification,  ageEstimation,  illegalSymbols, 
  };
  @SerializedName("proto")
  private ProtoEnum proto = null;

  /**
   * Name of commonly used rule sets (prototypes). That can be used to speed up the setup process. * _nudityCheck_ - Commonly used prototype to check for nudity. * _ageVerification_ - Deprecated see 'ageEstimation'. * _ageEstimation_ - Checks if there are children, adults or seniors recognizable. This is intended to be a suggestion to help you implement further steps. * _illegalSymbols_ - Checks for symbols that are not permitted in Germany. 
   **/
  @ApiModelProperty(value = "Name of commonly used rule sets (prototypes). That can be used to speed up the setup process. * _nudityCheck_ - Commonly used prototype to check for nudity. * _ageVerification_ - Deprecated see 'ageEstimation'. * _ageEstimation_ - Checks if there are children, adults or seniors recognizable. This is intended to be a suggestion to help you implement further steps. * _illegalSymbols_ - Checks for symbols that are not permitted in Germany. ")
  public ProtoEnum getProto() {
    return proto;
  }
  public void setProto(ProtoEnum proto) {
    this.proto = proto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INImage iNImage = (INImage) o;
    return (this.proto == null ? iNImage.proto == null : this.proto.equals(iNImage.proto));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.proto == null ? 0: this.proto.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class INImage {\n");
    
    sb.append("  proto: ").append(proto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
