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
    <version>4.1.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.irisnet.java.client:irisnet-java-client:4.1.3"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/irisnet-java-client-4.1.3.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import de.irisnet.java.client.AICheckOperationsApi;

public class AICheckOperationsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.irisnet.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AICheckOperationsApi* | [**ageVerification**](docs/AICheckOperationsApi.md#ageVerification) | **POST** /v2/age-verification/{configId} | Perform an age verfication check for a given selfie with the AI.
*AICheckOperationsApi* | [**checkIdDocument**](docs/AICheckOperationsApi.md#checkIdDocument) | **POST** /v2/check-id-document/{configId} | Check an id document with the AI.
*AICheckOperationsApi* | [**checkImage**](docs/AICheckOperationsApi.md#checkImage) | **POST** /v2/check-image/{configId} | Check an image with the AI.
*AICheckOperationsApi* | [**checkPoaDocument**](docs/AICheckOperationsApi.md#checkPoaDocument) | **POST** /v2/check-poa-document/{configId} | Perform an proof of address check with the AI.
*AICheckOperationsApi* | [**checkStream**](docs/AICheckOperationsApi.md#checkStream) | **POST** /v2/check-stream/{configId} | Check a stream with the AI.
*AICheckOperationsApi* | [**checkText**](docs/AICheckOperationsApi.md#checkText) | **POST** /v2/check-text/{configId} | Check a text with the AI.
*AICheckOperationsApi* | [**checkVideo**](docs/AICheckOperationsApi.md#checkVideo) | **POST** /v2/check-video/{configId} | Check a video with the AI.
*AICheckOperationsApi* | [**faceAuthentication**](docs/AICheckOperationsApi.md#faceAuthentication) | **POST** /v2/face-authentication/{configId} | Perform a face authentication for a given selfie with the AI.
*AICheckOperationsApi* | [**liveDocumentCheck**](docs/AICheckOperationsApi.md#liveDocumentCheck) | **POST** /v2/check-live-id-document/{configId} | Start a guided live id document check with the AI.
*BalanceEndpointsApi* | [**getCost**](docs/BalanceEndpointsApi.md#getCost) | **GET** /v2/cost/{configId} | Get the cost of the configuration for a single image.
*BalanceEndpointsApi* | [**getLicenseInfo**](docs/BalanceEndpointsApi.md#getLicenseInfo) | **GET** /v2/info | Get information for the given license key.
*BalanceEndpointsApi* | [**getVideoCost**](docs/BalanceEndpointsApi.md#getVideoCost) | **GET** /v2/cost/{configId}/{frames} | Get the cost of the configuration for moving images.
*BalanceEndpointsApi* | [**getVideoCost1**](docs/BalanceEndpointsApi.md#getVideoCost1) | **GET** /v2/cost/{configId}/{fps}/{duration} | Get the cost of the configuration for moving images.
*ConfigurationManagementApi* | [**deleteConfig**](docs/ConfigurationManagementApi.md#deleteConfig) | **DELETE** /v2/config/{configId} | Delete an AI configuration.
*ConfigurationManagementApi* | [**getAllConfigs**](docs/ConfigurationManagementApi.md#getAllConfigs) | **GET** /v2/config | List all saved AI configurations.
*ConfigurationManagementApi* | [**getConfig**](docs/ConfigurationManagementApi.md#getConfig) | **GET** /v2/config/{configId} | Get a specific AI configuration.
*ConfigurationManagementApi* | [**setConfig**](docs/ConfigurationManagementApi.md#setConfig) | **POST** /v2/config | Create a new AI configuration.
*DetailedConfigurationParametersApi* | [**clearParameters**](docs/DetailedConfigurationParametersApi.md#clearParameters) | **DELETE** /v2/config/parameters/{configId} | Delete the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**getParameters**](docs/DetailedConfigurationParametersApi.md#getParameters) | **GET** /v2/config/parameters/{configId} | Get the parameters of the AI configuration.
*DetailedConfigurationParametersApi* | [**setParameters**](docs/DetailedConfigurationParametersApi.md#setParameters) | **POST** /v2/config/parameters/{configId} | Set parameters to the given AI configuration.


## Documentation for Models

 - [AgeVerificationAttribute](docs/AgeVerificationAttribute.md)
 - [AgeVerificationDetection](docs/AgeVerificationDetection.md)
 - [AgeVerificationSubChecks](docs/AgeVerificationSubChecks.md)
 - [AiClassification](docs/AiClassification.md)
 - [AiPrototype](docs/AiPrototype.md)
 - [ApiNotice](docs/ApiNotice.md)
 - [Attribute](docs/Attribute.md)
 - [BaseAttribute](docs/BaseAttribute.md)
 - [BaseDetection](docs/BaseDetection.md)
 - [BiometricCheckRequestData](docs/BiometricCheckRequestData.md)
 - [BreastDetection](docs/BreastDetection.md)
 - [BrokenRule](docs/BrokenRule.md)
 - [Callback](docs/Callback.md)
 - [CheckResult](docs/CheckResult.md)
 - [CheckResultDetectionsInner](docs/CheckResultDetectionsInner.md)
 - [Config](docs/Config.md)
 - [Coordinates](docs/Coordinates.md)
 - [Data](docs/Data.md)
 - [Detection](docs/Detection.md)
 - [DocumentCheckRequestData](docs/DocumentCheckRequestData.md)
 - [Encoded](docs/Encoded.md)
 - [Event](docs/Event.md)
 - [FaceDetection](docs/FaceDetection.md)
 - [HairAttribute](docs/HairAttribute.md)
 - [HairDetection](docs/HairDetection.md)
 - [IdDocumentAttribute](docs/IdDocumentAttribute.md)
 - [IdDocumentDetection](docs/IdDocumentDetection.md)
 - [IdDocumentSubChecks](docs/IdDocumentSubChecks.md)
 - [ImageAnalysisDetection](docs/ImageAnalysisDetection.md)
 - [KnownFace](docs/KnownFace.md)
 - [KycUiParameter](docs/KycUiParameter.md)
 - [LanguageAttribute](docs/LanguageAttribute.md)
 - [LicenseInfo](docs/LicenseInfo.md)
 - [LiveDocumentCheckRequestData](docs/LiveDocumentCheckRequestData.md)
 - [LiveDocumentCheckResponseData](docs/LiveDocumentCheckResponseData.md)
 - [Param](docs/Param.md)
 - [ParamSet](docs/ParamSet.md)
 - [PoaCheckRequestData](docs/PoaCheckRequestData.md)
 - [PoaDocumentAttribute](docs/PoaDocumentAttribute.md)
 - [PoaDocumentDetection](docs/PoaDocumentDetection.md)
 - [PoaDocumentSubChecks](docs/PoaDocumentSubChecks.md)
 - [Pricing](docs/Pricing.md)
 - [Rectangle](docs/Rectangle.md)
 - [Segment](docs/Segment.md)
 - [Summary](docs/Summary.md)
 - [TextDetection](docs/TextDetection.md)
 - [ValueAttribute](docs/ValueAttribute.md)


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

