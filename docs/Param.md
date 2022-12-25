

# Param

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | [**ClassificationEnum**](#ClassificationEnum) | The classification of the object, that the element refers to. The following is a tree representation of the prototypes and their containing classifications. Default parameter values are defined per classification object. The default values of &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; are witten after the name of the classification object in that order. Use the prototype names to set parameters to all of the containing classifications. ##### nudityCheck &gt; _A prototype containing classifications for basic human attributes and sexual contents. This prototype and the containing classifications are activated by default_ * _face_ _(1, 3, 0)_ * _hand_ _(0, -1, 0)_ * _foot_ _(0, -1, 0)_ * _footwear_ _(0, -1, 0)_ * _chest_ _(0, -1, 0)_ * _breast_ _(0, 0, 2)_ * _vulva_ _(0, 0, 2)_ * _penis_ _(0, 0, 2)_ * _vagina_ _(0, 0, 2)_ * _buttocks_ _(0, 0, 2)_ * _anus_ _(0, 0, 2)_ * _toy_ _(0, -1, 0)_ * _oral_ _(0, 0, 2)_ * _penetration_ _(0, 0, 2)_ ##### ageEstimation &gt; _Contains classification objects for estimating the age of a human face. This prototype activates nudityCheck_ * _child (*)_ _(0, 0, 6)_ * _adult (*)_ _(0, -1, 0)_ * _senior (*)_ _(0, -1, 0)_ * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. ##### attributesCheck &gt; _Contains classification objects for various attributes of the human face. This prototype activates nudityCheck_ * _female (*)_ _(0, -1, 0)_ * _male (*)_ _(0, -1, 0)_ * _hair_ _(0, -1, 0)_ * _hairless_ _(0, -1, 0)_ * _beard_ _(0, -1, 0)_ * _moustache_ _(0, -1, 0)_ * _headpiece_ _(0, -1, 0)_ * _glasses_ _(0, -1, 0)_ * _sunglasses_ _(0, -1, 0)_ * _mask_ _(0, -1, 0)_ ##### nippleCheck &gt; _Contains classifications for determining if the object recognized as breast has a nipple. This prototype activates nudityCheck_ * _noNipple_ _(0, -1, 0)_ * _hasNipple_ _(0, 0, 0)_ ##### illegalSymbols &gt; _Contains various classification objects of symbols that are prohibited in Germany (e.g. Hakenkreuz, SS, etc). These are grouped under a single name_ * _illegalSymbols_ _(0, 0, 1)_ ##### textRecognition &gt; _Contains letters, numbers and some symbols (e.g. @, #, etc) as classification objects. These are grouped under a single name_ * _textRecognition_ _(0, 6, 6)_  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._ | 
**min** | **Integer** | The minimum amount of objects allowed on the image. Setting the value to -1 will cause the AI to ignore this rule. For moving images this value is applied to a single frame. |  [optional]
**max** | **Integer** | The maximum amount of objects allowed on the image. Setting the value to -1 will cause the AI to ignore this rule. For moving images this value is applied to a single frame. |  [optional]
**severity** | **Integer** | Set a value to define the severity of a broken rule of the given classification object. |  [optional]
**drawMode** | **Integer** | Set if and how a classification object should be drawn over.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur). |  [optional]
**grey** | **Integer** | A grey scale color used in combination of _drawMode_ &#39;2&#39; or &#39;3&#39;. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white. |  [optional]
**scale** | **Float** | Scale of the bounds around the classification object. Specify a value to increase or decrease the size of the bounds. This is applied to the resulting media as well as the JSON coordinates. |  [optional]
**ignore** | **Boolean** | A shorthand to ignore the classification object. This is equal to setting _min&#x3D;0_, _max&#x3D;-1_ and _drawMode&#x3D;0_. |  [optional]


## Enum: ClassificationEnum

Name | Value
---- | -----



