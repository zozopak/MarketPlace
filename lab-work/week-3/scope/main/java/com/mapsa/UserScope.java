package com.mapsa;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user1")
public class UserScope {
    private String name;
    private String lastName;
    private ProductScope product;

    public ProductScope getProduct() {
        return product;
    }

    public void setProduct(ProductScope product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserC{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", product=" + product +
                '}';
    }
}
