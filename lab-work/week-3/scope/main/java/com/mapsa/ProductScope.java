package com.mapsa;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "product1")
public class ProductScope {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductScope{" +
                "name='" + name + '\'' +
                '}';
    }
}
