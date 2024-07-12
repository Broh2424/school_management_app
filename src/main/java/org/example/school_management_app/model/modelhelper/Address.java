package org.example.school_management_app.model.modelhelper;


import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Embeddable
public class Address {
    private  String  street;
    private String city;
    private  String state;
    private String pinCode;

}
