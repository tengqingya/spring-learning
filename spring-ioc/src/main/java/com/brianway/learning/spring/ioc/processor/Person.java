package com.brianway.learning.spring.ioc.processor;

import org.springframework.stereotype.Component;

/**
 * @author tengqingya
 * @create 2017-04-03 15:25
 */
@Component
public class Person {
    int age;
    String name;

    public void say(){
        System.out.println("say..............");
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
