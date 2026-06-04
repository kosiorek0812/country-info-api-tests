package com.example.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SoapApiClient {

    private final WebClient webClient;

    @Autowired
    public SoapApiClient(WebClient soapApiClient) {
        this.webClient = soapApiClient;
    }

    public String postSoapRequest(String endpoint, String xmlPayload) {
        return webClient.post()
            .uri(endpoint)
            .bodyValue(xmlPayload)
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }
    
}
