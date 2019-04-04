package com.enjoy.cap12.config;

import com.enjoy.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.enjoy.cap12.processor")
public class MainConfig {
    @Bean
    public Dog dog() {
        return  new Dog();
    }
}
