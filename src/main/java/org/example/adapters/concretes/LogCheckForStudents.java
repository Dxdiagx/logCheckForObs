package org.example.adapters.concretes;

import org.example.adapters.abstracts.LogCheckStudentsDao;
import org.example.entities.Students;

public class LogCheckForStudents implements LogCheckStudentsDao {

    String schoolNo;
    String pass;
    public LogCheckForStudents(String schoolNo, String pass) {
        this.schoolNo = schoolNo;
        this.pass = pass;
    }


    public void loginCheck(Students students) {
        if (this.schoolNo.equals(students.schoolNo) && this.pass.equals(students.pass)){
            System.out.println("Giriş Başarılı.. Sayın "+students.firstName);
        }
        else System.out.println("Giriş Başarısız...");
    }

}
