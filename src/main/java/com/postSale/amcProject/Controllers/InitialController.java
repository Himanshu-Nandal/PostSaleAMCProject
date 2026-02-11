package com.postSale.amcProject.Controllers;

import com.postSale.amcProject.Model.nodes.Customers;
import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Model.nodes.Sales;
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
    public Customers createCustomer(@RequestBody Customers customer) {
        return initialService.createCust(customer);
    }

    @PostMapping("/sales")
    public Sales createSales(@RequestBody Sales sales) {
        return initialService.createSale(sales);
        // Also create warranty schedule
    }


    // PUT REQS
    @PutMapping("/customers/")
    public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customers){
        Customers updatedCustomer = initialService.updateCus(customers);
        return ResponseEntity.ok(updatedCustomer);
    }

    @PutMapping("/products/")
    public ResponseEntity<Product> updateCustomer(@RequestBody Product product){
        Product updatedProduct = initialService.updateProd(product);
        return ResponseEntity.ok(updatedProduct);
    }


    // GET REQS
    @GetMapping("/customers/")
    public List<Customers> getAllCustomers(){
        return initialService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customers> getCustomers(@PathVariable Long id){
        Customers customer = initialService.getCustomerById(id).get();
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
    public List<Sales> getAllSalesOfCust(Customers customers){
        return initialService.getAllSalesOfCustomer(customers);
    }


    // DELETE REQS
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customers> deleteCustomer(@PathVariable Long id) {
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