

# AgeVerificationDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional]
**classification** | **String** | The classification of the recognized object. |  [optional]
**group** | **String** | The group of the classification. |  [optional]
**id** | **Integer** | The id of the detection object. |  [optional]
**probability** | **Integer** | The probability that the object found matches the classification. |  [optional]
**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional]
**checkId** | **String** | The id of the check that lead to the detection |  [optional]
**faceSimilarity** | **Integer** | Indicates the similarity-level of whether two faces belong to the same person |  [optional]
**faceLivenessCheckScore** | **Integer** | Indicates the liveness score of the selfie image |  [optional]
**processedChecks** | [**AgeVerificationSubChecks**](AgeVerificationSubChecks.md) | The sub-checks that were processed |  [optional]
**attributes** | [**List&lt;AgeVerificationAttribute&gt;**](AgeVerificationAttribute.md) | Attributes of the _ageVerification_ detection. |  [optional]




