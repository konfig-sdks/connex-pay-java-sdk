# StatusGroupApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call3dsAuthenticationStatus**](StatusGroupApi.md#call3dsAuthenticationStatus) | **GET** /api/v1/3ds/{GUID} | Get 3DS Status Group |


<a name="call3dsAuthenticationStatus"></a>
# **call3dsAuthenticationStatus**
> StatusGroup3DsAuthenticationStatusResponse call3dsAuthenticationStatus(guid).execute();

Get 3DS Status Group

This endpoint returns the 3D Secure status of an authentication when a device fingerprint and/or cardholder challenge are required for 3D Secure Authentication.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusGroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandboxreportingapi.connexpay.com";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    ConnexPay client = new ConnexPay(configuration);
    String guid = "guid_example"; // Replace the original guid value with the guid that was returned with the status response indicating a device fingerprint or cardholder challenge is required to complete 3DS authentication..
    try {
      StatusGroup3DsAuthenticationStatusResponse result = client
              .statusGroup
              .call3dsAuthenticationStatus(guid)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getAmount());
      System.out.println(result.getSecureData());
      System.out.println(result.getEci());
      System.out.println(result.getCavv());
      System.out.println(result.getDirectoryServerTransactionID());
      System.out.println(result.getAcsTransactionId());
      System.out.println(result.getCard());
      System.out.println(result.getProcessorResponseCode());
      System.out.println(result.getProcessorMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusGroupApi#call3dsAuthenticationStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatusGroup3DsAuthenticationStatusResponse> response = client
              .statusGroup
              .call3dsAuthenticationStatus(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusGroupApi#call3dsAuthenticationStatus");
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
| **guid** | **String**| Replace the original guid value with the guid that was returned with the status response indicating a device fingerprint or cardholder challenge is required to complete 3DS authentication.. | |

### Return type

[**StatusGroup3DsAuthenticationStatusResponse**](StatusGroup3DsAuthenticationStatusResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

