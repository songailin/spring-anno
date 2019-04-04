package com.enjoy.cap1.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
//    @Bean("aPerson")
    @Bean
    public Person person() {
        return new Person("songail", 18);
    }
}
