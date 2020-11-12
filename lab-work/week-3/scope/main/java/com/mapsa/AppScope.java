package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppScope {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigDI.class);
        UserScope user = (UserScope) context.getBean("user1");
        user.setName("ali");
        user.setLastName("esmaili");
        UserScope user2 = (UserScope) context.getBean("user1");
        user2.setName("eml");
        user2.setLastName("emlll");
        ProductScope product = (ProductScope) context.getBean("product1");
        product.setName("product1");
        user.setProduct(product);
        System.out.println(user);
        System.out.println(user2);
    }
}
