package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));   keep the spring.xml file outside the Project Directory

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factory.getBean("alien");
//        obj.age = 15;
        obj.code();



//        Alien obj1 = (Alien)factory.getBean("alien");
//        obj1.code();

    }
}

// The ioc container takes care of the bean by creating the object, calling the constructor