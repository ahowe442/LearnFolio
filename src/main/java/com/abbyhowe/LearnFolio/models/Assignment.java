package com.abbyhowe.LearnFolio.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "assignment")
public class Assignment {


    private static final long serialVersionUID = -8885466378515990394L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "assignment_id")
    private Long id;
    @Column(name = "assignment_title")
    private String title;
    @Column(name = "assignment_description")
    private String description;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "dueDate")
    private Date dueDate;
    @Column(name = "assignment_createdDate")
    private Date createdDate;
    @Column(name = "assignment_updatedDate")
    private Date updatedDate;

    /**
     * Constructor
     */
    public Assignment(Long id, String title, String description, String createdBy, Date dueDate, Date createdDate, Date updatedDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }


    /**
     * Getters and Setters
     */


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Methods (hashCode, toString, equals)
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Assignment)) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getCreatedBy(), that.getCreatedBy()) &&
                Objects.equals(getDueDate(), that.getDueDate()) &&
                Objects.equals(getCreatedDate(), that.getCreatedDate()) &&
                Objects.equals(getUpdatedDate(), that.getUpdatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getTitle(), getDescription(), getCreatedBy(), getDueDate(), getCreatedDate(), getUpdatedDate());
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", dueDate=" + dueDate +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
