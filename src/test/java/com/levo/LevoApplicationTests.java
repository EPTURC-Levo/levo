package com.levo;

import com.levo.domain.*;
import com.levo.enumerations.Colors;
import com.levo.enumerations.OcurrenceType;
import com.levo.enumerations.TaskType;
import com.levo.enumerations.VehicleBrand;
import com.levo.persistence.DriverPesistence;
import com.levo.persistence.ItineraryPersistence;
import com.levo.persistence.VehiclePersistence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LevoApplicationTests {

    @Autowired
    private DriverPesistence driverPesistence;
    @Autowired
    private ItineraryPersistence itineraryPersistence;
    @Autowired
    private VehiclePersistence vehiclePersistence;


    @Test
    public void contextLoads() {
    }

    @Test
    public void createItinerary(){
        itineraryPersistence.save(newItinerary());
    }

    @Test
    public void createTask(){

    }

    @Test
    public void createDriver(){

        driverPesistence.save(newDriver());

    }
    @Test
    public void deleteDriver(){

        driverPesistence.delete((long) 1);

    }


    @Test
    public void createVehicle(){
        vehiclePersistence.save(newVehicle());
    }


    private Itinerary newItinerary(){
        Itinerary itinerary = new Itinerary();
        itinerary.setOccurrence(newOccurrence());
        itinerary.setTasks(newTasks());

        return itinerary;
    }

    private Driver newDriver(){
        Driver driver = new Driver();
        driver.setSocialId("123");
        driver.setName("paulo Melo");
        driver.setPhoneBattery(99);
        driver.setVehicle(newVehicle());
        driver.setItinerary(newItinerary());
        driver.setAddress(newAddress());

        return driver;
    }

    private Address newAddress(){

        Address address = new Address();
        address.setNeighborhood("tamarineira");
        address.setNumber(327);
        address.setReference("near DENOX");
        address.setStreet("av. engenheiro agamenon");
        address.setZipCode(32110000);

        return address;
    }

    private Address newTaskAddress(){

        Address address = new Address();
        address.setNeighborhood("boa viagem");
        address.setNumber(327);
        address.setReference("near the beach");
        address.setStreet("av. boa viagem");
        address.setZipCode(32110000);

        return address;
    }

    private List<Task> newTasks(){

        Task delivery = new Task();
        delivery.setDone(false);
        delivery.setLocal(newLocation());
        delivery.setNote("something about the task");
        delivery.setTaskType(TaskType.DELIVERY);
        delivery.setSuccess(false);
        delivery.setProduct(newProduct());
        delivery.setTaskAddress(newTaskAddress());


        Task collect = new Task();
        collect.setDone(false);
        collect.setLocal(newLocation());
        collect.setNote("something about the task");
        collect.setTaskType(TaskType.COLLECT);
        collect.setSuccess(false);
        collect.setProduct(newProduct());
        collect.setTaskAddress(newTaskAddress());


        List<Task> tasks = new ArrayList<Task>();
        tasks.add(delivery);
        tasks.add(collect);

        return tasks;
    }
    private Product newProduct(){
        Product product = new Product();
        product.setResponsableName("Jon");
        product.setProductName("black box");
        return product;
    }

    private Location newLocation(){
        Location location = new Location();
        location.setLatitude(-5.812059);
        location.setLongitude(-35.20714);
        return location;
    }


    private List<Occurrence> newOccurrence(){
        Occurrence occurrence = new Occurrence();
        occurrence.setDescription("A strike block the street");
        occurrence.setSolved(false);
        occurrence.setOcurrenceType(OcurrenceType.BLOCKED_STREET);

        List<Occurrence> occurrenceList = new ArrayList<Occurrence>();
        occurrenceList.add(occurrence);

        return occurrenceList;
    }


    private Vehicle newVehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setColor(Colors.BLACK);
        vehicle.setCurrentLocation(newLocation());
        vehicle.setLicensePlate("AKD-6954");
        vehicle.setVehicleBrand(VehicleBrand.IVECO);
        return vehicle;
    }

}
