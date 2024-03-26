# UtilsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateApiKey**](UtilsApi.md#validateApiKey) | **GET** /Utils/apiKey | Validate Apikey |


<a name="validateApiKey"></a>
# **validateApiKey**
> PayToolsApiModelsAuthenticationResult validateApiKey().execute();

Validate Apikey

This operation allows you to validate your API key and make sure that it is operational. Additionally, this method will allow you to test and check that the API is functioning properly

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    try {
      PayToolsApiModelsAuthenticationResult result = client
              .utils
              .validateApiKey()
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getUserName());
      System.out.println(result.getAccountId());
      System.out.println(result.getIsSandbox());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#validateApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsAuthenticationResult> response = client
              .utils
              .validateApiKey()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#validateApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PayToolsApiModelsAuthenticationResult**](PayToolsApiModelsAuthenticationResult.md)

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

