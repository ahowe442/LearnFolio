package com.abbyhowe.LearnFolio.models;

public class Teacher {

    private String name;
    private String address;
    private int id;
    private static int nextId = 1;


//    increments id
    public Teacher(){
        id = nextId;
        nextId++;
    }

//    Constructor (calls itself to increment the id number)
    public Teacher(String name, String address, int id) {
        this();
        this.name = name;
        this.address = address;
        this.id = id;
    }


//    getters and setters
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


//    toString Method
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
