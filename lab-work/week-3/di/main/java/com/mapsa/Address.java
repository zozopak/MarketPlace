package com.mapsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "address")
public class Address {
    private String name;
    private City city;

    public City getCity() {
        return city;
    }
    @Autowired

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
