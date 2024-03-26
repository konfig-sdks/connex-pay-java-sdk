# SettingApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenizeBankAccountInfo**](SettingApi.md#tokenizeBankAccountInfo) | **POST** /api/v1/merchantsupplier/settings | Merchant Supplier Setting |


<a name="tokenizeBankAccountInfo"></a>
# **tokenizeBankAccountInfo**
> SettingTokenizeBankAccountInfoResponse tokenizeBankAccountInfo().settingTokenizeBankAccountInfoRequest(settingTokenizeBankAccountInfoRequest).execute();

Merchant Supplier Setting

This endpoint allows you to create and tokenize a suppliers bank account information without actually making the Issue ACH call. That tokenized bank account can then be used in future Issue ACH or Issue ACH Lite API requests so you don&#39;t have to store the actual bank account information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SettingApi;
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
    String supplierName = "supplierName_example"; // Name of supplier to whom payment will be made
    SettingTokenizeBankAccountInfoRequestAccountHolder accountHolder = new SettingTokenizeBankAccountInfoRequestAccountHolder();
    try {
      SettingTokenizeBankAccountInfoResponse result = client
              .setting
              .tokenizeBankAccountInfo(merchantGuid, supplierName, accountHolder)
              .execute();
      System.out.println(result);
      System.out.println(result.getMerchantGuid());
      System.out.println(result.getSupplierName());
      System.out.println(result.getTimeStamp());
      System.out.println(result.getIdUser());
      System.out.println(result.getIdMerchantSupplierSettings());
      System.out.println(result.getAccountHolder());
      System.out.println(result.getUserName());
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingApi#tokenizeBankAccountInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SettingTokenizeBankAccountInfoResponse> response = client
              .setting
              .tokenizeBankAccountInfo(merchantGuid, supplierName, accountHolder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingApi#tokenizeBankAccountInfo");
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
| **settingTokenizeBankAccountInfoRequest** | [**SettingTokenizeBankAccountInfoRequest**](SettingTokenizeBankAccountInfoRequest.md)|  | [optional] |

### Return type

[**SettingTokenizeBankAccountInfoResponse**](SettingTokenizeBankAccountInfoResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

