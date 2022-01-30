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
    <version>2.4.2</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.irisnet.java.client:irisnet-java-client:2.4.2"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/irisnet-java-client-2.4.2.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import de.irisnet.java.client.EndpointsForAIChecksApi;

public class EndpointsForAIChecksApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.irisnet.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EndpointsForAIChecksApi* | [**checkImage**](docs/EndpointsForAIChecksApi.md#checkImage) | **POST** /v1/check-image/{licenseKey} | Upload and check image against previously chosen configuration.
*EndpointsForAIChecksApi* | [**checkImageUrl**](docs/EndpointsForAIChecksApi.md#checkImageUrl) | **POST** /v1/check-url/{licenseKey} | Check image url against previously chosen configuration.
*EndpointsToSetupTheAIApi* | [**setINDefine**](docs/EndpointsToSetupTheAIApi.md#setINDefine) | **POST** /v1/set-definition | Set definitions via pre-defined prototypes.
*EndpointsToSetupTheAIApi* | [**setINParams**](docs/EndpointsToSetupTheAIApi.md#setINParams) | **POST** /v1/set-parameters | Set the behaviour parameters for one object class.
*MiscellaneousOperationsApi* | [**downloadProcessed**](docs/MiscellaneousOperationsApi.md#downloadProcessed) | **GET** /v1/download/{filename} | Get the resulting media file.
*MiscellaneousOperationsApi* | [**getAICost**](docs/MiscellaneousOperationsApi.md#getAICost) | **GET** /v1/cost | Get the cost per image check of the previously set parameters. The cost of the configuration is subtracted from the license key during each check.
*MiscellaneousOperationsApi* | [**getLicenseInfo**](docs/MiscellaneousOperationsApi.md#getLicenseInfo) | **GET** /v1/info/{licenseKey} | Get information from given license key.


## Documentation for Models

 - [INDefault](docs/INDefault.md)
 - [INDefineAI](docs/INDefineAI.md)
 - [INError](docs/INError.md)
 - [INImage](docs/INImage.md)
 - [INObject](docs/INObject.md)
 - [INParam](docs/INParam.md)
 - [INParams](docs/INParams.md)
 - [INRule](docs/INRule.md)
 - [IrisNet](docs/IrisNet.md)
 - [LicenseInfo](docs/LicenseInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



