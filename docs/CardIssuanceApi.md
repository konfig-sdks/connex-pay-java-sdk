# CardIssuanceApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVirtualCard**](CardIssuanceApi.md#createVirtualCard) | **POST** /api/v1/IssueCard | Issue Card |


<a name="createVirtualCard"></a>
# **createVirtualCard**
> String createVirtualCard().cardIssuanceCreateVirtualCardRequest(cardIssuanceCreateVirtualCardRequest).execute();

Issue Card

Use this endpoint to issue virtual cards associated with a credit or ACH sale. Do not use this endpoint if you fund your virtual cards from cash and therefor don&#39;t have an associated sale. If you aren&#39;t sure which Issuance API to use, please contact your client support representative.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardIssuanceApi;
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
    String merchantGuid = "merchantGuid_example"; // Merchant's Guid. Application-level value that indicates a virtual card is being requested for client's account. Value provided by ConnexPay.
    String firstName = "firstName_example"; // Cardholder's first name. This is the first name placed on the virtual card provided to the supplier. The value is also searchable in the ConnexPay portal.
    String lastName = "lastName_example"; // Cardholder's last name. This is the last name placed on the virtual card provided to the supplier. The value is also searchable in the ConnexPay portal.
    Float amountLimit = 3.4F; // Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined.
    String purchaseType = "purchaseType_example"; // Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: '01' (Airline), '02' (Hotels and Resorts), '03' (Car Rental), '04' (Cable, Satellite, Television, and Radio Services),  '05' (Cruise Lines), '11' (Medical Services and Health Practitioners), '21' (Advertising Services), '22' (Misc Advertising and Business Services), '23' (Ticketing), '31' (Insurance Sales, Underwriting, and Premiums), '91' (Restaurants and Food Services), and '93' (Tax Payments). Leave this blank if you plan to utilize MID level controls.
    String phone = "phone_example"; // Cardholder's phone number. Phone number up to 20 character string, numbers and plus sign (+) allowed only. Telephone number of the user (including area code), prepended by the + symbol and the 1- to 3-digit country calling code. Do not include hyphens, spaces, or parentheses.
    String address1 = "address1_example"; // Cardholder's address line 1. The street number is used by the supplier when submitting the transaction to perform an AVS check. Alphanumerics and [,.-'] are allowed.
    String address2 = "address2_example"; // Cardholder's address line 2. Alphanumerics and [,.-'] are allowed.
    String city = "city_example"; // Cardholder's city.
    String state = "state_example"; // Cardholder's short name state.  The ISO 3166-2 CA and US state or province code of a user. Length = 2. If a non U.S. or Canadian value is submitted the virtual card request will not be processed and an error response returned.
    String zipCode = "zipCode_example"; // Cardholder's zipcode. The zip code is used by the supplier when submitting the transaction to perform an AVS check.  The Zipcode must be between 1 and 10 characters long, only numbers and letters are allowed.
    String country = "country_example"; // Cardholder's country.  Only alpha-2 digit country code allowed and numbers are not allowed.  See ISO-3166 country list of Alpha-2 country codes (https://www.iso.org/obp/ui/) .
    Long usageLimit = 56L; // Security Control: Maximum number of times the card may be authorized. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined. Even though a virtual card is often considered a “one-time-use” card, some suppliers may need to authorize a card multiple times (pre-authorizations, a purchase comprised of multiple tickets, etc.) and you may consider a value that is not overly restrictive to avoid unwanted declines.
    LocalDate expirationDate = LocalDate.now(); // The ExpirationDate (YYYY-MM-DD) is the date to be provided to the supplier as the actual expiration date for the virtual card. The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed to avoid acceptance issues.  The expiration date cannot be more than 36 months in the future. If an expiration date is not provided, the expiration will default to issue date plus three years. For cards issued outside of the US/Canada, the expiration date will default to issue date plus three years and can not be overwritten - even if this parameter is included in the request. Note, Returns can still be processed on expired or terminated VCCs.
    LocalDate terminateDate = LocalDate.now(); // The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated VCCs.
    List<String> miDWhitelist = Arrays.asList(); // MID = Merchant ID. Whitelisted MIDs are a supplement to Purchase Type. Utilize if you have a supplier MID(s) where the card can be used if that MID is categorized in an MCC other than the Purchase Type selected. Or use instead of Purchase Type. (eg. ['273514000108778', '900074KLM'])
    List<String> miDBlacklist = Arrays.asList(); // MID = Merchant ID. The list of MIDs where the virtual card will always be DECLINED regardless of PurchaseType or MIDWhitelist. MIDBlacklist overrides all other specifications. (eg. ['273594000108778'].)
    String sequenceNumber = "sequenceNumber_example"; // Transaction sequence number within client environment. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
    String orderNumber = "{{OrderNumber}}"; // This is the most common number you'll see throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field. The maximum length is 50 alpha-numeric characters and allows dashes ( - ).
    String incomingTransactionCode = "incomingTransactionCode_example"; // ITC for short Application level setting to associate the virtual card request with an original sale or sale group. The value is provided in the sale response of the original sale transaction, or in the Group Sale response of the group sale. All virtual card requests must be associated with an original sale or group transaction.
    String supplierId = "supplierId_example"; // The SupplierId is used to assist with Intelligent Routing functionality. The field accepts up to 100 alpha-numeric characters.  Alphanumeric with a max length of 100 characters
    Boolean nonDomesticSupplier = true; // We can issue the “Global VCC” if the Supplier accepting that VCC has an overseas merchant account. This is an optional field. Indicating true will result in issuing this Global VCC. Indicating false (or not including this property in your request) will result in receiving a VCC created for domestic use.
    CardIssuanceCreateVirtualCardRequestTransmission transmission = new CardIssuanceCreateVirtualCardRequestTransmission();
    Boolean returnCardData = true; // Optional field that may be set to true or false. When set to a value of true or if the field is not provided at all, card data is returned in the response. When set to a value of false, the Card Account Number and Security Code (CVV) will be excluded from the response.
    String customerID = "customerID_example"; // Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 100 characters and is alpha-numeric.
    String associationId = "associationId_example"; // Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting.
    List<CardIssuanceCreateVirtualCardRequestCustomParametersInner> customParameters = Arrays.asList(); // You can add custom parameters to your issue card request in the event that you need to associate additional information with the virtual card. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter = \\\"invoice\\\" and the value parameter as the invoice number. This requires customized reporting so you'll need to work with your implementations specialist to determine what's required.
    List<String> labelIDs = Arrays.asList(); // Utilize Label IDs to associate a virtual card to a specific label(s) within ConnexPay Bridge UI for your organization. If a virtual card is tied to an incorrect Label, it will not filter or display correctly in Bridge's Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use.
    try {
      String result = client
              .cardIssuance
              .createVirtualCard(merchantGuid, firstName, lastName, amountLimit, purchaseType)
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
              .miDWhitelist(miDWhitelist)
              .miDBlacklist(miDBlacklist)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .incomingTransactionCode(incomingTransactionCode)
              .supplierId(supplierId)
              .nonDomesticSupplier(nonDomesticSupplier)
              .transmission(transmission)
              .returnCardData(returnCardData)
              .customerID(customerID)
              .associationId(associationId)
              .customParameters(customParameters)
              .labelIDs(labelIDs)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardIssuanceApi#createVirtualCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .cardIssuance
              .createVirtualCard(merchantGuid, firstName, lastName, amountLimit, purchaseType)
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
              .miDWhitelist(miDWhitelist)
              .miDBlacklist(miDBlacklist)
              .sequenceNumber(sequenceNumber)
              .orderNumber(orderNumber)
              .incomingTransactionCode(incomingTransactionCode)
              .supplierId(supplierId)
              .nonDomesticSupplier(nonDomesticSupplier)
              .transmission(transmission)
              .returnCardData(returnCardData)
              .customerID(customerID)
              .associationId(associationId)
              .customParameters(customParameters)
              .labelIDs(labelIDs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardIssuanceApi#createVirtualCard");
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
| **cardIssuanceCreateVirtualCardRequest** | [**CardIssuanceCreateVirtualCardRequest**](CardIssuanceCreateVirtualCardRequest.md)|  | [optional] |

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

