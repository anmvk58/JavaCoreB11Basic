package com.vti.frontend;

import com.vti.backend.presentation_layer.StudentController;
import com.vti.database.Student;

import java.sql.SQLException;
import java.util.List;

public class Demo3TierApplicationBasic {
    public static void main(String[] args) throws SQLException {
        StudentController controller = new StudentController();

        System.out.println("Danh sach Student la: ");
        List<Student> students = controller.getListStudentFromController();

        for(Student s : students){
            System.out.println(s);
        }
    }
}
