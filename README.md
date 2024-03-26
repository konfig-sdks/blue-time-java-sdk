<div align="center">

[![Visit Bluetime](./header.png)](https://bluetime.io&#x2F;)

# [Bluetime](https://bluetime.io&#x2F;)

Code Version 1.0.7.15

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=BlueTime&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>blue-time-java-sdk</artifactId>
  <version>Prod</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:blue-time-java-sdk:Prod"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/blue-time-java-sdk-Prod.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.epaytools.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardOperationsApi* | [**getBrandPrefix**](docs/CardOperationsApi.md#getBrandPrefix) | **GET** /CardOperations/brand | Return brand of card prefix.
*CardOperationsApi* | [**getTokenStartOperation**](docs/CardOperationsApi.md#getTokenStartOperation) | **POST** /CardOperations | Get a token to start a card operation
*CardOperationsApi* | [**getTopBrandsLookup**](docs/CardOperationsApi.md#getTopBrandsLookup) | **GET** /CardOperations/topBrands | Return top credit card brands for lookup of up to 5 first digits. It covers 90% of the cases
*CardOperationsApi* | [**performUniversalPaymentGatewayCharge**](docs/CardOperationsApi.md#performUniversalPaymentGatewayCharge) | **POST** /CardOperations/charge | Perform Univesal payment gateway charge operation
*CardOperationsApi* | [**performValidation**](docs/CardOperationsApi.md#performValidation) | **POST** /CardOperations/validate | Perform card validation
*CardOperationsApi* | [**performValidation_0**](docs/CardOperationsApi.md#performValidation_0) | **GET** /CardOperations/opValidate | Perform validation of the operation using to signed data
*CardOperationsApi* | [**tokenizeAndStore**](docs/CardOperationsApi.md#tokenizeAndStore) | **POST** /CardOperations/store | Tokenize and store card number
*CustomFormsApi* | [**getList**](docs/CustomFormsApi.md#getList) | **GET** /CustomForms | List Custom Forms
*CustomFormsApi* | [**removeForm**](docs/CustomFormsApi.md#removeForm) | **DELETE** /CustomForms/{name} | Delete a Custom Forms
*CustomFormsApi* | [**uploadFormFolder**](docs/CustomFormsApi.md#uploadFormFolder) | **PUT** /CustomForms/{name} | Upload a custom form folder (add or replace)
*CvvOperationsApi* | [**getTokenCvvOperation**](docs/CvvOperationsApi.md#getTokenCvvOperation) | **POST** /CvvOperations | Get a token to start a CVV operation
*CvvOperationsApi* | [**performUniversalPaymentGatewayCharge**](docs/CvvOperationsApi.md#performUniversalPaymentGatewayCharge) | **POST** /CvvOperations/charge | Perform Univesal payment gateway charge operation
*CvvOperationsApi* | [**validateOperation**](docs/CvvOperationsApi.md#validateOperation) | **GET** /CvvOperations/opValidate | Perform validation of the operation using signed data from charge operation
*NetworkTokenApi* | [**cardTokenize**](docs/NetworkTokenApi.md#cardTokenize) | **POST** /NetworkToken | Network-tokenize a card
*NetworkTokenApi* | [**delete**](docs/NetworkTokenApi.md#delete) | **DELETE** /NetworkToken | Delete a Network-token
*PaymentGatewayApi* | [**listGateways**](docs/PaymentGatewayApi.md#listGateways) | **GET** /PaymentGateway | List all payment gateways
*PaymentGatewayApi* | [**performAuthorizeOperation**](docs/PaymentGatewayApi.md#performAuthorizeOperation) | **POST** /PaymentGateway/authorize | Perform a payment gateway authorize operation
*PaymentGatewayApi* | [**performCaptureOperation**](docs/PaymentGatewayApi.md#performCaptureOperation) | **PUT** /PaymentGateway/capture | Perform a payment gateway capture operation
*PaymentGatewayApi* | [**performChargeOperation**](docs/PaymentGatewayApi.md#performChargeOperation) | **POST** /PaymentGateway/charge | Perform a payment gateway charge operation
*PaymentGatewayApi* | [**performRefundOperation**](docs/PaymentGatewayApi.md#performRefundOperation) | **PUT** /PaymentGateway/refund | Perform a payment gateway refund operation
*PaymentGatewayApi* | [**voidOperation**](docs/PaymentGatewayApi.md#voidOperation) | **DELETE** /PaymentGateway/void | Perform a payment gateway Void operation
*PaymentGatewayAccountsApi* | [**addOrReplace**](docs/PaymentGatewayAccountsApi.md#addOrReplace) | **PUT** /PaymentGatewayAccounts/{name} | Add or Replace a Payment Gateway Account
*PaymentGatewayAccountsApi* | [**getAll**](docs/PaymentGatewayAccountsApi.md#getAll) | **GET** /PaymentGatewayAccounts | List Payment Gateway Accounts
*PaymentGatewayAccountsApi* | [**getInfo**](docs/PaymentGatewayAccountsApi.md#getInfo) | **GET** /PaymentGatewayAccounts/{name} | Retrieve Payment Gateway Account
*PaymentGatewayAccountsApi* | [**removeAccount**](docs/PaymentGatewayAccountsApi.md#removeAccount) | **DELETE** /PaymentGatewayAccounts/{name} | Delete a Payment Gateway Account
*StringTokensApi* | [**deleteByToken**](docs/StringTokensApi.md#deleteByToken) | **DELETE** /StringTokens/{token} | Delete an existing string by token
*StringTokensApi* | [**getContent**](docs/StringTokensApi.md#getContent) | **GET** /StringTokens/{token} | Retrieve content of StringToken
*StringTokensApi* | [**getMetaData**](docs/StringTokensApi.md#getMetaData) | **GET** /StringTokens/{token}/meta | Retrieve meta data of a StringToken
*StringTokensApi* | [**storeAndTokenize**](docs/StringTokensApi.md#storeAndTokenize) | **POST** /StringTokens | Store and tokenize a string
*ThreeDsMerchantsApi* | [**getMerchantInfo**](docs/ThreeDsMerchantsApi.md#getMerchantInfo) | **GET** /ThreeDsMerchants/{name} | Get a Merchant
*ThreeDsMerchantsApi* | [**listMerchants**](docs/ThreeDsMerchantsApi.md#listMerchants) | **GET** /ThreeDsMerchants | List Merchants
*ThreeDsMerchantsApi* | [**removeMerchant**](docs/ThreeDsMerchantsApi.md#removeMerchant) | **DELETE** /ThreeDsMerchants/{name} | Delete a Merchant
*ThreeDsMerchantsApi* | [**updateMerchantInfo**](docs/ThreeDsMerchantsApi.md#updateMerchantInfo) | **PUT** /ThreeDsMerchants/{name} | Set a merchant
*ThreeDsSessionsApi* | [**getChallengeStatus**](docs/ThreeDsSessionsApi.md#getChallengeStatus) | **GET** /ThreeDsSessions/challengeStatus | Get challenge ststus, as stored on server
*ThreeDsSessionsApi* | [**getTokenStartOperation**](docs/ThreeDsSessionsApi.md#getTokenStartOperation) | **POST** /ThreeDsSessions | Get a token to start a card operation
*ThreeDsSessionsApi* | [**handleFingerprintCallback**](docs/ThreeDsSessionsApi.md#handleFingerprintCallback) | **POST** /ThreeDsSessions/fingerprintCallback/{sessionId} | Handle a callback (redirect from device fingerprint)
*ThreeDsSessionsApi* | [**handleMpiChallengeCallback**](docs/ThreeDsSessionsApi.md#handleMpiChallengeCallback) | **GET** /ThreeDsSessions/mpiChallengeCallback/{sessionId} | Handle a callback (redirect from challenge)
*ThreeDsSessionsApi* | [**performValidationOperation**](docs/ThreeDsSessionsApi.md#performValidationOperation) | **GET** /ThreeDsSessions/opValidate | Perform validation of the operation using to signed data
*ToolsApi* | [**getBrandLookup**](docs/ToolsApi.md#getBrandLookup) | **GET** /Tools/brand | Brand Lookup
*ToolsApi* | [**lookupMetadata**](docs/ToolsApi.md#lookupMetadata) | **GET** /Tools/iin | Metadata Lookup
*ToolsApi* | [**validateCardDetails**](docs/ToolsApi.md#validateCardDetails) | **POST** /Tools/validate | Card Validation
*ToolsApi* | [**validateLuhnCard**](docs/ToolsApi.md#validateLuhnCard) | **GET** /Tools/luhn | Luhn Algorithm Validation
*UtilsApi* | [**validateApiKey**](docs/UtilsApi.md#validateApiKey) | **GET** /Utils/apiKey | Validate Apikey


## Documentation for Models

 - [CustomFormsUploadFormFolderRequest](docs/CustomFormsUploadFormFolderRequest.md)
 - [CustomFormsUploadFormFolderRequest1](docs/CustomFormsUploadFormFolderRequest1.md)
 - [NetworkTokenCardSource](docs/NetworkTokenCardSource.md)
 - [NetworkTokenRequestSource](docs/NetworkTokenRequestSource.md)
 - [NetworkTokenTokenizationResult](docs/NetworkTokenTokenizationResult.md)
 - [NetworkTokenTokenizationResultCode](docs/NetworkTokenTokenizationResultCode.md)
 - [PayToolsApiModelsAuthRequestModel](docs/PayToolsApiModelsAuthRequestModel.md)
 - [PayToolsApiModelsAuthenticationResult](docs/PayToolsApiModelsAuthenticationResult.md)
 - [PayToolsApiModelsBrandLookupResult](docs/PayToolsApiModelsBrandLookupResult.md)
 - [PayToolsApiModelsCaptureVoidRequestModel](docs/PayToolsApiModelsCaptureVoidRequestModel.md)
 - [PayToolsApiModelsCardBaseWithSecurityCode](docs/PayToolsApiModelsCardBaseWithSecurityCode.md)
 - [PayToolsApiModelsCardInputModel](docs/PayToolsApiModelsCardInputModel.md)
 - [PayToolsApiModelsCardOpsChargeRequest](docs/PayToolsApiModelsCardOpsChargeRequest.md)
 - [PayToolsApiModelsCardValidationResults](docs/PayToolsApiModelsCardValidationResults.md)
 - [PayToolsApiModelsCustomFormMetaModel](docs/PayToolsApiModelsCustomFormMetaModel.md)
 - [PayToolsApiModelsCustomFormUploadModel](docs/PayToolsApiModelsCustomFormUploadModel.md)
 - [PayToolsApiModelsCvvOpsChargeRequest](docs/PayToolsApiModelsCvvOpsChargeRequest.md)
 - [PayToolsApiModelsIinData](docs/PayToolsApiModelsIinData.md)
 - [PayToolsApiModelsJwsMultipleOutputModel](docs/PayToolsApiModelsJwsMultipleOutputModel.md)
 - [PayToolsApiModelsJwsOutputModel](docs/PayToolsApiModelsJwsOutputModel.md)
 - [PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull](docs/PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull.md)
 - [PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull](docs/PayToolsApiModelsJwsOutputModel1PayToolsBlAuthenticationChargeCardSignedModelPayToolsBlVersion1000CultureneutralPublicKeyTokennull.md)
 - [PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull](docs/PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull.md)
 - [PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull](docs/PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull.md)
 - [PayToolsApiModelsLuhnCheckResultsWithIinData](docs/PayToolsApiModelsLuhnCheckResultsWithIinData.md)
 - [PayToolsApiModelsNetworkTokenizationDeleteTokenRequest](docs/PayToolsApiModelsNetworkTokenizationDeleteTokenRequest.md)
 - [PayToolsApiModelsNetworkTokenizationPayer](docs/PayToolsApiModelsNetworkTokenizationPayer.md)
 - [PayToolsApiModelsNetworkTokenizationTokenizeRequest](docs/PayToolsApiModelsNetworkTokenizationTokenizeRequest.md)
 - [PayToolsApiModelsPayerBase](docs/PayToolsApiModelsPayerBase.md)
 - [PayToolsApiModelsPayerBaseWithClientIp](docs/PayToolsApiModelsPayerBaseWithClientIp.md)
 - [PayToolsApiModelsPayerDetails](docs/PayToolsApiModelsPayerDetails.md)
 - [PayToolsApiModelsPayerDetailsNoIpAddress](docs/PayToolsApiModelsPayerDetailsNoIpAddress.md)
 - [PayToolsApiModelsPaymentGatewayAccount](docs/PayToolsApiModelsPaymentGatewayAccount.md)
 - [PayToolsApiModelsPaymentGatewayAccountBriefOutputModel](docs/PayToolsApiModelsPaymentGatewayAccountBriefOutputModel.md)
 - [PayToolsApiModelsPaymentGatewayAccountFullOutputModel](docs/PayToolsApiModelsPaymentGatewayAccountFullOutputModel.md)
 - [PayToolsApiModelsPaymentGatewayAccountInputModel](docs/PayToolsApiModelsPaymentGatewayAccountInputModel.md)
 - [PayToolsApiModelsPaymentGatewayDescriptionModel](docs/PayToolsApiModelsPaymentGatewayDescriptionModel.md)
 - [PayToolsApiModelsRefundRequestModel](docs/PayToolsApiModelsRefundRequestModel.md)
 - [PayToolsApiModelsStringTokenIntputModel](docs/PayToolsApiModelsStringTokenIntputModel.md)
 - [PayToolsApiModelsStringTokenMetaDataOutputModel](docs/PayToolsApiModelsStringTokenMetaDataOutputModel.md)
 - [PayToolsApiModelsStringTokenOutputModel](docs/PayToolsApiModelsStringTokenOutputModel.md)
 - [PayToolsApiModelsThreeDSAuthenticationInputModel](docs/PayToolsApiModelsThreeDSAuthenticationInputModel.md)
 - [PayToolsApiModelsThreeDsMerchantOutputModel](docs/PayToolsApiModelsThreeDsMerchantOutputModel.md)
 - [PayToolsApiModelsTokenizationRequest](docs/PayToolsApiModelsTokenizationRequest.md)
 - [PayToolsApiModelsTopBrands](docs/PayToolsApiModelsTopBrands.md)
 - [PayToolsBlAuthenticationChargeCardSignedModel](docs/PayToolsBlAuthenticationChargeCardSignedModel.md)
 - [PayToolsBlAuthenticationChargePresetData](docs/PayToolsBlAuthenticationChargePresetData.md)
 - [PayToolsBlAuthenticationCvvSignedDataModel](docs/PayToolsBlAuthenticationCvvSignedDataModel.md)
 - [PayToolsBlAuthenticationPreSignedDataModel](docs/PayToolsBlAuthenticationPreSignedDataModel.md)
 - [PayToolsBlAuthenticationSignedData](docs/PayToolsBlAuthenticationSignedData.md)
 - [PayToolsBlAuthenticationThreeDMerchant](docs/PayToolsBlAuthenticationThreeDMerchant.md)
 - [PayToolsBlAuthenticationThreeDsBrand](docs/PayToolsBlAuthenticationThreeDsBrand.md)
 - [PayToolsBlAuthenticationThreeDsPresetData](docs/PayToolsBlAuthenticationThreeDsPresetData.md)
 - [PayToolsBlAuthenticationThreeDsSessionModel](docs/PayToolsBlAuthenticationThreeDsSessionModel.md)
 - [PayToolsBlAuthenticationTokenizationAction](docs/PayToolsBlAuthenticationTokenizationAction.md)
 - [PayToolsDalEntitiesThreeDsBrand](docs/PayToolsDalEntitiesThreeDsBrand.md)
 - [PayToolsDalEntitiesThreeDsMerchant](docs/PayToolsDalEntitiesThreeDsMerchant.md)
 - [PayToolsSharedEnumsPerform3ds](docs/PayToolsSharedEnumsPerform3ds.md)
 - [PayToolsSharedModelsCardStoredCard](docs/PayToolsSharedModelsCardStoredCard.md)
 - [PayToolsSharedModelsMessageType](docs/PayToolsSharedModelsMessageType.md)
 - [PayToolsSharedModelsMoneyModel](docs/PayToolsSharedModelsMoneyModel.md)
 - [PayToolsSharedModelsThreeDsClientMessage](docs/PayToolsSharedModelsThreeDsClientMessage.md)
 - [PaymentsBankCard](docs/PaymentsBankCard.md)
 - [PaymentsBankCardBase](docs/PaymentsBankCardBase.md)
 - [PaymentsCardTypes](docs/PaymentsCardTypes.md)
 - [PaymentsChargeRequest](docs/PaymentsChargeRequest.md)
 - [PaymentsCurrencyCode](docs/PaymentsCurrencyCode.md)
 - [PaymentsMoney](docs/PaymentsMoney.md)
 - [PaymentsNetworkTokenSchemes](docs/PaymentsNetworkTokenSchemes.md)
 - [PaymentsOperation](docs/PaymentsOperation.md)
 - [PaymentsOperationResult](docs/PaymentsOperationResult.md)
 - [PaymentsPayer](docs/PaymentsPayer.md)
 - [PaymentsResult](docs/PaymentsResult.md)
 - [PaymentsThreeDS](docs/PaymentsThreeDS.md)
 - [PciBookingIINLookupLibraryCardValidationRequest](docs/PciBookingIINLookupLibraryCardValidationRequest.md)
 - [PciBookingIINLookupLibraryCardValidationResult](docs/PciBookingIINLookupLibraryCardValidationResult.md)
 - [PciBookingIINLookupLibraryRiskLevel](docs/PciBookingIINLookupLibraryRiskLevel.md)
 - [SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e](docs/SystemCollectionsGenericKeyValuePair2SystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798eSystemStringSystemPrivateCoreLibVersion6000CultureneutralPublicKeyToken7cec85d7bea7798e.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
