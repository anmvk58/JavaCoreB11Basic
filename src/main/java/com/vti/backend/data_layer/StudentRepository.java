package com.vti.backend.data_layer;

import com.vti.database.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public List<Student> getListStudent() throws SQLException {
        // Khai báo thông tin kết nối tới Database
        String urlDb = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "root";

        // Tạo kết nối vật lý tới DB:
        Connection connection = DriverManager.getConnection(urlDb, username, password);

        // Tạo đối tượng statement để thực hiện querry
        Statement myStatement = connection.createStatement();

        // Querry và hứng kết quả vào ResultSet
        ResultSet resultSet = myStatement.executeQuery("SELECT  * FROM student");

        List<Student> list = new ArrayList<>();

        // Gán các data từ DB vào trong arrayList:
        while (resultSet.next()){
            int tempId = resultSet.getInt("id");
            String tempName = resultSet.getString("name");
            int tempAge = resultSet.getInt("age");
            String tempHometown = resultSet.getString("hometown");

            Student student = new Student(tempId, tempName, tempAge, tempHometown);
            list.add(student);
        }

        return list;
    }
}
