# PushToCardApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPayments**](PushToCardApi.md#cancelPayments) | **POST** /api/v1/PushToCard/Payouts/{payoutGuid}/Cancel | Cancel Payments |
| [**createPayee**](PushToCardApi.md#createPayee) | **POST** /api/v1/PushToCard/Payees | Create Payee |
| [**createPayout**](PushToCardApi.md#createPayout) | **POST** /api/v1/PushToCard/Payouts | Create Payout |
| [**getAuthenticationTokenAsync**](PushToCardApi.md#getAuthenticationTokenAsync) | **GET** /api/v1/PushToCard/AuthenticatePaymentWidget | Get Authentication Token for DropInUI |
| [**getPayee**](PushToCardApi.md#getPayee) | **GET** /api/v1/PushToCard/Payees | Get Payee |
| [**getPayoutDetails**](PushToCardApi.md#getPayoutDetails) | **GET** /api/v1/PushToCard/Payouts/{payoutGuid} | Get Payout Details |
| [**managePayee**](PushToCardApi.md#managePayee) | **PUT** /api/v1/PushToCard/Payees/{payeeGuid}/{status} | Manage Payee |
| [**pushFundsToCardAsync**](PushToCardApi.md#pushFundsToCardAsync) | **PATCH** /api/v1/PushToCard/Payments/{ridGuid}/{cardId} | Push Funds to a Card |
| [**updatePayee**](PushToCardApi.md#updatePayee) | **PATCH** /api/v1/PushToCard/Payees/{payeeGuid} | Update Payee |


<a name="cancelPayments"></a>
# **cancelPayments**
> String cancelPayments(payoutGuid, cancelPaymentsDto).execute();

Cancel Payments

Use this endpoint to cancel payments within a Payout.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID merchantGuid = UUID.randomUUID(); // Application-level value that indicates a Payout is being requested for client's account. Value provided by ConnexPay.
    List<UUID> payments = Arrays.asList(); // The Payment Guid returned in the Create Payout response.
    UUID payoutGuid = UUID.randomUUID(); // Globally Unique Identifier for a the Payout that will be changed
    try {
      String result = client
              .pushToCard
              .cancelPayments(merchantGuid, payments, payoutGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#cancelPayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .pushToCard
              .cancelPayments(merchantGuid, payments, payoutGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#cancelPayments");
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
| **payoutGuid** | **UUID**| Globally Unique Identifier for a the Payout that will be changed | |
| **cancelPaymentsDto** | [**CancelPaymentsDto**](CancelPaymentsDto.md)| Indicator of which payments to cancel | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment has been canceled |  -  |
| **400** | Payment list must not be empty |  -  |
| **404** | Payout doesn&#39;t exist or doesn&#39;t belong to the user --OR-- Payment doesn&#39;t exist or doesn&#39;t belong to payout |  -  |
| **409** | Payout is in &#39;Rejected&#39; State --OR-- All Payments must be in &#39;Approved&#39; state |  -  |

<a name="createPayee"></a>
# **createPayee**
> PayeeDto createPayee(payeeDto).execute();

Create Payee

Use this endpoint to create a new Payee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID merchantGuid = UUID.randomUUID(); // Merchant guid for the Payee to be created.
    String firstName = "firstName_example"; // First name for the Payee to be created.
    String lastName = "lastName_example"; // Last name for the Payee to be created.
    String email = "email_example"; // Email address for the Payee.
    String phone = "phone_example"; // Phone number for the Payee, up to 10-character string.
    UUID payeeGuid = UUID.randomUUID(); // Guid for the created Payee that is returned by ConnexPay upon creation of a Payee. Ignored if provided in a Payee creation request.
    String address1 = "address1_example"; // Postal address line 1 for the Payee. Alphanumerics and [,.-'] are allowed.
    String address2 = "address2_example"; // Postal address line 2 for the Payee. Alphanumerics and [,.-'] are allowed.
    String city = "city_example"; // Postal address city for the Payee.
    String state = "state_example"; // Postal address state for the Payee.
    String zipCode = "zipCode_example"; // Postal code for the Payee.
    String status = "status_example"; // Status for the Payee.
    String cardId = "cardId_example"; // Unique identifier that refers to the card saved for a Payee when using the Payment Widget. It will be null when a Payee is created but will have a value once stored for the Payee using the Payment Widget.
    try {
      PayeeDto result = client
              .pushToCard
              .createPayee(merchantGuid, firstName, lastName, email, phone)
              .payeeGuid(payeeGuid)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .status(status)
              .cardId(cardId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayeeGuid());
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZipCode());
      System.out.println(result.getPhone());
      System.out.println(result.getStatus());
      System.out.println(result.getCardId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#createPayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeDto> response = client
              .pushToCard
              .createPayee(merchantGuid, firstName, lastName, email, phone)
              .payeeGuid(payeeGuid)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .status(status)
              .cardId(cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#createPayee");
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
| **payeeDto** | [**PayeeDto**](PayeeDto.md)| The data for the Payee that will be created | |

### Return type

[**PayeeDto**](PayeeDto.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **409** | A Payee with the provided email address already exists |  -  |

<a name="createPayout"></a>
# **createPayout**
> PayoutDto createPayout(payoutDto).execute();

Create Payout

Use this endpoint to create a new Payout.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID merchantGuid = UUID.randomUUID(); // Application-level value that indicates a Payout is being requested for client's account. Value provided by ConnexPay.
    String memo = "memo_example"; // A brief description highlighting the reason for this Payout.
    List<PaymentsDto> payments = Arrays.asList();
    UUID payoutGuid = UUID.randomUUID(); // Guid assigned to the Payout by ConnexPay upon creation of a Payout.
    String payoutReferenceToken = "payoutReferenceToken_example"; // The Payout identifier that will be needed by ConnexPay support teams to research issues.
    String status = "status_example"; // Status of the Payout.
    String orderNumber = "orderNumber_example"; // The most common number used throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. The maximum length is 50 alpha-numeric characters and allows dashes ( - ).
    String customerId = "customerId_example"; // Transaction ID within the client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric.
    String associationId = "associationId_example"; // Association ID is used to tie a Payout to a sale or sales. For example, if you have several sales and one Payout to a Payee, association ID can be added to the sales and the Payout for downstream reporting.
    List<Integer> labelIds = Arrays.asList(); // Label IDs are used to associate a Payout to specific labels within ConnexPay Bridge UI for an organization. If a Payout is tied to an incorrect Label, it will not filter or display correctly in Bridge's Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use.
    try {
      PayoutDto result = client
              .pushToCard
              .createPayout(merchantGuid, memo, payments)
              .payoutGuid(payoutGuid)
              .payoutReferenceToken(payoutReferenceToken)
              .status(status)
              .orderNumber(orderNumber)
              .customerId(customerId)
              .associationId(associationId)
              .labelIds(labelIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayoutGuid());
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getPayoutReferenceToken());
      System.out.println(result.getMemo());
      System.out.println(result.getStatus());
      System.out.println(result.getPayments());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getCustomerId());
      System.out.println(result.getAssociationId());
      System.out.println(result.getLabelIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#createPayout");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutDto> response = client
              .pushToCard
              .createPayout(merchantGuid, memo, payments)
              .payoutGuid(payoutGuid)
              .payoutReferenceToken(payoutReferenceToken)
              .status(status)
              .orderNumber(orderNumber)
              .customerId(customerId)
              .associationId(associationId)
              .labelIds(labelIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#createPayout");
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
| **payoutDto** | [**PayoutDto**](PayoutDto.md)| The data for the Payout being created | |

### Return type

[**PayoutDto**](PayoutDto.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | BadRequest |  -  |

<a name="getAuthenticationTokenAsync"></a>
# **getAuthenticationTokenAsync**
> PayoutAuthResponse getAuthenticationTokenAsync().payeeGuid(payeeGuid).payeeEmailAddress(payeeEmailAddress).execute();

Get Authentication Token for DropInUI

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    String payeeGuid = "payeeGuid_example"; // Globally Unique Identifier for the Payee being authenticated.
    String payeeEmailAddress = "payeeEmailAddress_example"; // Email address of the Payee being retrieved
    try {
      PayoutAuthResponse result = client
              .pushToCard
              .getAuthenticationTokenAsync()
              .payeeGuid(payeeGuid)
              .payeeEmailAddress(payeeEmailAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthenticationResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getAuthenticationTokenAsync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutAuthResponse> response = client
              .pushToCard
              .getAuthenticationTokenAsync()
              .payeeGuid(payeeGuid)
              .payeeEmailAddress(payeeEmailAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getAuthenticationTokenAsync");
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
| **payeeGuid** | **String**| Globally Unique Identifier for the Payee being authenticated. | [optional] |
| **payeeEmailAddress** | **String**| Email address of the Payee being retrieved | [optional] |

### Return type

[**PayoutAuthResponse**](PayoutAuthResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | A valid Payee guid or email address must be provided |  -  |
| **401** | User doesn&#39;t have access to this merchant |  -  |
| **404** | Payee doesn&#39;t exist or doesn&#39;t belong to the user |  -  |

<a name="getPayee"></a>
# **getPayee**
> PayeeDto getPayee().payeeGuid(payeeGuid).payeeEmailAddress(payeeEmailAddress).execute();

Get Payee

Use this endpoint to retrieve a Payee for a specific Payee guid. One or both &#39;payeeGuid&#39; or &#39;payeeEmailAddress&#39; must be provided.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    String payeeGuid = "payeeGuid_example"; // Globally Unique Identifier for the Payee being retrieved
    String payeeEmailAddress = "payeeEmailAddress_example"; // Email address of the Payee being retrieved
    try {
      PayeeDto result = client
              .pushToCard
              .getPayee()
              .payeeGuid(payeeGuid)
              .payeeEmailAddress(payeeEmailAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayeeGuid());
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZipCode());
      System.out.println(result.getPhone());
      System.out.println(result.getStatus());
      System.out.println(result.getCardId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getPayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeDto> response = client
              .pushToCard
              .getPayee()
              .payeeGuid(payeeGuid)
              .payeeEmailAddress(payeeEmailAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getPayee");
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
| **payeeGuid** | **String**| Globally Unique Identifier for the Payee being retrieved | [optional] |
| **payeeEmailAddress** | **String**| Email address of the Payee being retrieved | [optional] |

### Return type

[**PayeeDto**](PayeeDto.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The Payee&#39;s guid or email address must be provided |  -  |
| **401** | User doesn&#39;t have access to this merchant |  -  |
| **404** | Payee doesn&#39;t exist or doesn&#39;t belong to the user |  -  |

<a name="getPayoutDetails"></a>
# **getPayoutDetails**
> DtoPayout getPayoutDetails(payoutGuid).execute();

Get Payout Details

Use this endpoint to retrieve the details for a Payout for a specific Payout guid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID payoutGuid = UUID.randomUUID(); // Globally Unique Identifier for a the Payout that will be retrieved
    try {
      DtoPayout result = client
              .pushToCard
              .getPayoutDetails(payoutGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayoutGuid());
      System.out.println(result.getPayoutReferenceToken());
      System.out.println(result.getMemo());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getAssociationId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLabelIds());
      System.out.println(result.getPayments());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getPayoutDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DtoPayout> response = client
              .pushToCard
              .getPayoutDetails(payoutGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#getPayoutDetails");
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
| **payoutGuid** | **UUID**| Globally Unique Identifier for a the Payout that will be retrieved | |

### Return type

[**DtoPayout**](DtoPayout.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | User doesn&#39;t have access to this merchant |  -  |
| **404** | Payout doesn&#39;t exist or doesn&#39;t belong to the user |  -  |

<a name="managePayee"></a>
# **managePayee**
> String managePayee(payeeGuid, status).execute();

Manage Payee

Use this endpoint to enable or disable a Payee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID payeeGuid = UUID.randomUUID(); // Globally Unique Identifier for the Payee that will be changed
    String status = "enable"; // Must be 'enable' or 'disable'
    try {
      String result = client
              .pushToCard
              .managePayee(payeeGuid, status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#managePayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .pushToCard
              .managePayee(payeeGuid, status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#managePayee");
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
| **payeeGuid** | **UUID**| Globally Unique Identifier for the Payee that will be changed | |
| **status** | **String**| Must be &#39;enable&#39; or &#39;disable&#39; | [enum: enable, disable] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payee status changed to the requested state --OR-- Payee is already in the requested state |  -  |
| **400** | Status must be &#39;enable&#39; or &#39;disable&#39; |  -  |
| **401** | User doesn&#39;t have access to this merchant |  -  |
| **404** | Payee doesn&#39;t exist or doesn&#39;t belong to the user |  -  |

<a name="pushFundsToCardAsync"></a>
# **pushFundsToCardAsync**
> String pushFundsToCardAsync(ridGuid, cardId).execute();

Push Funds to a Card

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    String ridGuid = "ridGuid_example"; // For Payment Widget clients. A ridGuid will will be returned upon creation of a Payout. That must be saved and passed here to complete the process.
    String cardId = "cardId_example"; // For Payment Widget clients. The cardId is retrieved by calling the Get Payee endpoint.
    try {
      String result = client
              .pushToCard
              .pushFundsToCardAsync(ridGuid, cardId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#pushFundsToCardAsync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .pushToCard
              .pushFundsToCardAsync(ridGuid, cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#pushFundsToCardAsync");
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
| **ridGuid** | **String**| For Payment Widget clients. A ridGuid will will be returned upon creation of a Payout. That must be saved and passed here to complete the process. | |
| **cardId** | **String**| For Payment Widget clients. The cardId is retrieved by calling the Get Payee endpoint. | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully pushed funds to card |  -  |
| **400** | Valid values for ridGuid and cardId must be provided |  -  |

<a name="updatePayee"></a>
# **updatePayee**
> String updatePayee(payeeGuid, updatePayeeDto).execute();

Update Payee

Use this endpoint to update data for a Payee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushToCardApi;
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
    UUID payeeGuid = UUID.randomUUID(); // Globally Unique Identifier for a the Payee that will be updated
    String firstName = "firstName_example"; // First name for the Payee to be updated.
    String lastName = "lastName_example"; // Last name for the Payee to be updated.
    String email = "email_example"; // Email address for the Payee to be updated.
    String address1 = "address1_example"; // Postal address line 1 for the Payee to be updated. Alphanumerics and [,.-'] are allowed.
    String address2 = "address2_example"; // Postal address line 2 for the Payee to be updated. Alphanumerics and [,.-'] are allowed.
    String city = "city_example"; // Postal address city for the Payee to be updated.
    String state = "state_example"; // Postal address state for the Payee to be updated.
    String zipCode = "zipCode_example"; // Postal code for the Payee to be updated.
    String phone = "phone_example"; // Phone number for the Payee to be updated, up to 10-character string.
    String status = "status_example"; // Status for the Payee to be updated.
    try {
      String result = client
              .pushToCard
              .updatePayee(payeeGuid)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .phone(phone)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#updatePayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .pushToCard
              .updatePayee(payeeGuid)
              .firstName(firstName)
              .lastName(lastName)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .phone(phone)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushToCardApi#updatePayee");
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
| **payeeGuid** | **UUID**| Globally Unique Identifier for a the Payee that will be updated | |
| **updatePayeeDto** | [**UpdatePayeeDto**](UpdatePayeeDto.md)| The data for the Payee that will be updated | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | payeeGuid must be a valid guid value |  -  |
| **401** | User doesn&#39;t have access to this merchant |  -  |
| **404** | Payee doesn&#39;t exist or doesn&#39;t belong to the user |  -  |

