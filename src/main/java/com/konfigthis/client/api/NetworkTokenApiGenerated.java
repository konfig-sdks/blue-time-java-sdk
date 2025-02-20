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


import com.konfigthis.client.model.NetworkTokenRequestSource;
import com.konfigthis.client.model.NetworkTokenTokenizationResult;
import com.konfigthis.client.model.PayToolsApiModelsCardBaseWithSecurityCode;
import com.konfigthis.client.model.PayToolsApiModelsNetworkTokenizationDeleteTokenRequest;
import com.konfigthis.client.model.PayToolsApiModelsNetworkTokenizationTokenizeRequest;
import com.konfigthis.client.model.PayToolsApiModelsTokenizationRequest;
import com.konfigthis.client.model.PaymentsNetworkTokenSchemes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class NetworkTokenApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NetworkTokenApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkTokenApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call cardTokenizeCall(PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = payToolsApiModelsNetworkTokenizationTokenizeRequest;

        // create path and map variables
        String localVarPath = "/NetworkToken";

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cardTokenizeValidateBeforeCall(PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest, final ApiCallback _callback) throws ApiException {
        return cardTokenizeCall(payToolsApiModelsNetworkTokenizationTokenizeRequest, _callback);

    }


    private ApiResponse<NetworkTokenTokenizationResult> cardTokenizeWithHttpInfo(PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest) throws ApiException {
        okhttp3.Call localVarCall = cardTokenizeValidateBeforeCall(payToolsApiModelsNetworkTokenizationTokenizeRequest, null);
        Type localVarReturnType = new TypeToken<NetworkTokenTokenizationResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call cardTokenizeAsync(PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest, final ApiCallback<NetworkTokenTokenizationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = cardTokenizeValidateBeforeCall(payToolsApiModelsNetworkTokenizationTokenizeRequest, _callback);
        Type localVarReturnType = new TypeToken<NetworkTokenTokenizationResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CardTokenizeRequestBuilder {
        private PayToolsApiModelsTokenizationRequest tokenizationRequest;
        private PayToolsApiModelsCardBaseWithSecurityCode card;

        private CardTokenizeRequestBuilder() {
        }

        /**
         * Set tokenizationRequest
         * @param tokenizationRequest  (optional)
         * @return CardTokenizeRequestBuilder
         */
        public CardTokenizeRequestBuilder tokenizationRequest(PayToolsApiModelsTokenizationRequest tokenizationRequest) {
            this.tokenizationRequest = tokenizationRequest;
            return this;
        }
        
        /**
         * Set card
         * @param card  (optional)
         * @return CardTokenizeRequestBuilder
         */
        public CardTokenizeRequestBuilder card(PayToolsApiModelsCardBaseWithSecurityCode card) {
            this.card = card;
            return this;
        }
        
        /**
         * Build call for cardTokenize
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest = buildBodyParams();
            return cardTokenizeCall(payToolsApiModelsNetworkTokenizationTokenizeRequest, _callback);
        }

        private PayToolsApiModelsNetworkTokenizationTokenizeRequest buildBodyParams() {
            PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest = new PayToolsApiModelsNetworkTokenizationTokenizeRequest();
            payToolsApiModelsNetworkTokenizationTokenizeRequest.tokenizationRequest(this.tokenizationRequest);
            payToolsApiModelsNetworkTokenizationTokenizeRequest.card(this.card);
            return payToolsApiModelsNetworkTokenizationTokenizeRequest;
        }

        /**
         * Execute cardTokenize request
         * @return NetworkTokenTokenizationResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public NetworkTokenTokenizationResult execute() throws ApiException {
            PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest = buildBodyParams();
            ApiResponse<NetworkTokenTokenizationResult> localVarResp = cardTokenizeWithHttpInfo(payToolsApiModelsNetworkTokenizationTokenizeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute cardTokenize request with HTTP info returned
         * @return ApiResponse&lt;NetworkTokenTokenizationResult&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<NetworkTokenTokenizationResult> executeWithHttpInfo() throws ApiException {
            PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest = buildBodyParams();
            return cardTokenizeWithHttpInfo(payToolsApiModelsNetworkTokenizationTokenizeRequest);
        }

        /**
         * Execute cardTokenize request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<NetworkTokenTokenizationResult> _callback) throws ApiException {
            PayToolsApiModelsNetworkTokenizationTokenizeRequest payToolsApiModelsNetworkTokenizationTokenizeRequest = buildBodyParams();
            return cardTokenizeAsync(payToolsApiModelsNetworkTokenizationTokenizeRequest, _callback);
        }
    }

    /**
     * Network-tokenize a card
     * 
     * @return CardTokenizeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
     </table>
     */
    public CardTokenizeRequestBuilder cardTokenize() throws IllegalArgumentException {
        return new CardTokenizeRequestBuilder();
    }
    private okhttp3.Call deleteCall(PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = payToolsApiModelsNetworkTokenizationDeleteTokenRequest;

        // create path and map variables
        String localVarPath = "/NetworkToken";

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest, final ApiCallback _callback) throws ApiException {
        return deleteCall(payToolsApiModelsNetworkTokenizationDeleteTokenRequest, _callback);

    }


    private ApiResponse<Boolean> deleteWithHttpInfo(PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(payToolsApiModelsNetworkTokenizationDeleteTokenRequest, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteAsync(PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest, final ApiCallback<Boolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(payToolsApiModelsNetworkTokenizationDeleteTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DeleteRequestBuilder {
        private final NetworkTokenRequestSource source;
        private final String tokenId;
        private PaymentsNetworkTokenSchemes brand;
        private String reason;

        private DeleteRequestBuilder(NetworkTokenRequestSource source, String tokenId) {
            this.source = source;
            this.tokenId = tokenId;
        }

        /**
         * Set brand
         * @param brand  (optional)
         * @return DeleteRequestBuilder
         */
        public DeleteRequestBuilder brand(PaymentsNetworkTokenSchemes brand) {
            this.brand = brand;
            return this;
        }
        
        /**
         * Set reason
         * @param reason Reason for deletion (optional)
         * @return DeleteRequestBuilder
         */
        public DeleteRequestBuilder reason(String reason) {
            this.reason = reason;
            return this;
        }
        
        /**
         * Build call for delete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest = buildBodyParams();
            return deleteCall(payToolsApiModelsNetworkTokenizationDeleteTokenRequest, _callback);
        }

        private PayToolsApiModelsNetworkTokenizationDeleteTokenRequest buildBodyParams() {
            PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest = new PayToolsApiModelsNetworkTokenizationDeleteTokenRequest();
            payToolsApiModelsNetworkTokenizationDeleteTokenRequest.source(this.source);
            payToolsApiModelsNetworkTokenizationDeleteTokenRequest.brand(this.brand);
            payToolsApiModelsNetworkTokenizationDeleteTokenRequest.tokenId(this.tokenId);
            payToolsApiModelsNetworkTokenizationDeleteTokenRequest.reason(this.reason);
            return payToolsApiModelsNetworkTokenizationDeleteTokenRequest;
        }

        /**
         * Execute delete request
         * @return Boolean
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public Boolean execute() throws ApiException {
            PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest = buildBodyParams();
            ApiResponse<Boolean> localVarResp = deleteWithHttpInfo(payToolsApiModelsNetworkTokenizationDeleteTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute delete request with HTTP info returned
         * @return ApiResponse&lt;Boolean&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Boolean> executeWithHttpInfo() throws ApiException {
            PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest = buildBodyParams();
            return deleteWithHttpInfo(payToolsApiModelsNetworkTokenizationDeleteTokenRequest);
        }

        /**
         * Execute delete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Boolean> _callback) throws ApiException {
            PayToolsApiModelsNetworkTokenizationDeleteTokenRequest payToolsApiModelsNetworkTokenizationDeleteTokenRequest = buildBodyParams();
            return deleteAsync(payToolsApiModelsNetworkTokenizationDeleteTokenRequest, _callback);
        }
    }

    /**
     * Delete a Network-token
     * 
     * @return DeleteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
     </table>
     */
    public DeleteRequestBuilder delete(NetworkTokenRequestSource source, String tokenId) throws IllegalArgumentException {
        if (source == null) throw new IllegalArgumentException("\"source\" is required but got null");
        if (tokenId == null) throw new IllegalArgumentException("\"tokenId\" is required but got null");
            if (tokenId != null && tokenId.length() < 1) {
              throw new IllegalArgumentException("Invalid value for tokenId. Length must be greater than or equal to 1.");
            }

        return new DeleteRequestBuilder(source, tokenId);
    }
}
