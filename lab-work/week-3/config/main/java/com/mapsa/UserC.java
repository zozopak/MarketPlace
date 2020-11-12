package com.mapsa;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class UserC {
    private String name;
    private String lastName;
    private City product;

    public City getProduct() {
        return product;
    }

    public void setProduct(City product) {
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
