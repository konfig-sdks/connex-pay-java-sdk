# FundingApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**merchantCashBalance**](FundingApi.md#merchantCashBalance) | **POST** /api/v1/MerchantSelfServiceFunding | Client Self-Service Funding |
| [**transferMerchantCashBalance**](FundingApi.md#transferMerchantCashBalance) | **POST** /api/v1/MerchantFlexFunding/Funds/Transfer | Client Funds Transfer |


<a name="merchantCashBalance"></a>
# **merchantCashBalance**
> FundingMerchantCashBalanceResponse merchantCashBalance().fundingMerchantCashBalanceRequest(fundingMerchantCashBalanceRequest).execute();

Client Self-Service Funding

Use this endpoint to fund or withdraw your merchant cash balance with your merchant bank account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FundingApi;
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
    String merchantGUID = "merchantGUID_example"; // The merchant's GUID. Value provided by ConnexPay.
    Float amount = 3.4F; // Self-service funding amount that will be processed. Maximum transaction and daily funding limits are set by ConnexPay.
    Boolean isFundCashBalance = true; // true: Fund your merchant cash balance from your merchant bank account. false: Withdraw your merchant cash balance and ConnexPay will credit your merchant bank account.
    try {
      FundingMerchantCashBalanceResponse result = client
              .funding
              .merchantCashBalance(merchantGUID, amount, isFundCashBalance)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getRequestIp());
      System.out.println(result.getAmount());
      System.out.println(result.getIsFundCashBalance());
      System.out.println(result.getBankAccount());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingApi#merchantCashBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FundingMerchantCashBalanceResponse> response = client
              .funding
              .merchantCashBalance(merchantGUID, amount, isFundCashBalance)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingApi#merchantCashBalance");
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
| **fundingMerchantCashBalanceRequest** | [**FundingMerchantCashBalanceRequest**](FundingMerchantCashBalanceRequest.md)|  | [optional] |

### Return type

[**FundingMerchantCashBalanceResponse**](FundingMerchantCashBalanceResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="transferMerchantCashBalance"></a>
# **transferMerchantCashBalance**
> FundingTransferMerchantCashBalanceResponse transferMerchantCashBalance().fundingTransferMerchantCashBalanceRequest(fundingTransferMerchantCashBalanceRequest).execute();

Client Funds Transfer

Use this endpoint to transfer funds between your merchant cash balances within the same Corporate entity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FundingApi;
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
    String transferredFrom = "transferredFrom_example"; // The merchant's GUID of the withdrawn account. Value provided by ConnexPay.
    String transferredTo = "transferredTo_example"; // The merchant's GUID of the deposited account. Value provided by ConnexPay.
    Float amount = 3.4F; // Transferred funding amount that will be processed. Maximum transaction and daily funding limits are set by ConnexPay.
    try {
      FundingTransferMerchantCashBalanceResponse result = client
              .funding
              .transferMerchantCashBalance(transferredFrom, transferredTo, amount)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransferredFrom());
      System.out.println(result.getTransferredTo());
      System.out.println(result.getAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingApi#transferMerchantCashBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FundingTransferMerchantCashBalanceResponse> response = client
              .funding
              .transferMerchantCashBalance(transferredFrom, transferredTo, amount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingApi#transferMerchantCashBalance");
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
| **fundingTransferMerchantCashBalanceRequest** | [**FundingTransferMerchantCashBalanceRequest**](FundingTransferMerchantCashBalanceRequest.md)|  | [optional] |

### Return type

[**FundingTransferMerchantCashBalanceResponse**](FundingTransferMerchantCashBalanceResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

