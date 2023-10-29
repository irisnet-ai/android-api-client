# irisnet-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>de.irisnet.java.client</groupId>
    <artifactId>irisnet-java-client</artifactId>
    <version>3.4.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.irisnet.java.client:irisnet-java-client:3.4.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/irisnet-java-client-3.4.1.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import de.irisnet.java.client.AICheckOperationsApi;

public class AICheckOperationsApiExample {

    public static void main(String[] args) {
        AICheckOperationsApi apiInstance = new AICheckOperationsApi();
        UUID configId = null; // UUID | The configuration id from the Basic Configuration operations.
        String url = null; // String | <s>The url to the image that needs to be checked.</s> Deprecated: Use 'data' parameter instead. <b>This parameter will be removed in future releases.</b>
        String data = null; // String | The http(s) url or base64 encoded data uri of the image that needs to be checked.
        Integer detail = 1; // Integer | Set the detail level of the response.  * _1_ - The response only contains the _Summary_ and possibly the _Encoded_ schemas for basic information's (better API performance). * _2_ - Additionally lists all broken rules (_BrokenRule_ schema) according to the configuration parameters that were requested. * _3_ - Also shows detections (e.g. _BaseDetection_ schema) that contains extended features to each found object.
        Boolean imageEncode = false; // Boolean | Specifies whether or not to draw an output image that will be delivered in the response body as base64 encoded string. The _Encoded_ schema will be available in the response.
        try {
            CheckResult result = apiInstance.checkImage(configId, url, data, detail, imageEncode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AICheckOperationsApi#checkImage");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.irisnet.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AICheckOperationsApi* | [**checkImage**](docs/AICheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI.
*AICheckOperationsApi* | [**checkStream**](docs/AICheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI.
*AICheckOperationsApi* | [**checkVideo**](docs/AICheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI.
*BalanceEndpointsApi* | [**getCost**](docs/BalanceEndpointsApi.md#getCost) | **GET** /v2/cost/{configId} | Get the cost of the configuration for a single image.
*BalanceEndpointsApi* | [**getLicenseInfo**](docs/BalanceEndpointsApi.md#getLicenseInfo) | **GET** /v2/info/ | Get information for the given license key.
*BalanceEndpointsApi* | [**getVideoCost**](docs/BalanceEndpointsApi.md#getVideoCost) | **GET** /v2/cost/{configId}/{frames} | Get the cost of the configuration for moving images.
*BalanceEndpointsApi* | [**getVideoCost1**](docs/BalanceEndpointsApi.md#getVideoCost1) | **GET** /v2/cost/{configId}/{fps}/{duration} | Get the cost of the configuration for moving images.
*ConfigurationManagementApi* | [**deleteConfig**](docs/ConfigurationManagementApi.md#deleteConfig) | **DELETE** /v2/config/{configId} | Delete an AI configuration.
*ConfigurationManagementApi* | [**getAllConfigs**](docs/ConfigurationManagementApi.md#getAllConfigs) | **GET** /v2/config/ | List all saved AI configurations.
*ConfigurationManagementApi* | [**getConfig**](docs/ConfigurationManagementApi.md#getConfig) | **GET** /v2/config/{configId} | Get a specific AI configuration.
*ConfigurationManagementApi* | [**setConfig**](docs/ConfigurationManagementApi.md#setConfig) | **POST** /v2/config/ | Create a new AI configuration.
*DetailedConfigurationParametersApi* | [**clearParameters**](docs/DetailedConfigurationParametersApi.md#clearParameters) | **DELETE** /v2/config/parameters/{configId} | Delete the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**getParameters**](docs/DetailedConfigurationParametersApi.md#getParameters) | **GET** /v2/config/parameters/{configId} | Get the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**setParameters**](docs/DetailedConfigurationParametersApi.md#setParameters) | **POST** /v2/config/parameters/{configId} | Set parameters to the given AI configuration.


## Documentation for Models

 - [ApiNotice](docs/ApiNotice.md)
 - [BaseAttribute](docs/BaseAttribute.md)
 - [BaseDetection](docs/BaseDetection.md)
 - [BreastDetection](docs/BreastDetection.md)
 - [BrokenRule](docs/BrokenRule.md)
 - [CheckResult](docs/CheckResult.md)
 - [CheckResultDetectionsInner](docs/CheckResultDetectionsInner.md)
 - [Config](docs/Config.md)
 - [Coordinates](docs/Coordinates.md)
 - [Encoded](docs/Encoded.md)
 - [Event](docs/Event.md)
 - [FaceDetection](docs/FaceDetection.md)
 - [HairAttribute](docs/HairAttribute.md)
 - [HairDetection](docs/HairDetection.md)
 - [LicenseInfo](docs/LicenseInfo.md)
 - [Param](docs/Param.md)
 - [ParamSet](docs/ParamSet.md)
 - [Pricing](docs/Pricing.md)
 - [Rectangle](docs/Rectangle.md)
 - [Summary](docs/Summary.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### LICENSE-KEY

- **Type**: API key

- **API key parameter name**: LICENSE-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@irisnet.de

