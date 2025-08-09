package com.investsimples.service;

import com.investsimples.config.WalletConfigurationProperties;
import com.investsimples.request.WalletRequest;
import com.investsimples.response.WalletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class WalletService {
    @Qualifier("walletApiClient")
    private final RestClient restClient;
    private final WalletConfigurationProperties properties;

    public WalletResponse getWallet(WalletRequest request) {
        log.info("Enviando dados para API Python: {}", request);

        var carteira = restClient
                .post()
                .uri(properties.baseUrl() + "/carteira")
                .body(request)
                .retrieve()
                .body(WalletResponse.class);

        log.info("Resposta recebida da API Python: {}", carteira);
        return carteira;
    }
}
