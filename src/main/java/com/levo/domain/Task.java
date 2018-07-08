package com.levo.domain;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="itinerary_fk")
    private Itinerary itinerary;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;
    private Boolean isDone;
    private Boolean success;

    @OneToOne(cascade = CascadeType.ALL)
    private Location local;

    @Enumerated(EnumType.ORDINAL)
    private TaskType taskType;

}
