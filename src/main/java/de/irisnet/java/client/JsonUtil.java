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
    
    if ("INDefault".equalsIgnoreCase(className)) {
      return new TypeToken<List<INDefault>>(){}.getType();
    }
    
    if ("INDefineAI".equalsIgnoreCase(className)) {
      return new TypeToken<List<INDefineAI>>(){}.getType();
    }
    
    if ("INError".equalsIgnoreCase(className)) {
      return new TypeToken<List<INError>>(){}.getType();
    }
    
    if ("INImage".equalsIgnoreCase(className)) {
      return new TypeToken<List<INImage>>(){}.getType();
    }
    
    if ("INObject".equalsIgnoreCase(className)) {
      return new TypeToken<List<INObject>>(){}.getType();
    }
    
    if ("INParam".equalsIgnoreCase(className)) {
      return new TypeToken<List<INParam>>(){}.getType();
    }
    
    if ("INParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<INParams>>(){}.getType();
    }
    
    if ("INRule".equalsIgnoreCase(className)) {
      return new TypeToken<List<INRule>>(){}.getType();
    }
    
    if ("InlineObject".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineObject>>(){}.getType();
    }
    
    if ("IrisNet".equalsIgnoreCase(className)) {
      return new TypeToken<List<IrisNet>>(){}.getType();
    }
    
    if ("LicenseInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<LicenseInfo>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("INDefault".equalsIgnoreCase(className)) {
      return new TypeToken<INDefault>(){}.getType();
    }
    
    if ("INDefineAI".equalsIgnoreCase(className)) {
      return new TypeToken<INDefineAI>(){}.getType();
    }
    
    if ("INError".equalsIgnoreCase(className)) {
      return new TypeToken<INError>(){}.getType();
    }
    
    if ("INImage".equalsIgnoreCase(className)) {
      return new TypeToken<INImage>(){}.getType();
    }
    
    if ("INObject".equalsIgnoreCase(className)) {
      return new TypeToken<INObject>(){}.getType();
    }
    
    if ("INParam".equalsIgnoreCase(className)) {
      return new TypeToken<INParam>(){}.getType();
    }
    
    if ("INParams".equalsIgnoreCase(className)) {
      return new TypeToken<INParams>(){}.getType();
    }
    
    if ("INRule".equalsIgnoreCase(className)) {
      return new TypeToken<INRule>(){}.getType();
    }
    
    if ("InlineObject".equalsIgnoreCase(className)) {
      return new TypeToken<InlineObject>(){}.getType();
    }
    
    if ("IrisNet".equalsIgnoreCase(className)) {
      return new TypeToken<IrisNet>(){}.getType();
    }
    
    if ("LicenseInfo".equalsIgnoreCase(className)) {
      return new TypeToken<LicenseInfo>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
