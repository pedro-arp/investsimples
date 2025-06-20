package com.investsimples.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Wallet {
    private List<Assets> assets;

}
