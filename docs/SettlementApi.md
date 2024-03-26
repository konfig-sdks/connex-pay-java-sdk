# SettlementApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchVirtualCardSettlements**](SettlementApi.md#searchVirtualCardSettlements) | **POST** /api/v1/Search/Settlements | Search Settlements |


<a name="searchVirtualCardSettlements"></a>
# **searchVirtualCardSettlements**
> Object searchVirtualCardSettlements(pageNumber, pageSize).settlementSearchVirtualCardSettlementsRequest(settlementSearchVirtualCardSettlementsRequest).execute();

Search Settlements

This endpoint searches for Virtual Card Settlements.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SettlementApi;
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
    String merchantGuid = "merchantGuid_example"; // Merchant's Guid.
    Integer pageNumber = 56; // Number of pages of results to return. Default is 1.
    Integer pageSize = 56; // Size of each page of results. Default is 1000.
    LocalDate dateFrom = LocalDate.now(); // Card's Issued Date.
    LocalDate dateTo = LocalDate.now(); // Card's Issued Date.
    LocalDate postedDateFrom = LocalDate.now(); // Card settlement post date.
    LocalDate postedDateTo = LocalDate.now(); // Card settlement post date.
    String orderNumber = "orderNumber_example"; // Order Number. Max. Length = 50.
    Long issuedAmountFrom = 56L; // Issued Amount of the Card.
    Long issuedAmountTo = 56L; // Issued Amount of the Card.
    String issuedCardLastFour = "issuedCardLastFour_example"; // Card last four number.
    Float postedAmountFrom = 3.4F; // Posted Amount of the Card.
    Float postedAmountTo = 3.4F; // Posted Amount of the Card.
    LocalDate expirationDateFrom = LocalDate.now(); // Card's expiration date.
    LocalDate expirationDateTo = LocalDate.now(); // Card's expiration date.
    try {
      Object result = client
              .settlement
              .searchVirtualCardSettlements(merchantGuid, pageNumber, pageSize)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .postedDateFrom(postedDateFrom)
              .postedDateTo(postedDateTo)
              .orderNumber(orderNumber)
              .issuedAmountFrom(issuedAmountFrom)
              .issuedAmountTo(issuedAmountTo)
              .issuedCardLastFour(issuedCardLastFour)
              .postedAmountFrom(postedAmountFrom)
              .postedAmountTo(postedAmountTo)
              .expirationDateFrom(expirationDateFrom)
              .expirationDateTo(expirationDateTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SettlementApi#searchVirtualCardSettlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .settlement
              .searchVirtualCardSettlements(merchantGuid, pageNumber, pageSize)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .postedDateFrom(postedDateFrom)
              .postedDateTo(postedDateTo)
              .orderNumber(orderNumber)
              .issuedAmountFrom(issuedAmountFrom)
              .issuedAmountTo(issuedAmountTo)
              .issuedCardLastFour(issuedCardLastFour)
              .postedAmountFrom(postedAmountFrom)
              .postedAmountTo(postedAmountTo)
              .expirationDateFrom(expirationDateFrom)
              .expirationDateTo(expirationDateTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SettlementApi#searchVirtualCardSettlements");
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
| **pageNumber** | **Integer**| Number of pages of results to return. Default is 1. | |
| **pageSize** | **Integer**| Size of each page of results. Default is 1000. | |
| **settlementSearchVirtualCardSettlementsRequest** | [**SettlementSearchVirtualCardSettlementsRequest**](SettlementSearchVirtualCardSettlementsRequest.md)|  | [optional] |

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
| **200** | 200 |  -  |

