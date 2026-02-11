package com.postSale.amcProject.Services;

import com.postSale.amcProject.Model.nodes.Warranty;
import com.postSale.amcProject.Repositories.WarrantyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WarrantyService {
    @Autowired
    private WarrantyRepository warrantyRepository;

    public List<Warranty> getExpiringWarranties(){
        return warrantyRepository.findWarrantiesExpiringSoon();
    }

    public List<Warranty> getExpiringWarrantiesById(Long custId){
        return warrantyRepository.findWarrantiesByCustomerId(custId);
    }

}
