package com.orangesystems.currencyexchangesystem.serevice.service_decl;

import com.orangesystems.currencyexchangesystem.entity.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Flux<Employee> getAllEmployees();

    Mono<Employee> createEmployee(Employee employee);
}
