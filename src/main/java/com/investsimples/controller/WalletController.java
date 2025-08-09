package com.investsimples.controller;

import com.investsimples.request.WalletRequest;
import com.investsimples.response.WalletResponse;
import com.investsimples.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/suggestion")
    public WalletResponse sugestao(@RequestBody WalletRequest request) {
        return walletService.getWallet(request);
    }
}
