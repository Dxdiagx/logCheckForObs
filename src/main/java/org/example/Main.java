package org.example;
import org.example.adapters.abstracts.LogCheckService;
import org.example.adapters.concretes.LogCheckManager;
import org.example.entities.concretes.Students;
import org.example.entities.concretes.Teachers;

public class Main {
    public static void main(String[] args) {
       Students students1=new Students();
       students1.schoolNo="123456789";
       students1.pass="123456789";
       students1.firstName="Samet";

        Students students2= new Students();
        students2.schoolNo="123456789";
        students2.pass="1234567890";
        students2.firstName="Mehmet";
        Teachers teachers1=new Teachers();
        teachers1.tC="12345678901";
        teachers1.pass="123456";
        teachers1.firstName="Ahmet";
        Teachers teachers2=new Teachers();
        teachers2.tC="12345678901";
        teachers2.pass="1234567";
        teachers2.firstName="Taner";

        LogCheckService logCheckService=new LogCheckManager(students1);
        logCheckService.loginCheck(students1);
        LogCheckService logCheckService2=new LogCheckManager(teachers1);
        logCheckService2.loginCheck(teachers1);

    }
}