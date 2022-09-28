package config;

import beans.Person;
import beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"implementation", "services"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
public class ProjectConfig {
}
