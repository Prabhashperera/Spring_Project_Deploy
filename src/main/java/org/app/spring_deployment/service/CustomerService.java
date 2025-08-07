package org.app.spring_deployment.service;

import org.app.spring_deployment.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public Customer getCustomer(int id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
}
