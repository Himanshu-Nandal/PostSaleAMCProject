package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Repositories.CustomerRepository;

public class InitialService {
    CustomerRepository customerRepository;

    public InitialService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCust(Customer customer) {
        return customerRepository.save(customer);
    }
}
