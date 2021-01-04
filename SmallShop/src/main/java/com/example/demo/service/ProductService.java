package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public interface ProductService {
    void  saveProductToDB(String name,String quantity,String price,String color,MultipartFile file);
   Product get(long id);
    List<Product> getAllProduct();

}
