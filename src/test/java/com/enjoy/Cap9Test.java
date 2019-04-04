package com.enjoy;

import com.enjoy.cap9.config.MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
    @Test
    public void test01() throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器初始化完成......");

        TestService testService = applicationContext.getBean(TestService.class);
        TestDao testDao = applicationContext.getBean(TestDao.class);
        System.out.println(testService.getTestDao() == testDao);

        testService.insert();

        applicationContext.close();
    }
}
