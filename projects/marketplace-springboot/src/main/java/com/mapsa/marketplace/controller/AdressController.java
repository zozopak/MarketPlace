package com.mapsa.marketplace.controller;

import com.mapsa.marketplace.model.Adress;
import com.mapsa.marketplace.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Repository("/adress")
public class AdressController {

    private AdressRepository adressRepository;
    @Autowired
    public AdressController(AdressRepository adressRepository){
        this.adressRepository=adressRepository;
    }




}
