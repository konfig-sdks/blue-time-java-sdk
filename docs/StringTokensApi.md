# StringTokensApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteByToken**](StringTokensApi.md#deleteByToken) | **DELETE** /StringTokens/{token} | Delete an existing string by token |
| [**getContent**](StringTokensApi.md#getContent) | **GET** /StringTokens/{token} | Retrieve content of StringToken |
| [**getMetaData**](StringTokensApi.md#getMetaData) | **GET** /StringTokens/{token}/meta | Retrieve meta data of a StringToken |
| [**storeAndTokenize**](StringTokensApi.md#storeAndTokenize) | **POST** /StringTokens | Store and tokenize a string |


<a name="deleteByToken"></a>
# **deleteByToken**
> deleteByToken(token).execute();

Delete an existing string by token

This method allows you to delete a stringToken by its token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StringTokensApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String token = "token_example"; // The token ID representing the string to be deleted
    try {
      client
              .stringTokens
              .deleteByToken(token)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#deleteByToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .stringTokens
              .deleteByToken(token)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#deleteByToken");
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
| **token** | **String**| The token ID representing the string to be deleted | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |
| **404** | Not found |  -  |

<a name="getContent"></a>
# **getContent**
> PayToolsApiModelsStringTokenOutputModel getContent(token).execute();

Retrieve content of StringToken

This method allows you to retrieve the stored content of the StringToken.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StringTokensApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String token = "token_example"; // The token ID of the StringToken you would like to retrieve the content for
    try {
      PayToolsApiModelsStringTokenOutputModel result = client
              .stringTokens
              .getContent(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getClearPayload());
      System.out.println(result.getToken());
      System.out.println(result.getCreateTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#getContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsStringTokenOutputModel> response = client
              .stringTokens
              .getContent(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#getContent");
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
| **token** | **String**| The token ID of the StringToken you would like to retrieve the content for | |

### Return type

[**PayToolsApiModelsStringTokenOutputModel**](PayToolsApiModelsStringTokenOutputModel.md)

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
| **404** | Not found |  -  |

<a name="getMetaData"></a>
# **getMetaData**
> PayToolsApiModelsStringTokenMetaDataOutputModel getMetaData(token).execute();

Retrieve meta data of a StringToken

This method allows you to retrieve the meta data of a StringToken.  The response to this method will **not** retrieve the content of the StringToken (you can do that by using &#x60;GET /StringTokens/{token}&#x60;)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StringTokensApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String token = "token_example"; // Token representing the string to be retrieved
    try {
      PayToolsApiModelsStringTokenMetaDataOutputModel result = client
              .stringTokens
              .getMetaData(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getCreateTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#getMetaData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> response = client
              .stringTokens
              .getMetaData(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#getMetaData");
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
| **token** | **String**| Token representing the string to be retrieved | |

### Return type

[**PayToolsApiModelsStringTokenMetaDataOutputModel**](PayToolsApiModelsStringTokenMetaDataOutputModel.md)

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
| **404** | Not found |  -  |

<a name="storeAndTokenize"></a>
# **storeAndTokenize**
> PayToolsApiModelsStringTokenMetaDataOutputModel storeAndTokenize(payToolsApiModelsStringTokenIntputModel).execute();

Store and tokenize a string

This method allows you to submit a string to be stored and tokenized in our system.  Once tokenized, the token ID will be returned in the body of the response and the full token URI will be returned in the &#x60;Location&#x60; header.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StringTokensApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String payload = "payload_example"; // The content of the string you would like to tokenize
    try {
      PayToolsApiModelsStringTokenMetaDataOutputModel result = client
              .stringTokens
              .storeAndTokenize(payload)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getCreateTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#storeAndTokenize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> response = client
              .stringTokens
              .storeAndTokenize(payload)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StringTokensApi#storeAndTokenize");
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
| **payToolsApiModelsStringTokenIntputModel** | [**PayToolsApiModelsStringTokenIntputModel**](PayToolsApiModelsStringTokenIntputModel.md)| StringToken input model | |

### Return type

[**PayToolsApiModelsStringTokenMetaDataOutputModel**](PayToolsApiModelsStringTokenMetaDataOutputModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - Token URI representing the stringToken <br>  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |

