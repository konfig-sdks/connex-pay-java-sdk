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


import java.time.LocalDate;
import com.konfigthis.client.model.ValidationSearchVerifyOperationRequest;
import com.konfigthis.client.model.ValidationSearchVerifyOperationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ValidationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ValidationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ValidationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call searchVerifyOperationCall(String exportable, Integer pageNumber, String pageSize, ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = validationSearchVerifyOperationRequest;

        // create path and map variables
        String localVarPath = "/api/v1/Search/Verify/{exportable}/{pageNumber}/{pageSize}"
            .replace("{" + "Exportable" + "}", localVarApiClient.escapeString(exportable.toString()))
            .replace("{" + "PageNumber" + "}", localVarApiClient.escapeString(pageNumber.toString()))
            .replace("{" + "PageSize" + "}", localVarApiClient.escapeString(pageSize.toString()));

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
    private okhttp3.Call searchVerifyOperationValidateBeforeCall(String exportable, Integer pageNumber, String pageSize, ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exportable' is set
        if (exportable == null) {
            throw new ApiException("Missing the required parameter 'exportable' when calling searchVerifyOperation(Async)");
        }

        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling searchVerifyOperation(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling searchVerifyOperation(Async)");
        }

        return searchVerifyOperationCall(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest, _callback);

    }


    private ApiResponse<ValidationSearchVerifyOperationResponse> searchVerifyOperationWithHttpInfo(String exportable, Integer pageNumber, String pageSize, ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest) throws ApiException {
        okhttp3.Call localVarCall = searchVerifyOperationValidateBeforeCall(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest, null);
        Type localVarReturnType = new TypeToken<ValidationSearchVerifyOperationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call searchVerifyOperationAsync(String exportable, Integer pageNumber, String pageSize, ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest, final ApiCallback<ValidationSearchVerifyOperationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchVerifyOperationValidateBeforeCall(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest, _callback);
        Type localVarReturnType = new TypeToken<ValidationSearchVerifyOperationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SearchVerifyOperationRequestBuilder {
        private final String exportable;
        private final Integer pageNumber;
        private final String pageSize;
        private String merchantGuid;
        private String cardLastFour;
        private String cardHolderName;
        private String cardType;
        private LocalDate timeStampFrom;
        private LocalDate timeStampTo;
        private String status;

        private SearchVerifyOperationRequestBuilder(String exportable, Integer pageNumber, String pageSize) {
            this.exportable = exportable;
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
        }

        /**
         * Set merchantGuid
         * @param merchantGuid Merchant’s Guid. (optional, default to Mandatory)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder merchantGuid(String merchantGuid) {
            this.merchantGuid = merchantGuid;
            return this;
        }
        
        /**
         * Set cardLastFour
         * @param cardLastFour Card last four number. (optional, default to Optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder cardLastFour(String cardLastFour) {
            this.cardLastFour = cardLastFour;
            return this;
        }
        
        /**
         * Set cardHolderName
         * @param cardHolderName Cardholder’s name. Providing information in this field allows a user of the ConnexPay portal to search for a transaction using the cardholder name. (optional, default to Optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder cardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }
        
        /**
         * Set cardType
         * @param cardType Card Type. (optional, default to Optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        
        /**
         * Set timeStampFrom
         * @param timeStampFrom Verify’s TimeStamp From. (optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder timeStampFrom(LocalDate timeStampFrom) {
            this.timeStampFrom = timeStampFrom;
            return this;
        }
        
        /**
         * Set timeStampTo
         * @param timeStampTo Verify’s TimeStamp To. (optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder timeStampTo(LocalDate timeStampTo) {
            this.timeStampTo = timeStampTo;
            return this;
        }
        
        /**
         * Set status
         * @param status Verify’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning (optional, default to Optional)
         * @return SearchVerifyOperationRequestBuilder
         */
        public SearchVerifyOperationRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Build call for searchVerifyOperation
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
            ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest = buildBodyParams();
            return searchVerifyOperationCall(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest, _callback);
        }

        private ValidationSearchVerifyOperationRequest buildBodyParams() {
            ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest = new ValidationSearchVerifyOperationRequest();
            validationSearchVerifyOperationRequest.merchantGuid(this.merchantGuid);
            validationSearchVerifyOperationRequest.cardLastFour(this.cardLastFour);
            validationSearchVerifyOperationRequest.cardHolderName(this.cardHolderName);
            validationSearchVerifyOperationRequest.cardType(this.cardType);
            validationSearchVerifyOperationRequest.timeStampFrom(this.timeStampFrom);
            validationSearchVerifyOperationRequest.timeStampTo(this.timeStampTo);
            validationSearchVerifyOperationRequest.status(this.status);
            return validationSearchVerifyOperationRequest;
        }

        /**
         * Execute searchVerifyOperation request
         * @return ValidationSearchVerifyOperationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ValidationSearchVerifyOperationResponse execute() throws ApiException {
            ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest = buildBodyParams();
            ApiResponse<ValidationSearchVerifyOperationResponse> localVarResp = searchVerifyOperationWithHttpInfo(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute searchVerifyOperation request with HTTP info returned
         * @return ApiResponse&lt;ValidationSearchVerifyOperationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ValidationSearchVerifyOperationResponse> executeWithHttpInfo() throws ApiException {
            ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest = buildBodyParams();
            return searchVerifyOperationWithHttpInfo(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest);
        }

        /**
         * Execute searchVerifyOperation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ValidationSearchVerifyOperationResponse> _callback) throws ApiException {
            ValidationSearchVerifyOperationRequest validationSearchVerifyOperationRequest = buildBodyParams();
            return searchVerifyOperationAsync(exportable, pageNumber, pageSize, validationSearchVerifyOperationRequest, _callback);
        }
    }

    /**
     * Search verify
     * This endpoint search a verify.
     * @param exportable True or False. It means if you want results exportable to CSV. (required)
     * @param pageNumber Int. Number of page of the results. Default is 1 (Page size default is 500). (required)
     * @param pageSize Int. Size of each page of the results. Default is 500. (required)
     * @return SearchVerifyOperationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public SearchVerifyOperationRequestBuilder searchVerifyOperation(String exportable, Integer pageNumber, String pageSize) throws IllegalArgumentException {
        if (exportable == null) throw new IllegalArgumentException("\"exportable\" is required but got null");
            

        if (pageNumber == null) throw new IllegalArgumentException("\"pageNumber\" is required but got null");
        if (pageSize == null) throw new IllegalArgumentException("\"pageSize\" is required but got null");
            

        return new SearchVerifyOperationRequestBuilder(exportable, pageNumber, pageSize);
    }
}
