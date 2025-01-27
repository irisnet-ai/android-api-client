

# LiveDocumentCheckRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback** | [**Callback**](Callback.md) |  | 
**statusUrl** | [**URI**](URI.md) | The URL to send the intermediate status requests to. If not set, no intermediate status requests will be sent. |  [optional]
**endUserRedirectUrl** | [**URI**](URI.md) | If set the enduser is being redirected to this URL after the check is finished. |  [optional]
**tokenValidityInSeconds** | **Long** | The validity duration of a started ident process in seconds. Defaults to 3600 seconds &#x3D; 60 minutes. |  [optional]




