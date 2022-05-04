package com.orangesystems.currencyexchangesystem.controller;

import com.orangesystems.currencyexchangesystem.entity.CurrencyValue;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CurrencyValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
public class CurrencyValueController {

    private final CurrencyValueService currencyValueService;

    @GetMapping("/currencyValues")
    public Flux<CurrencyValue> getAll() {
        return currencyValueService.getAllCurrencyValue();
    }
}
