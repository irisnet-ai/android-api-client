# AICheckOperationsApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkImage**](AICheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI.
[**checkStream**](AICheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI.
[**checkVideo**](AICheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI.



## checkImage

> CheckResult checkImage(configId, url, detail, imageEncode)

Check an image with the AI.

The response (_CheckResult_ schema) is returned immediately after the request.

### Example

```java
// Import classes:
//import de.irisnet.java.client.AICheckOperationsApi;

AICheckOperationsApi apiInstance = new AICheckOperationsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
String url = null; // String | The url to the image that needs to be checked.
Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response.
try {
    CheckResult result = apiInstance.checkImage(configId, url, detail, imageEncode);
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
 **url** | **String**| The url to the image that needs to be checked. | [default to null]
 **detail** | **Integer**| Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information&#39;s (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object. | [optional] [default to 1]
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response. | [optional] [default to false]

### Return type

[**CheckResult**](CheckResult.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
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
Callback callback = new Callback(); // Callback | 
Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows events (_Event_ schema) that contains extended features to each found object.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response.
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
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output video that can be downloaded afterwards. The _Encoded_ schema will be available in the response. | [optional] [default to false]
 **checkRate** | **Integer**| The milliseconds between each AI check. E.g. The AI will check 1 frame per second when checkRate is set to &#39;1000&#39;. | [optional] [default to 0]

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

