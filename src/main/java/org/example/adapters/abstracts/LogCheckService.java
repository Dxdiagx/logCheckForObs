package org.example.adapters.abstracts;

import org.example.entities.concretes.Students;
import org.example.entities.concretes.Teachers;

public  interface LogCheckService {
    public void loginCheck(Students students);
    public  void loginCheck(Teachers teachers);
}
