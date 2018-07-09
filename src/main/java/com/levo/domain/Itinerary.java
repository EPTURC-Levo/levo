package com.levo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Itinerary {

    final Integer maxTasks = 2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @OneToMany(mappedBy = "itinerary", cascade = CascadeType.ALL)
    private List<Occurrence> occurrence;

    @OneToMany(mappedBy = "itinerary", cascade = CascadeType.ALL)
    private List<Task> tasks;


    public Itinerary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Occurrence> getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(List<Occurrence> occurrence) {
        this.occurrence = occurrence;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Integer getMaxTasks() {
        return maxTasks;
    }
}
