package org.example.school_management_app;

import org.example.school_management_app.model.Student;
import org.example.school_management_app.model.modelhelper.Address;
import org.example.school_management_app.model.modelhelper.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementAppApplication.class, args);
    }
}
