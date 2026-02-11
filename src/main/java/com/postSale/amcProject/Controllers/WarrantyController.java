package com.postSale.amcProject.Controllers;

import com.postSale.amcProject.Model.nodes.Warranty;
import com.postSale.amcProject.Repositories.WarrantyRepository;
import com.postSale.amcProject.Services.WarrantyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warranty")
public class WarrantyController {
    private WarrantyService warrantyService;

    @GetMapping
    public List<Warranty> getAllSoonExpiring(){
        return warrantyService.getExpiringWarranties();
    }

    @GetMapping("/{id}")
    public List<Warranty> getSoonExpiringById(Long id){
        return warrantyService.getExpiringWarrantiesById(id);
    }

}
