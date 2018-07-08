package com.levo.domain;

import javax.persistence.*;

@Entity
public class Occurrences {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private OcurrenceType ocurrenceType;
    private String description;
    private Boolean isSolved;

}
