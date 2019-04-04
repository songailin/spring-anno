package com.enjoy.cap6.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap6.bean.Cat;
import com.enjoy.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Dog.class, Cat.class, CustomImportSelector.class, CustomImportBeanDefinitionRegistrar.class})
public class MainConfig {

    @Bean
    public Person person() {
        System.out.println("给容器添加person.");
        return new Person("songail", 18);
    }

    @Bean
    public CustomFactoryBean customFactoryBean() {
        return new CustomFactoryBean();
    }
}
