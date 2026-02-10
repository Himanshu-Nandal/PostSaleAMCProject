package com.postSale.amcProject.Controllers;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Repositories.CustomerRepository;
import com.postSale.amcProject.Services.InitialService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
    InitialService initialService;

    public InitialController(InitialService initialService) {
        this.initialService = initialService;
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return initialService.createCust(customer);
    }

}