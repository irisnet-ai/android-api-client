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

package de.irisnet.java.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import de.irisnet.java.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AgeEstimationAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<List<AgeEstimationAttribute>>(){}.getType();
    }
    
    if ("AgeEstimationDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<AgeEstimationDetection>>(){}.getType();
    }
    
    if ("AgeEstimationSubChecks".equalsIgnoreCase(className)) {
      return new TypeToken<List<AgeEstimationSubChecks>>(){}.getType();
    }
    
    if ("ApiNotice".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiNotice>>(){}.getType();
    }
    
    if ("BaseAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<List<BaseAttribute>>(){}.getType();
    }
    
    if ("BaseDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<BaseDetection>>(){}.getType();
    }
    
    if ("BreastDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<BreastDetection>>(){}.getType();
    }
    
    if ("BrokenRule".equalsIgnoreCase(className)) {
      return new TypeToken<List<BrokenRule>>(){}.getType();
    }
    
    if ("Callback".equalsIgnoreCase(className)) {
      return new TypeToken<List<Callback>>(){}.getType();
    }
    
    if ("CheckResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckResult>>(){}.getType();
    }
    
    if ("Config".equalsIgnoreCase(className)) {
      return new TypeToken<List<Config>>(){}.getType();
    }
    
    if ("Data".equalsIgnoreCase(className)) {
      return new TypeToken<List<Data>>(){}.getType();
    }
    
    if ("DocumentCheckRequestData".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentCheckRequestData>>(){}.getType();
    }
    
    if ("Encoded".equalsIgnoreCase(className)) {
      return new TypeToken<List<Encoded>>(){}.getType();
    }
    
    if ("Event".equalsIgnoreCase(className)) {
      return new TypeToken<List<Event>>(){}.getType();
    }
    
    if ("FaceDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaceDetection>>(){}.getType();
    }
    
    if ("HairAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<List<HairAttribute>>(){}.getType();
    }
    
    if ("HairDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<HairDetection>>(){}.getType();
    }
    
    if ("IdDocumentAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<List<IdDocumentAttribute>>(){}.getType();
    }
    
    if ("IdDocumentDetection".equalsIgnoreCase(className)) {
      return new TypeToken<List<IdDocumentDetection>>(){}.getType();
    }
    
    if ("IdDocumentSubChecks".equalsIgnoreCase(className)) {
      return new TypeToken<List<IdDocumentSubChecks>>(){}.getType();
    }
    
    if ("LicenseInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<LicenseInfo>>(){}.getType();
    }
    
    if ("Param".equalsIgnoreCase(className)) {
      return new TypeToken<List<Param>>(){}.getType();
    }
    
    if ("ParamSet".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParamSet>>(){}.getType();
    }
    
    if ("Pricing".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pricing>>(){}.getType();
    }
    
    if ("Summary".equalsIgnoreCase(className)) {
      return new TypeToken<List<Summary>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AgeEstimationAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<AgeEstimationAttribute>(){}.getType();
    }
    
    if ("AgeEstimationDetection".equalsIgnoreCase(className)) {
      return new TypeToken<AgeEstimationDetection>(){}.getType();
    }
    
    if ("AgeEstimationSubChecks".equalsIgnoreCase(className)) {
      return new TypeToken<AgeEstimationSubChecks>(){}.getType();
    }
    
    if ("ApiNotice".equalsIgnoreCase(className)) {
      return new TypeToken<ApiNotice>(){}.getType();
    }
    
    if ("BaseAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<BaseAttribute>(){}.getType();
    }
    
    if ("BaseDetection".equalsIgnoreCase(className)) {
      return new TypeToken<BaseDetection>(){}.getType();
    }
    
    if ("BreastDetection".equalsIgnoreCase(className)) {
      return new TypeToken<BreastDetection>(){}.getType();
    }
    
    if ("BrokenRule".equalsIgnoreCase(className)) {
      return new TypeToken<BrokenRule>(){}.getType();
    }
    
    if ("Callback".equalsIgnoreCase(className)) {
      return new TypeToken<Callback>(){}.getType();
    }
    
    if ("CheckResult".equalsIgnoreCase(className)) {
      return new TypeToken<CheckResult>(){}.getType();
    }
    
    if ("Config".equalsIgnoreCase(className)) {
      return new TypeToken<Config>(){}.getType();
    }
    
    if ("Data".equalsIgnoreCase(className)) {
      return new TypeToken<Data>(){}.getType();
    }
    
    if ("DocumentCheckRequestData".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentCheckRequestData>(){}.getType();
    }
    
    if ("Encoded".equalsIgnoreCase(className)) {
      return new TypeToken<Encoded>(){}.getType();
    }
    
    if ("Event".equalsIgnoreCase(className)) {
      return new TypeToken<Event>(){}.getType();
    }
    
    if ("FaceDetection".equalsIgnoreCase(className)) {
      return new TypeToken<FaceDetection>(){}.getType();
    }
    
    if ("HairAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<HairAttribute>(){}.getType();
    }
    
    if ("HairDetection".equalsIgnoreCase(className)) {
      return new TypeToken<HairDetection>(){}.getType();
    }
    
    if ("IdDocumentAttribute".equalsIgnoreCase(className)) {
      return new TypeToken<IdDocumentAttribute>(){}.getType();
    }
    
    if ("IdDocumentDetection".equalsIgnoreCase(className)) {
      return new TypeToken<IdDocumentDetection>(){}.getType();
    }
    
    if ("IdDocumentSubChecks".equalsIgnoreCase(className)) {
      return new TypeToken<IdDocumentSubChecks>(){}.getType();
    }
    
    if ("LicenseInfo".equalsIgnoreCase(className)) {
      return new TypeToken<LicenseInfo>(){}.getType();
    }
    
    if ("Param".equalsIgnoreCase(className)) {
      return new TypeToken<Param>(){}.getType();
    }
    
    if ("ParamSet".equalsIgnoreCase(className)) {
      return new TypeToken<ParamSet>(){}.getType();
    }
    
    if ("Pricing".equalsIgnoreCase(className)) {
      return new TypeToken<Pricing>(){}.getType();
    }
    
    if ("Summary".equalsIgnoreCase(className)) {
      return new TypeToken<Summary>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
