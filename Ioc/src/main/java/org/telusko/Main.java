


// using this module for IOC autowire and primary bean purpose only

package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));   keep the spring.xml file outside the Project Directory

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factory.getBean("alien");
        obj.code();



    }
}

// The ioc container takes care of the bean by creating the object, calling the constructor