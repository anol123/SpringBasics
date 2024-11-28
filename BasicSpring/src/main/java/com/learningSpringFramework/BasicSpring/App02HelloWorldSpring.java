package com.learningSpringFramework.BasicSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.learningSpringFramework.BasicSpring.HelloWorldConfiguration;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
    }

}
