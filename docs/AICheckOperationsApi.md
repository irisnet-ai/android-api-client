# AICheckOperationsApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ageVerification**](AICheckOperationsApi.md#ageVerification) | **POST** /v2/age-verification/{configId} | Perform an age verfication check for a given selfie with the AI.
[**checkIdDocument**](AICheckOperationsApi.md#checkIdDocument) | **POST** /v2/check-id-document/{configId} | Check an id document with the AI.
[**checkImage**](AICheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI.
[**checkPoaDocument**](AICheckOperationsApi.md#checkPoaDocument) | **POST** /v2/check-poa-document/{configId} | Perform an proof of address check with the AI.
[**checkStream**](AICheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI.
[**checkText**](AICheckOperationsApi.md#checkText) | **POST** /v2/check-text/{configId} | Check a text with the AI.
[**checkVideo**](AICheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI.
[**faceAuthentication**](AICheckOperationsApi.md#faceAuthentication) | **POST** /v2/face-authentication/{configId} | Perform a face authentication for a given selfie with the AI.
[**liveDocumentCheck**](AICheckOperationsApi.md#liveDocumentCheck) | **POST** /v2/check-live-id-document/{configId} | Start a guided live id document check with the AI.



## ageVerification

> CheckResult ageVerification(configId, biometricCheckRequestData)

Perform an age verfication check for a given selfie with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
BiometricCheckRequestData biometricCheckRequestData = {"callback":{"callbackUrl":"https://www.example.com/callback?ageestimation"},"selfieImage":"/9j/4AAQSkZJRgABAQEASABIAAD..."}; // BiometricCheckRequestData | The BiometricCheckRequestData containing data needed for the age verification check.
try {
    CheckResult result = apiInstance.ageVerification(configId, biometricCheckRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#ageVerification");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **biometricCheckRequestData** | [**BiometricCheckRequestData**](BiometricCheckRequestData.md)| The BiometricCheckRequestData containing data needed for the age verification check. |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## checkIdDocument

> CheckResult checkIdDocument(configId, documentCheckRequestData)

Check an id document with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
DocumentCheckRequestData documentCheckRequestData = {"callback":{"callbackUrl":"https://www.example.com/callback?idcheck"},"documentCountry":"DE","documentType":"national_identity_card","frontImage":"/9j/4AAQSkZJRgABAQEASABIAAD...","backImage":"/9j/4AAQSkZJRgABAQEASABIAAD...","selfieImage":"/9j/4AAQSkZJRgABAQEASABIAAD..."}; // DocumentCheckRequestData | The DocumentCheckRequestData containing data needed for the id document check.
try {
    CheckResult result = apiInstance.checkIdDocument(configId, documentCheckRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkIdDocument");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **documentCheckRequestData** | [**DocumentCheckRequestData**](DocumentCheckRequestData.md)| The DocumentCheckRequestData containing data needed for the id document check. |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## checkImage

> CheckResult checkImage(configId, url, detail, imageEncode, data)

Check an image with the AI.

The response (_CheckResult_ schema) is returned immediately after the request.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
String url = null; // String | <s>The url to the image that needs to be checked.</s> Deprecated: Use request body instead. <b>This parameter will be removed in future releases.</b>
Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response.
Data data = {"data":"https://example.com/path/to/your/image.png"}; // Data | The http(s) url or base64 encoded body uri of the image that needs to be checked.
try {
    CheckResult result = apiInstance.checkImage(configId, url, detail, imageEncode, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkImage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **url** | **String**| &lt;s&gt;The url to the image that needs to be checked.&lt;/s&gt; Deprecated: Use request body instead. &lt;b&gt;This parameter will be removed in future releases.&lt;/b&gt; | [optional] [default to null]
 **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. | [optional] [default to 1]
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. | [optional] [default to false]
 **data** | [**Data**](Data.md)| The http(s) url or base64 encoded body uri of the image that needs to be checked. | [optional]

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## checkPoaDocument

> CheckResult checkPoaDocument(configId, poaCheckRequestData)

Perform an proof of address check with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
PoaCheckRequestData poaCheckRequestData = {"callback":{"callbackUrl":"https://www.example.com/callback?poacheck"},"documentType":"utility_bill","frontImage":"/9j/4AAQSkZJRgABAQEASABIAAD..."}; // PoaCheckRequestData | The PoaCheckRequestData containing data needed for the proof of address check. The DocumentType in the request data must be either 'utility_bill' or 'bank_statement'.
try {
    CheckResult result = apiInstance.checkPoaDocument(configId, poaCheckRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkPoaDocument");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **poaCheckRequestData** | [**PoaCheckRequestData**](PoaCheckRequestData.md)| The PoaCheckRequestData containing data needed for the proof of address check. The DocumentType in the request data must be either &#39;utility_bill&#39; or &#39;bank_statement&#39;. |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## checkStream

> List&lt;CheckResult&gt; checkStream(configId, inUrl, outUrl, cycleLength, checkRate)

Check a stream with the AI.

The body is continuously send per JSON stream until completion of the video stream. Only then the full _CheckResult_ schema will be shown (past _Events_ omitted).  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;  &lt;b&gt;WARNING: Please do not use the &#39;Try it out&#39; for this operation. The browser is not able to refresh the response preview until the completion of the video stream.&lt;b&gt;

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
String inUrl = null; // String | The URL of the video stream that the AI should check.
String outUrl = null; // String | The URL of where the AI should send the encoded stream.
Integer cycleLength = 500; // Integer | Determine how often (value in milliseconds) the the AI should give a feedback.
Integer checkRate = 0; // Integer | The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to '1000'.
try {
    List<CheckResult> result = apiInstance.checkStream(configId, inUrl, outUrl, cycleLength, checkRate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkStream");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **inUrl** | **String**| The URL of the video stream that the AI should check. | [default to null]
 **outUrl** | **String**| The URL of where the AI should send the encoded stream. | [optional] [default to null]
 **cycleLength** | **Integer**| Determine how often (value in milliseconds) the the AI should give a feedback. | [optional] [default to 500]
 **checkRate** | **Integer**| The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. | [optional] [default to 0]

### Return type

[**List&lt;CheckResult&gt;**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/x-ndjson


## checkText

> CheckResult checkText(configId, data, detail)

Check a text with the AI.

The response (_CheckResult_ schema) is returned immediately after the request.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
Data data = {"data":"This is an example text."}; // Data | The text that needs to be checked.
Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object.
try {
    CheckResult result = apiInstance.checkText(configId, data, detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkText");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **data** | [**Data**](Data.md)| The text that needs to be checked. |
 **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. | [optional] [default to 1]

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## checkVideo

> checkVideo(configId, url, callback, detail, imageEncode, checkRate)

Check a video with the AI.

An empty response is returned immediately. The actual body (_CheckResult_ schema) is send to the _callbackUrl_ after the AI has finished processing.  &lt;b&gt;NOTICE: Depending on your configuration and parameters this operation can be quite expensive on your credit balance.&lt;b&gt;

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
String url = null; // String | The url to the video that needs to be checked.
Callback callback = {"callbackUrl":"http://www.example.com/callback?video","headers":{"Authorization":"Basic Rm9yemEgTmFwb2xpLCBzZW1wcmUh"}}; // Callback | 
Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output video that can be downloaded afterwards. The output video format will be MP4 containing H.264 encoding independent of the input format. The _Encoded_ schema will be available in the response.
Integer checkRate = 0; // Integer | The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to '1000'.
try {
    apiInstance.checkVideo(configId, url, callback, detail, imageEncode, checkRate);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#checkVideo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **url** | **String**| The url to the video that needs to be checked. | [default to null]
 **callback** | [**Callback**](Callback.md)|  |
 **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object. | [optional] [default to 1]
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output video that can be downloaded afterwards. The output video format will be MP4 containing H.264 encoding independent of the input format. The _Encoded_ schema will be available in the response. | [optional] [default to false]
 **checkRate** | **Integer**| The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## faceAuthentication

> CheckResult faceAuthentication(configId, biometricCheckRequestData)

Perform a face authentication for a given selfie with the AI.

The response (_CheckResult_ schema) containing only the checkId and possibly ApiNotices is returned immediately after the request. The actual body (_CheckResult_ schema) is sent to the _callbackUrl_ after the AI has finished processing.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
BiometricCheckRequestData biometricCheckRequestData = {"callback":{"callbackUrl":"https://www.example.com/callback?ageestimation"},"selfieImage":"/9j/4AAQSkZJRgABAQEASABIAAD..."}; // BiometricCheckRequestData | The BiometricCheckRequestData containing data needed for the face authentication.
try {
    CheckResult result = apiInstance.faceAuthentication(configId, biometricCheckRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#faceAuthentication");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **biometricCheckRequestData** | [**BiometricCheckRequestData**](BiometricCheckRequestData.md)| The BiometricCheckRequestData containing data needed for the face authentication. |

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## liveDocumentCheck

> LiveDocumentCheckResponseData liveDocumentCheck(configId, liveDocumentCheckRequestData)

Start a guided live id document check with the AI.

The synchronous response (_LiveDocumentCheckResponseData_ schema) contains an eventId, possibly a token and an URL to send the enduser to. The actual result (_CheckResult_ schema) of the document check is sent to the provided _callbackUrl_ after the AI has finished processing.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
LiveDocumentCheckRequestData liveDocumentCheckRequestData = {"callback":{"callbackUrl":"https://www.example.com/callback?liveident"},"endUserRedirectUrl":"https://www.example.com/user"}; // LiveDocumentCheckRequestData | The LiveDocumentCheckRequestData containing data needed for the live id document check.
try {
    LiveDocumentCheckResponseData result = apiInstance.liveDocumentCheck(configId, liveDocumentCheckRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AICheckOperationsApi#liveDocumentCheck");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **liveDocumentCheckRequestData** | [**LiveDocumentCheckRequestData**](LiveDocumentCheckRequestData.md)| The LiveDocumentCheckRequestData containing data needed for the live id document check. |

### Return type

[**LiveDocumentCheckResponseData**](LiveDocumentCheckResponseData.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

