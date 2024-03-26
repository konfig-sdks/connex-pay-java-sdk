# AddendumApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAchPurchase**](AddendumApi.md#createAchPurchase) | **POST** /api/v1/Addendum/ACH | ACH Purchase Addendum |
| [**createVirtualCard**](AddendumApi.md#createVirtualCard) | **POST** /api/v1/Addendum/VirtualCard | Virtual Card Addendum |
| [**deleteItem**](AddendumApi.md#deleteItem) | **POST** /v1/Addendum/Remove/&lt;guid&gt; | Addendum Remove |


<a name="createAchPurchase"></a>
# **createAchPurchase**
> AddendumCreateAchPurchaseResponse createAchPurchase().addendumCreateAchPurchaseRequest(addendumCreateAchPurchaseRequest).execute();

ACH Purchase Addendum



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddendumApi;
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
    String itemGuid = "Mandatory"; // Guid for the ACH Purchase you are attaching information to with this addendum request. This Guid was returned to client when the ACH Purchase was initially created.
    String value = "Mandatory"; // Character data to associate with the Virtual card.
    String category = "Optional"; // Can be used by client to specify a desired category for an Addenda item. Consistent category parameters will aid in reporting consistently. See note below regarding the \\\"MultipleSales\\\" category and how to use the category specifically to associate an ACH Purchase to an existing sale(s).
    String idExternal = "Optional"; // Can be supplied by client to associate this addendum with an ID in client's data.
    String note = "Optional"; // Additional information to associate with this addendum, as desired.
    String sequence = "Optional"; // If client creates multiple addenda for a single ACH Purchase this sequence can be specified if a client desires.
    try {
      AddendumCreateAchPurchaseResponse result = client
              .addendum
              .createAchPurchase()
              .itemGuid(itemGuid)
              .value(value)
              .category(category)
              .idExternal(idExternal)
              .note(note)
              .sequence(sequence)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getItemGuid());
      System.out.println(result.getValue());
      System.out.println(result.getCategory());
      System.out.println(result.getIdExternal());
      System.out.println(result.getNote());
      System.out.println(result.getSequence());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#createAchPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddendumCreateAchPurchaseResponse> response = client
              .addendum
              .createAchPurchase()
              .itemGuid(itemGuid)
              .value(value)
              .category(category)
              .idExternal(idExternal)
              .note(note)
              .sequence(sequence)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#createAchPurchase");
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
| **addendumCreateAchPurchaseRequest** | [**AddendumCreateAchPurchaseRequest**](AddendumCreateAchPurchaseRequest.md)|  | [optional] |

### Return type

[**AddendumCreateAchPurchaseResponse**](AddendumCreateAchPurchaseResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="createVirtualCard"></a>
# **createVirtualCard**
> AddendumCreateVirtualCardResponse createVirtualCard().addendumCreateVirtualCardRequest(addendumCreateVirtualCardRequest).execute();

Virtual Card Addendum



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddendumApi;
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
    String itemGuid = "Mandatory"; // Guid for the Virtual Card you are attaching information to with this addendum request. This Guid was returned to client when the Virtual Card was initially created.
    String value = "Mandatory"; // Character data to associate with the Virtual card.
    String category = "Optional"; // Can be used by client to specify a desired category for an Addenda item.
    String idExternal = "Optional"; // Can be supplied by client to associate this addendum with an ID in client's data.
    String note = "Optional"; // Additional information to associate with this addendum, as desired.
    String sequence = "Optional"; // If client creates multiple addenda for a single Virtual Card this sequence can be specified if a client desires.
    try {
      AddendumCreateVirtualCardResponse result = client
              .addendum
              .createVirtualCard()
              .itemGuid(itemGuid)
              .value(value)
              .category(category)
              .idExternal(idExternal)
              .note(note)
              .sequence(sequence)
              .execute();
      System.out.println(result);
      System.out.println(result.getGuid());
      System.out.println(result.getItemGuid());
      System.out.println(result.getValue());
      System.out.println(result.getCategory());
      System.out.println(result.getIdExternal());
      System.out.println(result.getNote());
      System.out.println(result.getSequence());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#createVirtualCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddendumCreateVirtualCardResponse> response = client
              .addendum
              .createVirtualCard()
              .itemGuid(itemGuid)
              .value(value)
              .category(category)
              .idExternal(idExternal)
              .note(note)
              .sequence(sequence)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#createVirtualCard");
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
| **addendumCreateVirtualCardRequest** | [**AddendumCreateVirtualCardRequest**](AddendumCreateVirtualCardRequest.md)|  | [optional] |

### Return type

[**AddendumCreateVirtualCardResponse**](AddendumCreateVirtualCardResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="deleteItem"></a>
# **deleteItem**
> AddendumDeleteItemResponse deleteItem(guid).execute();

Addendum Remove

This endpoint deletes an Addendum information item from an object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddendumApi;
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
    String guid = "guid_example"; // The Addendum guid to terminate.
    try {
      AddendumDeleteItemResponse result = client
              .addendum
              .deleteItem(guid)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#deleteItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddendumDeleteItemResponse> response = client
              .addendum
              .deleteItem(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddendumApi#deleteItem");
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
| **guid** | **String**| The Addendum guid to terminate. | |

### Return type

[**AddendumDeleteItemResponse**](AddendumDeleteItemResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

