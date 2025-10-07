package com.investsimples.response;

import lombok.Data;

import java.util.Map;

@Data
public class WalletResponse {
    private String mensagem;
    private Map<String, String> alocacao;
}
