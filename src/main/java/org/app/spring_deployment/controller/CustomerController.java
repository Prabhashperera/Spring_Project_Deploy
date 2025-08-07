package org.app.spring_deployment.controller;

import lombok.RequiredArgsConstructor;
import org.app.spring_deployment.entity.Customer;
import org.app.spring_deployment.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("get")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping("create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("delete")
    public void deleteCustomer(@RequestBody Customer customer) {
        customerService.deleteCustomer(customer);
    }
}
