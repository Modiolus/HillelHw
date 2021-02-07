package com.homework20;

import com.homework20.entity.StudentShort;
import com.homework20.entity.Students;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class AddGetStudent {
    public static void addStudents(String name, Integer IdGroup, Integer YearAdmission, Session session) {

        Students students = new Students()
                .setNameStudent(name)
                .setIdGroup(IdGroup)
                .setYearAdmission(YearAdmission);

        session.save(students);
        session.getTransaction().commit();
    }

    public static void getStudents(Session session, String query) {
        Query q = session.createQuery(query);
        List<StudentShort> studentShortList = q.list();

        for (StudentShort sts : studentShortList) {
            System.out.println(sts);
        }
    }
}
