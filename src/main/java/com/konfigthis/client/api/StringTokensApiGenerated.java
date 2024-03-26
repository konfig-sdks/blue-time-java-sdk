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


import com.konfigthis.client.model.PayToolsApiModelsStringTokenIntputModel;
import com.konfigthis.client.model.PayToolsApiModelsStringTokenMetaDataOutputModel;
import com.konfigthis.client.model.PayToolsApiModelsStringTokenOutputModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StringTokensApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StringTokensApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StringTokensApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call deleteByTokenCall(String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/StringTokens/{token}"
            .replace("{" + "token" + "}", localVarApiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteByTokenValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling deleteByToken(Async)");
        }

        return deleteByTokenCall(token, _callback);

    }


    private ApiResponse<Void> deleteByTokenWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = deleteByTokenValidateBeforeCall(token, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteByTokenAsync(String token, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteByTokenValidateBeforeCall(token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteByTokenRequestBuilder {
        private final String token;

        private DeleteByTokenRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Build call for deleteByToken
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteByTokenCall(token, _callback);
        }


        /**
         * Execute deleteByToken request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteByTokenWithHttpInfo(token);
        }

        /**
         * Execute deleteByToken request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteByTokenWithHttpInfo(token);
        }

        /**
         * Execute deleteByToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteByTokenAsync(token, _callback);
        }
    }

    /**
     * Delete an existing string by token
     * This method allows you to delete a stringToken by its token
     * @param token The token ID representing the string to be deleted (required)
     * @return DeleteByTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
     */
    public DeleteByTokenRequestBuilder deleteByToken(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new DeleteByTokenRequestBuilder(token);
    }
    private okhttp3.Call getContentCall(String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/StringTokens/{token}"
            .replace("{" + "token" + "}", localVarApiClient.escapeString(token.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContentValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getContent(Async)");
        }

        return getContentCall(token, _callback);

    }


    private ApiResponse<PayToolsApiModelsStringTokenOutputModel> getContentWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = getContentValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenOutputModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getContentAsync(String token, final ApiCallback<PayToolsApiModelsStringTokenOutputModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContentValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenOutputModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetContentRequestBuilder {
        private final String token;

        private GetContentRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Build call for getContent
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getContentCall(token, _callback);
        }


        /**
         * Execute getContent request
         * @return PayToolsApiModelsStringTokenOutputModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public PayToolsApiModelsStringTokenOutputModel execute() throws ApiException {
            ApiResponse<PayToolsApiModelsStringTokenOutputModel> localVarResp = getContentWithHttpInfo(token);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getContent request with HTTP info returned
         * @return ApiResponse&lt;PayToolsApiModelsStringTokenOutputModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayToolsApiModelsStringTokenOutputModel> executeWithHttpInfo() throws ApiException {
            return getContentWithHttpInfo(token);
        }

        /**
         * Execute getContent request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayToolsApiModelsStringTokenOutputModel> _callback) throws ApiException {
            return getContentAsync(token, _callback);
        }
    }

    /**
     * Retrieve content of StringToken
     * This method allows you to retrieve the stored content of the StringToken.
     * @param token The token ID of the StringToken you would like to retrieve the content for (required)
     * @return GetContentRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
     */
    public GetContentRequestBuilder getContent(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new GetContentRequestBuilder(token);
    }
    private okhttp3.Call getMetaDataCall(String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/StringTokens/{token}/meta"
            .replace("{" + "token" + "}", localVarApiClient.escapeString(token.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMetaDataValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getMetaData(Async)");
        }

        return getMetaDataCall(token, _callback);

    }


    private ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> getMetaDataWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = getMetaDataValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenMetaDataOutputModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getMetaDataAsync(String token, final ApiCallback<PayToolsApiModelsStringTokenMetaDataOutputModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaDataValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenMetaDataOutputModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetMetaDataRequestBuilder {
        private final String token;

        private GetMetaDataRequestBuilder(String token) {
            this.token = token;
        }

        /**
         * Build call for getMetaData
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getMetaDataCall(token, _callback);
        }


        /**
         * Execute getMetaData request
         * @return PayToolsApiModelsStringTokenMetaDataOutputModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public PayToolsApiModelsStringTokenMetaDataOutputModel execute() throws ApiException {
            ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> localVarResp = getMetaDataWithHttpInfo(token);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getMetaData request with HTTP info returned
         * @return ApiResponse&lt;PayToolsApiModelsStringTokenMetaDataOutputModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> executeWithHttpInfo() throws ApiException {
            return getMetaDataWithHttpInfo(token);
        }

        /**
         * Execute getMetaData request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayToolsApiModelsStringTokenMetaDataOutputModel> _callback) throws ApiException {
            return getMetaDataAsync(token, _callback);
        }
    }

    /**
     * Retrieve meta data of a StringToken
     * This method allows you to retrieve the meta data of a StringToken.  The response to this method will **not** retrieve the content of the StringToken (you can do that by using &#x60;GET /StringTokens/{token}&#x60;)
     * @param token Token representing the string to be retrieved (required)
     * @return GetMetaDataRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
     */
    public GetMetaDataRequestBuilder getMetaData(String token) throws IllegalArgumentException {
        if (token == null) throw new IllegalArgumentException("\"token\" is required but got null");
            

        return new GetMetaDataRequestBuilder(token);
    }
    private okhttp3.Call storeAndTokenizeCall(PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = payToolsApiModelsStringTokenIntputModel;

        // create path and map variables
        String localVarPath = "/StringTokens";

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
    private okhttp3.Call storeAndTokenizeValidateBeforeCall(PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'payToolsApiModelsStringTokenIntputModel' is set
        if (payToolsApiModelsStringTokenIntputModel == null) {
            throw new ApiException("Missing the required parameter 'payToolsApiModelsStringTokenIntputModel' when calling storeAndTokenize(Async)");
        }

        return storeAndTokenizeCall(payToolsApiModelsStringTokenIntputModel, _callback);

    }


    private ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> storeAndTokenizeWithHttpInfo(PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel) throws ApiException {
        okhttp3.Call localVarCall = storeAndTokenizeValidateBeforeCall(payToolsApiModelsStringTokenIntputModel, null);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenMetaDataOutputModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call storeAndTokenizeAsync(PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel, final ApiCallback<PayToolsApiModelsStringTokenMetaDataOutputModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = storeAndTokenizeValidateBeforeCall(payToolsApiModelsStringTokenIntputModel, _callback);
        Type localVarReturnType = new TypeToken<PayToolsApiModelsStringTokenMetaDataOutputModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class StoreAndTokenizeRequestBuilder {
        private final String payload;

        private StoreAndTokenizeRequestBuilder(String payload) {
            this.payload = payload;
        }

        /**
         * Build call for storeAndTokenize
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  * Location - Token URI representing the stringToken <br>  </td></tr>
            <tr><td> 400 </td><td> Bad data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel = buildBodyParams();
            return storeAndTokenizeCall(payToolsApiModelsStringTokenIntputModel, _callback);
        }

        private PayToolsApiModelsStringTokenIntputModel buildBodyParams() {
            PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel = new PayToolsApiModelsStringTokenIntputModel();
            payToolsApiModelsStringTokenIntputModel.payload(this.payload);
            return payToolsApiModelsStringTokenIntputModel;
        }

        /**
         * Execute storeAndTokenize request
         * @return PayToolsApiModelsStringTokenMetaDataOutputModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  * Location - Token URI representing the stringToken <br>  </td></tr>
            <tr><td> 400 </td><td> Bad data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public PayToolsApiModelsStringTokenMetaDataOutputModel execute() throws ApiException {
            PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel = buildBodyParams();
            ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> localVarResp = storeAndTokenizeWithHttpInfo(payToolsApiModelsStringTokenIntputModel);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute storeAndTokenize request with HTTP info returned
         * @return ApiResponse&lt;PayToolsApiModelsStringTokenMetaDataOutputModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  * Location - Token URI representing the stringToken <br>  </td></tr>
            <tr><td> 400 </td><td> Bad data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayToolsApiModelsStringTokenMetaDataOutputModel> executeWithHttpInfo() throws ApiException {
            PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel = buildBodyParams();
            return storeAndTokenizeWithHttpInfo(payToolsApiModelsStringTokenIntputModel);
        }

        /**
         * Execute storeAndTokenize request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  * Location - Token URI representing the stringToken <br>  </td></tr>
            <tr><td> 400 </td><td> Bad data </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayToolsApiModelsStringTokenMetaDataOutputModel> _callback) throws ApiException {
            PayToolsApiModelsStringTokenIntputModel payToolsApiModelsStringTokenIntputModel = buildBodyParams();
            return storeAndTokenizeAsync(payToolsApiModelsStringTokenIntputModel, _callback);
        }
    }

    /**
     * Store and tokenize a string
     * This method allows you to submit a string to be stored and tokenized in our system.  Once tokenized, the token ID will be returned in the body of the response and the full token URI will be returned in the &#x60;Location&#x60; header.
     * @param payToolsApiModelsStringTokenIntputModel StringToken input model (required)
     * @return StoreAndTokenizeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * Location - Token URI representing the stringToken <br>  </td></tr>
        <tr><td> 400 </td><td> Bad data </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  -  </td></tr>
     </table>
     */
    public StoreAndTokenizeRequestBuilder storeAndTokenize(String payload) throws IllegalArgumentException {
        if (payload == null) throw new IllegalArgumentException("\"payload\" is required but got null");
            if (payload != null && payload.length() < 1) {
              throw new IllegalArgumentException("Invalid value for payload. Length must be greater than or equal to 1.");
            }

        return new StoreAndTokenizeRequestBuilder(payload);
    }
}
