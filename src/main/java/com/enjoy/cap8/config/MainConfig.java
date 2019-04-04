package com.enjoy.cap8.config;

import com.enjoy.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/application.properties")
public class MainConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }

}
