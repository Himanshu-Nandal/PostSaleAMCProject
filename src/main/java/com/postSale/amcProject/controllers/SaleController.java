package com.postSale.amcProject.controllers;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Model.nodes.Sale;
import com.postSale.amcProject.Services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/{id}")
    public List<Sale> getSales(@PathVariable String id) {
        return saleService.getSalesForCustomer(id);
    }

    @PostMapping("/")
    public Sale createSales(@RequestBody Sale sales) {
        return saleService.createSale(sales);
        // Also create warranty schedule
    }

    @GetMapping
    public List<Sale> getAllSalesOfCust(Customer customers){
        return saleService.getAllSalesOfCustomer(customers);
    }
}
