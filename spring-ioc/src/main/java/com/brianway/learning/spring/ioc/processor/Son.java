package com.brianway.learning.spring.ioc.processor;

import org.springframework.stereotype.Component;

/**
 * @author tengqingya
 * @create 2017-04-03 15:33
 */
@Component
public class Son {
    int age;
    String name;
    String fuck;

    public void say(){
        System.out.println("fuck................");
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

    public String getFuck() {
        return fuck;
    }

    public void setFuck( String fuck ) {
        this.fuck = fuck;
    }
}
