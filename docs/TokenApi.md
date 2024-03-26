# TokenApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateReportingToken**](TokenApi.md#generateReportingToken) | **POST** /api/v1/authenticate | Reporting Token |
| [**issueAuthenticationToken**](TokenApi.md#issueAuthenticationToken) | **POST** /api/v1/token | Issuing Token |
| [**requestHppToken**](TokenApi.md#requestHppToken) | **POST** /api/v1/HostedPaymentPageRequests | HPP Token Request |


<a name="generateReportingToken"></a>
# **generateReportingToken**
> TokenGenerateReportingTokenResponse generateReportingToken().tokenGenerateReportingTokenRequest(tokenGenerateReportingTokenRequest).execute();

Reporting Token

Reporting API requests require a combination of assigned Bridge user name, Bridge password, and a successfully generated authentication token. The Bridge credentials used are assigned separately from the Purchase and Sales API credentials. The received token for Reporting is valid for 60 minutes from issuance and may be used for all requests during its lifespan.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
    String userName = "userName_example"; // Assigned username for CXP Bridge
    String password = "password_example"; // Assigned password for CXP Bridge
    try {
      TokenGenerateReportingTokenResponse result = client
              .token
              .generateReportingToken(userName, password)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateReportingToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenGenerateReportingTokenResponse> response = client
              .token
              .generateReportingToken(userName, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateReportingToken");
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
| **tokenGenerateReportingTokenRequest** | [**TokenGenerateReportingTokenRequest**](TokenGenerateReportingTokenRequest.md)|  | [optional] |

### Return type

[**TokenGenerateReportingTokenResponse**](TokenGenerateReportingTokenResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="issueAuthenticationToken"></a>
# **issueAuthenticationToken**
> TokenIssueAuthenticationTokenResponse issueAuthenticationToken().tokenIssueAuthenticationTokenRequest(tokenIssueAuthenticationTokenRequest).execute();

Issuing Token

API requests require a combination of assigned user name, password, and successfully generated authentication token. The received token is valid for 24 hours from issuance and may be used for all requests during its lifespan.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
    String grantType = "password";
    String username = "username_example"; // CXP provided username
    String password = "password_example"; // CXP provided password
    try {
      TokenIssueAuthenticationTokenResponse result = client
              .token
              .issueAuthenticationToken(grantType, username, password)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#issueAuthenticationToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenIssueAuthenticationTokenResponse> response = client
              .token
              .issueAuthenticationToken(grantType, username, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#issueAuthenticationToken");
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
| **tokenIssueAuthenticationTokenRequest** | [**TokenIssueAuthenticationTokenRequest**](TokenIssueAuthenticationTokenRequest.md)|  | [optional] |

### Return type

[**TokenIssueAuthenticationTokenResponse**](TokenIssueAuthenticationTokenResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="requestHppToken"></a>
# **requestHppToken**
> TokenRequestHppTokenResponse requestHppToken().tokenRequestHppTokenRequest(tokenRequestHppTokenRequest).execute();

HPP Token Request



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
    String merchantName = "merchantName_example"; // Merchant Name. ConnexPay displays this on the Hosted Payment Page. The max length is 100 characters.
    TokenRequestHppTokenRequestSale sale = new TokenRequestHppTokenRequestSale();
    String description = "description_example"; // Additional information ConnexPay can display in the Hosted Payment Page. The max length is 2048 characters.
    String resultRedirectUrl = "resultRedirectUrl_example"; // This is a ConnexPay CLIENT server route ConnexPay uses to (re)direct the consumer payment result back to our client upon payment success, failure or cancel. If this data is not set, then it will use the default one from ConnexPay.
    String logoUrl = "logoUrl_example"; // ConnexPay can display this instead of “MerchantName” in the payment dialog.
    List<String> tenderTypeOptions = Arrays.asList(); // Payment types you wish to make available to your consumer when they enter payment information into the Hosted Payment Page. Options are \\\"ACH\\\", \\\"Credit\\\", \\\"GooglePay\\\"/
    OffsetDateTime expiration = OffsetDateTime.now(); // Client can request a specific expiration date to identify when the HPP Link will expire. Timestamps will be converted to UTC for consistency within the ConnexPay environment.
    try {
      TokenRequestHppTokenResponse result = client
              .token
              .requestHppToken(merchantName, sale)
              .description(description)
              .resultRedirectUrl(resultRedirectUrl)
              .logoUrl(logoUrl)
              .tenderTypeOptions(tenderTypeOptions)
              .expiration(expiration)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMerchantName());
      System.out.println(result.getAmount());
      System.out.println(result.getResultRedirectUrl());
      System.out.println(result.getTempToken());
      System.out.println(result.getExpiration());
      System.out.println(result.getLogoUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#requestHppToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenRequestHppTokenResponse> response = client
              .token
              .requestHppToken(merchantName, sale)
              .description(description)
              .resultRedirectUrl(resultRedirectUrl)
              .logoUrl(logoUrl)
              .tenderTypeOptions(tenderTypeOptions)
              .expiration(expiration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#requestHppToken");
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
| **tokenRequestHppTokenRequest** | [**TokenRequestHppTokenRequest**](TokenRequestHppTokenRequest.md)|  | [optional] |

### Return type

[**TokenRequestHppTokenResponse**](TokenRequestHppTokenResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

