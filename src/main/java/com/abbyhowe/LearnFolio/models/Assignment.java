package com.abbyhowe.LearnFolio.models;

import java.util.Date;
import java.util.Objects;

public class Assignment {

    private String title;
    private String description;
    private String createdBy;
    private Date dueDate;

    private int id;
    private static int nextId = 1;

    public Assignment(String title, String description, String createdBy, Date dueDate) {
        this();
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.dueDate = dueDate;
    }

    public Assignment (){
        this.id = nextId;
        nextId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
        Assignment.nextId = nextId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Assignment)) return false;
        Assignment that = (Assignment) o;
        return getId() == that.getId() &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getCreatedBy(), that.getCreatedBy()) &&
                Objects.equals(getDueDate(), that.getDueDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getCreatedBy(), getDueDate(), getId());
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", dueDate=" + dueDate +
                ", id=" + id +
                '}';
    }
}
