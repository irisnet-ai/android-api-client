

# Config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique identifier for the AI configuration. Use this for any check operation to tell the AI how to behave. |  [optional]
**name** | **String** | The name of the AI configuration. |  [optional]
**kycCheckParameters** | [**Set&lt;KycCheckParametersEnum&gt;**](#Set&lt;KycCheckParametersEnum&gt;) | Configures your kyc checks. You can combine certain parameters to customize a single check operation. |  [optional]
**prototypes** | [**Set&lt;PrototypesEnum&gt;**](#Set&lt;PrototypesEnum&gt;) | Configures your detection. As there are literally hundreds of parameters, prototypes can be used to get useful behaviour. This includes a default setting for parameters and rules that should be applied to the check operations. You can use multiple prototypes for a single check operation. |  [optional]


## Enum: Set&lt;KycCheckParametersEnum&gt;

Name | Value
---- | -----
IDENTITYDOCUMENTCHECK | &quot;identityDocumentCheck&quot;
AUTOMATEDDOCUMENTRECOGNITION | &quot;automatedDocumentRecognition&quot;
BIOMETRICCHECK | &quot;biometricCheck&quot;
FORMAUTOFILL | &quot;formAutofill&quot;
AGEVERIFICATIONCHECK | &quot;ageVerificationCheck&quot;
PROOFOFADDRESSCHECK | &quot;proofOfAddressCheck&quot;
FACEAUTHENTICATION | &quot;faceAuthentication&quot;
LIVEIDENTIFICATION | &quot;liveIdentification&quot;
LIVEIDENTITYDOCUMENTCHECK | &quot;liveIdentityDocumentCheck&quot;
LIVESELFIE | &quot;liveSelfie&quot;
LIVEPROOFOFADDRESSCHECK | &quot;liveProofOfAddressCheck&quot;
LIVEAGEVERIFICATIONCHECK | &quot;liveAgeVerificationCheck&quot;
LIVEFACEAUTHENTICATION | &quot;liveFaceAuthentication&quot;
VIDEOUPLOADIDENTIFICATION | &quot;videoUploadIdentification&quot;
CONSIDERKNOWNFACES | &quot;considerKnownFaces&quot;
ADDENCODINGSTORESULT | &quot;addEncodingsToResult&quot;
IFRAMEFLOW | &quot;iFrameFlow&quot;
REDIRECTFLOW | &quot;redirectFlow&quot;
REDIRECTONMOBILE | &quot;redirectOnMobile&quot;


## Enum: Set&lt;PrototypesEnum&gt;

Name | Value
---- | -----
NUDITYCHECK | &quot;nudityCheck&quot;
AGEESTIMATION | &quot;ageEstimation&quot;
ILLEGALSYMBOLS | &quot;illegalSymbols&quot;
TEXTRECOGNITION | &quot;textRecognition&quot;
ATTRIBUTESCHECK | &quot;attributesCheck&quot;
BODYATTRIBUTES | &quot;bodyAttributes&quot;
NIPPLECHECK | &quot;nippleCheck&quot;
UNWANTEDSUBSTANCES | &quot;unwantedSubstances&quot;
VIOLENCECHECK | &quot;violenceCheck&quot;
SELFIECHECK | &quot;selfieCheck&quot;




