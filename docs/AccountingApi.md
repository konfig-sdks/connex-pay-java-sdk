# AccountingApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDailyDetail**](AccountingApi.md#getDailyDetail) | **GET** /api/v1/Accounting/DailyDetail | Get Daily Accounting Detail |
| [**getDailySummary**](AccountingApi.md#getDailySummary) | **GET** /api/v1/Accounting/DailySummary | Get Daily Accounting Summary |


<a name="getDailyDetail"></a>
# **getDailyDetail**
> DailyAccountingDetailPaginatedItems getDailyDetail(merchantGuid, releasedDate).pageNumber(pageNumber).pageSize(pageSize).execute();

Get Daily Accounting Detail

This endpoint returns the paginated daily accounting detail items of a client for a given release date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    UUID merchantGuid = UUID.fromString("ab0123f5-7648-4e27-8709-ad0f4e162c20"); // The client identifier for the requested transactions.
    LocalDate releasedDate = LocalDate.parse("2022-12-31"); // Date on which the requested transactions were released to the client.
    Integer pageNumber = 1; // 
    Integer pageSize = 10; // 
    try {
      DailyAccountingDetailPaginatedItems result = client
              .accounting
              .getDailyDetail(merchantGuid, releasedDate)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageItemCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDailyDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DailyAccountingDetailPaginatedItems> response = client
              .accounting
              .getDailyDetail(merchantGuid, releasedDate)
              .pageNumber(pageNumber)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDailyDetail");
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
| **merchantGuid** | **UUID**| The client identifier for the requested transactions. | |
| **releasedDate** | **LocalDate**| Date on which the requested transactions were released to the client. | |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 10] |

### Return type

[**DailyAccountingDetailPaginatedItems**](DailyAccountingDetailPaginatedItems.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved daily accounting detail data. |  -  |

<a name="getDailySummary"></a>
# **getDailySummary**
> DailyAccountingSummary getDailySummary(merchantGuid, releasedDate).execute();

Get Daily Accounting Summary

This endpoint returns the daily accounting summary of a merchant for a given release date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    UUID merchantGuid = UUID.fromString("ab0123f5-7648-4e27-8709-ad0f4e162c20"); // The client identifier for the requested transactions.
    LocalDate releasedDate = LocalDate.parse("2022-12-31"); // Date on which the requested transactions were released to the client.
    try {
      DailyAccountingSummary result = client
              .accounting
              .getDailySummary(merchantGuid, releasedDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getClientName());
      System.out.println(result.getReleasedDate());
      System.out.println(result.getPriorDayCashBalance());
      System.out.println(result.getWireAchToFundCashAmount());
      System.out.println(result.getBeginningCashBalance());
      System.out.println(result.getCreditSaleAmount());
      System.out.println(result.getAchSaleAmount());
      System.out.println(result.getPurchaseAchAmount());
      System.out.println(result.getPurchaseCardAmount());
      System.out.println(result.getPurchasePushToCardAmount());
      System.out.println(result.getCreditVoidAmount());
      System.out.println(result.getCreditReturnAmount());
      System.out.println(result.getCreditChargebackAmount());
      System.out.println(result.getCreditAdjustmentAmount());
      System.out.println(result.getAchVoidAmount());
      System.out.println(result.getAchReturnAmount());
      System.out.println(result.getPurchaseCardReturnAmount());
      System.out.println(result.getPurchaseCardChargebackAmount());
      System.out.println(result.getPurchaseAchReturnAmount());
      System.out.println(result.getTotalActivity());
      System.out.println(result.getNewCashBalance());
      System.out.println(result.getNetDebitCreditToClient());
      System.out.println(result.getEndingCashBalance());
      System.out.println(result.getMinimumCashBalance());
      System.out.println(result.getAchDebitRejectAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDailySummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DailyAccountingSummary> response = client
              .accounting
              .getDailySummary(merchantGuid, releasedDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDailySummary");
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
| **merchantGuid** | **UUID**| The client identifier for the requested transactions. | |
| **releasedDate** | **LocalDate**| Date on which the requested transactions were released to the client. | |

### Return type

[**DailyAccountingSummary**](DailyAccountingSummary.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved daily accounting summary data. |  -  |

