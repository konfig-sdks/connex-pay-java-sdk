# VerificationApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardBankAccount**](VerificationApi.md#cardBankAccount) | **POST** /api/v1/verify | Verify |


<a name="cardBankAccount"></a>
# **cardBankAccount**
> Object cardBankAccount().verificationCardBankAccountRequest(verificationCardBankAccountRequest).execute();

Verify

Call to Verify Card or Bank Account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerificationApi;
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
    String deviceGuid = "{{Device}}"; // Device's Guid provided by ConnexPay.
    VerificationCardBankAccountRequestCard card = new VerificationCardBankAccountRequestCard();
    VerificationCardBankAccountRequestBankAccount bankAccount = new VerificationCardBankAccountRequestBankAccount();
    try {
      Object result = client
              .verification
              .cardBankAccount(deviceGuid)
              .card(card)
              .bankAccount(bankAccount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationApi#cardBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .verification
              .cardBankAccount(deviceGuid)
              .card(card)
              .bankAccount(bankAccount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationApi#cardBankAccount");
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
| **verificationCardBankAccountRequest** | [**VerificationCardBankAccountRequest**](VerificationCardBankAccountRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

