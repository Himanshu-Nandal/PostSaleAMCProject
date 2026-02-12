package com.postSale.amcProject.controllers;

import com.postSale.amcProject.Model.nodes.Product;
import com.postSale.amcProject.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductController {
    @Autowired
    private ProductService productService;

    // PUT REQS
    @PutMapping()
    public ResponseEntity<Product> updateCustomer(@RequestBody Product product){
        Product updatedProduct = productService.updateProd(product);
        return ResponseEntity.ok(updatedProduct);
    }


    // GET REQS
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id){
        Product product = productService.getProductById(id).get();
        if (product == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(product);
    }


    // DELETE REQS
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable String id) {
        boolean deletedProoduct = productService.deleteProduct(id);
        if(!deletedProoduct)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
