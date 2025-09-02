package com.investsimples.service;

import com.investsimples.config.CoinGeckoConfigurationProperties;
import com.investsimples.domain.CoinGeckoData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class CoinGeckoService {
    @Qualifier("coinGeckoApiClient")
    private final RestClient restClient;

    private final CoinGeckoConfigurationProperties properties;

    public CoinGeckoData getCurrencyExchangeRate(String id) {
        return restClient
                .get()
                .uri(properties.baseUrl() + "/" + id)
                .header("accept", "application/json")
                .header("x-cg-api-key", properties.apiKey())
                .retrieve()
                .body(CoinGeckoData.class);
    }


}