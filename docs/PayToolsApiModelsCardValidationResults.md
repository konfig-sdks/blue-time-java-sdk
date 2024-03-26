

# PayToolsApiModelsCardValidationResults

Results for a card validation request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the risk that was identified for this transaction. |  [optional] |
|**riskLevel** | **String** | The risk level associated with this transaction (possible values are &#x60;VeryLow&#x60;, &#x60;Low&#x60;, &#x60;High&#x60; and &#x60;VeryHigh&#x60;) |  [optional] |
|**cardBrand** | **String** | The card brand (AMERICAN EXPRESS, VISA, MASTERCARD, JCB etc) |  [optional] |
|**cardType** | **String** | Type of card (e.g &#39;CREDIT&#39;, &#39;DEBIT&#39;, etc.) |  [optional] |
|**cardCategory** | **String** | Card category (e.g &#39;GIFT&#39;, &#39;PROPRIETARY&#39; etc.) |  [optional] |
|**issuerName** | **String** | Name of Card issuer (e.g &#39;Bank of America&#39;) |  [optional] |
|**issuerCountry** | **String** | 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) of the card issuer&#39;s country |  [optional] |
|**countryByIP** | **String** | 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) of the country detected by the Payer&#39;s IP address |  [optional] |
|**countryFromBillingAddress** | **String** | 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) from the Payer&#39;s billing address |  [optional] |
|**anonymousProxyUsed** | **Boolean** | Is the Payer&#39;s IP address coming from an Anonymous Proxy |  [optional] |



