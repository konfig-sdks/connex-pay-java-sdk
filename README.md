<div align="center">

[![Visit Connexpay](./header.png)](https://connexpay.com&#x2F;)

# [Connexpay](https://connexpay.com&#x2F;)

REST API for retrieving reporting data. Currently Daily Accounting data only.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ConnexPay&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>connex-pay-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:connex-pay-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/connex-pay-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AchApi* | [**createCreditPayment**](docs/AchApi.md#createCreditPayment) | **POST** /api/v1/IssueACH/IssueLite | Issue ACH Lite
*AccountingApi* | [**getDailyDetail**](docs/AccountingApi.md#getDailyDetail) | **GET** /api/v1/Accounting/DailyDetail | Get Daily Accounting Detail
*AccountingApi* | [**getDailySummary**](docs/AccountingApi.md#getDailySummary) | **GET** /api/v1/Accounting/DailySummary | Get Daily Accounting Summary
*AddendumApi* | [**createAchPurchase**](docs/AddendumApi.md#createAchPurchase) | **POST** /api/v1/Addendum/ACH | ACH Purchase Addendum
*AddendumApi* | [**createVirtualCard**](docs/AddendumApi.md#createVirtualCard) | **POST** /api/v1/Addendum/VirtualCard | Virtual Card Addendum
*AddendumApi* | [**deleteItem**](docs/AddendumApi.md#deleteItem) | **POST** /v1/Addendum/Remove/&lt;guid&gt; | Addendum Remove
*AuthenticationApi* | [**acquireClientAuthorization**](docs/AuthenticationApi.md#acquireClientAuthorization) | **POST** /api/v1/authonlys | Auth Only
*AuthenticationApi* | [**obtain3dSecureAuthentication**](docs/AuthenticationApi.md#obtain3dSecureAuthentication) | **POST** /api/v1/3ds | 3DS Authentication
*CancellationApi* | [**entireTripCancellation**](docs/CancellationApi.md#entireTripCancellation) | **POST** /api/v1/cancel | Cancel
*CardApi* | [**activateDelayed**](docs/CardApi.md#activateDelayed) | **PUT** /api/v1/IssueCard/ActivateDelayedCard/{{CardGuid}} | Activate Virtual Card with Delayed Activation
*CardApi* | [**cancelVirtualCard**](docs/CardApi.md#cancelVirtualCard) | **PUT** /api/v1/IssueCard/Cancel/{{CardGuid}} | Cancel Card
*CardApi* | [**createLodgedCard**](docs/CardApi.md#createLodgedCard) | **POST** /api/v1/IssueCard/LodgedCard | Issue Lodged Card
*CardApi* | [**getDetail**](docs/CardApi.md#getDetail) | **GET** /api/v1/Cards/{CardGuid}/{ShowFullPan} | Get Issue Card Detail
*CardApi* | [**resendTransmissionInfo**](docs/CardApi.md#resendTransmissionInfo) | **PUT** /api/v1/IssueCard/SendPaymentInfo/{cardGuid} | Resend Transmission
*CardApi* | [**searchIssuedVirtualCards**](docs/CardApi.md#searchIssuedVirtualCards) | **POST** /api/v1/Search/IssuedCards | Search Issued Cards
*CardApi* | [**terminateByDate**](docs/CardApi.md#terminateByDate) | **POST** /api/v1/TerminateCard/&lt;guid&gt; | Terminate Card
*CardApi* | [**updateCardDetails**](docs/CardApi.md#updateCardDetails) | **PUT** /api/v1/IssueCard/{cardGuid} | Update Card
*CardApi* | [**updateDelayedActivation**](docs/CardApi.md#updateDelayedActivation) | **PUT** /api/v1/IssueCard/UpdateDelayedCard/{{CardGuid}} | Update Virtual Card with Delayed Activation
*CardApi* | [**updateLodgedCard**](docs/CardApi.md#updateLodgedCard) | **PUT** /api/v1/IssueCard/LodgedCard/{CardGuid} | Update Lodged Card
*CardIssuanceApi* | [**createVirtualCard**](docs/CardIssuanceApi.md#createVirtualCard) | **POST** /api/v1/IssueCard | Issue Card
*CardIssueApi* | [**createVirtualCardLite**](docs/CardIssueApi.md#createVirtualCardLite) | **POST** /api/v1/IssueCard/IssueLite | Issue Lite
*FundingApi* | [**merchantCashBalance**](docs/FundingApi.md#merchantCashBalance) | **POST** /api/v1/MerchantSelfServiceFunding | Client Self-Service Funding
*FundingApi* | [**transferMerchantCashBalance**](docs/FundingApi.md#transferMerchantCashBalance) | **POST** /api/v1/MerchantFlexFunding/Funds/Transfer | Client Funds Transfer
*FundsApi* | [**getAvailableDetails**](docs/FundsApi.md#getAvailableDetails) | **GET** /api/v1/Search/AvailableFunds/{merchantGuid} | Available Funds
*MerchantPayeesApi* | [**createPayee**](docs/MerchantPayeesApi.md#createPayee) | **POST** /api/v1/Merchants/{merchantGuid}/Payees | Create merchant payee
*MerchantPayeesApi* | [**deletePayee**](docs/MerchantPayeesApi.md#deletePayee) | **DELETE** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Delete merchant payee
*MerchantPayeesApi* | [**getPayee**](docs/MerchantPayeesApi.md#getPayee) | **GET** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Get a merchant payee by guid
*MerchantPayeesApi* | [**getPayees**](docs/MerchantPayeesApi.md#getPayees) | **POST** /api/v1/Merchants/{merchantGuid}/Payees/Search/{page}/{pagesize} | Get merchant payees
*MerchantPayeesApi* | [**updatePayee**](docs/MerchantPayeesApi.md#updatePayee) | **PUT** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Update merchant payee
*PushToCardApi* | [**cancelPayments**](docs/PushToCardApi.md#cancelPayments) | **POST** /api/v1/PushToCard/Payouts/{payoutGuid}/Cancel | Cancel Payments
*PushToCardApi* | [**createPayee**](docs/PushToCardApi.md#createPayee) | **POST** /api/v1/PushToCard/Payees | Create Payee
*PushToCardApi* | [**createPayout**](docs/PushToCardApi.md#createPayout) | **POST** /api/v1/PushToCard/Payouts | Create Payout
*PushToCardApi* | [**getAuthenticationTokenAsync**](docs/PushToCardApi.md#getAuthenticationTokenAsync) | **GET** /api/v1/PushToCard/AuthenticatePaymentWidget | Get Authentication Token for DropInUI
*PushToCardApi* | [**getPayee**](docs/PushToCardApi.md#getPayee) | **GET** /api/v1/PushToCard/Payees | Get Payee
*PushToCardApi* | [**getPayoutDetails**](docs/PushToCardApi.md#getPayoutDetails) | **GET** /api/v1/PushToCard/Payouts/{payoutGuid} | Get Payout Details
*PushToCardApi* | [**managePayee**](docs/PushToCardApi.md#managePayee) | **PUT** /api/v1/PushToCard/Payees/{payeeGuid}/{status} | Manage Payee
*PushToCardApi* | [**pushFundsToCardAsync**](docs/PushToCardApi.md#pushFundsToCardAsync) | **PATCH** /api/v1/PushToCard/Payments/{ridGuid}/{cardId} | Push Funds to a Card
*PushToCardApi* | [**updatePayee**](docs/PushToCardApi.md#updatePayee) | **PATCH** /api/v1/PushToCard/Payees/{payeeGuid} | Update Payee
*ReplayApi* | [**purchaseEventHistoryResend**](docs/ReplayApi.md#purchaseEventHistoryResend) | **POST** /api/v1/PurchaseEventHistory/Resend | Purchase Event History (Replay Webhooks)
*ReturnApi* | [**itemRequest**](docs/ReturnApi.md#itemRequest) | **POST** /api/v1/returns | Return
*ReturnApi* | [**searchSaleReturns**](docs/ReturnApi.md#searchSaleReturns) | **POST** /api/v1/Search/Returns/{exportable}/{pageNumber}/{pageSize} | Search returns
*SaleApi* | [**activateDelayed**](docs/SaleApi.md#activateDelayed) | **PUT** /api/v1/sales/Activate/{SaleGuid} | Activate Delayed Sale
*SaleApi* | [**createTransaction**](docs/SaleApi.md#createTransaction) | **POST** /api/v1/sales | Create Sale
*SaleApi* | [**getChargebacksByUser**](docs/SaleApi.md#getChargebacksByUser) | **GET** /api/chargeback/GetByUser | Sales Chargebacks
*SaleApi* | [**searchSales**](docs/SaleApi.md#searchSales) | **POST** /api/v1/Search/Sales/{exportable}/{pageNumber}/{pageSize} | Search sales
*SaleApi* | [**updateDelayedActivation**](docs/SaleApi.md#updateDelayedActivation) | **POST** /api/v1/sales/UpdateFutureSale | Update Delayed Sale
*SettingApi* | [**tokenizeBankAccountInfo**](docs/SettingApi.md#tokenizeBankAccountInfo) | **POST** /api/v1/merchantsupplier/settings | Merchant Supplier Setting
*SettlementApi* | [**searchVirtualCardSettlements**](docs/SettlementApi.md#searchVirtualCardSettlements) | **POST** /api/v1/Search/Settlements | Search Settlements
*StatusGroupApi* | [**call3dsAuthenticationStatus**](docs/StatusGroupApi.md#call3dsAuthenticationStatus) | **GET** /api/v1/3ds/{GUID} | Get 3DS Status Group
*TokenApi* | [**generateReportingToken**](docs/TokenApi.md#generateReportingToken) | **POST** /api/v1/authenticate | Reporting Token
*TokenApi* | [**issueAuthenticationToken**](docs/TokenApi.md#issueAuthenticationToken) | **POST** /api/v1/token | Issuing Token
*TokenApi* | [**requestHppToken**](docs/TokenApi.md#requestHppToken) | **POST** /api/v1/HostedPaymentPageRequests | HPP Token Request
*TransactionApi* | [**captureAuthorization**](docs/TransactionApi.md#captureAuthorization) | **POST** /api/v1/Captures | Capture
*TransactionApi* | [**createAchCreditPayment**](docs/TransactionApi.md#createAchCreditPayment) | **POST** /api/v1/IssueACH | Issue ACH
*TransactionApi* | [**searchVirtualCardHistory**](docs/TransactionApi.md#searchVirtualCardHistory) | **GET** /api/v1/Cards/Transactions/{cardGuid} | Search Virtual Card History
*ValidationApi* | [**searchVerifyOperation**](docs/ValidationApi.md#searchVerifyOperation) | **POST** /api/v1/Search/Verify/{exportable}/{pageNumber}/{pageSize} | Search verify
*VerificationApi* | [**cardBankAccount**](docs/VerificationApi.md#cardBankAccount) | **POST** /api/v1/verify | Verify
*VoidApi* | [**createVoid**](docs/VoidApi.md#createVoid) | **POST** /api/v1/void | Void
*VoidApi* | [**searchVoids**](docs/VoidApi.md#searchVoids) | **POST** /api/v1/Search/Voids/{exportable}/{pageNumber}/{pageSize} | Search voids


## Documentation for Models

 - [AchCreateCreditPaymentRequest](docs/AchCreateCreditPaymentRequest.md)
 - [AchCreateCreditPaymentRequestAccountHolder](docs/AchCreateCreditPaymentRequestAccountHolder.md)
 - [AchCreateCreditPaymentResponse](docs/AchCreateCreditPaymentResponse.md)
 - [AddendumCreateAchPurchaseRequest](docs/AddendumCreateAchPurchaseRequest.md)
 - [AddendumCreateAchPurchaseResponse](docs/AddendumCreateAchPurchaseResponse.md)
 - [AddendumCreateVirtualCardRequest](docs/AddendumCreateVirtualCardRequest.md)
 - [AddendumCreateVirtualCardResponse](docs/AddendumCreateVirtualCardResponse.md)
 - [AddendumDeleteItemResponse](docs/AddendumDeleteItemResponse.md)
 - [AuthenticationAcquireClientAuthorizationRequest](docs/AuthenticationAcquireClientAuthorizationRequest.md)
 - [AuthenticationAcquireClientAuthorizationRequestBankAccount](docs/AuthenticationAcquireClientAuthorizationRequestBankAccount.md)
 - [AuthenticationAcquireClientAuthorizationRequestBrowserData](docs/AuthenticationAcquireClientAuthorizationRequestBrowserData.md)
 - [AuthenticationAcquireClientAuthorizationRequestCard](docs/AuthenticationAcquireClientAuthorizationRequestCard.md)
 - [AuthenticationAcquireClientAuthorizationRequestRiskData](docs/AuthenticationAcquireClientAuthorizationRequestRiskData.md)
 - [AuthenticationAcquireClientAuthorizationRequestRiskDataFlightData](docs/AuthenticationAcquireClientAuthorizationRequestRiskDataFlightData.md)
 - [AuthenticationAcquireClientAuthorizationRequestRiskDataFlightPassengersInner](docs/AuthenticationAcquireClientAuthorizationRequestRiskDataFlightPassengersInner.md)
 - [AuthenticationAcquireClientAuthorizationResponse](docs/AuthenticationAcquireClientAuthorizationResponse.md)
 - [AuthenticationAcquireClientAuthorizationResponseCard](docs/AuthenticationAcquireClientAuthorizationResponseCard.md)
 - [AuthenticationAcquireClientAuthorizationResponseCardCustomer](docs/AuthenticationAcquireClientAuthorizationResponseCardCustomer.md)
 - [AuthenticationAcquireClientAuthorizationResponseEnhancedData](docs/AuthenticationAcquireClientAuthorizationResponseEnhancedData.md)
 - [AuthenticationAcquireClientAuthorizationResponseRiskResponse](docs/AuthenticationAcquireClientAuthorizationResponseRiskResponse.md)
 - [AuthenticationObtain3DSecureAuthenticationRequest](docs/AuthenticationObtain3DSecureAuthenticationRequest.md)
 - [AuthenticationObtain3DSecureAuthenticationRequestBrowserData](docs/AuthenticationObtain3DSecureAuthenticationRequestBrowserData.md)
 - [AuthenticationObtain3DSecureAuthenticationRequestCard](docs/AuthenticationObtain3DSecureAuthenticationRequestCard.md)
 - [AuthenticationObtain3DSecureAuthenticationResponse](docs/AuthenticationObtain3DSecureAuthenticationResponse.md)
 - [AuthenticationObtain3DSecureAuthenticationResponseCard](docs/AuthenticationObtain3DSecureAuthenticationResponseCard.md)
 - [AuthenticationResult](docs/AuthenticationResult.md)
 - [CancelPaymentsDto](docs/CancelPaymentsDto.md)
 - [CancellationEntireTripCancellationRequest](docs/CancellationEntireTripCancellationRequest.md)
 - [CardActivateDelayedResponse](docs/CardActivateDelayedResponse.md)
 - [CardActivateDelayedResponseCard](docs/CardActivateDelayedResponseCard.md)
 - [CardActivateDelayedResponseCardHolder](docs/CardActivateDelayedResponseCardHolder.md)
 - [CardCancelVirtualCardResponse](docs/CardCancelVirtualCardResponse.md)
 - [CardCancelVirtualCardResponseCard](docs/CardCancelVirtualCardResponseCard.md)
 - [CardCancelVirtualCardResponseCardHolder](docs/CardCancelVirtualCardResponseCardHolder.md)
 - [CardCreateLodgedCardRequest](docs/CardCreateLodgedCardRequest.md)
 - [CardCreateLodgedCardRequestTransmission](docs/CardCreateLodgedCardRequestTransmission.md)
 - [CardGetDetailResponse](docs/CardGetDetailResponse.md)
 - [CardIssuanceCreateVirtualCardRequest](docs/CardIssuanceCreateVirtualCardRequest.md)
 - [CardIssuanceCreateVirtualCardRequestCustomParametersInner](docs/CardIssuanceCreateVirtualCardRequestCustomParametersInner.md)
 - [CardIssuanceCreateVirtualCardRequestTransmission](docs/CardIssuanceCreateVirtualCardRequestTransmission.md)
 - [CardIssueCreateVirtualCardLiteRequest](docs/CardIssueCreateVirtualCardLiteRequest.md)
 - [CardIssueCreateVirtualCardLiteRequestTransmission](docs/CardIssueCreateVirtualCardLiteRequestTransmission.md)
 - [CardResendTransmissionInfoRequest](docs/CardResendTransmissionInfoRequest.md)
 - [CardResendTransmissionInfoResponse](docs/CardResendTransmissionInfoResponse.md)
 - [CardSearchIssuedVirtualCardsRequest](docs/CardSearchIssuedVirtualCardsRequest.md)
 - [CardTerminateByDateResponse](docs/CardTerminateByDateResponse.md)
 - [CardUpdateCardDetailsRequest](docs/CardUpdateCardDetailsRequest.md)
 - [CardUpdateCardDetailsResponse](docs/CardUpdateCardDetailsResponse.md)
 - [CardUpdateCardDetailsResponseCard](docs/CardUpdateCardDetailsResponseCard.md)
 - [CardUpdateDelayedActivationRequest](docs/CardUpdateDelayedActivationRequest.md)
 - [CardUpdateDelayedActivationResponse](docs/CardUpdateDelayedActivationResponse.md)
 - [CardUpdateDelayedActivationResponseCard](docs/CardUpdateDelayedActivationResponseCard.md)
 - [CardUpdateDelayedActivationResponseCardHolder](docs/CardUpdateDelayedActivationResponseCardHolder.md)
 - [CardUpdateLodgedCardRequest](docs/CardUpdateLodgedCardRequest.md)
 - [CardUpdateLodgedCardResponse](docs/CardUpdateLodgedCardResponse.md)
 - [CardUpdateLodgedCardResponseCard](docs/CardUpdateLodgedCardResponseCard.md)
 - [DailyAccountingDetail](docs/DailyAccountingDetail.md)
 - [DailyAccountingDetailPaginatedItems](docs/DailyAccountingDetailPaginatedItems.md)
 - [DailyAccountingSummary](docs/DailyAccountingSummary.md)
 - [DtoPayments](docs/DtoPayments.md)
 - [DtoPayout](docs/DtoPayout.md)
 - [FundingMerchantCashBalanceRequest](docs/FundingMerchantCashBalanceRequest.md)
 - [FundingMerchantCashBalanceResponse](docs/FundingMerchantCashBalanceResponse.md)
 - [FundingMerchantCashBalanceResponseBankAccount](docs/FundingMerchantCashBalanceResponseBankAccount.md)
 - [FundingMerchantCashBalanceResponseBankAccountCustomer](docs/FundingMerchantCashBalanceResponseBankAccountCustomer.md)
 - [FundingTransferMerchantCashBalanceRequest](docs/FundingTransferMerchantCashBalanceRequest.md)
 - [FundingTransferMerchantCashBalanceResponse](docs/FundingTransferMerchantCashBalanceResponse.md)
 - [MerchantPayeeDto](docs/MerchantPayeeDto.md)
 - [MerchantPayeePaginatedResponse](docs/MerchantPayeePaginatedResponse.md)
 - [PayeeDto](docs/PayeeDto.md)
 - [PaymentsDto](docs/PaymentsDto.md)
 - [PayoutAuthResponse](docs/PayoutAuthResponse.md)
 - [PayoutDto](docs/PayoutDto.md)
 - [ReplayPurchaseEventHistoryResendRequest](docs/ReplayPurchaseEventHistoryResendRequest.md)
 - [ReturnItemRequestRequest](docs/ReturnItemRequestRequest.md)
 - [ReturnItemRequestRequestReturnRetryCard](docs/ReturnItemRequestRequestReturnRetryCard.md)
 - [ReturnItemRequestResponse](docs/ReturnItemRequestResponse.md)
 - [ReturnItemRequestResponseSale](docs/ReturnItemRequestResponseSale.md)
 - [ReturnItemRequestResponseSaleCard](docs/ReturnItemRequestResponseSaleCard.md)
 - [ReturnItemRequestResponseSaleCardCustomer](docs/ReturnItemRequestResponseSaleCardCustomer.md)
 - [ReturnSearchSaleReturnsRequest](docs/ReturnSearchSaleReturnsRequest.md)
 - [ReturnSearchSaleReturnsResponse](docs/ReturnSearchSaleReturnsResponse.md)
 - [ReturnSearchSaleReturnsResponseSearchResultDTOInner](docs/ReturnSearchSaleReturnsResponseSearchResultDTOInner.md)
 - [ReturnSearchSaleReturnsResponseSearchResultDTOInnerCard](docs/ReturnSearchSaleReturnsResponseSearchResultDTOInnerCard.md)
 - [SaleCreateTransaction201Response](docs/SaleCreateTransaction201Response.md)
 - [SaleCreateTransaction201ResponseBankAccount](docs/SaleCreateTransaction201ResponseBankAccount.md)
 - [SaleCreateTransaction201ResponseBankAccountCustomer](docs/SaleCreateTransaction201ResponseBankAccountCustomer.md)
 - [SaleCreateTransaction201ResponseConnexPayTransaction](docs/SaleCreateTransaction201ResponseConnexPayTransaction.md)
 - [SaleCreateTransactionRequest](docs/SaleCreateTransactionRequest.md)
 - [SaleCreateTransactionRequestBankAccount](docs/SaleCreateTransactionRequestBankAccount.md)
 - [SaleCreateTransactionRequestBankAccountCustomer](docs/SaleCreateTransactionRequestBankAccountCustomer.md)
 - [SaleCreateTransactionRequestBrowserData](docs/SaleCreateTransactionRequestBrowserData.md)
 - [SaleCreateTransactionRequestCard](docs/SaleCreateTransactionRequestCard.md)
 - [SaleCreateTransactionRequestCardCustomer](docs/SaleCreateTransactionRequestCardCustomer.md)
 - [SaleCreateTransactionRequestCardThreeDS](docs/SaleCreateTransactionRequestCardThreeDS.md)
 - [SaleCreateTransactionRequestConnexPayTransaction](docs/SaleCreateTransactionRequestConnexPayTransaction.md)
 - [SaleCreateTransactionRequestCustomParametersInner](docs/SaleCreateTransactionRequestCustomParametersInner.md)
 - [SaleCreateTransactionRequestCustomer](docs/SaleCreateTransactionRequestCustomer.md)
 - [SaleCreateTransactionRequestEnhancedData](docs/SaleCreateTransactionRequestEnhancedData.md)
 - [SaleCreateTransactionRequestRiskData](docs/SaleCreateTransactionRequestRiskData.md)
 - [SaleCreateTransactionRequestRiskDataFlightData](docs/SaleCreateTransactionRequestRiskDataFlightData.md)
 - [SaleCreateTransactionRequestRiskDataFlightPassengersInner](docs/SaleCreateTransactionRequestRiskDataFlightPassengersInner.md)
 - [SaleCreateTransactionResponse](docs/SaleCreateTransactionResponse.md)
 - [SaleCreateTransactionResponseCard](docs/SaleCreateTransactionResponseCard.md)
 - [SaleCreateTransactionResponseCardCustomer](docs/SaleCreateTransactionResponseCardCustomer.md)
 - [SaleCreateTransactionResponseCardThreeDS](docs/SaleCreateTransactionResponseCardThreeDS.md)
 - [SaleCreateTransactionResponseConnexPayTransaction](docs/SaleCreateTransactionResponseConnexPayTransaction.md)
 - [SaleCreateTransactionResponseRiskResponse](docs/SaleCreateTransactionResponseRiskResponse.md)
 - [SaleSearchSalesRequest](docs/SaleSearchSalesRequest.md)
 - [SaleSearchSalesResponse](docs/SaleSearchSalesResponse.md)
 - [SaleSearchSalesResponseSearchResultDTOInner](docs/SaleSearchSalesResponseSearchResultDTOInner.md)
 - [SaleSearchSalesResponseSearchResultDTOInnerCard](docs/SaleSearchSalesResponseSearchResultDTOInnerCard.md)
 - [SaleUpdateDelayedActivationRequest](docs/SaleUpdateDelayedActivationRequest.md)
 - [SearchMerchantPayeeDto](docs/SearchMerchantPayeeDto.md)
 - [SettingTokenizeBankAccountInfoRequest](docs/SettingTokenizeBankAccountInfoRequest.md)
 - [SettingTokenizeBankAccountInfoRequestAccountHolder](docs/SettingTokenizeBankAccountInfoRequestAccountHolder.md)
 - [SettingTokenizeBankAccountInfoResponse](docs/SettingTokenizeBankAccountInfoResponse.md)
 - [SettingTokenizeBankAccountInfoResponseAccountHolder](docs/SettingTokenizeBankAccountInfoResponseAccountHolder.md)
 - [SettingTokenizeBankAccountInfoResponseAccountHolderAddress](docs/SettingTokenizeBankAccountInfoResponseAccountHolderAddress.md)
 - [SettingTokenizeBankAccountInfoResponseAccountHolderBankAccount](docs/SettingTokenizeBankAccountInfoResponseAccountHolderBankAccount.md)
 - [SettlementSearchVirtualCardSettlementsRequest](docs/SettlementSearchVirtualCardSettlementsRequest.md)
 - [StatusGroup3DsAuthenticationStatusResponse](docs/StatusGroup3DsAuthenticationStatusResponse.md)
 - [StatusGroup3DsAuthenticationStatusResponseCard](docs/StatusGroup3DsAuthenticationStatusResponseCard.md)
 - [TokenGenerateReportingTokenRequest](docs/TokenGenerateReportingTokenRequest.md)
 - [TokenGenerateReportingTokenResponse](docs/TokenGenerateReportingTokenResponse.md)
 - [TokenIssueAuthenticationTokenRequest](docs/TokenIssueAuthenticationTokenRequest.md)
 - [TokenIssueAuthenticationTokenResponse](docs/TokenIssueAuthenticationTokenResponse.md)
 - [TokenRequestHppTokenRequest](docs/TokenRequestHppTokenRequest.md)
 - [TokenRequestHppTokenRequestSale](docs/TokenRequestHppTokenRequestSale.md)
 - [TokenRequestHppTokenResponse](docs/TokenRequestHppTokenResponse.md)
 - [TransactionCaptureAuthorizationRequest](docs/TransactionCaptureAuthorizationRequest.md)
 - [TransactionCaptureAuthorizationRequestConnexPayTransaction](docs/TransactionCaptureAuthorizationRequestConnexPayTransaction.md)
 - [TransactionCaptureAuthorizationResponse](docs/TransactionCaptureAuthorizationResponse.md)
 - [TransactionCaptureAuthorizationResponseSale](docs/TransactionCaptureAuthorizationResponseSale.md)
 - [TransactionCaptureAuthorizationResponseSaleCard](docs/TransactionCaptureAuthorizationResponseSaleCard.md)
 - [TransactionCaptureAuthorizationResponseSaleCardCustomer](docs/TransactionCaptureAuthorizationResponseSaleCardCustomer.md)
 - [TransactionCaptureAuthorizationResponseSaleConnexPayTransaction](docs/TransactionCaptureAuthorizationResponseSaleConnexPayTransaction.md)
 - [TransactionCaptureAuthorizationResponseSaleRiskResponse](docs/TransactionCaptureAuthorizationResponseSaleRiskResponse.md)
 - [TransactionCreateAchCreditPaymentRequest](docs/TransactionCreateAchCreditPaymentRequest.md)
 - [TransactionCreateAchCreditPaymentRequestAccountHolder](docs/TransactionCreateAchCreditPaymentRequestAccountHolder.md)
 - [TransactionCreateAchCreditPaymentRequestAccountHolderAddress](docs/TransactionCreateAchCreditPaymentRequestAccountHolderAddress.md)
 - [TransactionCreateAchCreditPaymentRequestAccountHolderBankAccount](docs/TransactionCreateAchCreditPaymentRequestAccountHolderBankAccount.md)
 - [TransactionCreateAchCreditPaymentResponse](docs/TransactionCreateAchCreditPaymentResponse.md)
 - [TransactionSearchVirtualCardHistoryResponse](docs/TransactionSearchVirtualCardHistoryResponse.md)
 - [TransactionSearchVirtualCardHistoryResponseTransactionsInner](docs/TransactionSearchVirtualCardHistoryResponseTransactionsInner.md)
 - [UpdatePayeeDto](docs/UpdatePayeeDto.md)
 - [ValidationSearchVerifyOperationRequest](docs/ValidationSearchVerifyOperationRequest.md)
 - [ValidationSearchVerifyOperationResponse](docs/ValidationSearchVerifyOperationResponse.md)
 - [ValidationSearchVerifyOperationResponseSearchResultDTOInner](docs/ValidationSearchVerifyOperationResponseSearchResultDTOInner.md)
 - [ValidationSearchVerifyOperationResponseSearchResultDTOInnerCard](docs/ValidationSearchVerifyOperationResponseSearchResultDTOInnerCard.md)
 - [VerificationCardBankAccountRequest](docs/VerificationCardBankAccountRequest.md)
 - [VerificationCardBankAccountRequestBankAccount](docs/VerificationCardBankAccountRequestBankAccount.md)
 - [VerificationCardBankAccountRequestCard](docs/VerificationCardBankAccountRequestCard.md)
 - [VoidCreateVoidRequest](docs/VoidCreateVoidRequest.md)
 - [VoidCreateVoidResponse](docs/VoidCreateVoidResponse.md)
 - [VoidCreateVoidResponseSale](docs/VoidCreateVoidResponseSale.md)
 - [VoidCreateVoidResponseSaleCard](docs/VoidCreateVoidResponseSaleCard.md)
 - [VoidCreateVoidResponseSaleCardCustomer](docs/VoidCreateVoidResponseSaleCardCustomer.md)
 - [VoidSearchVoidsRequest](docs/VoidSearchVoidsRequest.md)
 - [VoidSearchVoidsResponse](docs/VoidSearchVoidsResponse.md)
 - [VoidSearchVoidsResponseSearchResultDTOInner](docs/VoidSearchVoidsResponseSearchResultDTOInner.md)
 - [VoidSearchVoidsResponseSearchResultDTOInnerSale](docs/VoidSearchVoidsResponseSearchResultDTOInnerSale.md)
 - [VoidSearchVoidsResponseSearchResultDTOInnerSaleCard](docs/VoidSearchVoidsResponseSearchResultDTOInnerSaleCard.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
