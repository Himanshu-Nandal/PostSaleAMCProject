package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Sale;
import com.postSale.amcProject.Repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getSalesForCustomer(Long id) {
        return saleRepository.findAllSalesByCustomerId(id);
    }
}
