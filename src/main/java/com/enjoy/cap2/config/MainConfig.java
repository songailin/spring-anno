package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {OrderController.class})
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig {
    @Bean
    public Person person() {
        return new Person("songail", 18);
    }
}
