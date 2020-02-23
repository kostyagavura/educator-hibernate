package com.bihuniak.educator.basic;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;

    @Embedded
    private Address address;
    private LocalDate birthday;
    @Embedded
    @Enumerated(value = EnumType.STRING)
    private Sex sex;

    public Human() {
    }

    public Human(String firstName, String lastName, Address address, LocalDate birthday, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.sex = sex;
    }
}
