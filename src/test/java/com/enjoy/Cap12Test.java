package com.enjoy;

import com.enjoy.cap12.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap12Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");

        applicationContext.close();
    }
}
