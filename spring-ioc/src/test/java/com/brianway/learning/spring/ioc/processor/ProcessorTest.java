package com.brianway.learning.spring.ioc.processor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by brian on 16/8/29.
 */
public class ProcessorTest {


    /**
     * 通过XML组装@Configuration配置类所提供的配置信息
     */
    @Test
    public void testBeanDefinitionRegistryPostProcessor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/brianway/learning/spring/ioc/processor/processor-configuration.xml");
        Object person = context.getBean("person");
        ((Son)person).say();
        System.out.println(person);
    }


}
