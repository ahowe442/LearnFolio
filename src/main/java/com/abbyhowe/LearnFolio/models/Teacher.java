package com.abbyhowe.LearnFolio.models;

public class Teacher {

    private String name;
    private String address;
    private int id;
    private static int nextId = 1;

    public Teacher(){
        id = nextId;
        nextId++;
    }

    public Teacher(String name, String address, int id) {
        this();
        this.name = name;
        this.address = address;
        this.id = id;
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
