package org.example.school_management_app.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private  long studentId;
    private String name;
    private Date dateOfJoining;
    private  Date dateOfBirth;
    private  String fatherName;
    private  String motherName;
}
