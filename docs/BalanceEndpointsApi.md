# BalanceEndpointsApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCost**](BalanceEndpointsApi.md#getCost) | **GET** /v2/cost/{configId} | Get the cost of the configuration for a single image.
[**getLicenseInfo**](BalanceEndpointsApi.md#getLicenseInfo) | **GET** /v2/info | Get information for the given license key.
[**getVideoCost**](BalanceEndpointsApi.md#getVideoCost) | **GET** /v2/cost/{configId}/{frames} | Get the cost of the configuration for moving images.
[**getVideoCost1**](BalanceEndpointsApi.md#getVideoCost1) | **GET** /v2/cost/{configId}/{fps}/{duration} | Get the cost of the configuration for moving images.



## getCost

> Pricing getCost(configId)

Get the cost of the configuration for a single image.

The cost is subtracted from the license key after a successful check-image operation.

### Example

```java
// Import classes:
//import de.irisnet.java.client.BalanceEndpointsApi;

BalanceEndpointsApi apiInstance = new BalanceEndpointsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
try {
    Pricing result = apiInstance.getCost(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceEndpointsApi#getCost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLicenseInfo

> LicenseInfo getLicenseInfo()

Get information for the given license key.

Get the LicenseInfo schema for the given license key in the authorization header.

### Example

```java
// Import classes:
//import de.irisnet.java.client.BalanceEndpointsApi;

BalanceEndpointsApi apiInstance = new BalanceEndpointsApi();
try {
    LicenseInfo result = apiInstance.getLicenseInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceEndpointsApi#getLicenseInfo");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**LicenseInfo**](LicenseInfo.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVideoCost

> Pricing getVideoCost(configId, frames)

Get the cost of the configuration for moving images.

The cost is subtracted from the license key after a successful check operation for moving images.  &lt;b&gt;NOTICE: The returned cost is an approximation. The exact cost can only be determined during the check operation.&lt;b&gt;

### Example

```java
// Import classes:
//import de.irisnet.java.client.BalanceEndpointsApi;

BalanceEndpointsApi apiInstance = new BalanceEndpointsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
Long frames = null; // Long | The number of frames that the AI should check.
try {
    Pricing result = apiInstance.getVideoCost(configId, frames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceEndpointsApi#getVideoCost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **frames** | **Long**| The number of frames that the AI should check. | [default to null]

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVideoCost1

> Pricing getVideoCost1(configId, fps, duration)

Get the cost of the configuration for moving images.

The cost is subtracted from the license key after a successful check operation for moving images.  &lt;b&gt;NOTICE: The returned cost is an approximation. The exact cost can only be determined during the check operation.&lt;b&gt;

### Example

```java
// Import classes:
//import de.irisnet.java.client.BalanceEndpointsApi;

BalanceEndpointsApi apiInstance = new BalanceEndpointsApi();
UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
Integer fps = null; // Integer | The frames per second of the video or stream.
Long duration = null; // Long | The duration in seconds of the video or stream.
try {
    Pricing result = apiInstance.getVideoCost1(configId, fps, duration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceEndpointsApi#getVideoCost1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The configuration id from the Basic Configuration operations. | [default to null]
 **fps** | **Integer**| The frames per second of the video or stream. | [default to null]
 **duration** | **Long**| The duration in seconds of the video or stream. | [default to null]

### Return type

[**Pricing**](Pricing.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

