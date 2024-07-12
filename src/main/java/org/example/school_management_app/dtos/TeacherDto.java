package org.example.school_management_app.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.school_management_app.model.modelhelper.Address;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherDto {
    private  long teacherId;
    private  String teacherName;
    private Address address;
}
