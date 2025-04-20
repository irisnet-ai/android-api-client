

# DocumentCheckRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback** | [**Callback**](Callback.md) |  | 
**frontImage** | **String** | The base64-encoded front image of the document to be checked in either jpg or png file format. | 
**backImage** | **String** | The base64-encoded back image of the document to be checked in either jpg or png file format. |  [optional]
**selfieImage** | **String** | The base64-encoded selfie image to be checked in either jpg or png file format. |  [optional]
**minimumAcceptedAge** | **Integer** | The minimum age in years accepted for a DocumentCheck, if applicable. Defaults to 18 if not specified. |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional]
**documentCountry** | **String** | The country of the document in ISO 3166-1 alpha-2 format. |  [optional]


## Enum: DocumentTypeEnum

Name | Value
---- | -----




