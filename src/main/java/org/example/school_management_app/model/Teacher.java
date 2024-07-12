package org.example.school_management_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.school_management_app.model.modelhelper.Address;
import org.example.school_management_app.model.modelhelper.Person;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Teacher extends Person {
    @Id
    private  long teacherId;
    private  String teacherName;
    private Address address;
}
