package com.enjoy;

import com.enjoy.cap6.bean.Monkey;
import com.enjoy.cap6.config.CustomFactoryBean;
import com.enjoy.cap6.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("==========>" + name);
        }

        Monkey monkey = (Monkey) applicationContext.getBean("customFactoryBean");
        System.out.println("It's monkey======>" + monkey);
        Monkey monkey2 = (Monkey) applicationContext.getBean("customFactoryBean");
        System.out.println("It's monkey2======>" + monkey);
        CustomFactoryBean customFactoryBean = (CustomFactoryBean) applicationContext.getBean("&customFactoryBean");
        System.out.println("It's FactoryBean======>" +customFactoryBean);
    }
}
