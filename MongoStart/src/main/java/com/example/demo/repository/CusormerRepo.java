package com.example.demo.repository;

import com.example.demo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CusormerRepo extends MongoRepository<Customer,Long> {
}
