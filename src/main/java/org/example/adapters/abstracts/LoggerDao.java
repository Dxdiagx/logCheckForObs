package org.example.adapters.abstracts;

import org.example.entities.Students;
import org.example.entities.Teachers;
import org.example.entities.Users;

public  interface LoggerDao {
    public void loginCheck(Students students);
    public  void loginCheck(Teachers teachers);
}
