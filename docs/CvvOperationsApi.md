# CvvOperationsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokenCvvOperation**](CvvOperationsApi.md#getTokenCvvOperation) | **POST** /CvvOperations | Get a token to start a CVV operation |
| [**performUniversalPaymentGatewayCharge**](CvvOperationsApi.md#performUniversalPaymentGatewayCharge) | **POST** /CvvOperations/charge | Perform Univesal payment gateway charge operation |
| [**validateOperation**](CvvOperationsApi.md#validateOperation) | **GET** /CvvOperations/opValidate | Perform validation of the operation using signed data from charge operation |


<a name="getTokenCvvOperation"></a>
# **getTokenCvvOperation**
> PayToolsApiModelsJwsOutputModel getTokenCvvOperation(ttl).payToolsBlAuthenticationCvvSignedDataModel(payToolsBlAuthenticationCvvSignedDataModel).execute();

Get a token to start a CVV operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CvvOperationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    Integer ttl = 56; // Time to live for the returned token
    PayToolsSharedModelsCardStoredCard card = new PayToolsSharedModelsCardStoredCard();
    PayToolsBlAuthenticationChargePresetData crgD = new PayToolsBlAuthenticationChargePresetData();
    try {
      PayToolsApiModelsJwsOutputModel result = client
              .cvvOperations
              .getTokenCvvOperation(ttl)
              .card(card)
              .crgD(crgD)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#getTokenCvvOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel> response = client
              .cvvOperations
              .getTokenCvvOperation(ttl)
              .card(card)
              .crgD(crgD)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#getTokenCvvOperation");
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
| **payToolsBlAuthenticationCvvSignedDataModel** | [**PayToolsBlAuthenticationCvvSignedDataModel**](PayToolsBlAuthenticationCvvSignedDataModel.md)| The data to be validated in further requests | [optional] |

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

<a name="performUniversalPaymentGatewayCharge"></a>
# **performUniversalPaymentGatewayCharge**
> PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull performUniversalPaymentGatewayCharge(payToolsApiModelsCvvOpsChargeRequest).execute();

Perform Univesal payment gateway charge operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CvvOperationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    BlueTime client = new BlueTime(configuration);
    String cvv = "cvv_example"; // The card details that should be charged. You can either provide us with the raw card details or provide a reference to the stored card details in a token.
    try {
      PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull result = client
              .cvvOperations
              .performUniversalPaymentGatewayCharge(cvv)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayload());
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#performUniversalPaymentGatewayCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull> response = client
              .cvvOperations
              .performUniversalPaymentGatewayCharge(cvv)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#performUniversalPaymentGatewayCharge");
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
| **payToolsApiModelsCvvOpsChargeRequest** | [**PayToolsApiModelsCvvOpsChargeRequest**](PayToolsApiModelsCvvOpsChargeRequest.md)|  | |

### Return type

[**PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull**](PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="validateOperation"></a>
# **validateOperation**
> PayToolsBlAuthenticationCvvSignedDataModel validateOperation().execute();

Perform validation of the operation using signed data from charge operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CvvOperationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    BlueTime client = new BlueTime(configuration);
    try {
      PayToolsBlAuthenticationCvvSignedDataModel result = client
              .cvvOperations
              .validateOperation()
              .execute();
      System.out.println(result);
      System.out.println(result.getCard());
      System.out.println(result.getCrgD());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#validateOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsBlAuthenticationCvvSignedDataModel> response = client
              .cvvOperations
              .validateOperation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CvvOperationsApi#validateOperation");
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

[**PayToolsBlAuthenticationCvvSignedDataModel**](PayToolsBlAuthenticationCvvSignedDataModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

