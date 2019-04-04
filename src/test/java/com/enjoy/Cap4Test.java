package com.enjoy;

import com.enjoy.cap4.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");
        applicationContext.getBean("person");
    }
}
