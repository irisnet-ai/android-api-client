

# INImage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proto** | [**ProtoEnum**](#ProtoEnum) | Name of commonly used rule sets (prototypes). That can be used to speed up the setup process. * _nudityCheck_ - Commonly used prototype to check for nudity. * _ageVerification_ - Deprecated see &#39;ageEstimation&#39;. * _ageEstimation_ - Checks if there are children, adults or seniors recognizable. This is intended to be a suggestion to help you implement further steps. * _illegalSymbols_ - Checks for symbols that are not permitted in Germany. * _textRecognition_ - Checks for text occurrences. * _attributesCheck_ - Checks for attributes of a person (e.g. female, male, glasses, hair, etc). * _nippleCheck_ - Check for determining if the object recognized as breast has a nipple.  |  [optional]


## Enum: ProtoEnum

Name | Value
---- | -----




