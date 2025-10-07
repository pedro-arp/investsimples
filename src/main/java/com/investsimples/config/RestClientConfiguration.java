package com.investsimples.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestClient;

@Configuration
@RequiredArgsConstructor
public class RestClientConfiguration {
    private final CoinGeckoConfigurationProperties coinGeckoConfigurationProperties;
    private final WalletConfigurationProperties walletConfigurationProperties;

    @Bean
    @Primary
    public RestClient coinGeckoApiClient(RestClient.Builder builder) {
        return builder.baseUrl(coinGeckoConfigurationProperties.baseUrl()).build();
    }

    @Bean
    public RestClient walletApiClient(RestClient.Builder builder) {
        return builder.baseUrl(walletConfigurationProperties.baseUrl()).build();
    }

}

