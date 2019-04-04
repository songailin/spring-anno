package com.enjoy.cap12.processor;

import com.enjoy.cap6.bean.Cat;
import com.enjoy.cap6.bean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("===CustomBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry,Bean的数量" + registry.getBeanDefinitionCount());
        RootBeanDefinition catBeanDefinition = new RootBeanDefinition(Cat.class);
        registry.registerBeanDefinition("myCat", catBeanDefinition);
        AbstractBeanDefinition dogBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Dog.class).getBeanDefinition();
        registry.registerBeanDefinition("myDog", dogBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("===CustomBeanDefinitionRegistryPostProcessor...postProcessBeanFactory,Bean的数量" + beanFactory.getBeanDefinitionCount());

    }
}
