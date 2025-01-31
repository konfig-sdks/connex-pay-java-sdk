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


import com.konfigthis.client.model.StatusGroup3DsAuthenticationStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StatusGroupApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatusGroupApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StatusGroupApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call call3dsAuthenticationStatusCall(String guid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/3ds/{GUID}"
            .replace("{" + "guid" + "}", localVarApiClient.escapeString(guid.toString()));

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
    private okhttp3.Call call3dsAuthenticationStatusValidateBeforeCall(String guid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiException("Missing the required parameter 'guid' when calling call3dsAuthenticationStatus(Async)");
        }

        return call3dsAuthenticationStatusCall(guid, _callback);

    }


    private ApiResponse<StatusGroup3DsAuthenticationStatusResponse> call3dsAuthenticationStatusWithHttpInfo(String guid) throws ApiException {
        okhttp3.Call localVarCall = call3dsAuthenticationStatusValidateBeforeCall(guid, null);
        Type localVarReturnType = new TypeToken<StatusGroup3DsAuthenticationStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call call3dsAuthenticationStatusAsync(String guid, final ApiCallback<StatusGroup3DsAuthenticationStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = call3dsAuthenticationStatusValidateBeforeCall(guid, _callback);
        Type localVarReturnType = new TypeToken<StatusGroup3DsAuthenticationStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class Call3dsAuthenticationStatusRequestBuilder {
        private final String guid;

        private Call3dsAuthenticationStatusRequestBuilder(String guid) {
            this.guid = guid;
        }

        /**
         * Build call for call3dsAuthenticationStatus
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
            return call3dsAuthenticationStatusCall(guid, _callback);
        }


        /**
         * Execute call3dsAuthenticationStatus request
         * @return StatusGroup3DsAuthenticationStatusResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public StatusGroup3DsAuthenticationStatusResponse execute() throws ApiException {
            ApiResponse<StatusGroup3DsAuthenticationStatusResponse> localVarResp = call3dsAuthenticationStatusWithHttpInfo(guid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute call3dsAuthenticationStatus request with HTTP info returned
         * @return ApiResponse&lt;StatusGroup3DsAuthenticationStatusResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StatusGroup3DsAuthenticationStatusResponse> executeWithHttpInfo() throws ApiException {
            return call3dsAuthenticationStatusWithHttpInfo(guid);
        }

        /**
         * Execute call3dsAuthenticationStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<StatusGroup3DsAuthenticationStatusResponse> _callback) throws ApiException {
            return call3dsAuthenticationStatusAsync(guid, _callback);
        }
    }

    /**
     * Get 3DS Status Group
     * This endpoint returns the 3D Secure status of an authentication when a device fingerprint and/or cardholder challenge are required for 3D Secure Authentication.
     * @param guid Replace the original guid value with the guid that was returned with the status response indicating a device fingerprint or cardholder challenge is required to complete 3DS authentication.. (required)
     * @return Call3dsAuthenticationStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public Call3dsAuthenticationStatusRequestBuilder call3dsAuthenticationStatus(String guid) throws IllegalArgumentException {
        if (guid == null) throw new IllegalArgumentException("\"guid\" is required but got null");
            

        return new Call3dsAuthenticationStatusRequestBuilder(guid);
    }
}
