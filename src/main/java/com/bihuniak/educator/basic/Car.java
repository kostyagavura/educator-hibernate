package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue()
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic(optional = false) // or
    //@Column(nullable = false)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }

    private long id;

    private String model;
    private String brand;
    private int wheel;

    private double engineCapacity;
    private boolean secondHand;

    public Car(String model, String brand, int wheel, double engineCapacity, boolean secondHand) {
        this.model = model;
        this.brand = brand;
        this.wheel = wheel;
        this.engineCapacity = engineCapacity;
        this.secondHand = secondHand;
    }

    public Car() {
    }
}