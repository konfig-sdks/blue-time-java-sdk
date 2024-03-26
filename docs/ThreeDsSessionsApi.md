# ThreeDsSessionsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChallengeStatus**](ThreeDsSessionsApi.md#getChallengeStatus) | **GET** /ThreeDsSessions/challengeStatus | Get challenge ststus, as stored on server |
| [**getTokenStartOperation**](ThreeDsSessionsApi.md#getTokenStartOperation) | **POST** /ThreeDsSessions | Get a token to start a card operation |
| [**handleFingerprintCallback**](ThreeDsSessionsApi.md#handleFingerprintCallback) | **POST** /ThreeDsSessions/fingerprintCallback/{sessionId} | Handle a callback (redirect from device fingerprint) |
| [**handleMpiChallengeCallback**](ThreeDsSessionsApi.md#handleMpiChallengeCallback) | **GET** /ThreeDsSessions/mpiChallengeCallback/{sessionId} | Handle a callback (redirect from challenge) |
| [**performValidationOperation**](ThreeDsSessionsApi.md#performValidationOperation) | **GET** /ThreeDsSessions/opValidate | Perform validation of the operation using to signed data |


<a name="getChallengeStatus"></a>
# **getChallengeStatus**
> PayToolsSharedModelsThreeDsClientMessage getChallengeStatus().execute();

Get challenge ststus, as stored on server

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    // Configure HTTP bearer authorization: JwsAuth
    configuration.token = "BEARER TOKEN";
    BlueTime client = new BlueTime(configuration);
    try {
      PayToolsSharedModelsThreeDsClientMessage result = client
              .threeDsSessions
              .getChallengeStatus()
              .execute();
      System.out.println(result);
      System.out.println(result.getMessageType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#getChallengeStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsSharedModelsThreeDsClientMessage> response = client
              .threeDsSessions
              .getChallengeStatus()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#getChallengeStatus");
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

[**PayToolsSharedModelsThreeDsClientMessage**](PayToolsSharedModelsThreeDsClientMessage.md)

### Authorization

[JwsAuth](../README.md#JwsAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="getTokenStartOperation"></a>
# **getTokenStartOperation**
> PayToolsApiModelsJwsOutputModel getTokenStartOperation(ttl).payToolsBlAuthenticationThreeDsSessionModel(payToolsBlAuthenticationThreeDsSessionModel).execute();

Get a token to start a card operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String merchantAccountName = "merchantAccountName_example"; // The name of the stored merchant account
    PayToolsSharedModelsMoneyModel amt = new PayToolsSharedModelsMoneyModel();
    Integer ttl = 56; // Time to live for the returned token
    try {
      PayToolsApiModelsJwsOutputModel result = client
              .threeDsSessions
              .getTokenStartOperation(merchantAccountName, amt, ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#getTokenStartOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel> response = client
              .threeDsSessions
              .getTokenStartOperation(merchantAccountName, amt, ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#getTokenStartOperation");
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
| **ttl** | **Integer**| Time to live for the returned token | |
| **payToolsBlAuthenticationThreeDsSessionModel** | [**PayToolsBlAuthenticationThreeDsSessionModel**](PayToolsBlAuthenticationThreeDsSessionModel.md)| The data to be validated in further requests | [optional] |

### Return type

[**PayToolsApiModelsJwsOutputModel**](PayToolsApiModelsJwsOutputModel.md)

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

<a name="handleFingerprintCallback"></a>
# **handleFingerprintCallback**
> handleFingerprintCallback(sessionId).execute();

Handle a callback (redirect from device fingerprint)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    BlueTime client = new BlueTime(configuration);
    String sessionId = "sessionId_example"; // The value containing data to designate the client
    try {
      client
              .threeDsSessions
              .handleFingerprintCallback(sessionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#handleFingerprintCallback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .threeDsSessions
              .handleFingerprintCallback(sessionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#handleFingerprintCallback");
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
| **sessionId** | **String**| The value containing data to designate the client | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="handleMpiChallengeCallback"></a>
# **handleMpiChallengeCallback**
> handleMpiChallengeCallback(sessionId).execute();

Handle a callback (redirect from challenge)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    BlueTime client = new BlueTime(configuration);
    String sessionId = "sessionId_example"; // The value containing data to designate the client
    try {
      client
              .threeDsSessions
              .handleMpiChallengeCallback(sessionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#handleMpiChallengeCallback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .threeDsSessions
              .handleMpiChallengeCallback(sessionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#handleMpiChallengeCallback");
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
| **sessionId** | **String**| The value containing data to designate the client | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="performValidationOperation"></a>
# **performValidationOperation**
> performValidationOperation().execute();

Perform validation of the operation using to signed data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    // Configure HTTP bearer authorization: JwsAuth
    configuration.token = "BEARER TOKEN";
    BlueTime client = new BlueTime(configuration);
    try {
      client
              .threeDsSessions
              .performValidationOperation()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#performValidationOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .threeDsSessions
              .performValidationOperation()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsSessionsApi#performValidationOperation");
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

null (empty response body)

### Authorization

[JwsAuth](../README.md#JwsAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

