package com.enjoy;

import com.enjoy.cap11.config.MainConfig;
import com.enjoy.cap11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap11Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");

        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.addOrder();

        applicationContext.close();
    }
}
