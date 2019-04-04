package com.enjoy;

import com.enjoy.cap1.Person;
import com.enjoy.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap1Test {
    public static void main(String [] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);

        String [] namesForBean = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForBean) {
            System.out.println(name);
        }
    }
}
