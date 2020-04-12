package com.abbyhowe.LearnFolio.models;

public class Student {

    private String name;
    private String address;
    private int id;
    private static int nextId = 1;

    public Student(){
        id = nextId;
        nextId++;
    }

    public Student(String name, String address, int id) {
        this();
        this.name = name;
        this.address = address;
    }


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

    public int getId() {
        return id;
    }

}
