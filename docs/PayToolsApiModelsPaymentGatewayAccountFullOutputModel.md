

# PayToolsApiModelsPaymentGatewayAccountFullOutputModel

Output Model for designating a payment gateway account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of account |  [optional] |
|**creationTime** | **OffsetDateTime** | Date and time the credentials were stored |  [optional] |
|**paymentGatewayName** | **String** | Unique name of the Payment Gateway the account information relates to. |  [optional] |
|**credentials** | [**List&lt;SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e&gt;**](SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e.md) | A list of key-value pairs that represents your credentials within the Payment gateway.   Each key should represent a parameter listed in the \&quot;CredentialsNames\&quot; element of the response from the list all payment gateways method at &#x60;[GET] /paymentGateway&#x60;  Example:  \&quot;Credentials\&quot;: [     {         \&quot;Key\&quot;: \&quot;PrivateKey\&quot;,         \&quot;Value\&quot;: \&quot;VBtt666M/G098098vgdewvk0Mc-GH\&quot;     }  ] |  [optional] |



