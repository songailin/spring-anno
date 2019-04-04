package com.enjoy.cap3.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {
    @Scope("prototype")
    @Bean
    public Person person() {
        return new Person("songail", 18);
    }
}
