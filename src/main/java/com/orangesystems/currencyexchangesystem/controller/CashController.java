package com.orangesystems.currencyexchangesystem.controller;

import com.orangesystems.currencyexchangesystem.entity.Cash;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.CashService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
public class CashController {

    private final CashService cashService;

    @GetMapping("/cash")
    public Flux<Cash> getAll() {
        return cashService.getAllCash();
    }
}
