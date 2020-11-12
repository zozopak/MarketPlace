package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = (User) context.getBean("userId");
        user.setName("ali");
        user.setLastName("esmaili");
        Product product = new Product();
        product.setName("product1");
        user.setProduct(product);
        System.out.println(user);
    }
}
