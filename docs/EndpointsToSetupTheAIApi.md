# EndpointsToSetupTheAIApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setINDefine**](EndpointsToSetupTheAIApi.md#setINDefine) | **POST** /v1/set-definition | Set definitions via pre-defined prototypes.
[**setINParams**](EndpointsToSetupTheAIApi.md#setINParams) | **POST** /v1/set-parameters | Set the behaviour parameters for one object class.



## setINDefine

> setINDefine(iNDefineAI)

Set definitions via pre-defined prototypes.

Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.

### Example

```java
// Import classes:
//import de.irisnet.java.client.EndpointsToSetupTheAIApi;

EndpointsToSetupTheAIApi apiInstance = new EndpointsToSetupTheAIApi();
INDefineAI iNDefineAI = <?xml version="1.0" encoding="UTF-8"?>
<inDefineAI>
	<inImage proto="nudityCheck"/>
	<inImage proto="ageEstimation"/>
	<inImage proto="illegalSymbols"/>
	<inImage proto="attributesCheck"/>
	<inImage proto="textRecognition"/>
</inDefineAI>; // INDefineAI | 
try {
    apiInstance.setINDefine(iNDefineAI);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsToSetupTheAIApi#setINDefine");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iNDefineAI** | [**INDefineAI**](INDefineAI.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/xml, application/json
- **Accept**: Not defined


## setINParams

> setINParams(iNParams)

Set the behaviour parameters for one object class.

Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.

### Example

```java
// Import classes:
//import de.irisnet.java.client.EndpointsToSetupTheAIApi;

EndpointsToSetupTheAIApi apiInstance = new EndpointsToSetupTheAIApi();
INParams iNParams = <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<inParams>
	<inDefault thresh="0.5" grey="127"/>
	<inParam inClass="face" min="1" max="3" drawMode="0" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="hand" min="-1" max="-1" drawMode="0" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="breast" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="vulva" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="penis" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="vagina" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="buttocks" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="anus" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="toy" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="oral" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
	<inParam inClass="penetration" min="0" max="0" drawMode="2" grey="127" scale="1.0" severity="100"/>
</inParams>; // INParams | 
try {
    apiInstance.setINParams(iNParams);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsToSetupTheAIApi#setINParams");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iNParams** | [**INParams**](INParams.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/xml, application/json
- **Accept**: Not defined

