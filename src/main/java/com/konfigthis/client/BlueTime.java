package com.konfigthis.client;

import com.konfigthis.client.api.CardOperationsApi;
import com.konfigthis.client.api.CustomFormsApi;
import com.konfigthis.client.api.CvvOperationsApi;
import com.konfigthis.client.api.NetworkTokenApi;
import com.konfigthis.client.api.PaymentGatewayApi;
import com.konfigthis.client.api.PaymentGatewayAccountsApi;
import com.konfigthis.client.api.StringTokensApi;
import com.konfigthis.client.api.ThreeDsMerchantsApi;
import com.konfigthis.client.api.ThreeDsSessionsApi;
import com.konfigthis.client.api.ToolsApi;
import com.konfigthis.client.api.UtilsApi;

public class BlueTime {
    private ApiClient apiClient;
    public final CardOperationsApi cardOperations;
    public final CustomFormsApi customForms;
    public final CvvOperationsApi cvvOperations;
    public final NetworkTokenApi networkToken;
    public final PaymentGatewayApi paymentGateway;
    public final PaymentGatewayAccountsApi paymentGatewayAccounts;
    public final StringTokensApi stringTokens;
    public final ThreeDsMerchantsApi threeDsMerchants;
    public final ThreeDsSessionsApi threeDsSessions;
    public final ToolsApi tools;
    public final UtilsApi utils;

    public BlueTime() {
        this(null);
    }

    public BlueTime(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.cardOperations = new CardOperationsApi(this.apiClient);
        this.customForms = new CustomFormsApi(this.apiClient);
        this.cvvOperations = new CvvOperationsApi(this.apiClient);
        this.networkToken = new NetworkTokenApi(this.apiClient);
        this.paymentGateway = new PaymentGatewayApi(this.apiClient);
        this.paymentGatewayAccounts = new PaymentGatewayAccountsApi(this.apiClient);
        this.stringTokens = new StringTokensApi(this.apiClient);
        this.threeDsMerchants = new ThreeDsMerchantsApi(this.apiClient);
        this.threeDsSessions = new ThreeDsSessionsApi(this.apiClient);
        this.tools = new ToolsApi(this.apiClient);
        this.utils = new UtilsApi(this.apiClient);
    }

}
