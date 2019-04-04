package com.enjoy.cap7.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap7.bean.Bike;
import com.enjoy.cap7.bean.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.enjoy.cap7.bean")
public class MainConfig {

    @Bean
    public Person person() {
        System.out.println("给容器添加person.");
        return new Person("songail", 18);
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public Train train() {
        return new Train();
    }
}
