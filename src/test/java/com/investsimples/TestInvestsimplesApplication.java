package com.investsimples;

import org.springframework.boot.SpringApplication;

public class TestInvestsimplesApplication {

    public static void main(String[] args) {
        SpringApplication.from(InvestsimplesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
