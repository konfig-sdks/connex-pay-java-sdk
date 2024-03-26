# VoidApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVoid**](VoidApi.md#createVoid) | **POST** /api/v1/void | Void |
| [**searchVoids**](VoidApi.md#searchVoids) | **POST** /api/v1/Search/Voids/{exportable}/{pageNumber}/{pageSize} | Search voids |


<a name="createVoid"></a>
# **createVoid**
> VoidCreateVoidResponse createVoid().voidCreateVoidRequest(voidCreateVoidRequest).execute();

Void

This endpoint creates a void.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoidApi;
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
    String deviceGuid = "deviceGuid_example"; // Device’s Guid provided by ConnexPay.
    String saleGuid = "Conditional Mandatory when SaleReferenceNumber, AuthOnlyGuid and ReturnGuid parameters are not present"; // Sale Transaction Guid
    String returnGuid = "Conditional Mandatory when SaleGuid, AuthOnlyGuid and SaleReferenceNumber parameters are not present"; // Return's Guid
    Integer saleReferenceNumber = 56; // Sale Reference Number
    String authOnlyGuid = "Conditional Mandatory when SaleGuid, SaleReferenceNumber and ReturnGuid parameters are not present"; // Guid to include in request when voiding an Auth Only request.
    String voidReason = "Optional"; // Indicates the reason the transaction was voided.  Allowed values:  1. POST_AUTH_USER_DECLINE 2. DEVICE_TIMEOUT 3. DEVICE_UNAVAILABLE 4. PARTIAL_REVERSAL 5. TORN_TRANSACTIONS 6. POST_AUTH_CHIP_DECLINE
    Float amount = 3.4F; // Amount to be voided.  Note: Amount is be used once only for credit card Sales and should not exceed corresponding Sale’s Amount.
    String sequenceNumber = "Optional"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    try {
      VoidCreateVoidResponse result = client
              .void
              .createVoid(deviceGuid)
              .saleGuid(saleGuid)
              .returnGuid(returnGuid)
              .saleReferenceNumber(saleReferenceNumber)
              .authOnlyGuid(authOnlyGuid)
              .voidReason(voidReason)
              .amount(amount)
              .sequenceNumber(sequenceNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getAmount());
      System.out.println(result.getBatchStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getSaleGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getVoidReason());
      System.out.println(result.getProcessorStatusCode());
      System.out.println(result.getWasProcessed());
      System.out.println(result.getBatchGuid());
      System.out.println(result.getAuthCode());
      System.out.println(result.getRefNumber());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getCustomerReceipt());
      System.out.println(result.getSequenceNumber());
      System.out.println(result.getSale());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoidApi#createVoid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoidCreateVoidResponse> response = client
              .void
              .createVoid(deviceGuid)
              .saleGuid(saleGuid)
              .returnGuid(returnGuid)
              .saleReferenceNumber(saleReferenceNumber)
              .authOnlyGuid(authOnlyGuid)
              .voidReason(voidReason)
              .amount(amount)
              .sequenceNumber(sequenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoidApi#createVoid");
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
| **voidCreateVoidRequest** | [**VoidCreateVoidRequest**](VoidCreateVoidRequest.md)|  | [optional] |

### Return type

[**VoidCreateVoidResponse**](VoidCreateVoidResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="searchVoids"></a>
# **searchVoids**
> VoidSearchVoidsResponse searchVoids(exportable, pageNumber, pageSize).voidSearchVoidsRequest(voidSearchVoidsRequest).execute();

Search voids

This endpoint searches sales voids.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoidApi;
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
    String voidReason = "Optional"; // Indicates the reason the transaction was voided.  Allowed values:  1. POST_AUTH_USER_DECLINE 2. DEVICE_TIMEOUT 3. DEVICE_UNAVAILABLE 4. PARTIAL_REVERSAL 5. TORN_TRANSACTIONS 6. POST_AUTH_CHIP_DECLINE
    String status = "Optional"; // Void’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning
    LocalDate timeStampFrom = LocalDate.now(); // Void’s TimeStamp.
    LocalDate timeStampTo = LocalDate.now(); // Void’s TimeStamp.
    try {
      VoidSearchVoidsResponse result = client
              .void
              .searchVoids(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .voidReason(voidReason)
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
      System.err.println("Exception when calling VoidApi#searchVoids");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoidSearchVoidsResponse> response = client
              .void
              .searchVoids(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .voidReason(voidReason)
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
      System.err.println("Exception when calling VoidApi#searchVoids");
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
| **voidSearchVoidsRequest** | [**VoidSearchVoidsRequest**](VoidSearchVoidsRequest.md)|  | [optional] |

### Return type

[**VoidSearchVoidsResponse**](VoidSearchVoidsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

