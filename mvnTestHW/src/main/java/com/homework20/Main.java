package com.homework20;

import org.hibernate.Session;

import static com.homework20.AddGetStudent.addStudents;
import static com.homework20.AddGetStudent.getStudents;


public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //addStudents("Михайлов", 2, 1995, session);
        getStudents(session, "From StudentShort");

    }


}
