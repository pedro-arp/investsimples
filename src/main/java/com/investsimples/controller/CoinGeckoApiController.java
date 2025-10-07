package com.investsimples.controller;

import com.investsimples.mapper.CoinGeckoDataMapper;
import com.investsimples.response.CoinGeckoDataGetResponse;
import com.investsimples.service.CoinGeckoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"v2/coin-gecko-api"})
@RequiredArgsConstructor
@Log4j2
public class CoinGeckoApiController {

    private final CoinGeckoService coinGeckoService;
    private static final CoinGeckoDataMapper MAPPER = CoinGeckoDataMapper.INSTANCE;

    @GetMapping("{id}")
    public ResponseEntity<CoinGeckoDataGetResponse> getAlbum(@PathVariable String id) {

        var coinGeckoDataResponse = coinGeckoService.getCurrencyExchangeRate(id);
        var coinGeckoDataGetResponse = MAPPER.toCoinGeckoDataGetResponse(coinGeckoDataResponse);
        return ResponseEntity.ok(coinGeckoDataGetResponse);

    }


}
