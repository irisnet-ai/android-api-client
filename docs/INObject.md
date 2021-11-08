

# INObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inClass** | **String** | The classification of the recognized object. |  [optional]
**inGroup** | **String** | The group of the classification. |  [optional]
**inId** | **String** | The group of the classification. |  [optional]
**color** | [**ColorEnum**](#ColorEnum) | The color of the object, e.g. the color of the hair. Is only available for certain classification objects. See list below:  * _hair_ - black, brown, blonde, grey, red, other |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | The style attribute of the object, e.g. the style of the hair. Is only available for certain classification objects. See list below:  * _hair_ - longHaired, shortHaired |  [optional]
**x0** | **Float** | The center of the rectangle in the horizontal (x) direction. |  [optional]
**y0** | **Float** | The center of the rectangle in the vertical (y) direction. |  [optional]
**width** | **Float** | The total width of the rectangle in the horizontal (x) direction. Use _x0 - width / 2_ and _x0 + width / 2_ to get the left and right edges of the rectangle. |  [optional]
**height** | **Float** | The total height of the rectangle in the vertical (y) direction. Use _y0 - height / 2_ and _y0 + height / 2_ to get the top and bottom edges of the rectangle. |  [optional]
**probability** | **Integer** | The probability that the object found matches the classification. |  [optional]


## Enum: ColorEnum

Name | Value
---- | -----


## Enum: StyleEnum

Name | Value
---- | -----




