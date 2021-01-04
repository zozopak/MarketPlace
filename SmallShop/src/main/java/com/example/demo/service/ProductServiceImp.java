package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
    private ProductRepo productRepo;
    @Autowired
    public void setProductRepo(ProductRepo productRepo){
        this.productRepo=productRepo;
    }

    @Override
    public void saveProductToDB(String name,String quantity,String price,String color, MultipartFile file) {

        Product p=new Product();
        try {
           p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.setName(name);
        p.setQuantity(quantity);
        p.setPrice(price);
        p.setColor(color);
        productRepo.save(p);
    }

    @Override
    public Product get(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }
}
