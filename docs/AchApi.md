# AchApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCreditPayment**](AchApi.md#createCreditPayment) | **POST** /api/v1/IssueACH/IssueLite | Issue ACH Lite |


<a name="createCreditPayment"></a>
# **createCreditPayment**
> AchCreateCreditPaymentResponse createCreditPayment().achCreateCreditPaymentRequest(achCreateCreditPaymentRequest).execute();

Issue ACH Lite

This endpoint creates an ACH Credit payment that does not have an associated sale. This allows ConnexPay Lite clients to submit the issue payment call only.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AchApi;
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
    String merchantGuid = "merchantGuid_example"; // Merchant's guid. Application level value that indicates the ACH payment is being requested for clients account. Value provided by ConnexPay.
    Float amount = 3.4F; // Payment amount with the minimum amount > 0.5.
    String payeeName = "payeeName_example"; // Payee name up to 100 characters.
    AchCreateCreditPaymentRequestAccountHolder accountHolder = new AchCreateCreditPaymentRequestAccountHolder();
    String statementCompanyName = "Merchant Alias"; // Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement.
    String description = "description_example"; // For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement.
    String orderNumber = "7H2345"; // This is the most common number you'll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters.
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    String associationId = "associationId_example"; // This parameter allows you to input an up to 100 character association ID that can be used to tie this ACH Purchase to a sale (Association ID also needs to be included on the sale request). This is useful if you issue the ACH purchase prior to creating the sale that associates to it.
    try {
      AchCreateCreditPaymentResponse result = client
              .ach
              .createCreditPayment(merchantGuid, amount, payeeName, accountHolder)
              .statementCompanyName(statementCompanyName)
              .description(description)
              .orderNumber(orderNumber)
              .sequenceNumber(sequenceNumber)
              .associationId(associationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMerchantId());
      System.out.println(result.getIncomingTransactionCode());
      System.out.println(result.getPaymentId());
      System.out.println(result.getIsCredit());
      System.out.println(result.getAmount());
      System.out.println(result.getPayeeName());
      System.out.println(result.getPaymentStatus());
      System.out.println(result.getScheduleDate());
      System.out.println(result.getReceiptDate());
      System.out.println(result.getProcessingDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling AchApi#createCreditPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AchCreateCreditPaymentResponse> response = client
              .ach
              .createCreditPayment(merchantGuid, amount, payeeName, accountHolder)
              .statementCompanyName(statementCompanyName)
              .description(description)
              .orderNumber(orderNumber)
              .sequenceNumber(sequenceNumber)
              .associationId(associationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AchApi#createCreditPayment");
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
| **achCreateCreditPaymentRequest** | [**AchCreateCreditPaymentRequest**](AchCreateCreditPaymentRequest.md)|  | [optional] |

### Return type

[**AchCreateCreditPaymentResponse**](AchCreateCreditPaymentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

