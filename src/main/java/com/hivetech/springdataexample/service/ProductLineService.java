package com.hivetech.springdataexample.service;

import com.hivetech.springdataexample.model.ProductLine;
import com.hivetech.springdataexample.repo.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductLineService {

    @Autowired
    private ProductLineRepository productLineRepository;


    public Optional<ProductLine> getProductLineById(String id){
        return productLineRepository.findById(id);
    }

    public List<ProductLine> getAllProductLine(){
        return (List<ProductLine>) productLineRepository.findAll();
    }

    public ProductLine addProductLine(ProductLine productLine){
        return productLineRepository.save(productLine);
    }

    public void deleteProductLineById(String id){
        productLineRepository.deleteById(id);
    }

    public void updateProductLine(ProductLine productLine){
        productLineRepository.save(productLine);
    }

    public long countProductLine(){
        return productLineRepository.count();
    }

    public boolean productLineIsExistedById(String id){
        return productLineRepository.existsById(id);
    }

    /** Custom of repo **/
    public List<ProductLine> getProductLineByTextDes(String des){
        return productLineRepository.findByTextDescription(des);
    }
}
