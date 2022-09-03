package org.example.adapters.abstracts;

import org.example.entities.Students;
import org.example.entities.Teachers;

public  interface LogCheckService {
    public void loginCheck(Students students);
    public  void loginCheck(Teachers teachers);
}
