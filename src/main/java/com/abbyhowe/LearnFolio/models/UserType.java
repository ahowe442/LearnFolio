package com.abbyhowe.LearnFolio.models;

public enum UserType {
    TEACHER("Teacher"),
    STUDENT("Student"),
    ADMIN("Account Administrator");

    private final String displayName;

    UserType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
