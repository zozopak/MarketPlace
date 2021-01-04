package com.example.demo.controller;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {


    private ProductRepo productRepo;



    @GetMapping
    public List<Product> getProduct(){
        return productRepo.findAll();
    }

    @PostMapping
    public  Product getProducts(@RequestBody Product product){
        return productRepo.save(product);
    }
}
