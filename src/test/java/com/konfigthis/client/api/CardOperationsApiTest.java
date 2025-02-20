/*
 * Orchestra API
 * Code Version 1.0.7.15
 *
 * The version of the OpenAPI document: Prod
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
import com.konfigthis.client.model.PayToolsApiModelsBrandLookupResult;
import com.konfigthis.client.model.PayToolsApiModelsCardInputModel;
import com.konfigthis.client.model.PayToolsApiModelsCardOpsChargeRequest;
import com.konfigthis.client.model.PayToolsApiModelsJwsMultipleOutputModel;
import com.konfigthis.client.model.PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull;
import com.konfigthis.client.model.PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull;
import com.konfigthis.client.model.PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull;
import com.konfigthis.client.model.PayToolsApiModelsPayerBase;
import com.konfigthis.client.model.PayToolsApiModelsPayerDetailsNoIpAddress;
import com.konfigthis.client.model.PayToolsApiModelsStringTokenIntputModel;
import com.konfigthis.client.model.PayToolsApiModelsTopBrands;
import com.konfigthis.client.model.PayToolsBlAuthenticationChargePresetData;
import com.konfigthis.client.model.PayToolsBlAuthenticationPreSignedDataModel;
import com.konfigthis.client.model.PayToolsBlAuthenticationSignedData;
import com.konfigthis.client.model.PayToolsBlAuthenticationThreeDsSessionModel;
import com.konfigthis.client.model.PayToolsBlAuthenticationTokenizationAction;
import com.konfigthis.client.model.PayToolsSharedEnumsPerform3ds;
import com.konfigthis.client.model.PciBookingIINLookupLibraryRiskLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardOperationsApi
 */
@Disabled
public class CardOperationsApiTest {

    private static CardOperationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CardOperationsApi(apiClient);
    }

    /**
     * Return brand of card prefix.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBrandPrefixTest() throws ApiException {
        String iin = null;
        PayToolsApiModelsBrandLookupResult response = api.getBrandPrefix(iin)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a token to start a card operation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenStartOperationTest() throws ApiException {
        Integer ttl = null;
        PayToolsBlAuthenticationThreeDsSessionModel threeDsSessionModel = null;
        PciBookingIINLookupLibraryRiskLevel vld = null;
        PayToolsSharedEnumsPerform3ds _3ds = null;
        Boolean crg = null;
        PayToolsBlAuthenticationTokenizationAction tkn = null;
        PayToolsBlAuthenticationChargePresetData crgD = null;
        PayToolsApiModelsJwsMultipleOutputModel response = api.getTokenStartOperation(ttl)
                .threeDsSessionModel(threeDsSessionModel)
                .vld(vld)
                ._3ds(_3ds)
                .crg(crg)
                .tkn(tkn)
                .crgD(crgD)
                .execute();
        // TODO: test validations
    }

    /**
     * Return top credit card brands for lookup of up to 5 first digits. It covers 90% of the cases
     *
     * The result is an array of 5 elements, where each element represents iin prefixes for a givel size as well as the list of logo Url&#39;s for all brands.  Each element in the top-level array is an object where members are prefixes and data is the brand.  For a quick lookup:  1. get the element by the size of your prefix.  2. try to obtain the prefix as a member name; The member value is the brand    For logo lookup finf thr brand name as the key to the logos member.  If not found, you can try using &#39;DEFAULT&#39;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopBrandsLookupTest() throws ApiException {
        PayToolsApiModelsTopBrands response = api.getTopBrandsLookup()
                .execute();
        // TODO: test validations
    }

    /**
     * Perform Univesal payment gateway charge operation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void performUniversalPaymentGatewayChargeTest() throws ApiException {
        PayToolsApiModelsCardInputModel card = null;
        PayToolsApiModelsPayerDetailsNoIpAddress payerDetails = null;
        String myRef = null;
        PayToolsApiModelsJwsOutputModel1PaymentsOperationResultPaymentsVersion0000CultureneutralPublicKeyTokennull response = api.performUniversalPaymentGatewayCharge(card)
                .payerDetails(payerDetails)
                .myRef(myRef)
                .execute();
        // TODO: test validations
    }

    /**
     * Perform card validation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void performValidationTest() throws ApiException {
        String countryCode = null;
        String iin = null;
        String city = null;
        String stateProvince = null;
        PayToolsApiModelsJwsOutputModel1pciBookingIINLookupLibraryCardValidationResultpciBookingIINLookupLibraryVersion1040CultureneutralPublicKeyTokennull response = api.performValidation(countryCode, iin)
                .city(city)
                .stateProvince(stateProvince)
                .execute();
        // TODO: test validations
    }

    /**
     * Perform validation of the operation using to signed data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void performValidation_0Test() throws ApiException {
        PayToolsBlAuthenticationSignedData response = api.performValidation_0()
                .execute();
        // TODO: test validations
    }

    /**
     * Tokenize and store card number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenizeAndStoreTest() throws ApiException {
        String payload = null;
        PayToolsApiModelsJwsOutputModel1PayToolsApiModelsStringTokenMetaDataOutputModelPayToolsApiVersion10715CultureneutralPublicKeyTokennull response = api.tokenizeAndStore(payload)
                .execute();
        // TODO: test validations
    }

}
