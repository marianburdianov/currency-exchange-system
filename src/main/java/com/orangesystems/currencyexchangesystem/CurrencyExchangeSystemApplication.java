package com.orangesystems.currencyexchangesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {R2dbcAutoConfiguration.class})
public class CurrencyExchangeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeSystemApplication.class, args);
    }

}
