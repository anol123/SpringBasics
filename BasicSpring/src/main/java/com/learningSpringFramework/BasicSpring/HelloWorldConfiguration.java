package com.learningSpringFramework.BasicSpring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String colonyNAme, int h_no){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Anol";
    }

    @Bean
    public int age(){
        return 26;
    }

    @Bean("person_anol")    //customised the bean name
    public Person person1 (){
        var person1 = new Person("Anol", 26);
        return person1;
    }



}
