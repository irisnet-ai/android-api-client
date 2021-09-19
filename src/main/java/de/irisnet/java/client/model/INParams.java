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

import de.irisnet.java.client.model.INDefault;
import de.irisnet.java.client.model.INParam;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A set of parameters/rules that describe how the AI should behave.
 **/
@ApiModel(description = "A set of parameters/rules that describe how the AI should behave.")
public class INParams {
  
  @SerializedName("inDefault")
  private INDefault inDefault = null;
  @SerializedName("inParam")
  private List<INParam> inParam = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public INDefault getInDefault() {
    return inDefault;
  }
  public void setInDefault(INDefault inDefault) {
    this.inDefault = inDefault;
  }

  /**
   * A list of parameter sets that describe the rules of the objects.
   **/
  @ApiModelProperty(value = "A list of parameter sets that describe the rules of the objects.")
  public List<INParam> getInParam() {
    return inParam;
  }
  public void setInParam(List<INParam> inParam) {
    this.inParam = inParam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INParams iNParams = (INParams) o;
    return (this.inDefault == null ? iNParams.inDefault == null : this.inDefault.equals(iNParams.inDefault)) &&
        (this.inParam == null ? iNParams.inParam == null : this.inParam.equals(iNParams.inParam));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.inDefault == null ? 0: this.inDefault.hashCode());
    result = 31 * result + (this.inParam == null ? 0: this.inParam.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class INParams {\n");
    
    sb.append("  inDefault: ").append(inDefault).append("\n");
    sb.append("  inParam: ").append(inParam).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
