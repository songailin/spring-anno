package com.enjoy.cap5.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public Person person() {
        System.out.println("给容器添加person.");
        return new Person("person", 18);
    }

    @Conditional(WinCondition.class)
    @Bean("lison")
    public Person lison() {
        System.out.println("给容器添加lison.");
        return new Person("person", 38);
    }

    @Conditional(LinuxCondition.class)
    @Bean("james")
    public Person james() {
        System.out.println("给容器添加james.");
        return new Person("james", 28);
    }
}
