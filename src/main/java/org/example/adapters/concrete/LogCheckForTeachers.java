package org.example.adapters.concrete;

import org.example.entities.Teachers;
import org.example.adapters.abstracts.LogCheckTeachersDao;

public class LogCheckForTeachers implements LogCheckTeachersDao {
    String tC;
    String pass;


    public LogCheckForTeachers(String tC,String pass) {
        this.tC = tC;
        this.pass = pass;
    }

    
    public void loginCheck(Teachers teachers){
        if (this.tC.equals(teachers.tC) && this.pass.equals(teachers.pass)){
            System.out.println("Giriş Başarılı.. Sayın "+teachers.firstName);
        }
        
    }
}
