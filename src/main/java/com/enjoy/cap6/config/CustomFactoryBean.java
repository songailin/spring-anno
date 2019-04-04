package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }
}
