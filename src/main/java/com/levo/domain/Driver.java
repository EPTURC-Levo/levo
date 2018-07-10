package com.levo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "driver_id")
public class Driver extends Staff{


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itinerary_id")
    private Itinerary itinerary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Message> messageList;

    private float phoneBattery;

    public Driver() {
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public float getPhoneBattery() {
        return phoneBattery;
    }

    public void setPhoneBattery(float phoneBattery) {
        this.phoneBattery = phoneBattery;
    }
}
