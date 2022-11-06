package com.vti.backend.business_layer;

import com.vti.backend.data_layer.StudentRepository;
import com.vti.database.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private StudentRepository repository;

    public StudentService() {
        repository = new StudentRepository();
    }

    public List<Student> getListStudentFromService() throws SQLException {
        return repository.getListStudent();
    }
}
