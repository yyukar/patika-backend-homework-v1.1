package week5.records;

import java.util.Objects;

public record Student(String name, String surName, Integer studentNum) {

    // Validate constructor arguments
    public Student {
        Objects.requireNonNull(name, " Name cannot be null");
        Objects.requireNonNull(surName, "Surname cannot be null");
        Objects.requireNonNull(studentNum, "Student number cannot be null");

        if (studentNum < 0 ) {
            throw new IllegalArgumentException("Student number must be positive!");
        }
    }
}
