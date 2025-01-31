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


import com.konfigthis.client.model.FundingMerchantCashBalanceRequest;
import com.konfigthis.client.model.FundingMerchantCashBalanceResponse;
import com.konfigthis.client.model.FundingTransferMerchantCashBalanceRequest;
import com.konfigthis.client.model.FundingTransferMerchantCashBalanceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FundingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FundingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public FundingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call merchantCashBalanceCall(FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fundingMerchantCashBalanceRequest;

        // create path and map variables
        String localVarPath = "/api/v1/MerchantSelfServiceFunding";

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
    private okhttp3.Call merchantCashBalanceValidateBeforeCall(FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest, final ApiCallback _callback) throws ApiException {
        return merchantCashBalanceCall(fundingMerchantCashBalanceRequest, _callback);

    }


    private ApiResponse<FundingMerchantCashBalanceResponse> merchantCashBalanceWithHttpInfo(FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest) throws ApiException {
        okhttp3.Call localVarCall = merchantCashBalanceValidateBeforeCall(fundingMerchantCashBalanceRequest, null);
        Type localVarReturnType = new TypeToken<FundingMerchantCashBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call merchantCashBalanceAsync(FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest, final ApiCallback<FundingMerchantCashBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = merchantCashBalanceValidateBeforeCall(fundingMerchantCashBalanceRequest, _callback);
        Type localVarReturnType = new TypeToken<FundingMerchantCashBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class MerchantCashBalanceRequestBuilder {
        private final String merchantGUID;
        private final Float amount;
        private final Boolean isFundCashBalance;

        private MerchantCashBalanceRequestBuilder(String merchantGUID, Float amount, Boolean isFundCashBalance) {
            this.merchantGUID = merchantGUID;
            this.amount = amount;
            this.isFundCashBalance = isFundCashBalance;
        }

        /**
         * Build call for merchantCashBalance
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest = buildBodyParams();
            return merchantCashBalanceCall(fundingMerchantCashBalanceRequest, _callback);
        }

        private FundingMerchantCashBalanceRequest buildBodyParams() {
            FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest = new FundingMerchantCashBalanceRequest();
            fundingMerchantCashBalanceRequest.merchantGUID(this.merchantGUID);
            fundingMerchantCashBalanceRequest.amount(this.amount);
            fundingMerchantCashBalanceRequest.isFundCashBalance(this.isFundCashBalance);
            return fundingMerchantCashBalanceRequest;
        }

        /**
         * Execute merchantCashBalance request
         * @return FundingMerchantCashBalanceResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public FundingMerchantCashBalanceResponse execute() throws ApiException {
            FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest = buildBodyParams();
            ApiResponse<FundingMerchantCashBalanceResponse> localVarResp = merchantCashBalanceWithHttpInfo(fundingMerchantCashBalanceRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute merchantCashBalance request with HTTP info returned
         * @return ApiResponse&lt;FundingMerchantCashBalanceResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<FundingMerchantCashBalanceResponse> executeWithHttpInfo() throws ApiException {
            FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest = buildBodyParams();
            return merchantCashBalanceWithHttpInfo(fundingMerchantCashBalanceRequest);
        }

        /**
         * Execute merchantCashBalance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<FundingMerchantCashBalanceResponse> _callback) throws ApiException {
            FundingMerchantCashBalanceRequest fundingMerchantCashBalanceRequest = buildBodyParams();
            return merchantCashBalanceAsync(fundingMerchantCashBalanceRequest, _callback);
        }
    }

    /**
     * Client Self-Service Funding
     * Use this endpoint to fund or withdraw your merchant cash balance with your merchant bank account.
     * @return MerchantCashBalanceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
     </table>
     */
    public MerchantCashBalanceRequestBuilder merchantCashBalance(String merchantGUID, Float amount, Boolean isFundCashBalance) throws IllegalArgumentException {
        if (merchantGUID == null) throw new IllegalArgumentException("\"merchantGUID\" is required but got null");
            

        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        if (isFundCashBalance == null) throw new IllegalArgumentException("\"isFundCashBalance\" is required but got null");
        return new MerchantCashBalanceRequestBuilder(merchantGUID, amount, isFundCashBalance);
    }
    private okhttp3.Call transferMerchantCashBalanceCall(FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fundingTransferMerchantCashBalanceRequest;

        // create path and map variables
        String localVarPath = "/api/v1/MerchantFlexFunding/Funds/Transfer";

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
    private okhttp3.Call transferMerchantCashBalanceValidateBeforeCall(FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest, final ApiCallback _callback) throws ApiException {
        return transferMerchantCashBalanceCall(fundingTransferMerchantCashBalanceRequest, _callback);

    }


    private ApiResponse<FundingTransferMerchantCashBalanceResponse> transferMerchantCashBalanceWithHttpInfo(FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest) throws ApiException {
        okhttp3.Call localVarCall = transferMerchantCashBalanceValidateBeforeCall(fundingTransferMerchantCashBalanceRequest, null);
        Type localVarReturnType = new TypeToken<FundingTransferMerchantCashBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call transferMerchantCashBalanceAsync(FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest, final ApiCallback<FundingTransferMerchantCashBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = transferMerchantCashBalanceValidateBeforeCall(fundingTransferMerchantCashBalanceRequest, _callback);
        Type localVarReturnType = new TypeToken<FundingTransferMerchantCashBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TransferMerchantCashBalanceRequestBuilder {
        private final String transferredFrom;
        private final String transferredTo;
        private final Float amount;

        private TransferMerchantCashBalanceRequestBuilder(String transferredFrom, String transferredTo, Float amount) {
            this.transferredFrom = transferredFrom;
            this.transferredTo = transferredTo;
            this.amount = amount;
        }

        /**
         * Build call for transferMerchantCashBalance
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
            FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest = buildBodyParams();
            return transferMerchantCashBalanceCall(fundingTransferMerchantCashBalanceRequest, _callback);
        }

        private FundingTransferMerchantCashBalanceRequest buildBodyParams() {
            FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest = new FundingTransferMerchantCashBalanceRequest();
            fundingTransferMerchantCashBalanceRequest.transferredFrom(this.transferredFrom);
            fundingTransferMerchantCashBalanceRequest.transferredTo(this.transferredTo);
            fundingTransferMerchantCashBalanceRequest.amount(this.amount);
            return fundingTransferMerchantCashBalanceRequest;
        }

        /**
         * Execute transferMerchantCashBalance request
         * @return FundingTransferMerchantCashBalanceResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public FundingTransferMerchantCashBalanceResponse execute() throws ApiException {
            FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest = buildBodyParams();
            ApiResponse<FundingTransferMerchantCashBalanceResponse> localVarResp = transferMerchantCashBalanceWithHttpInfo(fundingTransferMerchantCashBalanceRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute transferMerchantCashBalance request with HTTP info returned
         * @return ApiResponse&lt;FundingTransferMerchantCashBalanceResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<FundingTransferMerchantCashBalanceResponse> executeWithHttpInfo() throws ApiException {
            FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest = buildBodyParams();
            return transferMerchantCashBalanceWithHttpInfo(fundingTransferMerchantCashBalanceRequest);
        }

        /**
         * Execute transferMerchantCashBalance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<FundingTransferMerchantCashBalanceResponse> _callback) throws ApiException {
            FundingTransferMerchantCashBalanceRequest fundingTransferMerchantCashBalanceRequest = buildBodyParams();
            return transferMerchantCashBalanceAsync(fundingTransferMerchantCashBalanceRequest, _callback);
        }
    }

    /**
     * Client Funds Transfer
     * Use this endpoint to transfer funds between your merchant cash balances within the same Corporate entity.
     * @return TransferMerchantCashBalanceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public TransferMerchantCashBalanceRequestBuilder transferMerchantCashBalance(String transferredFrom, String transferredTo, Float amount) throws IllegalArgumentException {
        if (transferredFrom == null) throw new IllegalArgumentException("\"transferredFrom\" is required but got null");
            

        if (transferredTo == null) throw new IllegalArgumentException("\"transferredTo\" is required but got null");
            

        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        return new TransferMerchantCashBalanceRequestBuilder(transferredFrom, transferredTo, amount);
    }
}
