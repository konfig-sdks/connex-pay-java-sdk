# SaleApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateDelayed**](SaleApi.md#activateDelayed) | **PUT** /api/v1/sales/Activate/{SaleGuid} | Activate Delayed Sale |
| [**createTransaction**](SaleApi.md#createTransaction) | **POST** /api/v1/sales | Create Sale |
| [**getChargebacksByUser**](SaleApi.md#getChargebacksByUser) | **GET** /api/chargeback/GetByUser | Sales Chargebacks |
| [**searchSales**](SaleApi.md#searchSales) | **POST** /api/v1/Search/Sales/{exportable}/{pageNumber}/{pageSize} | Search sales |
| [**updateDelayedActivation**](SaleApi.md#updateDelayedActivation) | **POST** /api/v1/sales/UpdateFutureSale | Update Delayed Sale |


<a name="activateDelayed"></a>
# **activateDelayed**
> Object activateDelayed(saleGuid).execute();

Activate Delayed Sale

Activate a delayed activation sale independent of the activation date for which the sale was created.  A client can \&quot;Activate\&quot; a delayed activation sale this way at any time before ConnexPay will automatically activate it during the early hours of the supplied future date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SaleApi;
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
    String saleGuid = "saleGuid_example"; // The sale guid returned upon initial creation of the delayed activation sale.
    try {
      Object result = client
              .sale
              .activateDelayed(saleGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#activateDelayed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .sale
              .activateDelayed(saleGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#activateDelayed");
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
| **saleGuid** | **String**| The sale guid returned upon initial creation of the delayed activation sale. | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createTransaction"></a>
# **createTransaction**
> SaleCreateTransactionResponse createTransaction().saleCreateTransactionRequest(saleCreateTransactionRequest).execute();

Create Sale

The Create Sale Endpoint is used by acquiring clients. The Sale transaction is used to create a sale for your consumer. You can create a credit sale or an ACH sale (ACH sales apply to US Clients only). A credit sale will charge a consumer&#39;s credit card. The consumer&#39;s credit card will be authorized immediately when the Sales request is received and will automatically settle/batch that same night. In other words, this one Sale request is just like running an AuthOnly and a Capture in one request.You can postpone charging the consumer&#39;s credit card by providing a date in the &#39;ActivationDate&#39; of your request. Doing so will delay the authorization and charge to the consumer&#39;s credit card until that future date.An ACH sale will create an ACH transaction that will debit the consumer&#39;s bank account. ACH sales received prior to 3:00 PM EST will process overnight. ACH Sales received after 3:00 PM EST will process the following night.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SaleApi;
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
    String deviceGuid = "{{Device}}"; // Device's Guid provided by ConnexPay
    Float amount = 3.4F; // Amount of the transaction that will be processed. Note: this value is submitted multiple times (in different formats) within the integration to support different purposes i.e. risk analysis, merchant processing, etc.  The minimum amount is: $0.50.
    SaleCreateTransactionRequestConnexPayTransaction connexPayTransaction = new SaleCreateTransactionRequestConnexPayTransaction();
    SaleCreateTransactionRequestRiskData riskData = new SaleCreateTransactionRequestRiskData();
    String tenderType = "credit"; // Allowed values:  \\\"credit\\\" (default if TenderType not provided) and \\\"ach\\\"
    String sequenceNumber = "{{SequenceNumber}}"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If a sale request with the same parameter data and the same sequence number is sent within 30 minutes it will be considered a duplicate request and the sale will not process. Note: value is not searchable or reportable in Bridge.  Alphanumeric.
    String orderNumber = "{{OrderNumber}}"; // This is the most common number you'll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters and allows dashes ( - ).
    Boolean sendReceipt = true; // Value determines whether or not a customer shall be emailed a receipt from the ConnexPay platform if the email address is provided in the API customer block. The default value is TRUE. Set to FALSE so that an email receipt is not sent to the customer. Set to TRUE or leave empty if you want e-mail to be sent. If TRUE, customer's email must be included in the \\\"Card.Customer.email\\\" parameter.
    Boolean riskProcessingOnly = true; // Indicator that determines if client would like to evaluate the transactions as risk only rather than process as merchant of record and create a virtual card. The allowed values:  1. Set to TRUE will only run risk validations. If TenderType is not set to Credit, setting TRUE will throw a validation error.  2. Set to FALSE will run risk validations and an authorization on the card. For this option a Processing Merchant account is required, contact ConnexPay support if any questions.  3. Set to NULL and your Merchant Level settings would apply.
    String statementDescription = "{{StatementDescription}}"; // US Clients only: The statement description allows a client to customize the Merchant name that appears on the cardholder statement such that the cardholder recognizes the transaction on their statement. For US Merchants: ConnexPay recommends sending a recognizable DBA along with the PNR i.e. ABC Travel ABC123.  The maximum length is 25 alpha-numeric characters.  For EU Merchants: The maximum length of the description is 13 alphanumeric characters and the DBA Name and City will automatically be coded to appear as part of the statement description. Note: functionality not applicable for American Express program.
    String customerID = "customerID_example"; // Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 100 characters and is alpha-numeric.
    LocalDate activationDate = LocalDate.now(); // Set a future date on which to run this sale, at least one day from creation date and within 600 days. If this parameter is supplied a record for this sale is created, supplied consumer card information is internally tokenized, but fraud check and authorization do not occur until ConnexPay processes it on the supplied ActivationDate. Alternatively, a client can force activation via the Activate API (see below). If this date is not supplied a sale is authorized and the consumer's credit card is charged immediately.
    String requestIp = "requestIp_example"; // Mandatory if TenderType is ACH. Customer's IP Address is a required parameter for all ACH Sales transactions to adhere to NACHA regulations.
    SaleCreateTransactionRequestCard card = new SaleCreateTransactionRequestCard();
    SaleCreateTransactionRequestBankAccount bankAccount = new SaleCreateTransactionRequestBankAccount();
    SaleCreateTransactionRequestCustomer customer = new SaleCreateTransactionRequestCustomer();
    SaleCreateTransactionRequestEnhancedData enhancedData = new SaleCreateTransactionRequestEnhancedData();
    String associationId = "associationId_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    List<SaleCreateTransactionRequestCustomParametersInner> customParameters = Arrays.asList(); // You can add custom parameters to your sale request in the event that you need to associate additional information with the pay-in. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter = \\\"invoice\\\" and the value parameter as the invoice number. This requires customized reporting so you'll need to work with your implementations specialist to determine what's required.
    List<String> labelIDs = Arrays.asList(); // Utilize Label IDs to associate a sale to a specific label(s) within ConnexPay Bridge UI for your organization. If a sale is tied to an incorrect Label, it will not filter or display correctly in Bridge's Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use.
    SaleCreateTransactionRequestBrowserData browserData = new SaleCreateTransactionRequestBrowserData();
    try {
      SaleCreateTransactionResponse result = client
              .sale
              .createTransaction(deviceGuid, amount, connexPayTransaction, riskData)
              .tenderType(tenderType)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .sendReceipt(sendReceipt)
              .riskProcessingOnly(riskProcessingOnly)
              .statementDescription(statementDescription)
              .customerID(customerID)
              .activationDate(activationDate)
              .requestIp(requestIp)
              .card(card)
              .bankAccount(bankAccount)
              .customer(customer)
              .enhancedData(enhancedData)
              .associationId(associationId)
              .customParameters(customParameters)
              .labelIDs(labelIDs)
              .browserData(browserData)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getBatchStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getAmount());
      System.out.println(result.getActivated());
      System.out.println(result.getTenderType());
      System.out.println(result.getEffectiveAmount());
      System.out.println(result.getRiskResponse());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCardDataSource());
      System.out.println(result.getCustomerID());
      System.out.println(result.getBatchGuid());
      System.out.println(result.getConnexPayTransaction());
      System.out.println(result.getAssociationId());
      System.out.println(result.getProcessorStatusCode());
      System.out.println(result.getProcessorResponseMessage());
      System.out.println(result.getWasProcessed());
      System.out.println(result.getAuthCode());
      System.out.println(result.getRefNumber());
      System.out.println(result.getCustomerReceipt());
      System.out.println(result.getStatementDescription());
      System.out.println(result.getGeneratedBy());
      System.out.println(result.getCard());
      System.out.println(result.getAddressVerificationResult());
      System.out.println(result.getCvvVerificationCode());
      System.out.println(result.getCvvVerificationResult());
      System.out.println(result.getCavvResponseCode());
      System.out.println(result.getWalletProvider());
      System.out.println(result.getIsFromIssueLite());
      System.out.println(result.getLabelIds());
      System.out.println(result.getRemainingAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#createTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SaleCreateTransactionResponse> response = client
              .sale
              .createTransaction(deviceGuid, amount, connexPayTransaction, riskData)
              .tenderType(tenderType)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .sendReceipt(sendReceipt)
              .riskProcessingOnly(riskProcessingOnly)
              .statementDescription(statementDescription)
              .customerID(customerID)
              .activationDate(activationDate)
              .requestIp(requestIp)
              .card(card)
              .bankAccount(bankAccount)
              .customer(customer)
              .enhancedData(enhancedData)
              .associationId(associationId)
              .customParameters(customParameters)
              .labelIDs(labelIDs)
              .browserData(browserData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#createTransaction");
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
| **saleCreateTransactionRequest** | [**SaleCreateTransactionRequest**](SaleCreateTransactionRequest.md)|  | [optional] |

### Return type

[**SaleCreateTransactionResponse**](SaleCreateTransactionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **201** | 201 |  -  |
| **202** | 202 |  -  |

<a name="getChargebacksByUser"></a>
# **getChargebacksByUser**
> String getChargebacksByUser(getByUserQuestionMarkStartDateEqual20161201, getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201, getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021).execute();

Sales Chargebacks



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SaleApi;
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
    String getByUserQuestionMarkStartDateEqual20161201 = "getByUserQuestionMarkStartDateEqual20161201_example"; // Return all chargebacks for the authenticated user with a start date
    String getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201 = "getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201_example"; // Return all chargebacks for the authenticated user with a start and end date
    String getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021 = "getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021_example"; // Return all chargebacks for the authenticated user with a start and end date based on resolved date
    try {
      String result = client
              .sale
              .getChargebacksByUser(getByUserQuestionMarkStartDateEqual20161201, getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201, getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#getChargebacksByUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .sale
              .getChargebacksByUser(getByUserQuestionMarkStartDateEqual20161201, getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201, getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#getChargebacksByUser");
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
| **getByUserQuestionMarkStartDateEqual20161201** | **String**| Return all chargebacks for the authenticated user with a start date | |
| **getByUserQuestionMarkStartDateEqual20161201AmpersandEndDateEqual20161201** | **String**| Return all chargebacks for the authenticated user with a start and end date | |
| **getByResolvedDateQuestionMarkStartDateEqual20190920AmpersandEndDateEqual20191021** | **String**| Return all chargebacks for the authenticated user with a start and end date based on resolved date | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="searchSales"></a>
# **searchSales**
> SaleSearchSalesResponse searchSales(exportable, pageNumber, pageSize).saleSearchSalesRequest(saleSearchSalesRequest).execute();

Search sales

This endpoint searches sales.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SaleApi;
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
    String cardHolderName = "Optional"; // Cardholder’s name.
    String cardLastFour = "Optional"; // Card last four number.
    String cardType = "Optional"; // Card type.
    Integer invoiceNumber = 56; // Sale’s InvoiceNumber.
    String orderNumber = "Optional"; // Sale’s order number. Length = 17.
    LocalDate orderDateFrom = LocalDate.now(); // Sale’s order Date.
    LocalDate orderDateTo = LocalDate.now(); // Sale’s order Date.
    LocalDate timeStampFrom = LocalDate.now(); // Sale’s TimeStamp.
    LocalDate timeStampTo = LocalDate.now(); // Sale’s TimeStamp.
    String status = "Optional"; // Sale’s status. Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning
    String merchantCustomerId = "Optional"; // Merchant Customer Id.
    Boolean activated = false; // Delayed Activation Sales to be included or not
    LocalDate activationDateFrom = LocalDate.now(); // Activation Start Date. This field is applicable only when Activated flag is set to true.
    LocalDate activationDateTo = LocalDate.now(); // Activation End Date. This field is applicable only when Activated flag is set to true.
    try {
      SaleSearchSalesResponse result = client
              .sale
              .searchSales(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .amountFrom(amountFrom)
              .amountTo(amountTo)
              .cardHolderName(cardHolderName)
              .cardLastFour(cardLastFour)
              .cardType(cardType)
              .invoiceNumber(invoiceNumber)
              .orderNumber(orderNumber)
              .orderDateFrom(orderDateFrom)
              .orderDateTo(orderDateTo)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .status(status)
              .merchantCustomerId(merchantCustomerId)
              .activated(activated)
              .activationDateFrom(activationDateFrom)
              .activationDateTo(activationDateTo)
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
      System.err.println("Exception when calling SaleApi#searchSales");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SaleSearchSalesResponse> response = client
              .sale
              .searchSales(exportable, pageNumber, pageSize)
              .merchantGuid(merchantGuid)
              .amountFrom(amountFrom)
              .amountTo(amountTo)
              .cardHolderName(cardHolderName)
              .cardLastFour(cardLastFour)
              .cardType(cardType)
              .invoiceNumber(invoiceNumber)
              .orderNumber(orderNumber)
              .orderDateFrom(orderDateFrom)
              .orderDateTo(orderDateTo)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .status(status)
              .merchantCustomerId(merchantCustomerId)
              .activated(activated)
              .activationDateFrom(activationDateFrom)
              .activationDateTo(activationDateTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#searchSales");
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
| **saleSearchSalesRequest** | [**SaleSearchSalesRequest**](SaleSearchSalesRequest.md)|  | [optional] |

### Return type

[**SaleSearchSalesResponse**](SaleSearchSalesResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateDelayedActivation"></a>
# **updateDelayedActivation**
> String updateDelayedActivation().saleUpdateDelayedActivationRequest(saleUpdateDelayedActivationRequest).execute();

Update Delayed Sale

Updates the sale amount or activation date on a delayed activation sale.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SaleApi;
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
    String saleGuid = "saleGuid_example"; // Sales's Guid that was provided by ConnexPay upon initial creation of the delayed activation sale.
    Float amount = 3.4F; // Amount of the transaction that will be processed. Note: this value is submitted multiple times (in different formats) within the integration to support different purposes i.e. risk analysis, merchant processing, etc.  The minimun amount is: $0.50.
    LocalDate activationDate = LocalDate.now(); // Set a future date on which to run this sale, at least one day from creation date and within 600 days.
    try {
      String result = client
              .sale
              .updateDelayedActivation(deviceGuid, saleGuid, amount)
              .activationDate(activationDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#updateDelayedActivation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .sale
              .updateDelayedActivation(deviceGuid, saleGuid, amount)
              .activationDate(activationDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SaleApi#updateDelayedActivation");
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
| **saleUpdateDelayedActivationRequest** | [**SaleUpdateDelayedActivationRequest**](SaleUpdateDelayedActivationRequest.md)|  | [optional] |

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

