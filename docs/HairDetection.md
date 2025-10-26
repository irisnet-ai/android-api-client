

# HairDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional]
**classification** | **String** | The classification of the recognized object. |  [optional]
**group** | **String** | The group of the classification. |  [optional]
**id** | **Integer** | The id of the detection object. |  [optional]
**probability** | **Integer** | The probability that the object found matches the classification. |  [optional]
**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional]
**attributes** | [**List&lt;HairAttribute&gt;**](HairAttribute.md) | Contains attributes for the _hair_ classification. |  [optional]




