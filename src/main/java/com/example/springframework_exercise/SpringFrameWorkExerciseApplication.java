package com.example.springframework_exercise;

import entities.Employee;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringFrameWorkExerciseApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringFrameWorkExerciseApplication.class, args);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        Employee e = (Employee) factory.getBean("e");

        e.show();
    }

}
