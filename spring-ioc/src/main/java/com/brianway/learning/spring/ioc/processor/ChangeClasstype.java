package com.brianway.learning.spring.ioc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author tengqingya
 * @create 2017-04-03 15:28
 */
@Component
public class ChangeClasstype implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry( BeanDefinitionRegistry beanDefinitionRegistry ) throws BeansException {
        BeanDefinition person = beanDefinitionRegistry.getBeanDefinition("person");
        person.setBeanClassName("com.brianway.learning.spring.ioc.processor.Son");
        System.out.println(person);


    }

    public void postProcessBeanFactory( ConfigurableListableBeanFactory configurableListableBeanFactory ) throws BeansException {
    }
}
