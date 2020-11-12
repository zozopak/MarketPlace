package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDI {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigDI.class);
        Address address = (Address) context.getBean("address");
        address.setName("address");
        Address address1 = (Address) context.getBean("address");
        address1.setName("eml");
        City city = (City) context.getBean("city");
        city.setName("teh");
        System.out.println(address);
        System.out.println(address1);
    }
}
