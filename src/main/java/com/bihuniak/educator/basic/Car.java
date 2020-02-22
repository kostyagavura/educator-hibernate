package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue()
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