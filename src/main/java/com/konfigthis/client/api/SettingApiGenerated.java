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


import com.konfigthis.client.model.SettingTokenizeBankAccountInfoRequest;
import com.konfigthis.client.model.SettingTokenizeBankAccountInfoRequestAccountHolder;
import com.konfigthis.client.model.SettingTokenizeBankAccountInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SettingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SettingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SettingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call tokenizeBankAccountInfoCall(SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = settingTokenizeBankAccountInfoRequest;

        // create path and map variables
        String localVarPath = "/api/v1/merchantsupplier/settings";

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
    private okhttp3.Call tokenizeBankAccountInfoValidateBeforeCall(SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest, final ApiCallback _callback) throws ApiException {
        return tokenizeBankAccountInfoCall(settingTokenizeBankAccountInfoRequest, _callback);

    }


    private ApiResponse<SettingTokenizeBankAccountInfoResponse> tokenizeBankAccountInfoWithHttpInfo(SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest) throws ApiException {
        okhttp3.Call localVarCall = tokenizeBankAccountInfoValidateBeforeCall(settingTokenizeBankAccountInfoRequest, null);
        Type localVarReturnType = new TypeToken<SettingTokenizeBankAccountInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call tokenizeBankAccountInfoAsync(SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest, final ApiCallback<SettingTokenizeBankAccountInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = tokenizeBankAccountInfoValidateBeforeCall(settingTokenizeBankAccountInfoRequest, _callback);
        Type localVarReturnType = new TypeToken<SettingTokenizeBankAccountInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TokenizeBankAccountInfoRequestBuilder {
        private final String merchantGuid;
        private final String supplierName;
        private final SettingTokenizeBankAccountInfoRequestAccountHolder accountHolder;

        private TokenizeBankAccountInfoRequestBuilder(String merchantGuid, String supplierName, SettingTokenizeBankAccountInfoRequestAccountHolder accountHolder) {
            this.merchantGuid = merchantGuid;
            this.supplierName = supplierName;
            this.accountHolder = accountHolder;
        }

        /**
         * Build call for tokenizeBankAccountInfo
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
            SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest = buildBodyParams();
            return tokenizeBankAccountInfoCall(settingTokenizeBankAccountInfoRequest, _callback);
        }

        private SettingTokenizeBankAccountInfoRequest buildBodyParams() {
            SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest = new SettingTokenizeBankAccountInfoRequest();
            settingTokenizeBankAccountInfoRequest.merchantGuid(this.merchantGuid);
            settingTokenizeBankAccountInfoRequest.supplierName(this.supplierName);
            settingTokenizeBankAccountInfoRequest.accountHolder(this.accountHolder);
            return settingTokenizeBankAccountInfoRequest;
        }

        /**
         * Execute tokenizeBankAccountInfo request
         * @return SettingTokenizeBankAccountInfoResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public SettingTokenizeBankAccountInfoResponse execute() throws ApiException {
            SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest = buildBodyParams();
            ApiResponse<SettingTokenizeBankAccountInfoResponse> localVarResp = tokenizeBankAccountInfoWithHttpInfo(settingTokenizeBankAccountInfoRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute tokenizeBankAccountInfo request with HTTP info returned
         * @return ApiResponse&lt;SettingTokenizeBankAccountInfoResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SettingTokenizeBankAccountInfoResponse> executeWithHttpInfo() throws ApiException {
            SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest = buildBodyParams();
            return tokenizeBankAccountInfoWithHttpInfo(settingTokenizeBankAccountInfoRequest);
        }

        /**
         * Execute tokenizeBankAccountInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SettingTokenizeBankAccountInfoResponse> _callback) throws ApiException {
            SettingTokenizeBankAccountInfoRequest settingTokenizeBankAccountInfoRequest = buildBodyParams();
            return tokenizeBankAccountInfoAsync(settingTokenizeBankAccountInfoRequest, _callback);
        }
    }

    /**
     * Merchant Supplier Setting
     * This endpoint allows you to create and tokenize a suppliers bank account information without actually making the Issue ACH call. That tokenized bank account can then be used in future Issue ACH or Issue ACH Lite API requests so you don&#39;t have to store the actual bank account information.
     * @return TokenizeBankAccountInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public TokenizeBankAccountInfoRequestBuilder tokenizeBankAccountInfo(String merchantGuid, String supplierName, SettingTokenizeBankAccountInfoRequestAccountHolder accountHolder) throws IllegalArgumentException {
        if (merchantGuid == null) throw new IllegalArgumentException("\"merchantGuid\" is required but got null");
            

        if (supplierName == null) throw new IllegalArgumentException("\"supplierName\" is required but got null");
            

        if (accountHolder == null) throw new IllegalArgumentException("\"accountHolder\" is required but got null");
        return new TokenizeBankAccountInfoRequestBuilder(merchantGuid, supplierName, accountHolder);
    }
}
