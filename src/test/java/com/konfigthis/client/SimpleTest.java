package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.epaytools.com";
        
        configuration.apiKeyAuth  = "YOUR API KEY";
        
        // Configure HTTP bearer authorization: JwsAuth
        configuration.token = "BEARER TOKEN";
        BlueTime client = new BlueTime(configuration);
        assertNotNull(client);
    }
}
