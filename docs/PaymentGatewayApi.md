# PaymentGatewayApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listGateways**](PaymentGatewayApi.md#listGateways) | **GET** /PaymentGateway | List all payment gateways |
| [**performAuthorizeOperation**](PaymentGatewayApi.md#performAuthorizeOperation) | **POST** /PaymentGateway/authorize | Perform a payment gateway authorize operation |
| [**performCaptureOperation**](PaymentGatewayApi.md#performCaptureOperation) | **PUT** /PaymentGateway/capture | Perform a payment gateway capture operation |
| [**performChargeOperation**](PaymentGatewayApi.md#performChargeOperation) | **POST** /PaymentGateway/charge | Perform a payment gateway charge operation |
| [**performRefundOperation**](PaymentGatewayApi.md#performRefundOperation) | **PUT** /PaymentGateway/refund | Perform a payment gateway refund operation |
| [**voidOperation**](PaymentGatewayApi.md#voidOperation) | **DELETE** /PaymentGateway/void | Perform a payment gateway Void operation |


<a name="listGateways"></a>
# **listGateways**
> List&lt;PayToolsApiModelsPaymentGatewayDescriptionModel&gt; listGateways().execute();

List all payment gateways

To provide you with full payment orchestration capabilities, we have integrated with many different payment gateways and processors around the world. This method allows you to retrieve the list of all integrated payment gateways in our system and provide you with the relevant connection settings required for each of them.  To see a graphical list of the supported payment gateways, please visit our website.  If you would like us to support a new payment gateway not on the list, please contact our support.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
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
      List<PayToolsApiModelsPaymentGatewayDescriptionModel> result = client
              .paymentGateway
              .listGateways()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#listGateways");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayToolsApiModelsPaymentGatewayDescriptionModel>> response = client
              .paymentGateway
              .listGateways()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#listGateways");
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

[**List&lt;PayToolsApiModelsPaymentGatewayDescriptionModel&gt;**](PayToolsApiModelsPaymentGatewayDescriptionModel.md)

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

<a name="performAuthorizeOperation"></a>
# **performAuthorizeOperation**
> PaymentsOperationResult performAuthorizeOperation(payToolsApiModelsAuthRequestModel).execute();

Perform a payment gateway authorize operation

This method allows you to perform an \&quot;authorize\&quot; operation (also called \&quot;preauthorization\&quot; or \&quot;authorization\&quot;) through your payment gateway. When you perform the \&quot;authorize\&quot; operation, the bank that issued the credit card will place an authorization of the total amount of the funds. This is how the bank determines if the funds are available to make the purchase. The card will not actually be “charged” until you perform the \&quot;capture\&quot; operation (using our &#x60;[PUT] /PaymentGateway/capture&#x60; method).  **Please note**, different card brands and different banks allow for different time frames on the lifespan of a payment authorization. You will need to check with your payment processor on how long you would have between performing an \&quot;authorize\&quot; operation and a \&quot;charge\&quot; operation\&quot;.  If needed, you can void this \&quot;authorize\&quot; operation by using the &#x60;[DELETE] /PaymentGateway/void&#x60; method

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String currency = "currency_example"; // The currency of the transaction. Based on the <a href=\\\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\\\" target=\\\"_blank\\\">ISO 4217</a> standard.
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    Double amount = 3.4D; // The amount to be charged (the amount should be in major units - for example, 10.23)
    Boolean isDigital = true; // This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters
    String orderDesc = "orderDesc_example"; // This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters
    PayToolsApiModelsPayerDetails payerDetails = new PayToolsApiModelsPayerDetails();
    String myRef = "myRef_example"; // Your custom reference for this transaction
    String paymentGatewayAccountName = "paymentGatewayAccountName_example"; // The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.
    String certificateName = "certificateName_example"; // Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\\\"https://portal.epaytools.com\\\" target=\\\"_blank\\\">users portal</a>
    PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount = new PayToolsApiModelsPaymentGatewayAccount();
    PaymentsNetworkTokenSchemes networkTokenBrand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    try {
      PaymentsOperationResult result = client
              .paymentGateway
              .performAuthorizeOperation(currency, card, amount)
              .isDigital(isDigital)
              .orderDesc(orderDesc)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizationCode());
      System.out.println(result.getOperationType());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getOperationResultCode());
      System.out.println(result.getOperationResultDescription());
      System.out.println(result.getCustomGatewayResponse());
      System.out.println(result.getGatewayName());
      System.out.println(result.getGatewayReference());
      System.out.println(result.getGatewayResultCode());
      System.out.println(result.getGatewayResultDescription());
      System.out.println(result.getGatewayResultSubCode());
      System.out.println(result.getGatewayResultSubDescription());
      System.out.println(result.getGatewayToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performAuthorizeOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentsOperationResult> response = client
              .paymentGateway
              .performAuthorizeOperation(currency, card, amount)
              .isDigital(isDigital)
              .orderDesc(orderDesc)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performAuthorizeOperation");
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
| **payToolsApiModelsAuthRequestModel** | [**PayToolsApiModelsAuthRequestModel**](PayToolsApiModelsAuthRequestModel.md)| Card charge model | |

### Return type

[**PaymentsOperationResult**](PaymentsOperationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Accepted (for future processing by payment gateway) |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |
| **409** | Conflict - rejected by payment gateway |  -  |
| **500** | Error with payment gateway |  -  |
| **503** | Temporary failure with payment gateway |  -  |

<a name="performCaptureOperation"></a>
# **performCaptureOperation**
> PaymentsOperationResult performCaptureOperation(payToolsApiModelsCaptureVoidRequestModel).execute();

Perform a payment gateway capture operation

This method allows you to perform a \&quot;capture\&quot; operation on a previously created \&quot;authorize\&quot; operation (see our &#x60;[POST] /PaymentGateway/authorize&#x60; method for additional information).  When you perform the \&quot;authorize\&quot; operation, the bank that issued the credit card will place an authorization of the total amount of the funds. This is how the bank determines if the funds are available to make the purchase. The card will not actually be “charged” until you perform the \&quot;capture\&quot; operation.  **Please note**, different card brands and different banks allow for different time frames on the lifespan of a payment authorization. You will need to check with your payment processor on how long you would have between performing an \&quot;authorize\&quot; operation and a \&quot;charge\&quot; operation\&quot;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String currency = "currency_example"; // The currency of the transaction. Based on the <a href=\\\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\\\" target=\\\"_blank\\\">ISO 4217</a> standard.
    String refTransId = "refTransId_example"; // The transaction ID that this operation is referring to.
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    Double amount = 3.4D; // The amount to be charged (the amount should be in major units - for example, 10.23)
    String myRef = "myRef_example"; // Your custom reference for this transaction
    String paymentGatewayAccountName = "paymentGatewayAccountName_example"; // The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.
    String certificateName = "certificateName_example"; // Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\\\"https://portal.epaytools.com\\\" target=\\\"_blank\\\">users portal</a>
    PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount = new PayToolsApiModelsPaymentGatewayAccount();
    PaymentsNetworkTokenSchemes networkTokenBrand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    try {
      PaymentsOperationResult result = client
              .paymentGateway
              .performCaptureOperation(currency, refTransId, card, amount)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizationCode());
      System.out.println(result.getOperationType());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getOperationResultCode());
      System.out.println(result.getOperationResultDescription());
      System.out.println(result.getCustomGatewayResponse());
      System.out.println(result.getGatewayName());
      System.out.println(result.getGatewayReference());
      System.out.println(result.getGatewayResultCode());
      System.out.println(result.getGatewayResultDescription());
      System.out.println(result.getGatewayResultSubCode());
      System.out.println(result.getGatewayResultSubDescription());
      System.out.println(result.getGatewayToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performCaptureOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentsOperationResult> response = client
              .paymentGateway
              .performCaptureOperation(currency, refTransId, card, amount)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performCaptureOperation");
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
| **payToolsApiModelsCaptureVoidRequestModel** | [**PayToolsApiModelsCaptureVoidRequestModel**](PayToolsApiModelsCaptureVoidRequestModel.md)| Capture or Void Request Model | |

### Return type

[**PaymentsOperationResult**](PaymentsOperationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Accepted (for future processing by payment gateway) |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |
| **409** | Conflict - rejected by payment gateway |  -  |
| **500** | Error with payment gateway |  -  |
| **503** | Temporary failure with payment gateway |  -  |

<a name="performChargeOperation"></a>
# **performChargeOperation**
> PaymentsOperationResult performChargeOperation(payToolsApiModelsAuthRequestModel).execute();

Perform a payment gateway charge operation

This method allows you to perform a \&quot;charge\&quot; operation through your payment gateway. A \&quot;charge\&quot; operation will request immediate payment from the card and the card owner will see this listed as a transaction in their card statement.  If needed, you can void this \&quot;charge\&quot; operation by using the &#x60;[DELETE] /PaymentGateway/void&#x60; method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String currency = "currency_example"; // The currency of the transaction. Based on the <a href=\\\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\\\" target=\\\"_blank\\\">ISO 4217</a> standard.
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    Double amount = 3.4D; // The amount to be charged (the amount should be in major units - for example, 10.23)
    Boolean isDigital = true; // This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters
    String orderDesc = "orderDesc_example"; // This field is an additional optional parameter used by some of our payment processors. Please read our additional guidance section for payment processors that use this and other parameters
    PayToolsApiModelsPayerDetails payerDetails = new PayToolsApiModelsPayerDetails();
    String myRef = "myRef_example"; // Your custom reference for this transaction
    String paymentGatewayAccountName = "paymentGatewayAccountName_example"; // The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.
    String certificateName = "certificateName_example"; // Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\\\"https://portal.epaytools.com\\\" target=\\\"_blank\\\">users portal</a>
    PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount = new PayToolsApiModelsPaymentGatewayAccount();
    PaymentsNetworkTokenSchemes networkTokenBrand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    try {
      PaymentsOperationResult result = client
              .paymentGateway
              .performChargeOperation(currency, card, amount)
              .isDigital(isDigital)
              .orderDesc(orderDesc)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizationCode());
      System.out.println(result.getOperationType());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getOperationResultCode());
      System.out.println(result.getOperationResultDescription());
      System.out.println(result.getCustomGatewayResponse());
      System.out.println(result.getGatewayName());
      System.out.println(result.getGatewayReference());
      System.out.println(result.getGatewayResultCode());
      System.out.println(result.getGatewayResultDescription());
      System.out.println(result.getGatewayResultSubCode());
      System.out.println(result.getGatewayResultSubDescription());
      System.out.println(result.getGatewayToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performChargeOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentsOperationResult> response = client
              .paymentGateway
              .performChargeOperation(currency, card, amount)
              .isDigital(isDigital)
              .orderDesc(orderDesc)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performChargeOperation");
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
| **payToolsApiModelsAuthRequestModel** | [**PayToolsApiModelsAuthRequestModel**](PayToolsApiModelsAuthRequestModel.md)| Card charge model | |

### Return type

[**PaymentsOperationResult**](PaymentsOperationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Accepted (for future processing by payment gateway) |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |
| **409** | Conflict - rejected by payment gateway |  -  |
| **500** | Error with payment gateway |  -  |
| **503** | Temporary failure with payment gateway |  -  |

<a name="performRefundOperation"></a>
# **performRefundOperation**
> PaymentsOperationResult performRefundOperation(payToolsApiModelsRefundRequestModel).execute();

Perform a payment gateway refund operation

This method allows you to submit a \&quot;refund\&quot; operation against a previously created \&quot;charge\&quot; (using &#x60;[POST] /PaymentGateway/charge&#x60;) or \&quot;capture\&quot; (using &#x60;[POST] /PaymentGateway/capture&#x60;) operations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String currency = "currency_example"; // The currency of the transaction. Based on the <a href=\\\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\\\" target=\\\"_blank\\\">ISO 4217</a> standard.
    String refTransId = "refTransId_example"; // The transaction ID that this operation is referring to.
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    Double amount = 3.4D; // The amount to be charged (the amount should be in major units - for example, 10.23)
    PayToolsApiModelsPayerDetails payerDetails = new PayToolsApiModelsPayerDetails();
    String myRef = "myRef_example"; // Your custom reference for this transaction
    String paymentGatewayAccountName = "paymentGatewayAccountName_example"; // The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.
    String certificateName = "certificateName_example"; // Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\\\"https://portal.epaytools.com\\\" target=\\\"_blank\\\">users portal</a>
    PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount = new PayToolsApiModelsPaymentGatewayAccount();
    PaymentsNetworkTokenSchemes networkTokenBrand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    try {
      PaymentsOperationResult result = client
              .paymentGateway
              .performRefundOperation(currency, refTransId, card, amount)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizationCode());
      System.out.println(result.getOperationType());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getOperationResultCode());
      System.out.println(result.getOperationResultDescription());
      System.out.println(result.getCustomGatewayResponse());
      System.out.println(result.getGatewayName());
      System.out.println(result.getGatewayReference());
      System.out.println(result.getGatewayResultCode());
      System.out.println(result.getGatewayResultDescription());
      System.out.println(result.getGatewayResultSubCode());
      System.out.println(result.getGatewayResultSubDescription());
      System.out.println(result.getGatewayToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performRefundOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentsOperationResult> response = client
              .paymentGateway
              .performRefundOperation(currency, refTransId, card, amount)
              .payerDetails(payerDetails)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#performRefundOperation");
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
| **payToolsApiModelsRefundRequestModel** | [**PayToolsApiModelsRefundRequestModel**](PayToolsApiModelsRefundRequestModel.md)| Capture or Void Request Model | |

### Return type

[**PaymentsOperationResult**](PaymentsOperationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Accepted (for future processing by payment gateway) |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |
| **409** | Conflict - rejected by payment gateway |  -  |
| **500** | Error with payment gateway |  -  |
| **503** | Temporary failure with payment gateway |  -  |

<a name="voidOperation"></a>
# **voidOperation**
> PaymentsOperationResult voidOperation(payToolsApiModelsCaptureVoidRequestModel).execute();

Perform a payment gateway Void operation

This method allows you to submit a \&quot;void\&quot; operation against a previously created \&quot;charge\&quot; (using &#x60;[POST] /PaymentGateway/charge&#x60;) or \&quot;authorize\&quot; (using &#x60;[POST] /PaymentGateway/authorize&#x60;) operations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentGatewayApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String currency = "currency_example"; // The currency of the transaction. Based on the <a href=\\\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\\\" target=\\\"_blank\\\">ISO 4217</a> standard.
    String refTransId = "refTransId_example"; // The transaction ID that this operation is referring to.
    PayToolsApiModelsCardInputModel card = new PayToolsApiModelsCardInputModel();
    Double amount = 3.4D; // The amount to be charged (the amount should be in major units - for example, 10.23)
    String myRef = "myRef_example"; // Your custom reference for this transaction
    String paymentGatewayAccountName = "paymentGatewayAccountName_example"; // The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.
    String certificateName = "certificateName_example"; // Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\\\"https://portal.epaytools.com\\\" target=\\\"_blank\\\">users portal</a>
    PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount = new PayToolsApiModelsPaymentGatewayAccount();
    PaymentsNetworkTokenSchemes networkTokenBrand = PaymentsNetworkTokenSchemes.fromValue("Visa");
    try {
      PaymentsOperationResult result = client
              .paymentGateway
              .voidOperation(currency, refTransId, card, amount)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizationCode());
      System.out.println(result.getOperationType());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmount());
      System.out.println(result.getOperationResultCode());
      System.out.println(result.getOperationResultDescription());
      System.out.println(result.getCustomGatewayResponse());
      System.out.println(result.getGatewayName());
      System.out.println(result.getGatewayReference());
      System.out.println(result.getGatewayResultCode());
      System.out.println(result.getGatewayResultDescription());
      System.out.println(result.getGatewayResultSubCode());
      System.out.println(result.getGatewayResultSubDescription());
      System.out.println(result.getGatewayToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#voidOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentsOperationResult> response = client
              .paymentGateway
              .voidOperation(currency, refTransId, card, amount)
              .myRef(myRef)
              .paymentGatewayAccountName(paymentGatewayAccountName)
              .certificateName(certificateName)
              .paymentGatewayAccount(paymentGatewayAccount)
              .networkTokenBrand(networkTokenBrand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentGatewayApi#voidOperation");
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
| **payToolsApiModelsCaptureVoidRequestModel** | [**PayToolsApiModelsCaptureVoidRequestModel**](PayToolsApiModelsCaptureVoidRequestModel.md)| Capture or Void Request Model | |

### Return type

[**PaymentsOperationResult**](PaymentsOperationResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Accepted (for future processing by payment gateway) |  -  |
| **400** | Bad data |  -  |
| **401** | Not authenticated |  -  |
| **409** | Conflict - rejected by payment gateway |  -  |
| **500** | Error with payment gateway |  -  |
| **503** | Temporary failure with payment gateway |  -  |

