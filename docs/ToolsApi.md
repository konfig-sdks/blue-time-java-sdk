# ToolsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBrandLookup**](ToolsApi.md#getBrandLookup) | **GET** /Tools/brand | Brand Lookup |
| [**lookupMetadata**](ToolsApi.md#lookupMetadata) | **GET** /Tools/iin | Metadata Lookup |
| [**validateCardDetails**](ToolsApi.md#validateCardDetails) | **POST** /Tools/validate | Card Validation |
| [**validateLuhnCard**](ToolsApi.md#validateLuhnCard) | **GET** /Tools/luhn | Luhn Algorithm Validation |


<a name="getBrandLookup"></a>
# **getBrandLookup**
> PayToolsApiModelsBrandLookupResult getBrandLookup(iin).execute();

Brand Lookup

This method allows you to lookup the brand of the card provided.               By providing the card&#39;s BIN / IIN (the first 6 to 11 digits of the card number), we lookup and return the brand of the card (Visa, Mastercard, Amex, etc.).              In addition, we will also provide the URL to the logo of the card brand - you can then reference this image in your card capture form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ToolsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String iin = "iin_example"; // Card's BIN / IIN (the first 6 to 11 digits of the card number)
    try {
      PayToolsApiModelsBrandLookupResult result = client
              .tools
              .getBrandLookup(iin)
              .execute();
      System.out.println(result);
      System.out.println(result.getBrand());
      System.out.println(result.getBrandLogoUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#getBrandLookup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsBrandLookupResult> response = client
              .tools
              .getBrandLookup(iin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#getBrandLookup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **iin** | **String**| Card&#39;s BIN / IIN (the first 6 to 11 digits of the card number) | |

### Return type

[**PayToolsApiModelsBrandLookupResult**](PayToolsApiModelsBrandLookupResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="lookupMetadata"></a>
# **lookupMetadata**
> PayToolsApiModelsIinData lookupMetadata(iin).execute();

Metadata Lookup

This method allows you to lookup the metadata of the card provided.   By providing the card&#39;s BIN / IIN (the first 6 to 11 digits of the card number), we lookup and return the full metadata available for this card./r/nI  In addition, we will also provide the URL to the logo of the card brand - you can then reference this image in your card capture form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ToolsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String iin = "iin_example"; // Card's BIN / IIN (the first 6 to 11 digits of the card number)
    try {
      PayToolsApiModelsIinData result = client
              .tools
              .lookupMetadata(iin)
              .execute();
      System.out.println(result);
      System.out.println(result.getBin());
      System.out.println(result.getCardBrand());
      System.out.println(result.getCardType());
      System.out.println(result.getCategory());
      System.out.println(result.getIssuingOrganization());
      System.out.println(result.getCountryCode());
      System.out.println(result.getBrandLogoUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#lookupMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsIinData> response = client
              .tools
              .lookupMetadata(iin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#lookupMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **iin** | **String**| Card&#39;s BIN / IIN (the first 6 to 11 digits of the card number) | |

### Return type

[**PayToolsApiModelsIinData**](PayToolsApiModelsIinData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="validateCardDetails"></a>
# **validateCardDetails**
> PayToolsApiModelsCardValidationResults validateCardDetails(iin, payToolsApiModelsPayerBaseWithClientIp).execute();

Card Validation

This method allows you to validate the card details against the card&#39;s meta data. By providing the billing address and IP address of the card owner, we validate those against the metadata of the card and provide a risk assessment for this transaction.  All you would need is the card&#39;s BIN / IIN (the first 6 to 11 digits of the card number), the billing address and IP address.  The response of this method will include the full metadata information for this BIN including the risk assessment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ToolsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String clientIPAddress = "clientIPAddress_example"; // Client IP address
    String countryCode = "countryCode_example"; // 2 letter country code (<a href=\\\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\\\" target=\\\"_blank\\\">ISO 3166-2 <img src=\\\"https://files.readme.io/b676144-openNewWindow.png\\\" width=\\\"10\\\" /></a>)
    String iin = "iin_example"; // Card's BIN / IIN (the first 6 to 11 digits of the card number)
    String city = "city_example"; // City
    String stateProvince = "stateProvince_example"; // State or Province
    try {
      PayToolsApiModelsCardValidationResults result = client
              .tools
              .validateCardDetails(clientIPAddress, countryCode, iin)
              .city(city)
              .stateProvince(stateProvince)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRiskLevel());
      System.out.println(result.getCardBrand());
      System.out.println(result.getCardType());
      System.out.println(result.getCardCategory());
      System.out.println(result.getIssuerName());
      System.out.println(result.getIssuerCountry());
      System.out.println(result.getCountryByIP());
      System.out.println(result.getCountryFromBillingAddress());
      System.out.println(result.getAnonymousProxyUsed());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#validateCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsCardValidationResults> response = client
              .tools
              .validateCardDetails(clientIPAddress, countryCode, iin)
              .city(city)
              .stateProvince(stateProvince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#validateCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **iin** | **String**| Card&#39;s BIN / IIN (the first 6 to 11 digits of the card number) | |
| **payToolsApiModelsPayerBaseWithClientIp** | [**PayToolsApiModelsPayerBaseWithClientIp**](PayToolsApiModelsPayerBaseWithClientIp.md)| payer details | |

### Return type

[**PayToolsApiModelsCardValidationResults**](PayToolsApiModelsCardValidationResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |

<a name="validateLuhnCard"></a>
# **validateLuhnCard**
> PayToolsApiModelsLuhnCheckResultsWithIinData validateLuhnCard(number).metaData(metaData).execute();

Luhn Algorithm Validation

This method allows you to provide the card number and validate it against the&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/Luhn_algorithm\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Luhn algorithm&lt;/a&gt;.In addition, you can choose to receive the card&#39;s metadata in the response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ToolsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String number = "number_example"; // The full card number to be validated.
    Boolean metaData = false; // An optional indicator to specify whether the card metadata should be included in the response.
    try {
      PayToolsApiModelsLuhnCheckResultsWithIinData result = client
              .tools
              .validateLuhnCard(number)
              .metaData(metaData)
              .execute();
      System.out.println(result);
      System.out.println(result.getIinData());
      System.out.println(result.getLuhnValid());
      System.out.println(result.getError());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#validateLuhnCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsLuhnCheckResultsWithIinData> response = client
              .tools
              .validateLuhnCard(number)
              .metaData(metaData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsApi#validateLuhnCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **number** | **String**| The full card number to be validated. | |
| **metaData** | **Boolean**| An optional indicator to specify whether the card metadata should be included in the response. | [optional] [default to false] |

### Return type

[**PayToolsApiModelsLuhnCheckResultsWithIinData**](PayToolsApiModelsLuhnCheckResultsWithIinData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |

