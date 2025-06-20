package com.investsimples.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alpha-vantage-api")
public record AlphaVantageConfigurationProperties(String baseUrl, String function, String symbol, String interval,
                                                  String apikey) {
}



