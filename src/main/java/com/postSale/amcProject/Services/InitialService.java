package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Customers;
import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Model.nodes.Sales;
import com.postSale.amcProject.Repositories.CustomerRepository;
import com.postSale.amcProject.Repositories.ProductRepository;
import com.postSale.amcProject.Repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class InitialService {
    @Autowired
    CustomerRepository customerRepository;
//    public InitialService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    ProductRepository productRepository;

    // CUSTOMER SERVICES
    public Customers createCust(Customers customer) {
        return customerRepository.save(customer);
    }

    public Customers updateCus(Customers customers) {
        if(!customerRepository.existsById(customers.getCustid())){
            throw new IllegalArgumentException("User with Name: " + customers.getCustName() + " doesn't exist"); // generic exception
        }
        customerRepository.save(customers);
        return customers;
    }

    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customers> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public boolean deleteCustomer(Long id) {
        if(!customerRepository.existsById(id)){
            throw new IllegalArgumentException("User with Id: " + id + " doesn't exist");
        }
        customerRepository.deleteById(id);
        return true;
    }

    // PRODUCT SERVICES
    public List<Product> getAllProducts() {
        return ProductRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product updateProd(Product product) {
        if(!productRepository.existsById(product.getProductId())){
            throw new IllegalArgumentException("Product with Name: " + product.getProductName() + " doesn't exist"); // generic exception
        }
        productRepository.save(product);
        return product;
    }

    public boolean deleteProduct(Long id) {
        if(!productRepository.existsById(id)){
            throw new IllegalArgumentException("Product with Id: " + id + " doesn't exist");
        }
        productRepository.deleteById(id);
        return true;
    }

    // SALES SERVICES
    public Sales createSale(Sales sales) {
        return saleRepository.save(sales);
    }

    public List<Sales> getAllSalesOfCustomer(Customers customers) {
        return saleRepository.findById(customers.getCustid());
    }
}
