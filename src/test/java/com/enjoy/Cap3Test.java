package com.enjoy;

import com.enjoy.cap1.Person;
import com.enjoy.cap3.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");
        if (person1 == person2) {
            System.out.println("person bean是单实例的。");
        } else {
            System.out.println("person bean是多实例的。");
        }
    }
}
