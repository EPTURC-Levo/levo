package com.levo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Itinerary {

    final Integer numberMaxTasks = 2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Driver driver;



    @OneToMany(mappedBy = "itinerary", cascade = CascadeType.ALL)
    private List<Task> tasks;



}
