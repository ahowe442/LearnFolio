package com.abbyhowe.LearnFolio.models;

import javax.persistence.*;

public class School {

    private static final long serialVersionUID = -8885466378515990394L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "school_id")
    private Long id;
    @Column(name = "school_name")
    private String name;
    @Column(name = "school_address")
    private String address;
    @Column(name = "school_phoneNumber")
    private String phoneNumber;

    private Student student;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
