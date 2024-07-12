package org.example.school_management_app.repository;

import org.example.school_management_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
