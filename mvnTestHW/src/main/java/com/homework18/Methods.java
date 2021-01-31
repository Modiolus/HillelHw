package com.homework18;

import java.sql.*;
import java.util.ArrayList;

public class Methods {
    public static void insertStudents(String name_stud, Integer idGroup, Integer year_admis, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into students(name_stud, idGroup, year_admis) values (?, ?, ?)");
        preparedStatement.setString(1, name_stud);
        preparedStatement.setInt(2, idGroup);
        preparedStatement.setInt(3, year_admis);
        preparedStatement.executeUpdate();

    }

    public static void deleteStudents(String name_stud, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from students where (name_stud" + " = " + "'" + name_stud + "'" + ")");
        //  connection.close();
    }

    public static void getStudents(ResultSet rs) throws SQLException {
        ArrayList<Students> person = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("idStudent");
            String name = rs.getString("name_stud");
            person.add(new Students(id, name));
        }

        for (Students st : person) {
            System.out.println(st);
        }
    }
}
