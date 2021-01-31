package com.homework18;

import java.sql.*;

import static com.homework18.Methods.*;

public class MainStudent {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection(URL, USER, PASS);

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select* from students");

        insertStudents("Petrov", 2, 1991, connection);
        insertStudents("Ivanov", 1, 1994, connection);
        insertStudents("Sidorov", 1, 1992, connection);

        System.out.println("Проверьте таблицу. Через 8 сек студент \"Ivanov\" будет удалён! ");
        Thread.sleep(8000);
        deleteStudents("Ivanov", connection);

      //  getStudents(rs);

    }

}
