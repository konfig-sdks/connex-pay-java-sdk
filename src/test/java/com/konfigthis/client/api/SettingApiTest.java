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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.SettingTokenizeBankAccountInfoRequest;
import com.konfigthis.client.model.SettingTokenizeBankAccountInfoRequestAccountHolder;
import com.konfigthis.client.model.SettingTokenizeBankAccountInfoResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingApi
 */
@Disabled
public class SettingApiTest {

    private static SettingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SettingApi(apiClient);
    }

    /**
     * Merchant Supplier Setting
     *
     * This endpoint allows you to create and tokenize a suppliers bank account information without actually making the Issue ACH call. That tokenized bank account can then be used in future Issue ACH or Issue ACH Lite API requests so you don&#39;t have to store the actual bank account information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenizeBankAccountInfoTest() throws ApiException {
        String merchantGuid = null;
        String supplierName = null;
        SettingTokenizeBankAccountInfoRequestAccountHolder accountHolder = null;
        SettingTokenizeBankAccountInfoResponse response = api.tokenizeBankAccountInfo(merchantGuid, supplierName, accountHolder)
                .execute();
        // TODO: test validations
    }

}
