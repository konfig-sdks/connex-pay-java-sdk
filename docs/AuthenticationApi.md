# AuthenticationApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquireClientAuthorization**](AuthenticationApi.md#acquireClientAuthorization) | **POST** /api/v1/authonlys | Auth Only |
| [**obtain3dSecureAuthentication**](AuthenticationApi.md#obtain3dSecureAuthentication) | **POST** /api/v1/3ds | 3DS Authentication |


<a name="acquireClientAuthorization"></a>
# **acquireClientAuthorization**
> AuthenticationAcquireClientAuthorizationResponse acquireClientAuthorization().authenticationAcquireClientAuthorizationRequest(authenticationAcquireClientAuthorizationRequest).execute();

Auth Only

The Auth Only Endpoint is applicable to acquiring clients.  Call Auth Only when you want to process an Authorization only, which will not settle until it&#39;s Captured.  We do not allow you to Capture an Authorization after 5 business days have passed.Calling this endpoint will authorize the card, however, it will not be settled until the [Capture endpoint](https://docs.connexpay.com/reference/capture) is called. Authorizations expire after 5 days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    Float amount = 3.4F; // Amount of the transaction that will be processed. Note: this value is submitted multiple times (in different formats) within the integration to support different purposes i.e. risk analysis, merchant processing, etc.  The minimum amount is: $0.50.
    AuthenticationAcquireClientAuthorizationRequestRiskData riskData = new AuthenticationAcquireClientAuthorizationRequestRiskData();
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    String orderNumber = "orderNumber_example"; // This is the most common number you'll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters.
    Boolean sendReceipt = true; // Value determines whether or not a customer shall be emailed a receipt from the ConnexPay platform if the email address is provided in the API customer block. The default value is TRUE. Set to FALSE so that an email receipt is not sent to the customer. Set to TRUE or leave empty if you want e-mail to be sent. If TRUE, customer's email must be included in the \\\"Card.Customer.email\\\" parameter.
    String statementDescription = "statementDescription_example"; // US Clients only: The statement description allows a client to customize the Merchant name that appears on the cardholder statement such that the cardholder recognizes the transaction on their statement. ConnexPay recommends sending a recognizable DBA along with the PNR i.e. ABC Travel ABC123. Note: functionality not applicable for American Express OptBlue program.  The maximun length is 25 alpha-numeric characters.
    String customerID = "customerID_example"; // Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 100 characters and is alpha-numeric.
    AuthenticationAcquireClientAuthorizationRequestCard card = new AuthenticationAcquireClientAuthorizationRequestCard();
    AuthenticationAcquireClientAuthorizationRequestBankAccount bankAccount = new AuthenticationAcquireClientAuthorizationRequestBankAccount();
    SaleCreateTransactionRequestCustomer customer = new SaleCreateTransactionRequestCustomer();
    SaleCreateTransactionRequestEnhancedData enhancedData = new SaleCreateTransactionRequestEnhancedData();
    String associationID = "associationID_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    AuthenticationAcquireClientAuthorizationRequestBrowserData browserData = new AuthenticationAcquireClientAuthorizationRequestBrowserData();
    try {
      AuthenticationAcquireClientAuthorizationResponse result = client
              .authentication
              .acquireClientAuthorization(deviceGuid, amount, riskData)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .sendReceipt(sendReceipt)
              .statementDescription(statementDescription)
              .customerID(customerID)
              .card(card)
              .bankAccount(bankAccount)
              .customer(customer)
              .enhancedData(enhancedData)
              .associationID(associationID)
              .browserData(browserData)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getBatchStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getAmount());
      System.out.println(result.getEffectiveAmount());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getCardDataSource());
      System.out.println(result.getCustomerID());
      System.out.println(result.getBatchGuid());
      System.out.println(result.getSendReceipt());
      System.out.println(result.getAllowCardEmv());
      System.out.println(result.getProcessorStatusCode());
      System.out.println(result.getProcessorResponseMessage());
      System.out.println(result.getWasProcessed());
      System.out.println(result.getAuthCode());
      System.out.println(result.getRefNumber());
      System.out.println(result.getInvoiceNumber());
      System.out.println(result.getCustomerReceipt());
      System.out.println(result.getStatementDescription());
      System.out.println(result.getEnhancedData());
      System.out.println(result.getCard());
      System.out.println(result.getAddressVerificationCode());
      System.out.println(result.getAddressVerificationResult());
      System.out.println(result.getCvvVerificationCode());
      System.out.println(result.getCvvVerificationResult());
      System.out.println(result.getRiskResponse());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#acquireClientAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationAcquireClientAuthorizationResponse> response = client
              .authentication
              .acquireClientAuthorization(deviceGuid, amount, riskData)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .sendReceipt(sendReceipt)
              .statementDescription(statementDescription)
              .customerID(customerID)
              .card(card)
              .bankAccount(bankAccount)
              .customer(customer)
              .enhancedData(enhancedData)
              .associationID(associationID)
              .browserData(browserData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#acquireClientAuthorization");
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
| **authenticationAcquireClientAuthorizationRequest** | [**AuthenticationAcquireClientAuthorizationRequest**](AuthenticationAcquireClientAuthorizationRequest.md)|  | [optional] |

### Return type

[**AuthenticationAcquireClientAuthorizationResponse**](AuthenticationAcquireClientAuthorizationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **202** | 202 |  -  |

<a name="obtain3dSecureAuthentication"></a>
# **obtain3dSecureAuthentication**
> AuthenticationObtain3DSecureAuthenticationResponse obtain3dSecureAuthentication().authenticationObtain3DSecureAuthenticationRequest(authenticationObtain3DSecureAuthenticationRequest).execute();

3DS Authentication

This endpoint can be used for obtaining 3D Secure Authentication separate from the Create Sale or Auth-Only calls.  This is recommended for our US and CA clients.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    AuthenticationObtain3DSecureAuthenticationRequestCard card = new AuthenticationObtain3DSecureAuthenticationRequestCard();
    String deviceGuid = "{{deviceGuid}}"; // Device's Guid as assigned by ConnexPay.
    AuthenticationObtain3DSecureAuthenticationRequestBrowserData browserData = new AuthenticationObtain3DSecureAuthenticationRequestBrowserData();
    Float amount = 3.4F; // Amount of the transaction being 3DS authenticated
    try {
      AuthenticationObtain3DSecureAuthenticationResponse result = client
              .authentication
              .obtain3dSecureAuthentication(card, deviceGuid, browserData, amount)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getDeviceGuid());
      System.out.println(result.getAmount());
      System.out.println(result.getThreeDSStatus());
      System.out.println(result.getSecureData());
      System.out.println(result.getCavv());
      System.out.println(result.getVersion());
      System.out.println(result.getDirectoryServerTransactionID());
      System.out.println(result.getAcsTransactionId());
      System.out.println(result.getECI());
      System.out.println(result.getCard());
      System.out.println(result.getExemptThreeDSRequest());
      System.out.println(result.getExemptThreeDSPayment());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#obtain3dSecureAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationObtain3DSecureAuthenticationResponse> response = client
              .authentication
              .obtain3dSecureAuthentication(card, deviceGuid, browserData, amount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#obtain3dSecureAuthentication");
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
| **authenticationObtain3DSecureAuthenticationRequest** | [**AuthenticationObtain3DSecureAuthenticationRequest**](AuthenticationObtain3DSecureAuthenticationRequest.md)|  | [optional] |

### Return type

[**AuthenticationObtain3DSecureAuthenticationResponse**](AuthenticationObtain3DSecureAuthenticationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **202** | 202 |  -  |

