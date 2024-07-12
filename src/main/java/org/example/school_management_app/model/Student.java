package org.example.school_management_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.school_management_app.model.modelhelper.Address;
import org.example.school_management_app.model.modelhelper.Person;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    @Id
    private  long studentId;
    private String name;
    private Date dateOfJoining;
    private  Date dateOfBirth;
    private  String fatherName;
    private  String motherName;
    private Address address;
}
