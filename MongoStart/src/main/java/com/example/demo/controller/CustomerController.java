package com.example.demo.controller;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CusormerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {


     @Autowired
    public CusormerRepo cusormerRepo;



    @GetMapping
    public List<Customer> getCustomers(){
        return cusormerRepo.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return  cusormerRepo.save(customer);
    }

}
