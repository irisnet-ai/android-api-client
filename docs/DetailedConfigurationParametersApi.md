# DetailedConfigurationParametersApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearParameters**](DetailedConfigurationParametersApi.md#clearParameters) | **DELETE** /v2/config/parameters/{configId} | Delete the parameters of the AI configuration.
[**getParameters**](DetailedConfigurationParametersApi.md#getParameters) | **GET** /v2/config/parameters/{configId} | Get the parameters of the AI configuration.
[**setParameters**](DetailedConfigurationParametersApi.md#setParameters) | **POST** /v2/config/parameters/{configId} | Set parameters to the given AI configuration.



## clearParameters

> clearParameters(configId)

Delete the parameters of the AI configuration.

Clears the parameters and restores the defaults for all classifications.

### Example

```java
// Import classes:
//import de.irisnet.java.client.DetailedConfigurationParametersApi;

DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi();
UUID configId = null; // UUID | The id of the configuration where the parameters should be deleted.
try {
    apiInstance.clearParameters(configId);
} catch (ApiException e) {
    System.err.println("Exception when calling DetailedConfigurationParametersApi#clearParameters");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The id of the configuration where the parameters should be deleted. | [default to null]

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getParameters

> ParamSet getParameters(configId)

Get the parameters of the AI configuration.

Returns the parameters stored in the given configuration.

### Example

```java
// Import classes:
//import de.irisnet.java.client.DetailedConfigurationParametersApi;

DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi();
UUID configId = null; // UUID | The id of the configuration for which the parameters are being requested.
try {
    ParamSet result = apiInstance.getParameters(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetailedConfigurationParametersApi#getParameters");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The id of the configuration for which the parameters are being requested. | [default to null]

### Return type

[**ParamSet**](ParamSet.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## setParameters

> ParamSet setParameters(configId, paramSet)

Set parameters to the given AI configuration.

Save or modify the parameters stored in the AI configuration.

### Example

```java
// Import classes:
//import de.irisnet.java.client.DetailedConfigurationParametersApi;

DetailedConfigurationParametersApi apiInstance = new DetailedConfigurationParametersApi();
UUID configId = null; // UUID | The id of the configuration where the parameters should be added.
ParamSet paramSet = {"params":[{"classification":"breast","drawMode":3},{"classification":"vulva","drawMode":3},{"classification":"penis","drawMode":3},{"classification":"vagina","drawMode":3},{"classification":"buttocks","drawMode":3},{"classification":"anus","drawMode":3},{"classification":"toy","drawMode":3},{"classification":"oral","drawMode":3},{"classification":"penetration","drawMode":3}]}; // ParamSet | Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters.
try {
    ParamSet result = apiInstance.setParameters(configId, paramSet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetailedConfigurationParametersApi#setParameters");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The id of the configuration where the parameters should be added. | [default to null]
 **paramSet** | [**ParamSet**](ParamSet.md)| Define the parameters to use for an AI check operation. View the _ParamSet_ and _Param_ schema to see the available parameters. |

### Return type

[**ParamSet**](ParamSet.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

