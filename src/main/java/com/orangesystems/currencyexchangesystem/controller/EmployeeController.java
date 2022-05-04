package com.orangesystems.currencyexchangesystem.controller;

import com.orangesystems.currencyexchangesystem.entity.Employee;
import com.orangesystems.currencyexchangesystem.serevice.service_decl.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public Flux<Employee> getAll() {
        return employeeService.getAllEmployees();
    }
}
