package com.abbyhowe.LearnFolio.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Teacher extends User {

    /**
     * constructor
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param email
     * @param phoneNumber
     * @param type
     * @param createdDate
     * @param updatedDate
     * @param files
     * @param removeImages
     */
    public Teacher(Long id, @NotBlank(message = "First name is required") @Size(min = 2, max = 50, message = "Name must be between 3 and 50 characters") String firstName, @NotBlank(message = "Last name is required") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String lastName, @NotBlank(message = "Email is required") @Email(message = "Invalid email. Try again.") String email, @NotBlank(message = "Phone number is required") String phoneNumber, UserType type, Date createdDate, Date updatedDate, List<MultipartFile> files, List<String> removeImages) {
        super(id, firstName, lastName, email, phoneNumber, type, createdDate, updatedDate, files, removeImages);
    }
}
