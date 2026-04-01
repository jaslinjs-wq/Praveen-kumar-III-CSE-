package com.example.DAO;

import java.util.ArrayList;
import java.util.List;
import com.example.POJO.Student;

public class StudentDAO {

    List<Student> students = new ArrayList<>();

    public StudentDAO() {
        students.add(new Student(1,"Arun","Kumar"));
        students.add(new Student(2,"Rahul","Sharma"));
        students.add(new Student(3,"Anu","Priya"));
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
