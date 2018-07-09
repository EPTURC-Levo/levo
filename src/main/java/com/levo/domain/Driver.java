package com.levo.domain;


import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "driver_id")
public class Driver extends Staff{


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itinerary_id")
    private Itinerary itinerary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

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
