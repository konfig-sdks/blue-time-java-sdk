# CardOperationsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBrandPrefix**](CardOperationsApi.md#getBrandPrefix) | **GET** /CardOperations/brand | Return brand of card prefix. |
| [**getTokenStartOperation**](CardOperationsApi.md#getTokenStartOperation) | **POST** /CardOperations | Get a token to start a card operation |
| [**getTopBrandsLookup**](CardOperationsApi.md#getTopBrandsLookup) | **GET** /CardOperations/topBrands | Return top credit card brands for lookup of up to 5 first digits. It covers 90% of the cases |
| [**performUniversalPaymentGatewayCharge**](CardOperationsApi.md#performUniversalPaymentGatewayCharge) | **POST** /CardOperations/charge | Perform Univesal payment gateway charge operation |
| [**performValidation**](CardOperationsApi.md#performValidation) | **POST** /CardOperations/validate | Perform card validation |
| [**performValidation_0**](CardOperationsApi.md#performValidation_0) | **GET** /CardOperations/opValidate | Perform validation of the operation using to signed data |
| [**tokenizeAndStore**](CardOperationsApi.md#tokenizeAndStore) | **POST** /CardOperations/store | Tokenize and store card number |


<a name="getBrandPrefix"></a>
# **getBrandPrefix**
> PayToolsApiModelsBrandLookupResult getBrandPrefix(iin).execute();

Return brand of card prefix.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOperationsApi;
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
    String iin = "iin_example"; // Card prefix
    try {
      PayToolsApiModelsBrandLookupResult result = client
              .cardOperations
              .getBrandPrefix(iin)
              .execute();
      System.out.println(result);
      System.out.println(result.getBrand());
      System.out.println(result.getBrandLogoUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getBrandPrefix");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsBrandLookupResult> response = client
              .cardOperations
              .getBrandPrefix(iin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getBrandPrefix");
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
| **iin** | **String**| Card prefix | |

### Return type

[**PayToolsApiModelsBrandLookupResult**](PayToolsApiModelsBrandLookupResult.md)

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
> PayToolsApiModelsJwsMultipleOutputModel getTokenStartOperation(ttl).payToolsBlAuthenticationPreSignedDataModel(payToolsBlAuthenticationPreSignedDataModel).execute();

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
import com.konfigthis.client.api.CardOperationsApi;
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
    PayToolsBlAuthenticationThreeDsSessionModel threeDsSessionModel = new PayToolsBlAuthenticationThreeDsSessionModel();
    PciBookingIINLookupLibraryRiskLevel vld = PciBookingIINLookupLibraryRiskLevel.fromValue("VeryHigh");
    PayToolsSharedEnumsPerform3ds _3ds = PayToolsSharedEnumsPerform3ds.fromValue("Mandatory");
    Boolean crg = true; // Is Card charge required for this session
    PayToolsBlAuthenticationTokenizationAction tkn = PayToolsBlAuthenticationTokenizationAction.fromValue("Always");
    PayToolsBlAuthenticationChargePresetData crgD = new PayToolsBlAuthenticationChargePresetData();
    try {
      PayToolsApiModelsJwsMultipleOutputModel result = client
              .cardOperations
              .getTokenStartOperation(ttl)
              .threeDsSessionModel(threeDsSessionModel)
              .vld(vld)
              ._3ds(_3ds)
              .crg(crg)
              .tkn(tkn)
              .crgD(crgD)
              .execute();
      System.out.println(result);
      System.out.println(result.getThreeDsAuthToken());
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getTokenStartOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsMultipleOutputModel> response = client
              .cardOperations
              .getTokenStartOperation(ttl)
              .threeDsSessionModel(threeDsSessionModel)
              .vld(vld)
              ._3ds(_3ds)
              .crg(crg)
              .tkn(tkn)
              .crgD(crgD)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getTokenStartOperation");
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
| **payToolsBlAuthenticationPreSignedDataModel** | [**PayToolsBlAuthenticationPreSignedDataModel**](PayToolsBlAuthenticationPreSignedDataModel.md)| The data to be validated in further requests | [optional] |

### Return type

[**PayToolsApiModelsJwsMultipleOutputModel**](PayToolsApiModelsJwsMultipleOutputModel.md)

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

<a name="getTopBrandsLookup"></a>
# **getTopBrandsLookup**
> PayToolsApiModelsTopBrands getTopBrandsLookup().execute();

Return top credit card brands for lookup of up to 5 first digits. It covers 90% of the cases

The result is an array of 5 elements, where each element represents iin prefixes for a givel size as well as the list of logo Url&#39;s for all brands.  Each element in the top-level array is an object where members are prefixes and data is the brand.  For a quick lookup:  1. get the element by the size of your prefix.  2. try to obtain the prefix as a member name; The member value is the brand    For logo lookup finf thr brand name as the key to the logos member.  If not found, you can try using &#39;DEFAULT&#39;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOperationsApi;
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
      PayToolsApiModelsTopBrands result = client
              .cardOperations
              .getTopBrandsLookup()
              .execute();
      System.out.println(result);
      System.out.println(result.getPrefixes());
      System.out.println(result.getLogos());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getTopBrandsLookup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsTopBrands> response = client
              .cardOperations
              .getTopBrandsLookup()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#getTopBrandsLookup");
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

[**PayToolsApiModelsTopBrands**](PayToolsApiModelsTopBrands.md)

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

<a name="performUniversalPaymentGatewayCharge"></a>
# **performUniversalPaymentGatewayCharge**
> PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull performUniversalPaymentGatewayCharge(payToolsApiModelsCardOpsChargeRequest).execute();

Perform Univesal payment gateway charge operation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOperationsApi;
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
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    PayToolsApiModelsPayerDetailsNoIpAddress payerDetails = new PayToolsApiModelsPayerDetailsNoIpAddress();
    String myRef = "myRef_example"; // Your custom reference for this transaction
    try {
      PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull result = client
              .cardOperations
              .performUniversalPaymentGatewayCharge(card)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayload());
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performUniversalPaymentGatewayCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull> response = client
              .cardOperations
              .performUniversalPaymentGatewayCharge(card)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performUniversalPaymentGatewayCharge");
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
| **payToolsApiModelsCardOpsChargeRequest** | [**PayToolsApiModelsCardOpsChargeRequest**](PayToolsApiModelsCardOpsChargeRequest.md)|  | |

### Return type

[**PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull**](PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull.md)

### Authorization

[JwsAuth](../README.md#JwsAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="performValidation"></a>
# **performValidation**
> PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull performValidation(iin, payToolsApiModelsPayerBase).execute();

Perform card validation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOperationsApi;
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
    String countryCode = "countryCode_example"; // 2 letter country code (<a href=\\\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\\\" target=\\\"_blank\\\">ISO 3166-2 <img src=\\\"https://files.readme.io/b676144-openNewWindow.png\\\" width=\\\"10\\\" /></a>)
    String iin = "iin_example"; // Card prefix
    String city = "city_example"; // City
    String stateProvince = "stateProvince_example"; // State or Province
    try {
      PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull result = client
              .cardOperations
              .performValidation(countryCode, iin)
              .city(city)
              .stateProvince(stateProvince)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayload());
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull> response = client
              .cardOperations
              .performValidation(countryCode, iin)
              .city(city)
              .stateProvince(stateProvince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performValidation");
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
| **iin** | **String**| Card prefix | |
| **payToolsApiModelsPayerBase** | [**PayToolsApiModelsPayerBase**](PayToolsApiModelsPayerBase.md)| Payer details | |

### Return type

[**PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull**](PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull.md)

### Authorization

[JwsAuth](../README.md#JwsAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

<a name="performValidation_0"></a>
# **performValidation_0**
> PayToolsBlAuthenticationSignedData performValidation_0().execute();

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
import com.konfigthis.client.api.CardOperationsApi;
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
      PayToolsBlAuthenticationSignedData result = client
              .cardOperations
              .performValidation_0()
              .execute();
      System.out.println(result);
      System.out.println(result.getVldRq());
      System.out.println(result.getVldRs());
      System.out.println(result.getCrgRq());
      System.out.println(result.getCrgRs());
      System.out.println(result.getTknRs());
      System.out.println(result.get3dsD());
      System.out.println(result.getVld());
      System.out.println(result.get3ds());
      System.out.println(result.getCrg());
      System.out.println(result.getTkn());
      System.out.println(result.getCrgD());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performValidation_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsBlAuthenticationSignedData> response = client
              .cardOperations
              .performValidation_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#performValidation_0");
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

[**PayToolsBlAuthenticationSignedData**](PayToolsBlAuthenticationSignedData.md)

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

<a name="tokenizeAndStore"></a>
# **tokenizeAndStore**
> PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull tokenizeAndStore(payToolsApiModelsStringTokenIntputModel).execute();

Tokenize and store card number

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOperationsApi;
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
    String payload = "payload_example"; // The content of the string you would like to tokenize
    try {
      PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull result = client
              .cardOperations
              .tokenizeAndStore(payload)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayload());
      System.out.println(result.getAuthToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#tokenizeAndStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull> response = client
              .cardOperations
              .tokenizeAndStore(payload)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOperationsApi#tokenizeAndStore");
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
| **payToolsApiModelsStringTokenIntputModel** | [**PayToolsApiModelsStringTokenIntputModel**](PayToolsApiModelsStringTokenIntputModel.md)| Model with card number to be tokenized | |

### Return type

[**PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull**](PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull.md)

### Authorization

[JwsAuth](../README.md#JwsAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

