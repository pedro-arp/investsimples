package com.investsimples.service;

import com.investsimples.config.AlphaVantageConfigurationProperties;
import com.investsimples.domain.CurrencyExchangeRate;
import com.investsimples.utils.Assets;
import com.investsimples.utils.Wallet;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class AlphaVantageService {

    private final RestClient restClient;

    private final AlphaVantageConfigurationProperties properties;

    public CurrencyExchangeRate getCurrencyExchangeRate() {
        CurrencyExchangeRate body = restClient
                .get()
                .uri(properties.baseUrl() + properties.function() + properties.symbol() + properties.interval() + properties.apikey())
                .retrieve()
                .body(CurrencyExchangeRate.class);
        var exchangeRate = Objects.requireNonNull(body).getRealtimeCurrencyExchangeRate().getExchangeRate();
        var rate = Double.parseDouble(exchangeRate);
        var assets = Assets.builder().currency("BTC").amount(1.0).build();
        var amount = assets.getAmount();
        assets.setBrlAmount(amount * 6.3 * rate);
        var wallet = Wallet.builder().assets(List.of(assets)).build();
        Objects.requireNonNull(body).getRealtimeCurrencyExchangeRate().setWallet(wallet);
        return body;

    }

}