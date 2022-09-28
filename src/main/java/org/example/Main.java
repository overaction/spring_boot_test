package org.example;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.VehicleServices;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving Person Bean");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving Person Bean");
    }
}