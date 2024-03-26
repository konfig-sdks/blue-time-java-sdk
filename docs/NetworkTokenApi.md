# NetworkTokenApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardTokenize**](NetworkTokenApi.md#cardTokenize) | **POST** /NetworkToken | Network-tokenize a card |
| [**delete**](NetworkTokenApi.md#delete) | **DELETE** /NetworkToken | Delete a Network-token |


<a name="cardTokenize"></a>
# **cardTokenize**
> NetworkTokenTokenizationResult cardTokenize().payToolsApiModelsNetworkTokenizationTokenizeRequest(payToolsApiModelsNetworkTokenizationTokenizeRequest).execute();

Network-tokenize a card

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkTokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    PayToolsApiModelsTokenizationRequest tokenizationRequest = new PayToolsApiModelsTokenizationRequest();
    PayToolsApiModelsCardBaseWithSecurityCode card = new PayToolsApiModelsCardBaseWithSecurityCode();
    try {
      NetworkTokenTokenizationResult result = client
              .networkToken
              .cardTokenize()
              .tokenizationRequest(tokenizationRequest)
              .card(card)
              .execute();
      System.out.println(result);
      System.out.println(result.getResultCode());
      System.out.println(result.getBrand());
      System.out.println(result.getTokenId());
      System.out.println(result.getTokenizedCard());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkTokenApi#cardTokenize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkTokenTokenizationResult> response = client
              .networkToken
              .cardTokenize()
              .tokenizationRequest(tokenizationRequest)
              .card(card)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkTokenApi#cardTokenize");
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
| **payToolsApiModelsNetworkTokenizationTokenizeRequest** | [**PayToolsApiModelsNetworkTokenizationTokenizeRequest**](PayToolsApiModelsNetworkTokenizationTokenizeRequest.md)| Tokenization Request | [optional] |

### Return type

[**NetworkTokenTokenizationResult**](NetworkTokenTokenizationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="delete"></a>
# **delete**
> Boolean delete().payToolsApiModelsNetworkTokenizationDeleteTokenRequest(payToolsApiModelsNetworkTokenizationDeleteTokenRequest).execute();

Delete a Network-token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkTokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    NetworkTokenRequestSource source = NetworkTokenRequestSource.fromValue("Merchant");
    String tokenId = "tokenId_example"; // Token Id within the Brand
    PaymentsNetworkTokenSchemes brand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    String reason = "reason_example"; // Reason for deletion
    try {
      Boolean result = client
              .networkToken
              .delete(source, tokenId)
              .brand(brand)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkTokenApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Boolean> response = client
              .networkToken
              .delete(source, tokenId)
              .brand(brand)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkTokenApi#delete");
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
| **payToolsApiModelsNetworkTokenizationDeleteTokenRequest** | [**PayToolsApiModelsNetworkTokenizationDeleteTokenRequest**](PayToolsApiModelsNetworkTokenizationDeleteTokenRequest.md)| Delete Request | [optional] |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

