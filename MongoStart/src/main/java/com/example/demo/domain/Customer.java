package com.example.demo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection ="customer")
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    private String id;
    private String name;
    private String number;



}
