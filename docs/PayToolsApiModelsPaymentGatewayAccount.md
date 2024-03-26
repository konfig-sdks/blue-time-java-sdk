

# PayToolsApiModelsPaymentGatewayAccount

The raw credentials necessary to connect to the chosen payment gateway as defined in `GET /PaymentGateway`.  **Please note**, if you provide us with both the raw details here and a stored Payment Gateway Account in the `paymentGatewayAccountName` parameter, these credentials will take precedence.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentGatewayName** | **String** | Unique name of the Payment Gateway the account information relates to. |  [optional] |
|**credentials** | [**List&lt;SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e&gt;**](SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e.md) | A list of key-value pairs that represents your credentials within the Payment gateway.   Each key should represent a parameter listed in the \&quot;CredentialsNames\&quot; element of the response from the list all payment gateways method at &#x60;[GET] /paymentGateway&#x60;  Example:  \&quot;Credentials\&quot;: [     {         \&quot;Key\&quot;: \&quot;PrivateKey\&quot;,         \&quot;Value\&quot;: \&quot;VBtt666M/G098098vgdewvk0Mc-GH\&quot;     }  ] |  [optional] |



