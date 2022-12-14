package org.example.adapters.concretes;

import org.example.adapters.abstracts.LogCheckService;
import org.example.entities.concretes.Students;
import org.example.entities.concretes.Teachers;

public class LogCheckManager implements LogCheckService {

    private Students students;
    private Teachers teachers;
    public LogCheckManager(Students students) {
        this.students = students;
        this.students.pass = students.pass;
        this.students.schoolNo=students.schoolNo;
    }



    public LogCheckManager(Teachers teachers) {
        this.teachers = teachers;
        this.teachers.tC = teachers.tC;
        this.teachers.pass = teachers.pass;
    }

    
    public void loginCheck(Teachers teachers){
        if (this.teachers.tC.equals(teachers.tC) && this.teachers.pass.equals(teachers.pass)){
            System.out.println("Giriş Başarılı.. Sayın "+teachers.firstName);
        }
        else{
            System.out.println("Giriş Başarısız");
        }
    }



    public void loginCheck(Students students) {
        if (this.students.schoolNo.equals(students.schoolNo) && this.students.pass.equals(students.pass)){
            System.out.println("Giriş Başarılı.. Sayın "+students.firstName);
        }
        else System.out.println("Giriş Başarısız...");
    }
}
