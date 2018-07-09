package com.levo.domain;

import com.levo.enumerations.OcurrenceType;

import javax.persistence.*;

@Entity
public class Occurrence {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="itinerary_id")
    private Itinerary itinerary;

    @Enumerated(EnumType.ORDINAL)
    private OcurrenceType ocurrenceType;
    private String description;
    private Boolean isSolved;

    public Occurrence() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OcurrenceType getOcurrenceType() {
        return ocurrenceType;
    }

    public void setOcurrenceType(OcurrenceType ocurrenceType) {
        this.ocurrenceType = ocurrenceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSolved() {
        return isSolved;
    }

    public void setSolved(Boolean solved) {
        isSolved = solved;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
}
