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
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Can be used to set a multitude of pre-defined commonly used rules without the need of specifying each parameter set.
 **/
@ApiModel(description = "Can be used to set a multitude of pre-defined commonly used rules without the need of specifying each parameter set.")
public class Config {
  
  @SerializedName("id")
  private UUID id = null;
  public enum Set&lt;PrototypesEnum&gt; {
     nudityCheck,  ageVerification,  ageEstimation,  illegalSymbols,  textRecognition,  attributesCheck,  bodyAttributes,  nippleCheck,  unwantedSubstances,  violenceCheck,  selfieCheck, 
  };
  @SerializedName("prototypes")
  private Set<PrototypesEnum> prototypes = null;

  /**
   * The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave.
   **/
  @ApiModelProperty(value = "The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave.")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation.
   **/
  @ApiModelProperty(value = "Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation.")
  public Set<PrototypesEnum> getPrototypes() {
    return prototypes;
  }
  public void setPrototypes(Set<PrototypesEnum> prototypes) {
    this.prototypes = prototypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return (this.id == null ? config.id == null : this.id.equals(config.id)) &&
        (this.prototypes == null ? config.prototypes == null : this.prototypes.equals(config.prototypes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.prototypes == null ? 0: this.prototypes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  prototypes: ").append(prototypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
