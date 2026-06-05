package com.example.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

  @Value("${api.base.url}")
  private String baseUrl;

  @Bean
  public WebClient SoapWebClient() {
    return WebClient.builder()
        .baseUrl(baseUrl)
        .defaultHeader("Content-Type", "text/xml; charset=utf-8")
        .build();
  }
}