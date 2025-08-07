package org.app.spring_deployment.service.impl;

import lombok.RequiredArgsConstructor;
import org.app.spring_deployment.entity.Customer;
import org.app.spring_deployment.repo.CustomerRepo;
import org.app.spring_deployment.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customerById = customerRepo.getCustomersById(customer.getId());
        customerById.setName(customer.getName());
        customerById.setAge(customer.getAge());
        customerRepo.save(customerById);
        return customerById;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepo.deleteById(customer.getId());
    }
}
