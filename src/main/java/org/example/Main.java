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
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();

        VehicleServices v1 = context.getBean(VehicleServices.class);
        VehicleServices v2 = context.getBean("vehicleServices",VehicleServices.class);

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

        person.getVehicle().getVehicleServices().playMusic();
    }
}