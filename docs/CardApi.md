# CardApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateDelayed**](CardApi.md#activateDelayed) | **PUT** /api/v1/IssueCard/ActivateDelayedCard/{{CardGuid}} | Activate Virtual Card with Delayed Activation |
| [**cancelVirtualCard**](CardApi.md#cancelVirtualCard) | **PUT** /api/v1/IssueCard/Cancel/{{CardGuid}} | Cancel Card |
| [**createLodgedCard**](CardApi.md#createLodgedCard) | **POST** /api/v1/IssueCard/LodgedCard | Issue Lodged Card |
| [**getDetail**](CardApi.md#getDetail) | **GET** /api/v1/Cards/{CardGuid}/{ShowFullPan} | Get Issue Card Detail |
| [**resendTransmissionInfo**](CardApi.md#resendTransmissionInfo) | **PUT** /api/v1/IssueCard/SendPaymentInfo/{cardGuid} | Resend Transmission |
| [**searchIssuedVirtualCards**](CardApi.md#searchIssuedVirtualCards) | **POST** /api/v1/Search/IssuedCards | Search Issued Cards |
| [**terminateByDate**](CardApi.md#terminateByDate) | **POST** /api/v1/TerminateCard/&lt;guid&gt; | Terminate Card |
| [**updateCardDetails**](CardApi.md#updateCardDetails) | **PUT** /api/v1/IssueCard/{cardGuid} | Update Card |
| [**updateDelayedActivation**](CardApi.md#updateDelayedActivation) | **PUT** /api/v1/IssueCard/UpdateDelayedCard/{{CardGuid}} | Update Virtual Card with Delayed Activation |
| [**updateLodgedCard**](CardApi.md#updateLodgedCard) | **PUT** /api/v1/IssueCard/LodgedCard/{CardGuid} | Update Lodged Card |


<a name="activateDelayed"></a>
# **activateDelayed**
> CardActivateDelayedResponse activateDelayed().execute();

Activate Virtual Card with Delayed Activation

Use this API to immediately activate a Virtual Card with a delayed activation date

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    try {
      CardActivateDelayedResponse result = client
              .card
              .activateDelayed()
              .execute();
      System.out.println(result);
      System.out.println(result.getCardHolder());
      System.out.println(result.getCard());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#activateDelayed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardActivateDelayedResponse> response = client
              .card
              .activateDelayed()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#activateDelayed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardActivateDelayedResponse**](CardActivateDelayedResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="cancelVirtualCard"></a>
# **cancelVirtualCard**
> CardCancelVirtualCardResponse cancelVirtualCard().execute();

Cancel Card

This endpoint should be called when you want to completely cancel a virtual card you created using the IssueLite endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    try {
      CardCancelVirtualCardResponse result = client
              .card
              .cancelVirtualCard()
              .execute();
      System.out.println(result);
      System.out.println(result.getCardHolder());
      System.out.println(result.getCard());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#cancelVirtualCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardCancelVirtualCardResponse> response = client
              .card
              .cancelVirtualCard()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#cancelVirtualCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardCancelVirtualCardResponse**](CardCancelVirtualCardResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createLodgedCard"></a>
# **createLodgedCard**
> Object createLodgedCard().cardCreateLodgedCardRequest(cardCreateLodgedCardRequest).execute();

Issue Lodged Card

Use this endpoint to create a Lodged Card

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String merchantGuid = "merchantGuid_example"; // Merchant's guid. Application level value that indicates a virtual card is being requested for clients account. Value provided by ConnexPay.
    String firstName = "firstName_example"; // Cardholder's first name. This is the first name placed on the virtual card provided to the supplier. The value is also searchable in the ConnexPay portal.
    String lastName = "lastName_example"; // Cardholder's last name. This is the last name placed on the virtual card provided to the supplier. The value is also searchable in the ConnexPay portal.
    Float amountLimit = 3.4F; // Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined.
    String limitWindow = "limitWindow_example"; // This is the time period that both the UsageLimit and the AmountLimit applies. Options are: Day, Week, Month, Lifetime. For example AmountLimit is $500 and LimitWindow is \\\"Week\\\" then the card can be approved for $500 per week.
    String phone = "phone_example"; // Cardholder's phone number. Phone number up to 20 character string, numbers and plus sign (+) allowed only. Telephone number of the user (including area code), prepended by the + symbol and the 1- to 3-digit country calling code. Do not include hyphens, spaces, or parentheses.
    String address1 = "address1_example"; // Cardholder's address line 1. The street number is used by the supplier when submitting the transaction to perform an AVS check. Alphanumerics and [,.-'] are allowed.
    String address2 = "address2_example"; // Cardholder's address line 2. Alphanumerics and [,.-'] are allowed.
    String city = "city_example"; // Cardholder's city.
    String state = "state_example"; // Cardholder's short name state.  The ISO 3166-2 CA and US state or province code of a user. Length = 2. If a non U.S. or Canadian value is submitted the virtual card request will not be processed and an error response returned.
    String zipCode = "zipCode_example"; // Cardholder's zipcode. The zip code is used by the supplier when submitting the transaction to perform an AVS check.  The Zipcode must be between 1 and 10 characters long, only numbers and letters are allowed.
    String country = "country_example"; // Cardholder's country.  Only alpha-2 digit country code allowed and numbers are not allowed.  See ISO-3166 country list of Alpha-2 country codes (https://www.iso.org/obp/ui/) .
    Long usageLimit = 56L; // Security Control: Maximum number of times the card may be authorized. This is used in conjunction with the Limit Window: for example, if you specify a Usage Limit of 4 and a Limit Window of Monthly, the card can be authorized up to 4 times per month. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined.
    LocalDate expirationDate = LocalDate.now(); // The ExpirationDate (YYYY-MM-DD) is the date to be provided to the supplier as the actual expiration date for the virtual card. The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed to avoid acceptance issues.  The expiration date cannot be more than 36 months in the future. If an expiration date is not provided, the expiration will default to issue date plus three years. For cards issued outside of the US/Canada, the expiration date will default to issue date plus three years and can not be overwritten - even if this parameter is included in the request. Note, Returns can still be processed on expired or terminated VCCs.
    LocalDate terminateDate = LocalDate.now(); // The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated VCCs.
    String purchaseType = "purchaseType_example"; // Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: '01' (Airline), '02' (Hotels and Resorts), '03' (Car Rental), '04' (Cable, Satellite, Television, and Radio Services),  '05' (Cruise Lines), '11' (Medical Services and Health Practitioners), '21' (Advertising Services), '22' (Misc Advertising and Business Services), '23' (Ticketing), '31' (Insurance Sales, Underwriting, and Premiums), '91' (Restaurants and Food Services), and '93' (Tax Payments). Leave this blank if you plan to utilize MID level controls.
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    String orderNumber = "orderNumber_example"; // This is the most common number you'll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters and allows dashes and spaces (\\\"-\\\", \\\" \\\").
    String supplierId = "supplierId_example"; // The SupplierId is used to assist with Intelligent Routing functionality. In many cases, a Lodged Card is used at several different suppliers. In this case, there may be no reason to include SupplierId. However, if the Lodged Card will be used at a single supplier, we recommend sending in the SupplierId to assist with acceptance and rebate. The field accepts up to 100 alpha-numeric characters.
    Boolean nonDomesticSupplier = true; // We can issue the “Global VCC” if the Supplier accepting that VCC has an overseas merchant account. This is an optional field. Indicating true will result in issuing this Global VCC. Indicating false (or not including this property in your request) will result in receiving a VCC created for domestic use.
    CardCreateLodgedCardRequestTransmission transmission = new CardCreateLodgedCardRequestTransmission();
    Boolean returnCardData = true; // Optional field that may be set to true or false. When set to a value of true or if the field is not provided at all, card data is returned in the response. When set to a value of false, the Card Account Number and Security Code (CVV) will be excluded from the response.
    String customerID = "customerID_example"; // Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 50 characters and is alpha-numeric.
    String associationId = "associationId_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    List<String> labelIDs = Arrays.asList(); // Utilize Label IDs to associate a lodged card to a specific label(s) within ConnexPay Bridge UI for your organization. If a lodged card is tied to an incorrect Label, it will not filter or display correctly in Bridge's Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use.
    List<CardIssuanceCreateVirtualCardRequestCustomParametersInner> customParameters = Arrays.asList(); // You can add custom parameters to your issue card request in the event that you need to associate additional information with the virtual card. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter = \\\"invoice\\\" and the value parameter as the invoice number. This requires customized reporting so you'll need to work with your implementations specialist to determine what's required.
    try {
      Object result = client
              .card
              .createLodgedCard(merchantGuid, firstName, lastName, amountLimit, limitWindow)
              .phone(phone)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .country(country)
              .usageLimit(usageLimit)
              .expirationDate(expirationDate)
              .terminateDate(terminateDate)
              .purchaseType(purchaseType)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .supplierId(supplierId)
              .nonDomesticSupplier(nonDomesticSupplier)
              .transmission(transmission)
              .returnCardData(returnCardData)
              .customerID(customerID)
              .associationId(associationId)
              .labelIDs(labelIDs)
              .customParameters(customParameters)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#createLodgedCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .card
              .createLodgedCard(merchantGuid, firstName, lastName, amountLimit, limitWindow)
              .phone(phone)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .country(country)
              .usageLimit(usageLimit)
              .expirationDate(expirationDate)
              .terminateDate(terminateDate)
              .purchaseType(purchaseType)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .supplierId(supplierId)
              .nonDomesticSupplier(nonDomesticSupplier)
              .transmission(transmission)
              .returnCardData(returnCardData)
              .customerID(customerID)
              .associationId(associationId)
              .labelIDs(labelIDs)
              .customParameters(customParameters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#createLodgedCard");
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
| **cardCreateLodgedCardRequest** | [**CardCreateLodgedCardRequest**](CardCreateLodgedCardRequest.md)|  | [optional] |

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

<a name="getDetail"></a>
# **getDetail**
> CardGetDetailResponse getDetail(cardGuid, showFullPan).execute();

Get Issue Card Detail

This Endpoint returns Virtual Credit Card details for a specific card guid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String cardGuid = "cardGuid_example"; // Global Unique Identifier for the VCC.
    Boolean showFullPan = true; // Set to True to indicate whether the response should include the full account number.
    try {
      CardGetDetailResponse result = client
              .card
              .getDetail(cardGuid, showFullPan)
              .execute();
      System.out.println(result);
      System.out.println(result.getCardGuid());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getExpiration());
      System.out.println(result.getTerminateDate());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getFirstSix());
      System.out.println(result.getLastFour());
      System.out.println(result.getNameLine1());
      System.out.println(result.getNameLine2());
      System.out.println(result.getStatus());
      System.out.println(result.getBank());
      System.out.println(result.getIssuedAmount());
      System.out.println(result.getCardType());
      System.out.println(result.getPurchaseType());
      System.out.println(result.getAvailableBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardGetDetailResponse> response = client
              .card
              .getDetail(cardGuid, showFullPan)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getDetail");
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
| **cardGuid** | **String**| Global Unique Identifier for the VCC. | |
| **showFullPan** | **Boolean**| Set to True to indicate whether the response should include the full account number. | |

### Return type

[**CardGetDetailResponse**](CardGetDetailResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="resendTransmissionInfo"></a>
# **resendTransmissionInfo**
> CardResendTransmissionInfoResponse resendTransmissionInfo(cardGuid).cardResendTransmissionInfoRequest(cardResendTransmissionInfoRequest).execute();

Resend Transmission

This endpoint resends payment information to recipient. Or returns a URL you can use within your application to direct a user to a visual representation of the virtual card.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    List<String> transmissionMethods = Arrays.asList(); // Methods of Transmission. Supported methods: Email, Link, Fax. Populate this parameter as 'Email' if you want to email the virtual card to a customer or supplier. Use the 'Link' option to have a URL included in the response.  Use the \\\"Fax\\\" option to fax the virtual card to a customer or supplier.
    String cardGuid = "cardGuid_example"; // Global Unique Identififer for the Card.
    String emailRecipient = "emailRecipient_example"; // Mandatory when transmission is Email. Otherwise don't include. This is the email address of the intended recipient. 255 char max.
    String merchantPhoneNumber = "merchantPhoneNumber_example"; // This is the phone number that should display on the virtual card and is the number that should be used if the link has expired. Up to 15 characters. Numbers and plus sign (+) allowed only.
    String emailFrom = "emailFrom_example"; // For email transmissions, this will be the email address that populates the ‘reply to’ section of the email message. Do not include this parameter on other transmission method types. 255 char max.
    String recipientName = "recipientName_example"; // A descriptive name of the email or fax recipient. Does not apply to the Link transmission method type. 255 char max
    String subject = "subject_example"; // High-level subject line description of the transmission contents. Does not apply to the Link transmission method type. 255 char max.
    String message = "message_example"; // The message body of the email or fax. Does not apply to the Link transmission method type. 1024 char max.
    Integer daysToExpire = 56; // The number of days after card issuance until the link to the VC expires. Range: 1-999 days.
    String faxFrom = "faxFrom_example"; // Mandatory for fax transmission. This can be the client name or fax number the fax is coming from that populates the ‘FaxFrom’ section of the fax. 255 char max.
    String faxRecipient = "faxRecipient_example"; // Mandatory for fax transmissions.  The fax number of the intended recipient.
    try {
      CardResendTransmissionInfoResponse result = client
              .card
              .resendTransmissionInfo(transmissionMethods, cardGuid)
              .emailRecipient(emailRecipient)
              .merchantPhoneNumber(merchantPhoneNumber)
              .emailFrom(emailFrom)
              .recipientName(recipientName)
              .subject(subject)
              .message(message)
              .daysToExpire(daysToExpire)
              .faxFrom(faxFrom)
              .faxRecipient(faxRecipient)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinkToCard());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#resendTransmissionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardResendTransmissionInfoResponse> response = client
              .card
              .resendTransmissionInfo(transmissionMethods, cardGuid)
              .emailRecipient(emailRecipient)
              .merchantPhoneNumber(merchantPhoneNumber)
              .emailFrom(emailFrom)
              .recipientName(recipientName)
              .subject(subject)
              .message(message)
              .daysToExpire(daysToExpire)
              .faxFrom(faxFrom)
              .faxRecipient(faxRecipient)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#resendTransmissionInfo");
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
| **cardGuid** | **String**| Global Unique Identififer for the Card. | |
| **cardResendTransmissionInfoRequest** | [**CardResendTransmissionInfoRequest**](CardResendTransmissionInfoRequest.md)|  | [optional] |

### Return type

[**CardResendTransmissionInfoResponse**](CardResendTransmissionInfoResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="searchIssuedVirtualCards"></a>
# **searchIssuedVirtualCards**
> String searchIssuedVirtualCards(pageNumber, pageSize).cardSearchIssuedVirtualCardsRequest(cardSearchIssuedVirtualCardsRequest).execute();

Search Issued Cards

This endpoint searches for Issued Virtual Cards.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String merchantGuid = "merchantGuid_example"; // Your assigned Merchant GUID.
    Integer pageNumber = 56; // Number of page of the results. Default is 1.
    Integer pageSize = 56; // Size of each page of the results. Default is 1000.
    String saleGuid = "saleGuid_example"; // Sale GUID linked to the card you are searching.
    String incomingTransactionCode = "incomingTransactionCode_example"; // Incoming Transaction Code linked to the card you are searching.
    String orderNumber = "orderNumber_example"; // Order Number linked to the card you are searching.
    String customerID = "customerID_example"; // Order Number linked to the card you are searching.
    LocalDate timeStampFrom = LocalDate.now(); // Starting Issued Date linked to the card(s) you are searching.
    LocalDate timeStampTo = LocalDate.now(); // Ending Issued Date linked to the card(s) you are searching.
    Float issuedAmountFrom = 3.4F; // Start of Issued Amount range linked to the card(s) you are searching.
    Float issuedAmountTo = 3.4F; // End of Issued Amount range linked to the card(s) you are searching.
    String outgoingTransactionCode = "outgoingTransactionCode_example"; // Outgoing Transaction Code linked to the card(s) you are searching.
    Long settledAmountFrom = 56L; // Start of Settled Amount range linked to the card(s) you are searching.
    Long settledAmountTo = 56L; // End of Settled Amount range linked to the card(s) you are searching.
    Long returnedAmountFrom = 56L; // Start of Settled Returned Amount range linked to the card(s) you are searching.
    Long returnedAmountTo = 56L; // End of Settled Returned Amount range linked to the card(s) you are searching.
    try {
      String result = client
              .card
              .searchIssuedVirtualCards(merchantGuid, pageNumber, pageSize)
              .saleGuid(saleGuid)
              .incomingTransactionCode(incomingTransactionCode)
              .orderNumber(orderNumber)
              .customerID(customerID)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .issuedAmountFrom(issuedAmountFrom)
              .issuedAmountTo(issuedAmountTo)
              .outgoingTransactionCode(outgoingTransactionCode)
              .settledAmountFrom(settledAmountFrom)
              .settledAmountTo(settledAmountTo)
              .returnedAmountFrom(returnedAmountFrom)
              .returnedAmountTo(returnedAmountTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#searchIssuedVirtualCards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .card
              .searchIssuedVirtualCards(merchantGuid, pageNumber, pageSize)
              .saleGuid(saleGuid)
              .incomingTransactionCode(incomingTransactionCode)
              .orderNumber(orderNumber)
              .customerID(customerID)
              .timeStampFrom(timeStampFrom)
              .timeStampTo(timeStampTo)
              .issuedAmountFrom(issuedAmountFrom)
              .issuedAmountTo(issuedAmountTo)
              .outgoingTransactionCode(outgoingTransactionCode)
              .settledAmountFrom(settledAmountFrom)
              .settledAmountTo(settledAmountTo)
              .returnedAmountFrom(returnedAmountFrom)
              .returnedAmountTo(returnedAmountTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#searchIssuedVirtualCards");
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
| **pageNumber** | **Integer**| Number of page of the results. Default is 1. | |
| **pageSize** | **Integer**| Size of each page of the results. Default is 1000. | |
| **cardSearchIssuedVirtualCardsRequest** | [**CardSearchIssuedVirtualCardsRequest**](CardSearchIssuedVirtualCardsRequest.md)|  | [optional] |

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

<a name="terminateByDate"></a>
# **terminateByDate**
> CardTerminateByDateResponse terminateByDate(guid).execute();

Terminate Card

The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  ExpirationDate is the month and year that will be applied to the actual VCC. Note, Returns can still be processed on terminated VCCs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String guid = "guid_example"; // Card’s guid to terminate
    try {
      CardTerminateByDateResponse result = client
              .card
              .terminateByDate(guid)
              .execute();
      System.out.println(result);
      System.out.println(result.getCardGuid());
      System.out.println(result.getAmountLimit());
      System.out.println(result.getUsageLimit());
      System.out.println(result.getLimitWindow());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getExpiration());
      System.out.println(result.getTerminateDate());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getFirstSix());
      System.out.println(result.getLastFour());
      System.out.println(result.getNameLine1());
      System.out.println(result.getNameLine2());
      System.out.println(result.getStatus());
      System.out.println(result.getCustomerServicePhoneNumber());
      System.out.println(result.getSequenceNumber());
      System.out.println(result.getCardType());
      System.out.println(result.getGatewayMerchantGuid());
      System.out.println(result.getAvailableBalance());
      System.out.println(result.getIsPhysical());
      System.out.println(result.getIsLodged());
      System.out.println(result.getFingerprint());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#terminateByDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardTerminateByDateResponse> response = client
              .card
              .terminateByDate(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#terminateByDate");
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
| **guid** | **String**| Card’s guid to terminate | |

### Return type

[**CardTerminateByDateResponse**](CardTerminateByDateResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateCardDetails"></a>
# **updateCardDetails**
> CardUpdateCardDetailsResponse updateCardDetails(cardGuid).cardUpdateCardDetailsRequest(cardUpdateCardDetailsRequest).execute();

Update Card



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String cardGuid = "cardGuid_example"; // Global Unique Identififer for the Card.
    String purchaseType = "purchaseType_example"; // Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: '01' (Airline), '02' (Hotels and Resorts), '03' (Car Rental), '04' (Cable, Satellite, Television, and Radio Services),  '05' (Cruise Lines), '11' (Medical Services and Health Practitioners), '21' (Advertising Services), '22' (Misc Advertising and Business Services), '23' (Ticketing), '31' (Insurance Sales, Underwriting, and Premiums), '91' (Restaurants and Food Services), and '93' (Tax Payments). Leave this blank if you plan to utilize MID level controls.
    List<String> miDWhitelist = Arrays.asList(); // MID = Merchant ID. Whitelisted MIDs are a supplement to Purchase Type. Utilize if you have a supplier MID(s) where the card can be used if that MID is categorized in an MCC other than the Purchase Type selected. Or use instead of Purchase Type. (e.g., ['273154000108778', '900074LKM'])
    List<String> miDBlacklist = Arrays.asList(); // MID = Merchant ID. The list of MIDs where the virtual card will always be DECLINED regardless of PurchaseType or MIDWhitelist. MIDBlacklist overrides all other specifications. (eg. ['273594000108778'].)
    Integer usageLimit = 56; // Security Control: Maximum number of times the card may be authorized. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined. Even though a virtual card is often considered a “one-time-use” card, some suppliers may need to authorize a card multiple times (pre-authorizations, a purchase comprised of multiple tickets, etc.) and you may consider a value that is not overly restrictive to avoid unwanted declines.
    String associationId = "associationId_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    LocalDate terminateDate = LocalDate.now(); // The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated VCCs.
    Float amountLimit = 3.4F; // Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined.
    try {
      CardUpdateCardDetailsResponse result = client
              .card
              .updateCardDetails(cardGuid)
              .purchaseType(purchaseType)
              .miDWhitelist(miDWhitelist)
              .miDBlacklist(miDBlacklist)
              .usageLimit(usageLimit)
              .associationId(associationId)
              .terminateDate(terminateDate)
              .amountLimit(amountLimit)
              .execute();
      System.out.println(result);
      System.out.println(result.getCard());
      System.out.println(result.getMccGroupName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardUpdateCardDetailsResponse> response = client
              .card
              .updateCardDetails(cardGuid)
              .purchaseType(purchaseType)
              .miDWhitelist(miDWhitelist)
              .miDBlacklist(miDBlacklist)
              .usageLimit(usageLimit)
              .associationId(associationId)
              .terminateDate(terminateDate)
              .amountLimit(amountLimit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateCardDetails");
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
| **cardGuid** | **String**| Global Unique Identififer for the Card. | |
| **cardUpdateCardDetailsRequest** | [**CardUpdateCardDetailsRequest**](CardUpdateCardDetailsRequest.md)|  | [optional] |

### Return type

[**CardUpdateCardDetailsResponse**](CardUpdateCardDetailsResponse.md)

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
> CardUpdateDelayedActivationResponse updateDelayedActivation(cardGuid).cardUpdateDelayedActivationRequest(cardUpdateDelayedActivationRequest).execute();

Update Virtual Card with Delayed Activation

Request this endpoint to update the activation date or card limit of a virtual card with a future activation date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String merchantGuid = "merchantGuid_example"; // Merchant's guid. Application level value that indicates a virtual card is being requested for clients account. Value provided by ConnexPay.
    String cardGuid = "cardGuid_example"; // Global Unique Identifier for the Card.
    LocalDate activationDate = LocalDate.now(); // Provide a future date, up to 600 days, if you wish to update the virtual card's activation date. Otherwise leave blank.
    Float amountLimit = 3.4F; // Provide a card amount if you wish to update the amount limit for the virtual card, otherwise leave blank.
    LocalDate terminateDate = LocalDate.now(); // The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  ExpirationDate is the month and year that will be applied to the actual VCC. The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. Note, Returns can still be processed on terminated VCCs.
    try {
      CardUpdateDelayedActivationResponse result = client
              .card
              .updateDelayedActivation(merchantGuid, cardGuid)
              .activationDate(activationDate)
              .amountLimit(amountLimit)
              .terminateDate(terminateDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getCardHolder());
      System.out.println(result.getCard());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDelayedActivation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardUpdateDelayedActivationResponse> response = client
              .card
              .updateDelayedActivation(merchantGuid, cardGuid)
              .activationDate(activationDate)
              .amountLimit(amountLimit)
              .terminateDate(terminateDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDelayedActivation");
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
| **cardGuid** | **String**| Global Unique Identifier for the Card. | |
| **cardUpdateDelayedActivationRequest** | [**CardUpdateDelayedActivationRequest**](CardUpdateDelayedActivationRequest.md)|  | [optional] |

### Return type

[**CardUpdateDelayedActivationResponse**](CardUpdateDelayedActivationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateLodgedCard"></a>
# **updateLodgedCard**
> CardUpdateLodgedCardResponse updateLodgedCard(cardGuid).cardUpdateLodgedCardRequest(cardUpdateLodgedCardRequest).execute();

Update Lodged Card



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String cardGuid = "cardGuid_example"; // Global Unique Identifier for the Card.
    Long usageLimit = 56L; // Security Control: Maximum number of times the card may be authorized. This is used in conjunction with the Limit Window; for example, if you specify a Usage Limit of 4 and a Limit Window of Monthly, the card can be authorized up to 4 times per month. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined.
    Float amountLimit = 3.4F; // Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined.
    String limitWindow = "limitWindow_example"; // This is the time period that both the UsageLimit and the AmountLimit applies. Options are: Day, Week, Month, Lifetime. For example AmountLimit is $500 and LimitWindow is \\\"Week\\\" then the card can be approved for $500 per week.
    String purchaseType = "purchaseType_example"; // Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: '01' (Airline), '02' (Hotels and Resorts), '03' (Car Rental), '04' (Cable, Satellite, Television, and Radio Services),  '05' (Cruise Lines), '11' (Medical Services and Health Practitioners), '21' (Advertising Services), '22' (Misc Advertising and Business Services), '23' (Ticketing), '31' (Insurance Sales, Underwriting, and Premiums), '91' (Restaurants and Food Services), and '93' (Tax Payments). Leave this blank if you plan to utilize MID level controls.
    Boolean activated = true; // True activates a lodged card. False suspends a lodged card.
    String associationId = "associationId_example"; // Utilize the Association ID field to tie a lodged card to a sale or sales. For example, if you have several sales and one lodged card payment to a supplier, you can add association ID to the sales and the lodged card for downstream reporting.
    LocalDate terminateDate = LocalDate.now(); // The TerminateDate (YYYY-MM-DD format) is the date the Lodged Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the Lodged Card is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated Lodged Cards.
    try {
      CardUpdateLodgedCardResponse result = client
              .card
              .updateLodgedCard(cardGuid)
              .usageLimit(usageLimit)
              .amountLimit(amountLimit)
              .limitWindow(limitWindow)
              .purchaseType(purchaseType)
              .activated(activated)
              .associationId(associationId)
              .terminateDate(terminateDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getCard());
      System.out.println(result.getMccGroupName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateLodgedCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardUpdateLodgedCardResponse> response = client
              .card
              .updateLodgedCard(cardGuid)
              .usageLimit(usageLimit)
              .amountLimit(amountLimit)
              .limitWindow(limitWindow)
              .purchaseType(purchaseType)
              .activated(activated)
              .associationId(associationId)
              .terminateDate(terminateDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateLodgedCard");
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
| **cardGuid** | **String**| Global Unique Identifier for the Card. | |
| **cardUpdateLodgedCardRequest** | [**CardUpdateLodgedCardRequest**](CardUpdateLodgedCardRequest.md)|  | [optional] |

### Return type

[**CardUpdateLodgedCardResponse**](CardUpdateLodgedCardResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

