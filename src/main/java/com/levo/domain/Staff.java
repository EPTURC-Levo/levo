package com.levo.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Credential credential;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    public Staff() {

    }


}
