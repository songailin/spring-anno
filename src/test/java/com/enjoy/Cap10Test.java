package com.enjoy;

import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");

        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        int result = calculator.div(9, 0);
        System.out.println("执行结果：" + result);

        applicationContext.close();
    }
}
