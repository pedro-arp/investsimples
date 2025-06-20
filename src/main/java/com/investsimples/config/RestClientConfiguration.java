package com.investsimples.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@RequiredArgsConstructor
public class RestClientConfiguration {
    private final AlphaVantageConfigurationProperties alphaVantageConfigurationProperties;

    @Bean
    public RestClient alphaVantageApiClient(RestClient.Builder builder) {
        return builder.baseUrl(alphaVantageConfigurationProperties.baseUrl()).build();
    }

}

