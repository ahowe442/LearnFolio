package com.abbyhowe.LearnFolio.models.dto;

public class RegisterFormDTO extends LoginFormDTO {

    private String verifyPassword;
    private String username;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
