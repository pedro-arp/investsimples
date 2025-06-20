package com.investsimples.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Assets {
    private String currency;
    private Double amount;
    private Double brlAmount;

}
