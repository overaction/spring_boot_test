package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.VehicleServices;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("vehicleBean")
public class Vehicle {
    private String name = "Honda";

    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
