package com.enjoy;

import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Cap8Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");

        Bird bird = (Bird) applicationContext.getBean("bird");
        System.out.println(bird);

        Environment environment = applicationContext.getEnvironment();
        String birdColor = environment.getProperty("bird.color");
        System.out.println("bird color=" + birdColor);

        applicationContext.close();
    }
}
