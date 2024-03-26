# CancellationApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entireTripCancellation**](CancellationApi.md#entireTripCancellation) | **POST** /api/v1/cancel | Cancel |


<a name="entireTripCancellation"></a>
# **entireTripCancellation**
> String entireTripCancellation().cancellationEntireTripCancellationRequest(cancellationEntireTripCancellationRequest).execute();

Cancel

The Cancel route should be used in the event the entire trip/booking (sale &amp; purchase) require cancellation. In this case, the traveler/cardholder would be due a refund from the sale and the Virtual Card would be terminated to prevent the travel supplier from authorizing the Virtual Card.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CancellationApi;
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
    String deviceGuid = "deviceGuid_example"; // Device's Guid provided by ConnexPay
    String saleGuid = "saleGuid_example"; // Sale transaction Guid
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    String voidReason = "voidReason_example"; // Indicates the reason the transaction was voided
    try {
      String result = client
              .cancellation
              .entireTripCancellation(deviceGuid, saleGuid)
              .sequenceNumber(sequenceNumber)
              .voidReason(voidReason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CancellationApi#entireTripCancellation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .cancellation
              .entireTripCancellation(deviceGuid, saleGuid)
              .sequenceNumber(sequenceNumber)
              .voidReason(voidReason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancellationApi#entireTripCancellation");
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
| **cancellationEntireTripCancellationRequest** | [**CancellationEntireTripCancellationRequest**](CancellationEntireTripCancellationRequest.md)|  | [optional] |

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

