# TransactionApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**captureAuthorization**](TransactionApi.md#captureAuthorization) | **POST** /api/v1/Captures | Capture |
| [**createAchCreditPayment**](TransactionApi.md#createAchCreditPayment) | **POST** /api/v1/IssueACH | Issue ACH |
| [**searchVirtualCardHistory**](TransactionApi.md#searchVirtualCardHistory) | **GET** /api/v1/Cards/Transactions/{cardGuid} | Search Virtual Card History |


<a name="captureAuthorization"></a>
# **captureAuthorization**
> TransactionCaptureAuthorizationResponse captureAuthorization().transactionCaptureAuthorizationRequest(transactionCaptureAuthorizationRequest).execute();

Capture

Call this endpoint to Capture an Authorization so that it settles

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String deviceGuid = "deviceGuid_example"; // Device's Guid provided by ConnexPay.
    String authOnlyGuid = "authOnlyGuid_example"; // Guid received from the AuthOnly operation.
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    TransactionCaptureAuthorizationRequestConnexPayTransaction connexPayTransaction = new TransactionCaptureAuthorizationRequestConnexPayTransaction();
    String orderNumber = "orderNumber_example"; // This is the most common number you'll see throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field. The maximum length is 50 alpha-numeric characters and allows dashes ( - ). If you provided an order number in the AUTH request it will be overwritten with the order number in the CAPTURE endpoint.
    String customerID = "customerID_example"; // Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric.
    String associationID = "associationID_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    List<SaleCreateTransactionRequestCustomParametersInner> customParameters = Arrays.asList(); // You can add custom parameters to your sale request in the event that you need to associate additional information with the pay-in. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter = \\\"invoice\\\" and the value parameter as the invoice number. This requires customized reporting so you'll need to work with your implementations specialist to determine what's required.
    try {
      TransactionCaptureAuthorizationResponse result = client
              .transaction
              .captureAuthorization(deviceGuid, authOnlyGuid)
              .sequenceNumber(sequenceNumber)
              .connexPayTransaction(connexPayTransaction)
              .orderNumber(orderNumber)
              .customerID(customerID)
              .associationID(associationID)
              .customParameters(customParameters)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getSale());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#captureAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionCaptureAuthorizationResponse> response = client
              .transaction
              .captureAuthorization(deviceGuid, authOnlyGuid)
              .sequenceNumber(sequenceNumber)
              .connexPayTransaction(connexPayTransaction)
              .orderNumber(orderNumber)
              .customerID(customerID)
              .associationID(associationID)
              .customParameters(customParameters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#captureAuthorization");
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
| **transactionCaptureAuthorizationRequest** | [**TransactionCaptureAuthorizationRequest**](TransactionCaptureAuthorizationRequest.md)|  | [optional] |

### Return type

[**TransactionCaptureAuthorizationResponse**](TransactionCaptureAuthorizationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createAchCreditPayment"></a>
# **createAchCreditPayment**
> TransactionCreateAchCreditPaymentResponse createAchCreditPayment().transactionCreateAchCreditPaymentRequest(transactionCreateAchCreditPaymentRequest).execute();

Issue ACH

This endpoint creates an ACH Credit payment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    Float amount = 3.4F; // Payment amount. Minimum amount > 0.5.
    String payeeName = "payeeName_example"; // Payee name up to 100 characters.
    String incomingTransactionCode = "incomingTransactionCode_example"; // ITC for short Application level setting to associate the ACH payment request with an original sale or sale group. The value is provided in the sale response of the original sale transaction, or in the Group Sale response of the group sale. All ACH payment requests must be associated with an original sale or group transaction.
    TransactionCreateAchCreditPaymentRequestAccountHolder accountHolder = new TransactionCreateAchCreditPaymentRequestAccountHolder();
    String statementCompanyName = "Merchant Alias"; // Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement.
    String description = "description_example"; // For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement.
    try {
      TransactionCreateAchCreditPaymentResponse result = client
              .transaction
              .createAchCreditPayment(merchantGuid, amount, payeeName, incomingTransactionCode, accountHolder)
              .statementCompanyName(statementCompanyName)
              .description(description)
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
      System.err.println("Exception when calling TransactionApi#createAchCreditPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionCreateAchCreditPaymentResponse> response = client
              .transaction
              .createAchCreditPayment(merchantGuid, amount, payeeName, incomingTransactionCode, accountHolder)
              .statementCompanyName(statementCompanyName)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#createAchCreditPayment");
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
| **transactionCreateAchCreditPaymentRequest** | [**TransactionCreateAchCreditPaymentRequest**](TransactionCreateAchCreditPaymentRequest.md)|  | [optional] |

### Return type

[**TransactionCreateAchCreditPaymentResponse**](TransactionCreateAchCreditPaymentResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="searchVirtualCardHistory"></a>
# **searchVirtualCardHistory**
> TransactionSearchVirtualCardHistoryResponse searchVirtualCardHistory(cardGuid).execute();

Search Virtual Card History

This API allows you to pull back history of the Virtual Card. This is the same API (and data) that is used when clicking the “Transactions” button on the Virtual Card in the Portal to display the transaction history. The API will return the merchant name where the Virtual Card was used, the date and time, transaction type (auth, settlement, refund, void, etc.), the response/memo which correlates to the transaction type and the amount.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String cardGuid = "cardGuid_example"; // Global Unique Identifier for the Card. Required parameter.
    try {
      TransactionSearchVirtualCardHistoryResponse result = client
              .transaction
              .searchVirtualCardHistory(cardGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransactions());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#searchVirtualCardHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionSearchVirtualCardHistoryResponse> response = client
              .transaction
              .searchVirtualCardHistory(cardGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#searchVirtualCardHistory");
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
| **cardGuid** | **String**| Global Unique Identifier for the Card. Required parameter. | |

### Return type

[**TransactionSearchVirtualCardHistoryResponse**](TransactionSearchVirtualCardHistoryResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

