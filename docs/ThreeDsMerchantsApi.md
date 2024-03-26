# ThreeDsMerchantsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMerchantInfo**](ThreeDsMerchantsApi.md#getMerchantInfo) | **GET** /ThreeDsMerchants/{name} | Get a Merchant |
| [**listMerchants**](ThreeDsMerchantsApi.md#listMerchants) | **GET** /ThreeDsMerchants | List Merchants |
| [**removeMerchant**](ThreeDsMerchantsApi.md#removeMerchant) | **DELETE** /ThreeDsMerchants/{name} | Delete a Merchant |
| [**updateMerchantInfo**](ThreeDsMerchantsApi.md#updateMerchantInfo) | **PUT** /ThreeDsMerchants/{name} | Set a merchant |


<a name="getMerchantInfo"></a>
# **getMerchantInfo**
> PayToolsApiModelsThreeDsMerchantOutputModel getMerchantInfo(name).execute();

Get a Merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsMerchantsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // Name of merchant
    try {
      PayToolsApiModelsThreeDsMerchantOutputModel result = client
              .threeDsMerchants
              .getMerchantInfo(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getThreeDsMerchant());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#getMerchantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsThreeDsMerchantOutputModel> response = client
              .threeDsMerchants
              .getMerchantInfo(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#getMerchantInfo");
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
| **name** | **String**| Name of merchant | |

### Return type

[**PayToolsApiModelsThreeDsMerchantOutputModel**](PayToolsApiModelsThreeDsMerchantOutputModel.md)

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

<a name="listMerchants"></a>
# **listMerchants**
> List&lt;PayToolsApiModelsThreeDsMerchantOutputModel&gt; listMerchants().execute();

List Merchants

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsMerchantsApi;
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
      List<PayToolsApiModelsThreeDsMerchantOutputModel> result = client
              .threeDsMerchants
              .listMerchants()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#listMerchants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayToolsApiModelsThreeDsMerchantOutputModel>> response = client
              .threeDsMerchants
              .listMerchants()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#listMerchants");
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

[**List&lt;PayToolsApiModelsThreeDsMerchantOutputModel&gt;**](PayToolsApiModelsThreeDsMerchantOutputModel.md)

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

<a name="removeMerchant"></a>
# **removeMerchant**
> removeMerchant(name).execute();

Delete a Merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsMerchantsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // Name of merchant
    try {
      client
              .threeDsMerchants
              .removeMerchant(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#removeMerchant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .threeDsMerchants
              .removeMerchant(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#removeMerchant");
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
| **name** | **String**| Name of merchant | |

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

<a name="updateMerchantInfo"></a>
# **updateMerchantInfo**
> PayToolsDalEntitiesThreeDsMerchant updateMerchantInfo(name).payToolsDalEntitiesThreeDsMerchant(payToolsDalEntitiesThreeDsMerchant).execute();

Set a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreeDsMerchantsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String merchantName = "merchantName_example";
    String merchantDisplayName = "merchantDisplayName_example";
    String merchantRequestorIdSuffix = "merchantRequestorIdSuffix_example";
    String merchantCountry = "merchantCountry_example";
    URI merchantUrl = new URI();
    String acquirerName = "acquirerName_example";
    String name = "name_example"; // Name of merchant
    List<PayToolsDalEntitiesThreeDsBrand> brands = Arrays.asList();
    try {
      PayToolsDalEntitiesThreeDsMerchant result = client
              .threeDsMerchants
              .updateMerchantInfo(merchantName, merchantDisplayName, merchantRequestorIdSuffix, merchantCountry, merchantUrl, acquirerName, name)
              .brands(brands)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantName());
      System.out.println(result.getMerchantDisplayName());
      System.out.println(result.getMerchantRequestorIdSuffix());
      System.out.println(result.getMerchantCountry());
      System.out.println(result.getMerchantUrl());
      System.out.println(result.getAcquirerName());
      System.out.println(result.getBrands());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#updateMerchantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsDalEntitiesThreeDsMerchant> response = client
              .threeDsMerchants
              .updateMerchantInfo(merchantName, merchantDisplayName, merchantRequestorIdSuffix, merchantCountry, merchantUrl, acquirerName, name)
              .brands(brands)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreeDsMerchantsApi#updateMerchantInfo");
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
| **name** | **String**| Name of merchant | |
| **payToolsDalEntitiesThreeDsMerchant** | [**PayToolsDalEntitiesThreeDsMerchant**](PayToolsDalEntitiesThreeDsMerchant.md)| 3DS Merchant | [optional] |

### Return type

[**PayToolsDalEntitiesThreeDsMerchant**](PayToolsDalEntitiesThreeDsMerchant.md)

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

