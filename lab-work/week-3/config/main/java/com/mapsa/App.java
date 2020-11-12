package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       User user= context.getBean("user",User.class);
       user.setName("ali");
       user.setLastname("parvin");
       Product product=context.getBean("product",Product.class);
       product.setName("phone");
       user.setProduct(product);
        System.out.println(user);
    }
}
