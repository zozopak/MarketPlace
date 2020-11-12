package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Conf.class);
       MyUser myUser= context.getBean("myuser",MyUser.class);
       myUser.setName("ali");
       myUser.setLastname("karimi");
       MyUser myUser1=context.getBean("myuser",MyUser.class);
       myUser1.setLastname("sadeghi");
       myUser1.setName("esmaeil");
        System.out.println(myUser);
        System.out.println(myUser1);
    }
}
