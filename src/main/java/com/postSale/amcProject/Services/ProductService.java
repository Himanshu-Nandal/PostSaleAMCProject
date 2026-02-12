package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product updateProd(Product product) {
        if(!productRepository.existsById(product.getProductId())){
            throw new IllegalArgumentException("Product with Name: " + product.getProductName() + " doesn't exist"); // generic exception
        }
        productRepository.save(product);
        return product;
    }

    public boolean deleteProduct(String id) {
        if(!productRepository.existsById(id)){
            throw new IllegalArgumentException("Product with Id: " + id + " doesn't exist");
        }
        productRepository.deleteById(id);
        return true;
    }
}
