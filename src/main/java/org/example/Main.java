package org.example;
import org.example.adapters.concretes.LogCheckManager;
import org.example.entities.Students;
import org.example.entities.Teachers;

public class Main {
    public static void main(String[] args) {
       Students students1=new Students();
       students1.schoolNo="123456789";
       students1.pass="123456789";
       students1.firstName="Mehmet";

        Students students2= new Students();
        students2.schoolNo="123456789";
        students2.pass="123456789";
        students2.firstName="Ali";
        Teachers teachers1=new Teachers();
        teachers1.tC="12345678901";
        teachers1.pass="123456";
        teachers1.firstName="Samet";
        Teachers teachers2=new Teachers();
        teachers2.tC="12345678901";
        teachers2.pass="123456";
        teachers2.firstName="Veli";

        LogCheckManager logCheckManager=new LogCheckManager(students1);
        logCheckManager.loginCheck(students1);
    }
}