package com.investsimples.service;

import com.investsimples.config.AlphaVantageConfigurationProperties;
import com.investsimples.domain.CurrencyExchangeRate;
import com.investsimples.response.CurrencyExchangeRateGetResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class AlphaVantageService {

    private final RestClient restClient;

    private final AlphaVantageConfigurationProperties properties;

 //   private final ObjectMapper mapper;

    public CurrencyExchangeRate getCurrencyExchangeRate() {
        CurrencyExchangeRate body = restClient
                .get()
                .uri(properties.baseUrl() + properties.function() + properties.symbol() +properties.interval() + properties.apikey())
                .retrieve()
//                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
//                    var albumErrorResponse = mapper.readValue(response.getBody().readAllBytes(), ErrorResponse.class);
//
//                    switch (response.getStatusCode()) {
//                        case HttpStatus.BAD_REQUEST:
//                            throw new AlphaVantageBadRequest(albumErrorResponse.error().message());
//                        case HttpStatus.UNAUTHORIZED:
//                            throw new AlphaVantageUnauthorized(albumErrorResponse.error().message());
//                        case HttpStatus.NOT_FOUND:
//                            throw new AlphaVantageNotFound(albumErrorResponse.error().message());
//                        default:
//                            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, albumErrorResponse.toString());
//                    }
//                })
                .body(CurrencyExchangeRate.class);
        Objects.requireNonNull(body).getRealtimeCurrencyExchangeRate().setTest("Testando");
        return body;
         



    }

}