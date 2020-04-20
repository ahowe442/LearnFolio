package com.abbyhowe.LearnFolio.models;

import java.util.Objects;

public class Student {

    private String name;
    private String address;
    private int id;
    private static int nextId = 1;


    public Student(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id=nextId;
        nextId++;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                getName().equals(student.getName()) &&
                getAddress().equals(student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getId());
    }
}
