# ValidationApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchVerifyOperation**](ValidationApi.md#searchVerifyOperation) | **POST** /api/v1/Search/Verify/{exportable}/{pageNumber}/{pageSize} | Search verify |


<a name="searchVerifyOperation"></a>
# **searchVerifyOperation**
> ValidationSearchVerifyOperationResponse searchVerifyOperation(exportable, pageNumber, pageSize).validationSearchVerifyOperationRequest(validationSearchVerifyOperationRequest).execute();

Search verify

This endpoint search a verify.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ValidationApi;
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
    String cardLastFour = "Optional"; // Card last four number.
    String cardHolderName = "Optional"; // Cardholder’s name. Providing information in this field allows a user of the ConnexPay portal to search for a transaction using the cardholder name.
    String cardType = "Optional"; // Card Type.
    LocalDate timeStampFrom = LocalDate.now(); // Verify’s TimeStamp From.
    LocalDate timeStampTo = LocalDate.now(); // Verify’s TimeStamp To.
    String status = "Optional"; // Verify’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning
    try {
      ValidationSearchVerifyOperationResponse result = client
              .validation
              .searchVerifyOperation(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .cardLastFour(cardLastFour)
              .cardHolderName(cardHolderName)
              .cardType(cardType)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .status(status)
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
      System.err.println("Exception when calling ValidationApi#searchVerifyOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ValidationSearchVerifyOperationResponse> response = client
              .validation
              .searchVerifyOperation(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .cardLastFour(cardLastFour)
              .cardHolderName(cardHolderName)
              .cardType(cardType)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#searchVerifyOperation");
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
| **validationSearchVerifyOperationRequest** | [**ValidationSearchVerifyOperationRequest**](ValidationSearchVerifyOperationRequest.md)|  | [optional] |

### Return type

[**ValidationSearchVerifyOperationResponse**](ValidationSearchVerifyOperationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

