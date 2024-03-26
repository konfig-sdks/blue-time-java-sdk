

# PayToolsApiModelsAuthRequestModel

Model for a Charge/Pre-authorize request for card processing via a payment gateway

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | The currency of the transaction. Based on the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217#Active_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 4217&lt;/a&gt; standard. |  |
|**isDigital** | **Boolean** | This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters |  [optional] |
|**orderDesc** | **String** | This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters |  [optional] |
|**payerDetails** | [**PayToolsApiModelsPayerDetails**](PayToolsApiModelsPayerDetails.md) |  |  [optional] |
|**card** | [**PayToolsApiModelsCardInputModel**](PayToolsApiModelsCardInputModel.md) |  |  |
|**amount** | **Double** | The amount to be charged (the amount should be in major units - for example, 10.23) |  |
|**myRef** | **String** | Your custom reference for this transaction |  [optional] |
|**paymentGatewayAccountName** | **String** | The reference name provided to the stored Payment Gateway Account as set in &#x60;PUT /PaymentGatewayAccounts/{name}&#x60;.  **Please note**, if you provide us with both this parameter and the raw credentials in the &#x60;paymentGatewayAccount&#x60; object, this parameter will be ignored and the raw credentials will take precedence. |  [optional] |
|**certificateName** | **String** | Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our &lt;a href&#x3D;\&quot;https://portal.epaytools.com\&quot; target&#x3D;\&quot;_blank\&quot;&gt;users portal&lt;/a&gt; |  [optional] |
|**paymentGatewayAccount** | [**PayToolsApiModelsPaymentGatewayAccount**](PayToolsApiModelsPaymentGatewayAccount.md) |  |  [optional] |
|**networkTokenBrand** | **PaymentsNetworkTokenSchemes** |  |  [optional] |



