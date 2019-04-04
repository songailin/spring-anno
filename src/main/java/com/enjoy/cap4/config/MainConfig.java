package com.enjoy.cap4.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MainConfig {
//    @Scope("prototype")
    @Lazy
    @Bean
    public Person person() {
        System.out.println("给容器添加person bean.");
        return new Person("songail", 18);
    }
}
