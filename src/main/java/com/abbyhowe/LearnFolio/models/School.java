package com.abbyhowe.LearnFolio.models;

public class School {

    private String name;
    private String address;
    private int id;
    private static int nextId = 1;

    public School(String name, String address, int id) {
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

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        School.nextId = nextId;
    }
}
