package org.app.spring_deployment.repo;


import org.app.spring_deployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    List<Customer> getCustomerById(int id);
    Customer getCustomersById(int id);
}
