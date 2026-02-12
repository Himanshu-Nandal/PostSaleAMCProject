package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Customer;
import com.postSale.amcProject.Model.nodes.Sale;
import com.postSale.amcProject.Repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getSalesForCustomer(String id) {
        return saleRepository.findAllSalesByCustomerId(id);
    }

    public Sale createSale(Sale sales) {
        return saleRepository.save(sales);
    }

    public List<Sale> getAllSalesOfCustomer(Customer customers) {
        return saleRepository.findAllById(Collections.singleton(customers.getCustId()));
    }
}
