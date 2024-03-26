# PaymentGatewayAccountsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrReplace**](PaymentGatewayAccountsApi.md#addOrReplace) | **PUT** /PaymentGatewayAccounts/{name} | Add or Replace a Payment Gateway Account |
| [**getAll**](PaymentGatewayAccountsApi.md#getAll) | **GET** /PaymentGatewayAccounts | List Payment Gateway Accounts |
| [**getInfo**](PaymentGatewayAccountsApi.md#getInfo) | **GET** /PaymentGatewayAccounts/{name} | Retrieve Payment Gateway Account |
| [**removeAccount**](PaymentGatewayAccountsApi.md#removeAccount) | **DELETE** /PaymentGatewayAccounts/{name} | Delete a Payment Gateway Account |


<a name="addOrReplace"></a>
# **addOrReplace**
> PayToolsApiModelsPaymentGatewayAccountFullOutputModel addOrReplace(name, payToolsApiModelsPaymentGatewayAccountInputModel).execute();

Add or Replace a Payment Gateway Account

A Payment Gateway Account is the set of information necessary for connecting to a specific payment gateway through our system.  This method allows you to add a new stored Payment Gateway Account in the system or to replace an existing one.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // A unique name of this Payment Gateway Account
    String paymentGatewayName = "paymentGatewayName_example"; // Unique name of the Payment Gateway the account information relates to.
    List<SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e> credentials = Arrays.asList(); // A list of key-value pairs that represents your credentials within the Payment gateway.   Each key should represent a parameter listed in the \\\"CredentialsNames\\\" element of the response from the list all payment gateways method at `[GET] /paymentGateway`  Example:  \\\"Credentials\\\": [     {         \\\"Key\\\": \\\"PrivateKey\\\",         \\\"Value\\\": \\\"VBtt666M/G098098vgdewvk0Mc-GH\\\"     }  ]
    try {
      PayToolsApiModelsPaymentGatewayAccountFullOutputModel result = client
              .paymentGatewayAccounts
              .addOrReplace(name)
              .paymentGatewayName(paymentGatewayName)
              .credentials(credentials)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCreationTime());
      System.out.println(result.getPaymentGatewayName());
      System.out.println(result.getCredentials());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#addOrReplace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsPaymentGatewayAccountFullOutputModel> response = client
              .paymentGatewayAccounts
              .addOrReplace(name)
              .paymentGatewayName(paymentGatewayName)
              .credentials(credentials)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#addOrReplace");
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
| **name** | **String**| A unique name of this Payment Gateway Account | |
| **payToolsApiModelsPaymentGatewayAccountInputModel** | [**PayToolsApiModelsPaymentGatewayAccountInputModel**](PayToolsApiModelsPaymentGatewayAccountInputModel.md)| Payment gateway account data | |

### Return type

[**PayToolsApiModelsPaymentGatewayAccountFullOutputModel**](PayToolsApiModelsPaymentGatewayAccountFullOutputModel.md)

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

<a name="getAll"></a>
# **getAll**
> List&lt;PayToolsApiModelsPaymentGatewayAccountBriefOutputModel&gt; getAll().execute();

List Payment Gateway Accounts

This method allows you to list all stored Payment Gateway Accounts in the system

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayAccountsApi;
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
      List<PayToolsApiModelsPaymentGatewayAccountBriefOutputModel> result = client
              .paymentGatewayAccounts
              .getAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayToolsApiModelsPaymentGatewayAccountBriefOutputModel>> response = client
              .paymentGatewayAccounts
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#getAll");
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

[**List&lt;PayToolsApiModelsPaymentGatewayAccountBriefOutputModel&gt;**](PayToolsApiModelsPaymentGatewayAccountBriefOutputModel.md)

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

<a name="getInfo"></a>
# **getInfo**
> PayToolsApiModelsPaymentGatewayAccountFullOutputModel getInfo(name).execute();

Retrieve Payment Gateway Account

A Payment Gateway Account is the set of information necessary for connecting to a specific payment gateway through our system.  This method allows you to retrieve the information set on a particular payment gateway account. You can then update it using the &#x60;[PUT] PaymentGatewayAccounts/{name}&#x60; method

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // A unique name of this Payment Gateway Account
    try {
      PayToolsApiModelsPaymentGatewayAccountFullOutputModel result = client
              .paymentGatewayAccounts
              .getInfo(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCreationTime());
      System.out.println(result.getPaymentGatewayName());
      System.out.println(result.getCredentials());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsPaymentGatewayAccountFullOutputModel> response = client
              .paymentGatewayAccounts
              .getInfo(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#getInfo");
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
| **name** | **String**| A unique name of this Payment Gateway Account | |

### Return type

[**PayToolsApiModelsPaymentGatewayAccountFullOutputModel**](PayToolsApiModelsPaymentGatewayAccountFullOutputModel.md)

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

<a name="removeAccount"></a>
# **removeAccount**
> removeAccount(name).execute();

Delete a Payment Gateway Account

This method allows you to delete a stored Payment Gateway Account in the system.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // A unique name of this Payment Gateway Account
    try {
      client
              .paymentGatewayAccounts
              .removeAccount(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#removeAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .paymentGatewayAccounts
              .removeAccount(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayAccountsApi#removeAccount");
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
| **name** | **String**| A unique name of this Payment Gateway Account | |

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

