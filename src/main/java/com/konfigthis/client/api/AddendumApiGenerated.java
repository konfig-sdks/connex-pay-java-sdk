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


import com.konfigthis.client.model.AddendumCreateAchPurchaseRequest;
import com.konfigthis.client.model.AddendumCreateAchPurchaseResponse;
import com.konfigthis.client.model.AddendumCreateVirtualCardRequest;
import com.konfigthis.client.model.AddendumCreateVirtualCardResponse;
import com.konfigthis.client.model.AddendumDeleteItemResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AddendumApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AddendumApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AddendumApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createAchPurchaseCall(AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = addendumCreateAchPurchaseRequest;

        // create path and map variables
        String localVarPath = "/api/v1/Addendum/ACH";

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
    private okhttp3.Call createAchPurchaseValidateBeforeCall(AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest, final ApiCallback _callback) throws ApiException {
        return createAchPurchaseCall(addendumCreateAchPurchaseRequest, _callback);

    }


    private ApiResponse<AddendumCreateAchPurchaseResponse> createAchPurchaseWithHttpInfo(AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest) throws ApiException {
        okhttp3.Call localVarCall = createAchPurchaseValidateBeforeCall(addendumCreateAchPurchaseRequest, null);
        Type localVarReturnType = new TypeToken<AddendumCreateAchPurchaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createAchPurchaseAsync(AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest, final ApiCallback<AddendumCreateAchPurchaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAchPurchaseValidateBeforeCall(addendumCreateAchPurchaseRequest, _callback);
        Type localVarReturnType = new TypeToken<AddendumCreateAchPurchaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateAchPurchaseRequestBuilder {
        private String itemGuid;
        private String value;
        private String category;
        private String idExternal;
        private String note;
        private String sequence;

        private CreateAchPurchaseRequestBuilder() {
        }

        /**
         * Set itemGuid
         * @param itemGuid Guid for the ACH Purchase you are attaching information to with this addendum request. This Guid was returned to client when the ACH Purchase was initially created. (optional, default to Mandatory)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder itemGuid(String itemGuid) {
            this.itemGuid = itemGuid;
            return this;
        }
        
        /**
         * Set value
         * @param value Character data to associate with the Virtual card. (optional, default to Mandatory)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder value(String value) {
            this.value = value;
            return this;
        }
        
        /**
         * Set category
         * @param category Can be used by client to specify a desired category for an Addenda item. Consistent category parameters will aid in reporting consistently. See note below regarding the \\\&quot;MultipleSales\\\&quot; category and how to use the category specifically to associate an ACH Purchase to an existing sale(s). (optional, default to Optional)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder category(String category) {
            this.category = category;
            return this;
        }
        
        /**
         * Set idExternal
         * @param idExternal Can be supplied by client to associate this addendum with an ID in client&#39;s data. (optional, default to Optional)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder idExternal(String idExternal) {
            this.idExternal = idExternal;
            return this;
        }
        
        /**
         * Set note
         * @param note Additional information to associate with this addendum, as desired. (optional, default to Optional)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder note(String note) {
            this.note = note;
            return this;
        }
        
        /**
         * Set sequence
         * @param sequence If client creates multiple addenda for a single ACH Purchase this sequence can be specified if a client desires. (optional, default to Optional)
         * @return CreateAchPurchaseRequestBuilder
         */
        public CreateAchPurchaseRequestBuilder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        
        /**
         * Build call for createAchPurchase
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
            AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest = buildBodyParams();
            return createAchPurchaseCall(addendumCreateAchPurchaseRequest, _callback);
        }

        private AddendumCreateAchPurchaseRequest buildBodyParams() {
            AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest = new AddendumCreateAchPurchaseRequest();
            addendumCreateAchPurchaseRequest.itemGuid(this.itemGuid);
            addendumCreateAchPurchaseRequest.value(this.value);
            addendumCreateAchPurchaseRequest.category(this.category);
            addendumCreateAchPurchaseRequest.idExternal(this.idExternal);
            addendumCreateAchPurchaseRequest.note(this.note);
            addendumCreateAchPurchaseRequest.sequence(this.sequence);
            return addendumCreateAchPurchaseRequest;
        }

        /**
         * Execute createAchPurchase request
         * @return AddendumCreateAchPurchaseResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public AddendumCreateAchPurchaseResponse execute() throws ApiException {
            AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest = buildBodyParams();
            ApiResponse<AddendumCreateAchPurchaseResponse> localVarResp = createAchPurchaseWithHttpInfo(addendumCreateAchPurchaseRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createAchPurchase request with HTTP info returned
         * @return ApiResponse&lt;AddendumCreateAchPurchaseResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AddendumCreateAchPurchaseResponse> executeWithHttpInfo() throws ApiException {
            AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest = buildBodyParams();
            return createAchPurchaseWithHttpInfo(addendumCreateAchPurchaseRequest);
        }

        /**
         * Execute createAchPurchase request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AddendumCreateAchPurchaseResponse> _callback) throws ApiException {
            AddendumCreateAchPurchaseRequest addendumCreateAchPurchaseRequest = buildBodyParams();
            return createAchPurchaseAsync(addendumCreateAchPurchaseRequest, _callback);
        }
    }

    /**
     * ACH Purchase Addendum
     * 
     * @return CreateAchPurchaseRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
     </table>
     */
    public CreateAchPurchaseRequestBuilder createAchPurchase() throws IllegalArgumentException {
        return new CreateAchPurchaseRequestBuilder();
    }
    private okhttp3.Call createVirtualCardCall(AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = addendumCreateVirtualCardRequest;

        // create path and map variables
        String localVarPath = "/api/v1/Addendum/VirtualCard";

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
    private okhttp3.Call createVirtualCardValidateBeforeCall(AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest, final ApiCallback _callback) throws ApiException {
        return createVirtualCardCall(addendumCreateVirtualCardRequest, _callback);

    }


    private ApiResponse<AddendumCreateVirtualCardResponse> createVirtualCardWithHttpInfo(AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest) throws ApiException {
        okhttp3.Call localVarCall = createVirtualCardValidateBeforeCall(addendumCreateVirtualCardRequest, null);
        Type localVarReturnType = new TypeToken<AddendumCreateVirtualCardResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createVirtualCardAsync(AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest, final ApiCallback<AddendumCreateVirtualCardResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVirtualCardValidateBeforeCall(addendumCreateVirtualCardRequest, _callback);
        Type localVarReturnType = new TypeToken<AddendumCreateVirtualCardResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateVirtualCardRequestBuilder {
        private String itemGuid;
        private String value;
        private String category;
        private String idExternal;
        private String note;
        private String sequence;

        private CreateVirtualCardRequestBuilder() {
        }

        /**
         * Set itemGuid
         * @param itemGuid Guid for the Virtual Card you are attaching information to with this addendum request. This Guid was returned to client when the Virtual Card was initially created. (optional, default to Mandatory)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder itemGuid(String itemGuid) {
            this.itemGuid = itemGuid;
            return this;
        }
        
        /**
         * Set value
         * @param value Character data to associate with the Virtual card. (optional, default to Mandatory)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder value(String value) {
            this.value = value;
            return this;
        }
        
        /**
         * Set category
         * @param category Can be used by client to specify a desired category for an Addenda item. (optional, default to Optional)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder category(String category) {
            this.category = category;
            return this;
        }
        
        /**
         * Set idExternal
         * @param idExternal Can be supplied by client to associate this addendum with an ID in client&#39;s data. (optional, default to Optional)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder idExternal(String idExternal) {
            this.idExternal = idExternal;
            return this;
        }
        
        /**
         * Set note
         * @param note Additional information to associate with this addendum, as desired. (optional, default to Optional)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder note(String note) {
            this.note = note;
            return this;
        }
        
        /**
         * Set sequence
         * @param sequence If client creates multiple addenda for a single Virtual Card this sequence can be specified if a client desires. (optional, default to Optional)
         * @return CreateVirtualCardRequestBuilder
         */
        public CreateVirtualCardRequestBuilder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        
        /**
         * Build call for createVirtualCard
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
            AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = buildBodyParams();
            return createVirtualCardCall(addendumCreateVirtualCardRequest, _callback);
        }

        private AddendumCreateVirtualCardRequest buildBodyParams() {
            AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = new AddendumCreateVirtualCardRequest();
            addendumCreateVirtualCardRequest.itemGuid(this.itemGuid);
            addendumCreateVirtualCardRequest.value(this.value);
            addendumCreateVirtualCardRequest.category(this.category);
            addendumCreateVirtualCardRequest.idExternal(this.idExternal);
            addendumCreateVirtualCardRequest.note(this.note);
            addendumCreateVirtualCardRequest.sequence(this.sequence);
            return addendumCreateVirtualCardRequest;
        }

        /**
         * Execute createVirtualCard request
         * @return AddendumCreateVirtualCardResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public AddendumCreateVirtualCardResponse execute() throws ApiException {
            AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = buildBodyParams();
            ApiResponse<AddendumCreateVirtualCardResponse> localVarResp = createVirtualCardWithHttpInfo(addendumCreateVirtualCardRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createVirtualCard request with HTTP info returned
         * @return ApiResponse&lt;AddendumCreateVirtualCardResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AddendumCreateVirtualCardResponse> executeWithHttpInfo() throws ApiException {
            AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = buildBodyParams();
            return createVirtualCardWithHttpInfo(addendumCreateVirtualCardRequest);
        }

        /**
         * Execute createVirtualCard request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AddendumCreateVirtualCardResponse> _callback) throws ApiException {
            AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = buildBodyParams();
            return createVirtualCardAsync(addendumCreateVirtualCardRequest, _callback);
        }
    }

    /**
     * Virtual Card Addendum
     * 
     * @return CreateVirtualCardRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
     </table>
     */
    public CreateVirtualCardRequestBuilder createVirtualCard() throws IllegalArgumentException {
        return new CreateVirtualCardRequestBuilder();
    }
    private okhttp3.Call deleteItemCall(String guid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/Addendum/Remove/<guid>"
            .replace("{" + "Guid" + "}", localVarApiClient.escapeString(guid.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteItemValidateBeforeCall(String guid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiException("Missing the required parameter 'guid' when calling deleteItem(Async)");
        }

        return deleteItemCall(guid, _callback);

    }


    private ApiResponse<AddendumDeleteItemResponse> deleteItemWithHttpInfo(String guid) throws ApiException {
        okhttp3.Call localVarCall = deleteItemValidateBeforeCall(guid, null);
        Type localVarReturnType = new TypeToken<AddendumDeleteItemResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteItemAsync(String guid, final ApiCallback<AddendumDeleteItemResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteItemValidateBeforeCall(guid, _callback);
        Type localVarReturnType = new TypeToken<AddendumDeleteItemResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DeleteItemRequestBuilder {
        private final String guid;

        private DeleteItemRequestBuilder(String guid) {
            this.guid = guid;
        }

        /**
         * Build call for deleteItem
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
            return deleteItemCall(guid, _callback);
        }


        /**
         * Execute deleteItem request
         * @return AddendumDeleteItemResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AddendumDeleteItemResponse execute() throws ApiException {
            ApiResponse<AddendumDeleteItemResponse> localVarResp = deleteItemWithHttpInfo(guid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute deleteItem request with HTTP info returned
         * @return ApiResponse&lt;AddendumDeleteItemResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AddendumDeleteItemResponse> executeWithHttpInfo() throws ApiException {
            return deleteItemWithHttpInfo(guid);
        }

        /**
         * Execute deleteItem request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AddendumDeleteItemResponse> _callback) throws ApiException {
            return deleteItemAsync(guid, _callback);
        }
    }

    /**
     * Addendum Remove
     * This endpoint deletes an Addendum information item from an object.
     * @param guid The Addendum guid to terminate. (required)
     * @return DeleteItemRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public DeleteItemRequestBuilder deleteItem(String guid) throws IllegalArgumentException {
        if (guid == null) throw new IllegalArgumentException("\"guid\" is required but got null");
            

        return new DeleteItemRequestBuilder(guid);
    }
}
