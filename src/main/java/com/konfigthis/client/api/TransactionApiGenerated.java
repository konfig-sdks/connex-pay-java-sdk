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


import com.konfigthis.client.model.SaleCreateTransactionRequestCustomParametersInner;
import com.konfigthis.client.model.TransactionCaptureAuthorizationRequest;
import com.konfigthis.client.model.TransactionCaptureAuthorizationRequestConnexPayTransaction;
import com.konfigthis.client.model.TransactionCaptureAuthorizationResponse;
import com.konfigthis.client.model.TransactionCreateAchCreditPaymentRequest;
import com.konfigthis.client.model.TransactionCreateAchCreditPaymentRequestAccountHolder;
import com.konfigthis.client.model.TransactionCreateAchCreditPaymentResponse;
import com.konfigthis.client.model.TransactionSearchVirtualCardHistoryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call captureAuthorizationCall(TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transactionCaptureAuthorizationRequest;

        // create path and map variables
        String localVarPath = "/api/v1/Captures";

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
    private okhttp3.Call captureAuthorizationValidateBeforeCall(TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest, final ApiCallback _callback) throws ApiException {
        return captureAuthorizationCall(transactionCaptureAuthorizationRequest, _callback);

    }


    private ApiResponse<TransactionCaptureAuthorizationResponse> captureAuthorizationWithHttpInfo(TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest) throws ApiException {
        okhttp3.Call localVarCall = captureAuthorizationValidateBeforeCall(transactionCaptureAuthorizationRequest, null);
        Type localVarReturnType = new TypeToken<TransactionCaptureAuthorizationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call captureAuthorizationAsync(TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest, final ApiCallback<TransactionCaptureAuthorizationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = captureAuthorizationValidateBeforeCall(transactionCaptureAuthorizationRequest, _callback);
        Type localVarReturnType = new TypeToken<TransactionCaptureAuthorizationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CaptureAuthorizationRequestBuilder {
        private final String deviceGuid;
        private final String authOnlyGuid;
        private String sequenceNumber;
        private TransactionCaptureAuthorizationRequestConnexPayTransaction connexPayTransaction;
        private String orderNumber;
        private String customerID;
        private String associationID;
        private List<SaleCreateTransactionRequestCustomParametersInner> customParameters;

        private CaptureAuthorizationRequestBuilder(String deviceGuid, String authOnlyGuid) {
            this.deviceGuid = deviceGuid;
            this.authOnlyGuid = authOnlyGuid;
        }

        /**
         * Set sequenceNumber
         * @param sequenceNumber Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder sequenceNumber(String sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }
        
        /**
         * Set connexPayTransaction
         * @param connexPayTransaction  (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder connexPayTransaction(TransactionCaptureAuthorizationRequestConnexPayTransaction connexPayTransaction) {
            this.connexPayTransaction = connexPayTransaction;
            return this;
        }
        
        /**
         * Set orderNumber
         * @param orderNumber This is the most common number you&#39;ll see throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field. The maximum length is 50 alpha-numeric characters and allows dashes ( - ). If you provided an order number in the AUTH request it will be overwritten with the order number in the CAPTURE endpoint. (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        
        /**
         * Set customerID
         * @param customerID Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric. (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder customerID(String customerID) {
            this.customerID = customerID;
            return this;
        }
        
        /**
         * Set associationID
         * @param associationID Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting. (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder associationID(String associationID) {
            this.associationID = associationID;
            return this;
        }
        
        /**
         * Set customParameters
         * @param customParameters You can add custom parameters to your sale request in the event that you need to associate additional information with the pay-in. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter &#x3D; \\\&quot;invoice\\\&quot; and the value parameter as the invoice number. This requires customized reporting so you&#39;ll need to work with your implementations specialist to determine what&#39;s required. (optional)
         * @return CaptureAuthorizationRequestBuilder
         */
        public CaptureAuthorizationRequestBuilder customParameters(List<SaleCreateTransactionRequestCustomParametersInner> customParameters) {
            this.customParameters = customParameters;
            return this;
        }
        
        /**
         * Build call for captureAuthorization
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest = buildBodyParams();
            return captureAuthorizationCall(transactionCaptureAuthorizationRequest, _callback);
        }

        private TransactionCaptureAuthorizationRequest buildBodyParams() {
            TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest = new TransactionCaptureAuthorizationRequest();
            transactionCaptureAuthorizationRequest.deviceGuid(this.deviceGuid);
            transactionCaptureAuthorizationRequest.authOnlyGuid(this.authOnlyGuid);
            transactionCaptureAuthorizationRequest.sequenceNumber(this.sequenceNumber);
            transactionCaptureAuthorizationRequest.connexPayTransaction(this.connexPayTransaction);
            transactionCaptureAuthorizationRequest.orderNumber(this.orderNumber);
            transactionCaptureAuthorizationRequest.customerID(this.customerID);
            transactionCaptureAuthorizationRequest.associationID(this.associationID);
            transactionCaptureAuthorizationRequest.customParameters(this.customParameters);
            return transactionCaptureAuthorizationRequest;
        }

        /**
         * Execute captureAuthorization request
         * @return TransactionCaptureAuthorizationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public TransactionCaptureAuthorizationResponse execute() throws ApiException {
            TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest = buildBodyParams();
            ApiResponse<TransactionCaptureAuthorizationResponse> localVarResp = captureAuthorizationWithHttpInfo(transactionCaptureAuthorizationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute captureAuthorization request with HTTP info returned
         * @return ApiResponse&lt;TransactionCaptureAuthorizationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionCaptureAuthorizationResponse> executeWithHttpInfo() throws ApiException {
            TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest = buildBodyParams();
            return captureAuthorizationWithHttpInfo(transactionCaptureAuthorizationRequest);
        }

        /**
         * Execute captureAuthorization request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionCaptureAuthorizationResponse> _callback) throws ApiException {
            TransactionCaptureAuthorizationRequest transactionCaptureAuthorizationRequest = buildBodyParams();
            return captureAuthorizationAsync(transactionCaptureAuthorizationRequest, _callback);
        }
    }

    /**
     * Capture
     * Call this endpoint to Capture an Authorization so that it settles
     * @return CaptureAuthorizationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CaptureAuthorizationRequestBuilder captureAuthorization(String deviceGuid, String authOnlyGuid) throws IllegalArgumentException {
        if (deviceGuid == null) throw new IllegalArgumentException("\"deviceGuid\" is required but got null");
            

        if (authOnlyGuid == null) throw new IllegalArgumentException("\"authOnlyGuid\" is required but got null");
            

        return new CaptureAuthorizationRequestBuilder(deviceGuid, authOnlyGuid);
    }
    private okhttp3.Call createAchCreditPaymentCall(TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transactionCreateAchCreditPaymentRequest;

        // create path and map variables
        String localVarPath = "/api/v1/IssueACH";

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
    private okhttp3.Call createAchCreditPaymentValidateBeforeCall(TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest, final ApiCallback _callback) throws ApiException {
        return createAchCreditPaymentCall(transactionCreateAchCreditPaymentRequest, _callback);

    }


    private ApiResponse<TransactionCreateAchCreditPaymentResponse> createAchCreditPaymentWithHttpInfo(TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest) throws ApiException {
        okhttp3.Call localVarCall = createAchCreditPaymentValidateBeforeCall(transactionCreateAchCreditPaymentRequest, null);
        Type localVarReturnType = new TypeToken<TransactionCreateAchCreditPaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createAchCreditPaymentAsync(TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest, final ApiCallback<TransactionCreateAchCreditPaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAchCreditPaymentValidateBeforeCall(transactionCreateAchCreditPaymentRequest, _callback);
        Type localVarReturnType = new TypeToken<TransactionCreateAchCreditPaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateAchCreditPaymentRequestBuilder {
        private final String merchantGuid;
        private final Float amount;
        private final String payeeName;
        private final String incomingTransactionCode;
        private final TransactionCreateAchCreditPaymentRequestAccountHolder accountHolder;
        private String statementCompanyName;
        private String description;

        private CreateAchCreditPaymentRequestBuilder(String merchantGuid, Float amount, String payeeName, String incomingTransactionCode, TransactionCreateAchCreditPaymentRequestAccountHolder accountHolder) {
            this.merchantGuid = merchantGuid;
            this.amount = amount;
            this.payeeName = payeeName;
            this.incomingTransactionCode = incomingTransactionCode;
            this.accountHolder = accountHolder;
        }

        /**
         * Set statementCompanyName
         * @param statementCompanyName Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement. (optional, default to Merchant Alias)
         * @return CreateAchCreditPaymentRequestBuilder
         */
        public CreateAchCreditPaymentRequestBuilder statementCompanyName(String statementCompanyName) {
            this.statementCompanyName = statementCompanyName;
            return this;
        }
        
        /**
         * Set description
         * @param description For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement. (optional)
         * @return CreateAchCreditPaymentRequestBuilder
         */
        public CreateAchCreditPaymentRequestBuilder description(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Build call for createAchCreditPayment
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest = buildBodyParams();
            return createAchCreditPaymentCall(transactionCreateAchCreditPaymentRequest, _callback);
        }

        private TransactionCreateAchCreditPaymentRequest buildBodyParams() {
            TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest = new TransactionCreateAchCreditPaymentRequest();
            transactionCreateAchCreditPaymentRequest.merchantGuid(this.merchantGuid);
            transactionCreateAchCreditPaymentRequest.amount(this.amount);
            transactionCreateAchCreditPaymentRequest.payeeName(this.payeeName);
            transactionCreateAchCreditPaymentRequest.statementCompanyName(this.statementCompanyName);
            transactionCreateAchCreditPaymentRequest.description(this.description);
            transactionCreateAchCreditPaymentRequest.incomingTransactionCode(this.incomingTransactionCode);
            transactionCreateAchCreditPaymentRequest.accountHolder(this.accountHolder);
            return transactionCreateAchCreditPaymentRequest;
        }

        /**
         * Execute createAchCreditPayment request
         * @return TransactionCreateAchCreditPaymentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public TransactionCreateAchCreditPaymentResponse execute() throws ApiException {
            TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest = buildBodyParams();
            ApiResponse<TransactionCreateAchCreditPaymentResponse> localVarResp = createAchCreditPaymentWithHttpInfo(transactionCreateAchCreditPaymentRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createAchCreditPayment request with HTTP info returned
         * @return ApiResponse&lt;TransactionCreateAchCreditPaymentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionCreateAchCreditPaymentResponse> executeWithHttpInfo() throws ApiException {
            TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest = buildBodyParams();
            return createAchCreditPaymentWithHttpInfo(transactionCreateAchCreditPaymentRequest);
        }

        /**
         * Execute createAchCreditPayment request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionCreateAchCreditPaymentResponse> _callback) throws ApiException {
            TransactionCreateAchCreditPaymentRequest transactionCreateAchCreditPaymentRequest = buildBodyParams();
            return createAchCreditPaymentAsync(transactionCreateAchCreditPaymentRequest, _callback);
        }
    }

    /**
     * Issue ACH
     * This endpoint creates an ACH Credit payment.
     * @return CreateAchCreditPaymentRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CreateAchCreditPaymentRequestBuilder createAchCreditPayment(String merchantGuid, Float amount, String payeeName, String incomingTransactionCode, TransactionCreateAchCreditPaymentRequestAccountHolder accountHolder) throws IllegalArgumentException {
        if (merchantGuid == null) throw new IllegalArgumentException("\"merchantGuid\" is required but got null");
            

        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        if (payeeName == null) throw new IllegalArgumentException("\"payeeName\" is required but got null");
            

        if (incomingTransactionCode == null) throw new IllegalArgumentException("\"incomingTransactionCode\" is required but got null");
            

        if (accountHolder == null) throw new IllegalArgumentException("\"accountHolder\" is required but got null");
        return new CreateAchCreditPaymentRequestBuilder(merchantGuid, amount, payeeName, incomingTransactionCode, accountHolder);
    }
    private okhttp3.Call searchVirtualCardHistoryCall(String cardGuid, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/Cards/Transactions/{cardGuid}"
            .replace("{" + "CardGuid" + "}", localVarApiClient.escapeString(cardGuid.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchVirtualCardHistoryValidateBeforeCall(String cardGuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardGuid' is set
        if (cardGuid == null) {
            throw new ApiException("Missing the required parameter 'cardGuid' when calling searchVirtualCardHistory(Async)");
        }

        return searchVirtualCardHistoryCall(cardGuid, _callback);

    }


    private ApiResponse<TransactionSearchVirtualCardHistoryResponse> searchVirtualCardHistoryWithHttpInfo(String cardGuid) throws ApiException {
        okhttp3.Call localVarCall = searchVirtualCardHistoryValidateBeforeCall(cardGuid, null);
        Type localVarReturnType = new TypeToken<TransactionSearchVirtualCardHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call searchVirtualCardHistoryAsync(String cardGuid, final ApiCallback<TransactionSearchVirtualCardHistoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchVirtualCardHistoryValidateBeforeCall(cardGuid, _callback);
        Type localVarReturnType = new TypeToken<TransactionSearchVirtualCardHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SearchVirtualCardHistoryRequestBuilder {
        private final String cardGuid;

        private SearchVirtualCardHistoryRequestBuilder(String cardGuid) {
            this.cardGuid = cardGuid;
        }

        /**
         * Build call for searchVirtualCardHistory
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return searchVirtualCardHistoryCall(cardGuid, _callback);
        }


        /**
         * Execute searchVirtualCardHistory request
         * @return TransactionSearchVirtualCardHistoryResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public TransactionSearchVirtualCardHistoryResponse execute() throws ApiException {
            ApiResponse<TransactionSearchVirtualCardHistoryResponse> localVarResp = searchVirtualCardHistoryWithHttpInfo(cardGuid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute searchVirtualCardHistory request with HTTP info returned
         * @return ApiResponse&lt;TransactionSearchVirtualCardHistoryResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionSearchVirtualCardHistoryResponse> executeWithHttpInfo() throws ApiException {
            return searchVirtualCardHistoryWithHttpInfo(cardGuid);
        }

        /**
         * Execute searchVirtualCardHistory request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionSearchVirtualCardHistoryResponse> _callback) throws ApiException {
            return searchVirtualCardHistoryAsync(cardGuid, _callback);
        }
    }

    /**
     * Search Virtual Card History
     * This API allows you to pull back history of the Virtual Card. This is the same API (and data) that is used when clicking the “Transactions” button on the Virtual Card in the Portal to display the transaction history. The API will return the merchant name where the Virtual Card was used, the date and time, transaction type (auth, settlement, refund, void, etc.), the response/memo which correlates to the transaction type and the amount.
     * @param cardGuid Global Unique Identifier for the Card. Required parameter. (required)
     * @return SearchVirtualCardHistoryRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public SearchVirtualCardHistoryRequestBuilder searchVirtualCardHistory(String cardGuid) throws IllegalArgumentException {
        if (cardGuid == null) throw new IllegalArgumentException("\"cardGuid\" is required but got null");
            

        return new SearchVirtualCardHistoryRequestBuilder(cardGuid);
    }
}
