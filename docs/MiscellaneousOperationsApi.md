# MiscellaneousOperationsApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadProcessed**](MiscellaneousOperationsApi.md#downloadProcessed) | **GET** /v1/download/{filename} | Get the resulting media file.
[**getAICost**](MiscellaneousOperationsApi.md#getAICost) | **GET** /v1/cost | Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.
[**getLicenseInfo**](MiscellaneousOperationsApi.md#getLicenseInfo) | **GET** /v1/info/{licenseKey} | Get information from given license key.



## downloadProcessed

> File downloadProcessed(filename)

Get the resulting media file.

### Example

```java
// Import classes:
//import de.irisnet.java.client.MiscellaneousOperationsApi;

MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi();
String filename = null; // String | 
try {
    File result = apiInstance.downloadProcessed(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscellaneousOperationsApi#downloadProcessed");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**|  | [default to null]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## getAICost

> Long getAICost()

Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.

### Example

```java
// Import classes:
//import de.irisnet.java.client.MiscellaneousOperationsApi;

MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi();
try {
    Long result = apiInstance.getAICost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscellaneousOperationsApi#getAICost");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## getLicenseInfo

> LicenseInfo getLicenseInfo(licenseKey)

Get information from given license key.

### Example

```java
// Import classes:
//import de.irisnet.java.client.MiscellaneousOperationsApi;

MiscellaneousOperationsApi apiInstance = new MiscellaneousOperationsApi();
String licenseKey = null; // String | License obtained from the https://irisnet.de/subscribe shop.
try {
    LicenseInfo result = apiInstance.getLicenseInfo(licenseKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscellaneousOperationsApi#getLicenseInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseKey** | **String**| License obtained from the https://irisnet.de/subscribe shop. | [default to null]

### Return type

[**LicenseInfo**](LicenseInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json

