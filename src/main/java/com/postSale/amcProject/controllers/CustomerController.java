package com.postSale.amcProject.controllers;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCust(customer);
    }

    @PutMapping("/")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customers){
        Customer updatedCustomer = customerService.updateCus(customers);
        return ResponseEntity.ok(updatedCustomer);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomers(@PathVariable String id){
        Customer customer = customerService.getCustomerById(id).get();
        if (customer == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable String id) {
        boolean deletedCustomer = customerService.deleteCustomer(id);
        if(!deletedCustomer)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
