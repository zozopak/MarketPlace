package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserC user =  context.getBean("user",UserC.class);
        user.setName("ali");
        user.setLastName("esmaili");
        City product =context.getBean("product", City.class);
        product.setName("product1");
        user.setProduct(product);
        System.out.println(user);
    }
}
