

# FaceDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional]
**classification** | **String** | The classification of the recognized object. |  [optional]
**group** | **String** | The group of the classification. |  [optional]
**id** | **Integer** | The id of the detection object. |  [optional]
**probability** | **Integer** | The probability that the object found matches the classification. |  [optional]
**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional]
**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | Attributes characterizing the _face_ detection. Mainly contains attributes that were activated with the _ageEstimation_ prototype. |  [optional]
**subDetections** | [**List&lt;Detection&gt;**](Detection.md) | A set of sub-detection that are particular to the _face_ detection. Mainly contains detections that were activated with the _attributesCheck_ prototype. |  [optional]




