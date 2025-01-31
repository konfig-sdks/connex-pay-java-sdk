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
import com.konfigthis.client.model.MerchantPayeeDto;
import com.konfigthis.client.model.MerchantPayeePaginatedResponse;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.SearchMerchantPayeeDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantPayeesApi
 */
@Disabled
public class MerchantPayeesApiTest {

    private static MerchantPayeesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MerchantPayeesApi(apiClient);
    }

    /**
     * Create merchant payee
     *
     * Create a payee for a merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPayeeTest() throws ApiException {
        Boolean isBusiness = null;
        String payeeId = null;
        String preferredPayoutMethod = null;
        UUID merchantGuid = null;
        Integer idMerchant = null;
        String firstName = null;
        String lastName = null;
        String dbaName = null;
        String taxId = null;
        String customerId = null;
        String email = null;
        String address1 = null;
        String address2 = null;
        String city = null;
        String state = null;
        String zip = null;
        String country = null;
        String preferredCardBrand = null;
        String preferredCardClass = null;
        String purchaseType = null;
        UUID guid = null;
        OffsetDateTime timestamp = null;
        MerchantPayeeDto response = api.createPayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid)
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
        // TODO: test validations
    }

    /**
     * Delete merchant payee
     *
     * Delete a payee for a merchant by guid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePayeeTest() throws ApiException {
        UUID merchantGuid = null;
        UUID payeeGuid = null;
        api.deletePayee(merchantGuid, payeeGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a merchant payee by guid
     *
     * Get a payee for a merchant by guid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPayeeTest() throws ApiException {
        UUID merchantGuid = null;
        UUID payeeGuid = null;
        MerchantPayeeDto response = api.getPayee(merchantGuid, payeeGuid)
                .execute();
        // TODO: test validations
    }

    /**
     * Get merchant payees
     *
     * Get a list of payees for a merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPayeesTest() throws ApiException {
        UUID merchantGuid = null;
        Integer page = null;
        Integer pagesize = null;
        String searchTerm = null;
        MerchantPayeePaginatedResponse response = api.getPayees(merchantGuid, page, pagesize)
                .searchTerm(searchTerm)
                .execute();
        // TODO: test validations
    }

    /**
     * Update merchant payee
     *
     * Update a payee for a merchant by guid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePayeeTest() throws ApiException {
        Boolean isBusiness = null;
        String payeeId = null;
        String preferredPayoutMethod = null;
        UUID merchantGuid = null;
        UUID payeeGuid = null;
        Integer idMerchant = null;
        String firstName = null;
        String lastName = null;
        String dbaName = null;
        String taxId = null;
        String customerId = null;
        String email = null;
        String address1 = null;
        String address2 = null;
        String city = null;
        String state = null;
        String zip = null;
        String country = null;
        String preferredCardBrand = null;
        String preferredCardClass = null;
        String purchaseType = null;
        UUID guid = null;
        OffsetDateTime timestamp = null;
        api.updatePayee(isBusiness, payeeId, preferredPayoutMethod, merchantGuid, payeeGuid)
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
        // TODO: test validations
    }

}
