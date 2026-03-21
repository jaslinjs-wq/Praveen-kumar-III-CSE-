package com.example.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.StudentDAO;
import com.example.POJO.Student;

@RestController
public class StudentController {

    StudentDAO dao = new StudentDAO();

    @GetMapping("/students")
    public List<Student> getStudents(){
        return dao.getAllStudents();
    }
}
