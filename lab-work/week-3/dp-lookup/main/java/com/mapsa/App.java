package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("applicationconfig.xml");
       User user= (User) context.getBean("myuser");
       user.setName("ali");
        user.setLastname("karimi");
        System.out.println(user);
    }
}
