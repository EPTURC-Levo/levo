package com.levo.domain;

import com.levo.enumerations.TaskType;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="itinerary_id")
    private Itinerary itinerary;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;
    private Boolean isDone;
    private Boolean success;


    @Column(length = 512)
    private String note;

    @OneToOne(cascade = CascadeType.ALL)
    private Location local;

    @OneToOne(cascade = CascadeType.ALL)
    private Address taskAddress;

    @Enumerated(EnumType.ORDINAL)
    private TaskType taskType;


    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Location getLocal() {
        return local;
    }

    public void setLocal(Location local) {
        this.local = local;
    }

    public Address getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(Address taskAddress) {
        this.taskAddress = taskAddress;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
