package com.bihuniak.educator.basic;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Address {
    private String street;
    private PostCode postCode;
    private String city;
    private String country;


    public Address() {
    }

    public Address(String street, PostCode postCode, String city, String country) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
    }
}
