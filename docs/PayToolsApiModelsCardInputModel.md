

# PayToolsApiModelsCardInputModel

The card details that should be charged. You can either provide us with the raw card details or provide a reference to the stored card details in a token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ownerID** | **String** | Card owner Id |  [optional] |
|**issueNumber** | **String** | Card Issue Number |  [optional] |
|**cvv** | **String** | Card security code (digits on back of card) |  [optional] |
|**threeDSAuthentication** | [**PayToolsApiModelsThreeDSAuthenticationInputModel**](PayToolsApiModelsThreeDSAuthenticationInputModel.md) |  |  [optional] |
|**cardType** | **PaymentsCardTypes** |  |  [optional] |
|**cardHolderName** | **String** | Cardholder name (as apears on card) |  |
|**cardNumber** | **String** | Card number (PAN) or a Reference to a Tokenized string. A Token should be referenced in the format @TOKEN, e.g \&quot;@nQGywsQE9gbURtrXEjTZwtWqeMdK9nsO\&quot; |  |
|**expirationYear** | **Integer** | Expiration year |  |
|**expirationMonth** | **Integer** | Expiration month |  |



