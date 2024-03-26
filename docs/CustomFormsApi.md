# CustomFormsApi

All URIs are relative to *https://api.epaytools.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getList**](CustomFormsApi.md#getList) | **GET** /CustomForms | List Custom Forms |
| [**removeForm**](CustomFormsApi.md#removeForm) | **DELETE** /CustomForms/{name} | Delete a Custom Forms |
| [**uploadFormFolder**](CustomFormsApi.md#uploadFormFolder) | **PUT** /CustomForms/{name} | Upload a custom form folder (add or replace) |


<a name="getList"></a>
# **getList**
> PayToolsApiModelsCustomFormMetaModel getList().execute();

List Custom Forms

This method allows you to retrieve the list of custom forms stored in PCI Booking

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFormsApi;
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
      PayToolsApiModelsCustomFormMetaModel result = client
              .customForms
              .getList()
              .execute();
      System.out.println(result);
      System.out.println(result.getCreationTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsCustomFormMetaModel> response = client
              .customForms
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#getList");
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

[**PayToolsApiModelsCustomFormMetaModel**](PayToolsApiModelsCustomFormMetaModel.md)

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

<a name="removeForm"></a>
# **removeForm**
> removeForm(name).execute();

Delete a Custom Forms

This method allows you to delete a custom form that was previously stored in PCI Booking.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFormsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // The unique identifier provided to this custom form when originally uploaded
    try {
      client
              .customForms
              .removeForm(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#removeForm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customForms
              .removeForm(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#removeForm");
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
| **name** | **String**| The unique identifier provided to this custom form when originally uploaded | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Not authenticated |  -  |

<a name="uploadFormFolder"></a>
# **uploadFormFolder**
> PayToolsApiModelsCustomFormUploadModel uploadFormFolder(name).customFormsUploadFormFolderRequest1(customFormsUploadFormFolderRequest1).execute();

Upload a custom form folder (add or replace)

This method allows you to upload a custom form into PCI Booking. You can design your custom form copletely on your own and upload any and all related content (JavaScript, stylesheet, images, etc) to PCI Booking. All content should be stored in one ZIP file that you will provide in this request.  The uploaded data should be a zip file, properly encoded as a part named &#39;zipFile&#39; in the body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueTime;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFormsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.epaytools.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    BlueTime client = new BlueTime(configuration);
    String name = "name_example"; // The unique name to identify this form in PCI Booking. You will use this value whenever referencing this custom form.
    String contentType = "contentType_example";
    String contentDisposition = "contentDisposition_example";
    Map<String, List<String>> headers = new HashMap();
    Long length = 56L;
    String name = "name_example";
    String fileName = "fileName_example";
    try {
      PayToolsApiModelsCustomFormUploadModel result = client
              .customForms
              .uploadFormFolder(name)
              .contentType(contentType)
              .contentDisposition(contentDisposition)
              .headers(headers)
              .length(length)
              .name(name)
              .fileName(fileName)
              .execute();
      System.out.println(result);
      System.out.println(result.getFormBaseUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#uploadFormFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayToolsApiModelsCustomFormUploadModel> response = client
              .customForms
              .uploadFormFolder(name)
              .contentType(contentType)
              .contentDisposition(contentDisposition)
              .headers(headers)
              .length(length)
              .name(name)
              .fileName(fileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFormsApi#uploadFormFolder");
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
| **name** | **String**| The unique name to identify this form in PCI Booking. You will use this value whenever referencing this custom form. | |
| **customFormsUploadFormFolderRequest1** | [**CustomFormsUploadFormFolderRequest1**](CustomFormsUploadFormFolderRequest1.md)|  | [optional] |

### Return type

[**PayToolsApiModelsCustomFormUploadModel**](PayToolsApiModelsCustomFormUploadModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Not authenticated |  -  |

