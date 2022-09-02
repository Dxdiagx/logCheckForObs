package org.example;

import org.example.adapters.abstracts.LogCheckTeachersDao;
import org.example.adapters.concrete.LogCheckForTeachers;
import org.example.entities.Students;
import org.example.entities.Teachers;

public class Main {
    public static void main(String[] args) {
       Students students1=new Students();
       students1.schoolNo="123456789";
       students1.pass="123456789";

        Students students2= new Students();
        students2.schoolNo="123456789";
        students2.pass="123456789";
        Teachers teachers1=new Teachers();
        teachers1.tC="12345678901";
        teachers1.pass="123456";
        teachers1.firstName="Samet";
        Teachers teachers2=new Teachers();
        teachers2.tC="12345678901";
        teachers2.pass="123456";

        LogCheckTeachersDao logCheckTeachersDao=new LogCheckForTeachers(teachers1.tC, teachers1.pass);
        logCheckTeachersDao.loginCheck(teachers1);
    }
}