package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends MongoRepository<Product,Long> {
}
