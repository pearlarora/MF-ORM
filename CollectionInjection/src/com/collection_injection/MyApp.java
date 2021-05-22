package com.collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Customer cust=(Customer)context.getBean("customer");
        System.out.println(cust.toString());
    }
}
