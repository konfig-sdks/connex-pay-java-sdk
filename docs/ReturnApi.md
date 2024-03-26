# ReturnApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemRequest**](ReturnApi.md#itemRequest) | **POST** /api/v1/returns | Return |
| [**searchSaleReturns**](ReturnApi.md#searchSaleReturns) | **POST** /api/v1/Search/Returns/{exportable}/{pageNumber}/{pageSize} | Search returns |


<a name="itemRequest"></a>
# **itemRequest**
> ReturnItemRequestResponse itemRequest().returnItemRequestRequest(returnItemRequestRequest).execute();

Return



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReturnApi;
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
    String deviceGuid = "deviceGuid_example"; // Device's Guid
    Float amount = 3.4F; // Transaction’s amount. Min. amt.: $0.50
    String saleGuid = "saleGuid_example"; // Mandatory when SaleReferenceNumber field is not sent. Sale's Guid.
    Integer saleReferenceNumber = 56; // Mandatory when SaleGuid field is not sent. Sale's Reference Number
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    ReturnItemRequestRequestReturnRetryCard returnRetryCard = new ReturnItemRequestRequestReturnRetryCard();
    try {
      ReturnItemRequestResponse result = client
              .return
              .itemRequest(deviceGuid, amount)
              .saleGuid(saleGuid)
              .saleReferenceNumber(saleReferenceNumber)
              .sequenceNumber(sequenceNumber)
              .returnRetryCard(returnRetryCard)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getBatchStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getSaleGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getAmount());
      System.out.println(result.getBatchGuid());
      System.out.println(result.getProcessorStatusCode());
      System.out.println(result.getWasProcessed());
      System.out.println(result.getAuthCode());
      System.out.println(result.getRefNumber());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getCustomerReceipt());
      System.out.println(result.getSequenceNumber());
      System.out.println(result.getSale());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#itemRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReturnItemRequestResponse> response = client
              .return
              .itemRequest(deviceGuid, amount)
              .saleGuid(saleGuid)
              .saleReferenceNumber(saleReferenceNumber)
              .sequenceNumber(sequenceNumber)
              .returnRetryCard(returnRetryCard)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#itemRequest");
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
| **returnItemRequestRequest** | [**ReturnItemRequestRequest**](ReturnItemRequestRequest.md)|  | [optional] |

### Return type

[**ReturnItemRequestResponse**](ReturnItemRequestResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="searchSaleReturns"></a>
# **searchSaleReturns**
> ReturnSearchSaleReturnsResponse searchSaleReturns(exportable, pageNumber, pageSize).returnSearchSaleReturnsRequest(returnSearchSaleReturnsRequest).execute();

Search returns

This endpoint searches sale returns.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReturnApi;
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
    String exportable = "Mandatory"; // True or False. It means if you want results exportable to CSV.
    Integer pageNumber = 56; // Int. Number of page of the results. Default is 1 (Page size default is 500).
    String pageSize = "Optional"; // Int. Size of each page of the results. Default is 500.
    String merchantGuid = "Mandatory"; // Merchant’s Guid.
    Float amountFrom = 3.4F; // Amount of the transaction. Min. amt.: $0.50
    Float amountTo = 3.4F; // Amount of the transaction. Min. amt.: $0.50
    String cardHolderName = "Optional"; // Cardholder’s name. Providing information in this field allows a user of the ConnexPay portal to search for a transaction using the cardholder name.
    String status = "Optional"; // Return’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning
    LocalDate timeStampFrom = LocalDate.now(); // Return’s TimeStamp.
    LocalDate timeStampTo = LocalDate.now(); // Return’s TimeStamp.
    try {
      ReturnSearchSaleReturnsResponse result = client
              .return
              .searchSaleReturns(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .amountFrom(amountFrom)
              .amountTo(amountTo)
              .cardHolderName(cardHolderName)
              .status(status)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getPageCurrent());
      System.out.println(result.getPageCurrentResults());
      System.out.println(result.getPageTotal());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalResults());
      System.out.println(result.getCardSummary());
      System.out.println(result.getSearchResultDTO());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#searchSaleReturns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReturnSearchSaleReturnsResponse> response = client
              .return
              .searchSaleReturns(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .amountFrom(amountFrom)
              .amountTo(amountTo)
              .cardHolderName(cardHolderName)
              .status(status)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#searchSaleReturns");
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
| **exportable** | **String**| True or False. It means if you want results exportable to CSV. | [default to Mandatory] |
| **pageNumber** | **Integer**| Int. Number of page of the results. Default is 1 (Page size default is 500). | |
| **pageSize** | **String**| Int. Size of each page of the results. Default is 500. | [default to Optional] |
| **returnSearchSaleReturnsRequest** | [**ReturnSearchSaleReturnsRequest**](ReturnSearchSaleReturnsRequest.md)|  | [optional] |

### Return type

[**ReturnSearchSaleReturnsResponse**](ReturnSearchSaleReturnsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

