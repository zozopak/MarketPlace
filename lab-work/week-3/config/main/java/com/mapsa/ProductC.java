package com.mapsa;

import org.springframework.stereotype.Component;

@Component(value="product")
public class ProductC {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.mapsa.Product{" +
                "name='" + name + '\'' +
                '}';
    }


}
