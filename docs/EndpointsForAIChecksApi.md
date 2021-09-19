# EndpointsForAIChecksApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkImage**](EndpointsForAIChecksApi.md#checkImage) | **POST** /v1/check-image/{licenseKey} | Upload and check image against previously chosen configuration.
[**checkImageUrl**](EndpointsForAIChecksApi.md#checkImageUrl) | **POST** /v1/check-url/{licenseKey} | Check image url against previously chosen configuration.



## checkImage

> IrisNet checkImage(licenseKey, file, detail, imageEncode)

Upload and check image against previously chosen configuration.

### Example

```java
// Import classes:
//import de.irisnet.java.client.EndpointsForAIChecksApi;

EndpointsForAIChecksApi apiInstance = new EndpointsForAIChecksApi();
String licenseKey = null; // String | License obtained from irisnet.de shop.
File file = null; // File | 
Integer detail = 1; // Integer | Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that can be downloaded afterwards.
try {
    IrisNet result = apiInstance.checkImage(licenseKey, file, detail, imageEncode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsForAIChecksApi#checkImage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**| License obtained from irisnet.de shop. | [default to null]
 **file** | **File**|  | [default to null]
 **detail** | **Integer**| Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. | [optional] [default to 1]
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output image that can be downloaded afterwards. | [optional] [default to false]

### Return type

[**IrisNet**](IrisNet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/xml, application/json


## checkImageUrl

> IrisNet checkImageUrl(url, licenseKey, detail, imageEncode)

Check image url against previously chosen configuration.

### Example

```java
// Import classes:
//import de.irisnet.java.client.EndpointsForAIChecksApi;

EndpointsForAIChecksApi apiInstance = new EndpointsForAIChecksApi();
String url = null; // String | 
String licenseKey = null; // String | License obtained from irisnet.de shop.
Integer detail = 1; // Integer | Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information.
Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that can be downloaded afterwards.
try {
    IrisNet result = apiInstance.checkImageUrl(url, licenseKey, detail, imageEncode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsForAIChecksApi#checkImageUrl");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  | [default to null]
 **licenseKey** | **String**| License obtained from irisnet.de shop. | [default to null]
 **detail** | **Integer**| Sets the response details.  * _1_ - The response body informs you if the image is ok or not ok (better API performance) * _2_ - In addition the response body lists all broken rules. * _3_ - In addition to the first two options, this will show all objects with positional information. | [optional] [default to 1]
 **imageEncode** | **Boolean**| Specifies whether or not to draw an output image that can be downloaded afterwards. | [optional] [default to false]

### Return type

[**IrisNet**](IrisNet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

