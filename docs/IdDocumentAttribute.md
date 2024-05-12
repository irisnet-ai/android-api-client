

# IdDocumentAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Used as a type discriminator for json to object conversion. |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional]
**documentNumber** | **String** | The number of the document |  [optional]
**isTwoSided** | **Boolean** | Indicates whether the document is two-sided |  [optional]
**issuingAuthority** | **String** | The issuing authority |  [optional]
**issuingDate** | [**Date**](Date.md) | The issuing date |  [optional]
**issuingCountry** | **String** | The document&#39;s country in ISO 3166-1 alpha-2 format |  [optional]
**expirationDate** | [**Date**](Date.md) | The expiration date |  [optional]
**accessNumber** | **String** | The access number |  [optional]
**firstNames** | **List&lt;String&gt;** | The document holder&#39;s first name(s) |  [optional]
**lastNames** | **List&lt;String&gt;** | The document holder&#39;s last name(s) |  [optional]
**birthName** | **String** | The document holder&#39;s birth name |  [optional]
**dateOfBirth** | [**Date**](Date.md) | The document holder&#39;s date of birth |  [optional]
**placeOfBirth** | **String** | The document holder&#39;s place of birth |  [optional]
**nationality** | **String** | The document holder&#39;s nationality in ISO 3166-1 alpha-2 format |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | The document holder&#39;s gender |  [optional]
**height** | **String** | The document holder&#39;s height |  [optional]
**address** | **String** | The document holder&#39;s address |  [optional]
**machineReadableZone** | **List&lt;String&gt;** | The document&#39;s machine readable zone (MRZ), at most 3 lines |  [optional]


## Enum: DocumentTypeEnum

Name | Value
---- | -----


## Enum: GenderEnum

Name | Value
---- | -----




