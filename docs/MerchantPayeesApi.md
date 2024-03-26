# MerchantPayeesApi

All URIs are relative to *https://sandboxreportingapi.connexpay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayee**](MerchantPayeesApi.md#createPayee) | **POST** /api/v1/Merchants/{merchantGuid}/Payees | Create merchant payee |
| [**deletePayee**](MerchantPayeesApi.md#deletePayee) | **DELETE** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Delete merchant payee |
| [**getPayee**](MerchantPayeesApi.md#getPayee) | **GET** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Get a merchant payee by guid |
| [**getPayees**](MerchantPayeesApi.md#getPayees) | **POST** /api/v1/Merchants/{merchantGuid}/Payees/Search/{page}/{pagesize} | Get merchant payees |
| [**updatePayee**](MerchantPayeesApi.md#updatePayee) | **PUT** /api/v1/Merchants/{merchantGuid}/Payees/{payeeGuid} | Update merchant payee |


<a name="createPayee"></a>
# **createPayee**
> MerchantPayeeDto createPayee(merchantGuid, merchantPayeeDto).execute();

Create merchant payee

Create a payee for a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantPayeesApi;
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
    Boolean isBusiness = true;
    String payeeId = "payeeId_example";
    String preferredPayoutMethod = "preferredPayoutMethod_example";
    UUID merchantGuid = UUID.randomUUID(); // The merchant guid
    Integer idMerchant = 56;
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String dbaName = "dbaName_example";
    String taxId = "taxId_example";
    String customerId = "customerId_example";
    String email = "email_example";
    String address1 = "address1_example";
    String address2 = "address2_example";
    String city = "city_example";
    String state = "state_example";
    String zip = "zip_example";
    String country = "country_example";
    String preferredCardBrand = "preferredCardBrand_example";
    String preferredCardClass = "preferredCardClass_example";
    String purchaseType = "purchaseType_example";
    UUID guid = UUID.randomUUID();
    OffsetDateTime timestamp = OffsetDateTime.now();
    try {
      MerchantPayeeDto result = client
              .merchantPayees
              .createPayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid)
              .idMerchant(idMerchant)
              .firstName(firstName)
              .lastName(lastName)
              .dbaName(dbaName)
              .taxId(taxId)
              .customerId(customerId)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .preferredCardBrand(preferredCardBrand)
              .preferredCardClass(preferredCardClass)
              .purchaseType(purchaseType)
              .guid(guid)
              .timestamp(timestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getIdMerchant());
      System.out.println(result.getIsBusiness());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getDbaName());
      System.out.println(result.getPayeeId());
      System.out.println(result.getTaxId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getEmail());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
      System.out.println(result.getPreferredPayoutMethod());
      System.out.println(result.getPreferredCardBrand());
      System.out.println(result.getPreferredCardClass());
      System.out.println(result.getPurchaseType());
      System.out.println(result.getGuid());
      System.out.println(result.getTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#createPayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantPayeeDto> response = client
              .merchantPayees
              .createPayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid)
              .idMerchant(idMerchant)
              .firstName(firstName)
              .lastName(lastName)
              .dbaName(dbaName)
              .taxId(taxId)
              .customerId(customerId)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .preferredCardBrand(preferredCardBrand)
              .preferredCardClass(preferredCardClass)
              .purchaseType(purchaseType)
              .guid(guid)
              .timestamp(timestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#createPayee");
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
| **merchantGuid** | **UUID**| The merchant guid | |
| **merchantPayeeDto** | [**MerchantPayeeDto**](MerchantPayeeDto.md)| The merchant payee dto | |

### Return type

[**MerchantPayeeDto**](MerchantPayeeDto.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Invalid ModelState |  -  |
| **403** | User does not have access to merchant. |  -  |
| **409** | A payee with this payeeID already exists |  -  |

<a name="deletePayee"></a>
# **deletePayee**
> deletePayee(merchantGuid, payeeGuid).execute();

Delete merchant payee

Delete a payee for a merchant by guid

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantPayeesApi;
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
    UUID merchantGuid = UUID.randomUUID(); // The merchant guid
    UUID payeeGuid = UUID.randomUUID(); // The payee guid
    try {
      client
              .merchantPayees
              .deletePayee(merchantGuid, payeeGuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#deletePayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .merchantPayees
              .deletePayee(merchantGuid, payeeGuid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#deletePayee");
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
| **merchantGuid** | **UUID**| The merchant guid | |
| **payeeGuid** | **UUID**| The payee guid | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Merchant Found |  -  |
| **400** | Bad request |  -  |
| **403** | User does not have access to merchant. |  -  |

<a name="getPayee"></a>
# **getPayee**
> MerchantPayeeDto getPayee(merchantGuid, payeeGuid).execute();

Get a merchant payee by guid

Get a payee for a merchant by guid

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantPayeesApi;
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
    UUID merchantGuid = UUID.randomUUID(); // The merchant guid
    UUID payeeGuid = UUID.randomUUID(); // The payee guid
    try {
      MerchantPayeeDto result = client
              .merchantPayees
              .getPayee(merchantGuid, payeeGuid)
              .execute();
      System.out.println(result);
      System.out.println(result.getIdMerchant());
      System.out.println(result.getIsBusiness());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getDbaName());
      System.out.println(result.getPayeeId());
      System.out.println(result.getTaxId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getEmail());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
      System.out.println(result.getPreferredPayoutMethod());
      System.out.println(result.getPreferredCardBrand());
      System.out.println(result.getPreferredCardClass());
      System.out.println(result.getPurchaseType());
      System.out.println(result.getGuid());
      System.out.println(result.getTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#getPayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantPayeeDto> response = client
              .merchantPayees
              .getPayee(merchantGuid, payeeGuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#getPayee");
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
| **merchantGuid** | **UUID**| The merchant guid | |
| **payeeGuid** | **UUID**| The payee guid | |

### Return type

[**MerchantPayeeDto**](MerchantPayeeDto.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No MerchantPayee found |  -  |
| **400** | Bad request |  -  |
| **403** | User does not have access to merchant. |  -  |

<a name="getPayees"></a>
# **getPayees**
> MerchantPayeePaginatedResponse getPayees(merchantGuid, page, pagesize, searchMerchantPayeeDto).execute();

Get merchant payees

Get a list of payees for a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantPayeesApi;
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
    UUID merchantGuid = UUID.randomUUID(); // The merchant guid
    Integer page = 56; // The page number
    Integer pagesize = 56; // The number of records to return per page
    String searchTerm = "searchTerm_example";
    try {
      MerchantPayeePaginatedResponse result = client
              .merchantPayees
              .getPayees(merchantGuid, page, pagesize)
              .searchTerm(searchTerm)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getCurrentPage());
      System.out.println(result.getSearchResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#getPayees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantPayeePaginatedResponse> response = client
              .merchantPayees
              .getPayees(merchantGuid, page, pagesize)
              .searchTerm(searchTerm)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#getPayees");
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
| **merchantGuid** | **UUID**| The merchant guid | |
| **page** | **Integer**| The page number | |
| **pagesize** | **Integer**| The number of records to return per page | |
| **searchMerchantPayeeDto** | [**SearchMerchantPayeeDto**](SearchMerchantPayeeDto.md)| A payload of search/filter parameters | |

### Return type

[**MerchantPayeePaginatedResponse**](MerchantPayeePaginatedResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **403** | User does not have access to merchant. |  -  |

<a name="updatePayee"></a>
# **updatePayee**
> updatePayee(merchantGuid, payeeGuid, merchantPayeeDto).execute();

Update merchant payee

Update a payee for a merchant by guid

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ConnexPay;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantPayeesApi;
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
    Boolean isBusiness = true;
    String payeeId = "payeeId_example";
    String preferredPayoutMethod = "preferredPayoutMethod_example";
    UUID merchantGuid = UUID.randomUUID(); // The merchant guid
    UUID payeeGuid = UUID.randomUUID(); // The payee guid
    Integer idMerchant = 56;
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String dbaName = "dbaName_example";
    String taxId = "taxId_example";
    String customerId = "customerId_example";
    String email = "email_example";
    String address1 = "address1_example";
    String address2 = "address2_example";
    String city = "city_example";
    String state = "state_example";
    String zip = "zip_example";
    String country = "country_example";
    String preferredCardBrand = "preferredCardBrand_example";
    String preferredCardClass = "preferredCardClass_example";
    String purchaseType = "purchaseType_example";
    UUID guid = UUID.randomUUID();
    OffsetDateTime timestamp = OffsetDateTime.now();
    try {
      client
              .merchantPayees
              .updatePayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid, payeeGuid)
              .idMerchant(idMerchant)
              .firstName(firstName)
              .lastName(lastName)
              .dbaName(dbaName)
              .taxId(taxId)
              .customerId(customerId)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .preferredCardBrand(preferredCardBrand)
              .preferredCardClass(preferredCardClass)
              .purchaseType(purchaseType)
              .guid(guid)
              .timestamp(timestamp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#updatePayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .merchantPayees
              .updatePayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid, payeeGuid)
              .idMerchant(idMerchant)
              .firstName(firstName)
              .lastName(lastName)
              .dbaName(dbaName)
              .taxId(taxId)
              .customerId(customerId)
              .email(email)
              .address1(address1)
              .address2(address2)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .preferredCardBrand(preferredCardBrand)
              .preferredCardClass(preferredCardClass)
              .purchaseType(purchaseType)
              .guid(guid)
              .timestamp(timestamp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantPayeesApi#updatePayee");
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
| **merchantGuid** | **UUID**| The merchant guid | |
| **payeeGuid** | **UUID**| The payee guid | |
| **merchantPayeeDto** | [**MerchantPayeeDto**](MerchantPayeeDto.md)| The merchant payee dto | |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | NoContent |  -  |
| **400** | Bad request |  -  |
| **403** | User does not have access to merchant. |  -  |
| **409** | A payee with this payeeID already exists |  -  |

