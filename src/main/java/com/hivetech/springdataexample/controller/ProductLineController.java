package com.hivetech.springdataexample.controller;

import com.hivetech.springdataexample.model.ProductLine;
import com.hivetech.springdataexample.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProductLineController {

    @Autowired
    private ProductLineService productLineService;

    @GetMapping("/")
    public String hello(){
        return "Welcome to spring data 2020";
    }

    @GetMapping("/find")
    @ResponseBody
    public ResponseEntity<?> findPLById(@RequestParam("id") String id){
        return new ResponseEntity<>(productLineService.getProductLineById(id), HttpStatus.OK);
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<ProductLine>> getAll(){
        return new ResponseEntity<>(productLineService.getAllProductLine(), HttpStatus.OK);
    }

    @GetMapping("/list/{textDes}")
    @ResponseBody
    public ResponseEntity<List<ProductLine>> getAllByDes(@PathVariable("textDes") String des){
        return new ResponseEntity<>(productLineService.getProductLineByTextDes(des), HttpStatus.OK);
    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<ProductLine> addProductLine(@RequestBody ProductLine productLine){
        return new ResponseEntity<>(productLineService.addProductLine(productLine), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteById(@RequestParam("id") String id){
        productLineService.deleteProductLineById(id);
    }

    @GetMapping("/count")
    @ResponseBody
    public ResponseEntity<Long> countProduct(){
        return new ResponseEntity<>(productLineService.countProductLine(), HttpStatus.OK);
    }


}
