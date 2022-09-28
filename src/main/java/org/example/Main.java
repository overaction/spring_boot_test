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
        VehicleServices vs1 = context.getBean(VehicleServices.class);
        VehicleServices vs2 = context.getBean(VehicleServices.class);

        System.out.println("해시코드 of vs1 : " + vs1.hashCode());
        System.out.println("해시코드 of vs2 : " + vs2.hashCode());
    }
}