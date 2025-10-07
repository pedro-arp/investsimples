package com.investsimples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "coin-gecko-api")
public record CoinGeckoConfigurationProperties(
        String baseUrl,
        String apiKey
) {
}
