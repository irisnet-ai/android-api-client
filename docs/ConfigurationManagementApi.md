# ConfigurationManagementApi

All URIs are relative to *https://api.irisnet.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConfig**](ConfigurationManagementApi.md#deleteConfig) | **DELETE** /v2/config/{configId} | Delete an AI configuration.
[**getAllConfigs**](ConfigurationManagementApi.md#getAllConfigs) | **GET** /v2/config/ | List all saved AI configurations.
[**getConfig**](ConfigurationManagementApi.md#getConfig) | **GET** /v2/config/{configId} | Get a specific AI configuration.
[**setConfig**](ConfigurationManagementApi.md#setConfig) | **POST** /v2/config/ | Create a new AI configuration.



## deleteConfig

> deleteConfig(configId)

Delete an AI configuration.

Deletes the AI configuration with the given id.

### Example

```java
// Import classes:
//import de.irisnet.java.client.ConfigurationManagementApi;

ConfigurationManagementApi apiInstance = new ConfigurationManagementApi();
UUID configId = null; // UUID | The id of the configuration that should be deleted.
try {
    apiInstance.deleteConfig(configId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationManagementApi#deleteConfig");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The id of the configuration that should be deleted. | [default to null]

### Return type

null (empty response body)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## getAllConfigs

> List&lt;Config&gt; getAllConfigs()

List all saved AI configurations.

Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.

### Example

```java
// Import classes:
//import de.irisnet.java.client.ConfigurationManagementApi;

ConfigurationManagementApi apiInstance = new ConfigurationManagementApi();
try {
    List<Config> result = apiInstance.getAllConfigs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationManagementApi#getAllConfigs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Config&gt;**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConfig

> Config getConfig(configId)

Get a specific AI configuration.

Returns a specific AI configuration for the requested id.

### Example

```java
// Import classes:
//import de.irisnet.java.client.ConfigurationManagementApi;

ConfigurationManagementApi apiInstance = new ConfigurationManagementApi();
UUID configId = null; // UUID | The id of the configuration that is being requested.
try {
    Config result = apiInstance.getConfig(configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationManagementApi#getConfig");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **UUID**| The id of the configuration that is being requested. | [default to null]

### Return type

[**Config**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## setConfig

> Config setConfig(config)

Create a new AI configuration.

Create a new AI configuration with the desired prototypes.

### Example

```java
// Import classes:
//import de.irisnet.java.client.ConfigurationManagementApi;

ConfigurationManagementApi apiInstance = new ConfigurationManagementApi();
Config config = {"prototypes":["nudityCheck","ageEstimation","illegalSymbols","attributesCheck","nippleCheck","textRecognition","bodyAttributes","unwantedSubstances","violenceCheck"]}; // Config | Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes.
try {
    Config result = apiInstance.setConfig(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationManagementApi#setConfig");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**Config**](Config.md)| Define the prototypes to use for an AI check operation. View the _Config_ schema to see the available prototypes. |

### Return type

[**Config**](Config.md)

### Authorization

[LICENSE-KEY](../README.md#LICENSE-KEY)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

