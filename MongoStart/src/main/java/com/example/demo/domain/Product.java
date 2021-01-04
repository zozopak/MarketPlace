package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "product")
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    private long id;
    private String name;
    private String number;
}
