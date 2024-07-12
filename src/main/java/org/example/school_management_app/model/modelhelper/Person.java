package org.example.school_management_app.model.modelhelper;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    private long id;
    private String name;
    @Embedded
    private Address address;


}
