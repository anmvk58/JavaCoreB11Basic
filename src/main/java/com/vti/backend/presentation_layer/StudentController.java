package com.vti.backend.presentation_layer;

import com.vti.backend.business_layer.StudentService;
import com.vti.database.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private StudentService service;

    public StudentController() {
        service = new StudentService();
    }

    public List<Student> getListStudentFromController() throws SQLException {
        return service.getListStudentFromService();
    }
}
