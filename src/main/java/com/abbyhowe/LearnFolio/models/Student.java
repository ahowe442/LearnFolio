package com.abbyhowe.LearnFolio.models;

import java.util.Objects;


public class Student extends User {

    private Double gradePointAverage;
    private Teacher teacher;

//    /**
//     * constructor
//     *
//     * @param id
//     * @param firstName
//     * @param lastName
//     * @param email
//     * @param phoneNumber
//     * @param type
//     * @param createdDate
//     * @param updatedDate
//     * @param files
//     * @param removeImages
//     */
//    public Student(Long id,
//                   @NotBlank(message = "First name is required") @Size(min = 2, max = 50, message = "Name must be between 3 and 50 characters") String firstName,
//                   @NotBlank(message = "Last name is required") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String lastName,
//                   @NotBlank(message = "Email is required") @Email(message = "Invalid email. Try again.") String email,
//                   @NotBlank(message = "Phone number is required") String phoneNumber,
//                   UserType type,
//                   Date createdDate,
//                   Date updatedDate,
//                   List<MultipartFile> files,
//                   List<String> removeImages) {
//        super(id, firstName, lastName, email, phoneNumber, type, createdDate, updatedDate, files, removeImages);
//    }


    /**
     * Getters adn Setters
     */
    public Double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(Double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * toString Method
     */
    @Override
    public String toString() {
        return "Student{" +
                "gradePointAverage=" + gradePointAverage +
                ", teacher=" + teacher +
                '}';
    }

    /**
     * equals and hashCode Methods.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getGradePointAverage(), student.getGradePointAverage()) &&
                Objects.equals(getTeacher(), student.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGradePointAverage(), getTeacher());
    }
}
