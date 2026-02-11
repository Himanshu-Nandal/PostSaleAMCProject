package com.postSale.amcProject.Controllers;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Model.nodes.Sale;
import com.postSale.amcProject.Services.InitialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InitialController {
    @Autowired
    InitialService initialService;

//    public InitialController(InitialService initialService) {
//        this.initialService = initialService;
//    }

    // POST REQS
    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return initialService.createCust(customer);
    }

    @PostMapping("/sales")
    public Sale createSales(@RequestBody Sale sales) {
        return initialService.createSale(sales);
        // Also create warranty schedule
    }


    // PUT REQS
    @PutMapping("/customers/")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customers){
        Customer updatedCustomer = initialService.updateCus(customers);
        return ResponseEntity.ok(updatedCustomer);
    }

    @PutMapping("/products/")
    public ResponseEntity<Product> updateCustomer(@RequestBody Product product){
        Product updatedProduct = initialService.updateProd(product);
        return ResponseEntity.ok(updatedProduct);
    }


    // GET REQS
    @GetMapping("/customers/")
    public List<Customer> getAllCustomers(){
        return initialService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomers(@PathVariable Long id){
        Customer customer = initialService.getCustomerById(id).get();
        if (customer == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/products/")
    public List<Product> getAllProducts(){
        return initialService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
        Product product = initialService.getProductById(id).get();
        if (product == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(product);
    }

    @GetMapping("/sales/")
    public List<Sale> getAllSalesOfCust(Customer customers){
        return initialService.getAllSalesOfCustomer(customers);
    }


    // DELETE REQS
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable Long id) {
        boolean deletedCustomer = initialService.deleteCustomer(id);
        if(!deletedCustomer)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        boolean deletedProoduct = initialService.deleteProduct(id);
        if(!deletedProoduct)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }

}