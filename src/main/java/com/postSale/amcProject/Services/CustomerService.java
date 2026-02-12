package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCust(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCus(Customer customers) {
        if(!customerRepository.existsById(customers.getCustId())){
            throw new IllegalArgumentException("User with Name: " + customers.getCustName() + " doesn't exist"); // generic exception
        }
        customerRepository.save(customers);
        return customers;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(String id) {
        return customerRepository.findById(id);
    }

    public boolean deleteCustomer(String id) {
        if(!customerRepository.existsById(id)){
            throw new IllegalArgumentException("User with Id: " + id + " doesn't exist");
        }
        customerRepository.deleteById(id);
        return true;
    }
}
