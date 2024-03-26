# ReplayApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**purchaseEventHistoryResend**](ReplayApi.md#purchaseEventHistoryResend) | **POST** /api/v1/PurchaseEventHistory/Resend | Purchase Event History (Replay Webhooks) |


<a name="purchaseEventHistoryResend"></a>
# **purchaseEventHistoryResend**
> String purchaseEventHistoryResend().replayPurchaseEventHistoryResendRequest(replayPurchaseEventHistoryResendRequest).execute();

Purchase Event History (Replay Webhooks)

Call this endpoint to receive VCC, Lodged Card, Physical Card or ACH purchase events either by unique Guid or for a specified date range. If you subscribe to webhooks and are concerned you may be missing events, this endpoint can retrieve past events.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplayApi;
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
    String sourceGuid = "sourceGuid_example"; // The unique GUID for a particular purchase.  This would be the Guid returned on your virtual card, lodged card, physical card or ACH issue call.
    String merchantGuid = "merchantGuid_example"; // Include your Merchant Guid instead of the Source Guid if you want to see all events for a given date range (you must also include the date range parameters)
    String eventGuid = "eventGuid_example"; // Transaction ID as displayed in Bridge
    LocalDate fromDateTime = LocalDate.now(); // From date
    LocalDate toDateTime = LocalDate.now(); // To date
    try {
      String result = client
              .replay
              .purchaseEventHistoryResend()
              .sourceGuid(sourceGuid)
              .merchantGuid(merchantGuid)
              .eventGuid(eventGuid)
              .fromDateTime(fromDateTime)
              .toDateTime(toDateTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplayApi#purchaseEventHistoryResend");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .replay
              .purchaseEventHistoryResend()
              .sourceGuid(sourceGuid)
              .merchantGuid(merchantGuid)
              .eventGuid(eventGuid)
              .fromDateTime(fromDateTime)
              .toDateTime(toDateTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplayApi#purchaseEventHistoryResend");
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
| **replayPurchaseEventHistoryResendRequest** | [**ReplayPurchaseEventHistoryResendRequest**](ReplayPurchaseEventHistoryResendRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

