package com.postSale.amcProject.Controllers;

import com.postSale.amcProject.Model.nodes.Sale;
import com.postSale.amcProject.Services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/customer/{id}")
    public List<Sale> getSales(@PathVariable Long id) {
        return saleService.getSalesForCustomer(id);
    }
}
