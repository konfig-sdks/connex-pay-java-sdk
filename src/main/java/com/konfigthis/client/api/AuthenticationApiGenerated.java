/*
 * ConnexPay Reporting API
 * REST API for retrieving reporting data. Currently Daily Accounting data only.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationRequest;
import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationRequestBankAccount;
import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationRequestBrowserData;
import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationRequestCard;
import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationRequestRiskData;
import com.konfigthis.client.model.AuthenticationAcquireClientAuthorizationResponse;
import com.konfigthis.client.model.AuthenticationObtain3DSecureAuthenticationRequest;
import com.konfigthis.client.model.AuthenticationObtain3DSecureAuthenticationRequestBrowserData;
import com.konfigthis.client.model.AuthenticationObtain3DSecureAuthenticationRequestCard;
import com.konfigthis.client.model.AuthenticationObtain3DSecureAuthenticationResponse;
import com.konfigthis.client.model.SaleCreateTransactionRequestCustomer;
import com.konfigthis.client.model.SaleCreateTransactionRequestEnhancedData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthenticationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call acquireClientAuthorizationCall(AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = authenticationAcquireClientAuthorizationRequest;

        // create path and map variables
        String localVarPath = "/api/v1/authonlys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acquireClientAuthorizationValidateBeforeCall(AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest, final ApiCallback _callback) throws ApiException {
        return acquireClientAuthorizationCall(authenticationAcquireClientAuthorizationRequest, _callback);

    }


    private ApiResponse<AuthenticationAcquireClientAuthorizationResponse> acquireClientAuthorizationWithHttpInfo(AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest) throws ApiException {
        okhttp3.Call localVarCall = acquireClientAuthorizationValidateBeforeCall(authenticationAcquireClientAuthorizationRequest, null);
        Type localVarReturnType = new TypeToken<AuthenticationAcquireClientAuthorizationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call acquireClientAuthorizationAsync(AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest, final ApiCallback<AuthenticationAcquireClientAuthorizationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = acquireClientAuthorizationValidateBeforeCall(authenticationAcquireClientAuthorizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthenticationAcquireClientAuthorizationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AcquireClientAuthorizationRequestBuilder {
        private final String deviceGuid;
        private final Float amount;
        private final AuthenticationAcquireClientAuthorizationRequestRiskData riskData;
        private String sequenceNumber;
        private String orderNumber;
        private Boolean sendReceipt;
        private String statementDescription;
        private String customerID;
        private AuthenticationAcquireClientAuthorizationRequestCard card;
        private AuthenticationAcquireClientAuthorizationRequestBankAccount bankAccount;
        private SaleCreateTransactionRequestCustomer customer;
        private SaleCreateTransactionRequestEnhancedData enhancedData;
        private String associationID;
        private AuthenticationAcquireClientAuthorizationRequestBrowserData browserData;

        private AcquireClientAuthorizationRequestBuilder(String deviceGuid, Float amount, AuthenticationAcquireClientAuthorizationRequestRiskData riskData) {
            this.deviceGuid = deviceGuid;
            this.amount = amount;
            this.riskData = riskData;
        }

        /**
         * Set sequenceNumber
         * @param sequenceNumber Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder sequenceNumber(String sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }
        
        /**
         * Set orderNumber
         * @param orderNumber This is the most common number you&#39;ll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        
        /**
         * Set sendReceipt
         * @param sendReceipt Value determines whether or not a customer shall be emailed a receipt from the ConnexPay platform if the email address is provided in the API customer block. The default value is TRUE. Set to FALSE so that an email receipt is not sent to the customer. Set to TRUE or leave empty if you want e-mail to be sent. If TRUE, customer&#39;s email must be included in the \\\&quot;Card.Customer.email\\\&quot; parameter. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder sendReceipt(Boolean sendReceipt) {
            this.sendReceipt = sendReceipt;
            return this;
        }
        
        /**
         * Set statementDescription
         * @param statementDescription US Clients only: The statement description allows a client to customize the Merchant name that appears on the cardholder statement such that the cardholder recognizes the transaction on their statement. ConnexPay recommends sending a recognizable DBA along with the PNR i.e. ABC Travel ABC123. Note: functionality not applicable for American Express OptBlue program.  The maximun length is 25 alpha-numeric characters. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder statementDescription(String statementDescription) {
            this.statementDescription = statementDescription;
            return this;
        }
        
        /**
         * Set customerID
         * @param customerID Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 100 characters and is alpha-numeric. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder customerID(String customerID) {
            this.customerID = customerID;
            return this;
        }
        
        /**
         * Set card
         * @param card  (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder card(AuthenticationAcquireClientAuthorizationRequestCard card) {
            this.card = card;
            return this;
        }
        
        /**
         * Set bankAccount
         * @param bankAccount  (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder bankAccount(AuthenticationAcquireClientAuthorizationRequestBankAccount bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }
        
        /**
         * Set customer
         * @param customer  (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder customer(SaleCreateTransactionRequestCustomer customer) {
            this.customer = customer;
            return this;
        }
        
        /**
         * Set enhancedData
         * @param enhancedData  (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder enhancedData(SaleCreateTransactionRequestEnhancedData enhancedData) {
            this.enhancedData = enhancedData;
            return this;
        }
        
        /**
         * Set associationID
         * @param associationID Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting. (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder associationID(String associationID) {
            this.associationID = associationID;
            return this;
        }
        
        /**
         * Set browserData
         * @param browserData  (optional)
         * @return AcquireClientAuthorizationRequestBuilder
         */
        public AcquireClientAuthorizationRequestBuilder browserData(AuthenticationAcquireClientAuthorizationRequestBrowserData browserData) {
            this.browserData = browserData;
            return this;
        }
        
        /**
         * Build call for acquireClientAuthorization
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest = buildBodyParams();
            return acquireClientAuthorizationCall(authenticationAcquireClientAuthorizationRequest, _callback);
        }

        private AuthenticationAcquireClientAuthorizationRequest buildBodyParams() {
            AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest = new AuthenticationAcquireClientAuthorizationRequest();
            authenticationAcquireClientAuthorizationRequest.deviceGuid(this.deviceGuid);
            authenticationAcquireClientAuthorizationRequest.amount(this.amount);
            authenticationAcquireClientAuthorizationRequest.sequenceNumber(this.sequenceNumber);
            authenticationAcquireClientAuthorizationRequest.orderNumber(this.orderNumber);
            authenticationAcquireClientAuthorizationRequest.sendReceipt(this.sendReceipt);
            authenticationAcquireClientAuthorizationRequest.statementDescription(this.statementDescription);
            authenticationAcquireClientAuthorizationRequest.customerID(this.customerID);
            authenticationAcquireClientAuthorizationRequest.riskData(this.riskData);
            authenticationAcquireClientAuthorizationRequest.card(this.card);
            authenticationAcquireClientAuthorizationRequest.bankAccount(this.bankAccount);
            authenticationAcquireClientAuthorizationRequest.customer(this.customer);
            authenticationAcquireClientAuthorizationRequest.enhancedData(this.enhancedData);
            authenticationAcquireClientAuthorizationRequest.associationID(this.associationID);
            authenticationAcquireClientAuthorizationRequest.browserData(this.browserData);
            return authenticationAcquireClientAuthorizationRequest;
        }

        /**
         * Execute acquireClientAuthorization request
         * @return AuthenticationAcquireClientAuthorizationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public AuthenticationAcquireClientAuthorizationResponse execute() throws ApiException {
            AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest = buildBodyParams();
            ApiResponse<AuthenticationAcquireClientAuthorizationResponse> localVarResp = acquireClientAuthorizationWithHttpInfo(authenticationAcquireClientAuthorizationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute acquireClientAuthorization request with HTTP info returned
         * @return ApiResponse&lt;AuthenticationAcquireClientAuthorizationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthenticationAcquireClientAuthorizationResponse> executeWithHttpInfo() throws ApiException {
            AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest = buildBodyParams();
            return acquireClientAuthorizationWithHttpInfo(authenticationAcquireClientAuthorizationRequest);
        }

        /**
         * Execute acquireClientAuthorization request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthenticationAcquireClientAuthorizationResponse> _callback) throws ApiException {
            AuthenticationAcquireClientAuthorizationRequest authenticationAcquireClientAuthorizationRequest = buildBodyParams();
            return acquireClientAuthorizationAsync(authenticationAcquireClientAuthorizationRequest, _callback);
        }
    }

    /**
     * Auth Only
     * The Auth Only Endpoint is applicable to acquiring clients.  Call Auth Only when you want to process an Authorization only, which will not settle until it&#39;s Captured.  We do not allow you to Capture an Authorization after 5 business days have passed.Calling this endpoint will authorize the card, however, it will not be settled until the [Capture endpoint](https://docs.connexpay.com/reference/capture) is called. Authorizations expire after 5 days.
     * @return AcquireClientAuthorizationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
     </table>
     */
    public AcquireClientAuthorizationRequestBuilder acquireClientAuthorization(String deviceGuid, Float amount, AuthenticationAcquireClientAuthorizationRequestRiskData riskData) throws IllegalArgumentException {
        if (deviceGuid == null) throw new IllegalArgumentException("\"deviceGuid\" is required but got null");
            

        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        if (riskData == null) throw new IllegalArgumentException("\"riskData\" is required but got null");
        return new AcquireClientAuthorizationRequestBuilder(deviceGuid, amount, riskData);
    }
    private okhttp3.Call obtain3dSecureAuthenticationCall(AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = authenticationObtain3DSecureAuthenticationRequest;

        // create path and map variables
        String localVarPath = "/api/v1/3ds";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call obtain3dSecureAuthenticationValidateBeforeCall(AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest, final ApiCallback _callback) throws ApiException {
        return obtain3dSecureAuthenticationCall(authenticationObtain3DSecureAuthenticationRequest, _callback);

    }


    private ApiResponse<AuthenticationObtain3DSecureAuthenticationResponse> obtain3dSecureAuthenticationWithHttpInfo(AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest) throws ApiException {
        okhttp3.Call localVarCall = obtain3dSecureAuthenticationValidateBeforeCall(authenticationObtain3DSecureAuthenticationRequest, null);
        Type localVarReturnType = new TypeToken<AuthenticationObtain3DSecureAuthenticationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call obtain3dSecureAuthenticationAsync(AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest, final ApiCallback<AuthenticationObtain3DSecureAuthenticationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = obtain3dSecureAuthenticationValidateBeforeCall(authenticationObtain3DSecureAuthenticationRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthenticationObtain3DSecureAuthenticationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class Obtain3dSecureAuthenticationRequestBuilder {
        private final AuthenticationObtain3DSecureAuthenticationRequestCard card;
        private final String deviceGuid;
        private final AuthenticationObtain3DSecureAuthenticationRequestBrowserData browserData;
        private final Float amount;

        private Obtain3dSecureAuthenticationRequestBuilder(AuthenticationObtain3DSecureAuthenticationRequestCard card, String deviceGuid, AuthenticationObtain3DSecureAuthenticationRequestBrowserData browserData, Float amount) {
            this.card = card;
            this.deviceGuid = deviceGuid;
            this.browserData = browserData;
            this.amount = amount;
        }

        /**
         * Build call for obtain3dSecureAuthentication
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest = buildBodyParams();
            return obtain3dSecureAuthenticationCall(authenticationObtain3DSecureAuthenticationRequest, _callback);
        }

        private AuthenticationObtain3DSecureAuthenticationRequest buildBodyParams() {
            AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest = new AuthenticationObtain3DSecureAuthenticationRequest();
            authenticationObtain3DSecureAuthenticationRequest.card(this.card);
            authenticationObtain3DSecureAuthenticationRequest.deviceGuid(this.deviceGuid);
            authenticationObtain3DSecureAuthenticationRequest.browserData(this.browserData);
            authenticationObtain3DSecureAuthenticationRequest.amount(this.amount);
            return authenticationObtain3DSecureAuthenticationRequest;
        }

        /**
         * Execute obtain3dSecureAuthentication request
         * @return AuthenticationObtain3DSecureAuthenticationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public AuthenticationObtain3DSecureAuthenticationResponse execute() throws ApiException {
            AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest = buildBodyParams();
            ApiResponse<AuthenticationObtain3DSecureAuthenticationResponse> localVarResp = obtain3dSecureAuthenticationWithHttpInfo(authenticationObtain3DSecureAuthenticationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute obtain3dSecureAuthentication request with HTTP info returned
         * @return ApiResponse&lt;AuthenticationObtain3DSecureAuthenticationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthenticationObtain3DSecureAuthenticationResponse> executeWithHttpInfo() throws ApiException {
            AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest = buildBodyParams();
            return obtain3dSecureAuthenticationWithHttpInfo(authenticationObtain3DSecureAuthenticationRequest);
        }

        /**
         * Execute obtain3dSecureAuthentication request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthenticationObtain3DSecureAuthenticationResponse> _callback) throws ApiException {
            AuthenticationObtain3DSecureAuthenticationRequest authenticationObtain3DSecureAuthenticationRequest = buildBodyParams();
            return obtain3dSecureAuthenticationAsync(authenticationObtain3DSecureAuthenticationRequest, _callback);
        }
    }

    /**
     * 3DS Authentication
     * This endpoint can be used for obtaining 3D Secure Authentication separate from the Create Sale or Auth-Only calls.  This is recommended for our US and CA clients.
     * @return Obtain3dSecureAuthenticationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> 202 </td><td>  -  </td></tr>
     </table>
     */
    public Obtain3dSecureAuthenticationRequestBuilder obtain3dSecureAuthentication(AuthenticationObtain3DSecureAuthenticationRequestCard card, String deviceGuid, AuthenticationObtain3DSecureAuthenticationRequestBrowserData browserData, Float amount) throws IllegalArgumentException {
        if (card == null) throw new IllegalArgumentException("\"card\" is required but got null");
        if (deviceGuid == null) throw new IllegalArgumentException("\"deviceGuid\" is required but got null");
            

        if (browserData == null) throw new IllegalArgumentException("\"browserData\" is required but got null");
        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        return new Obtain3dSecureAuthenticationRequestBuilder(card, deviceGuid, browserData, amount);
    }
}
