package com.investsimples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "wallet-api")
public record WalletConfigurationProperties(String baseUrl) {
}