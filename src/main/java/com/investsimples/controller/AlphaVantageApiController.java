package com.investsimples.controller;

import com.investsimples.domain.CurrencyExchangeRate;
import com.investsimples.service.AlphaVantageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"v1/alpha-vantage-api"})
@RequiredArgsConstructor
@Log4j2
public class AlphaVantageApiController {

    private final AlphaVantageService alphaVantageService;


    @GetMapping()
    public ResponseEntity<CurrencyExchangeRate> getAlbum() {

        var currencyExchangeRateResponse = alphaVantageService.getCurrencyExchangeRate();

        return ResponseEntity.ok(currencyExchangeRateResponse);

    }


}
