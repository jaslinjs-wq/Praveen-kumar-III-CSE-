package com.example.h2connections.Controller;
import com.example.h2connections.Exception.StudentNotException;
import com.example.h2connections.Service.StudentService;

import com.example.h2connections.dao.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student1> getStudents() {
            try{
            return service.getAllStudents();
        }
            catch (Exception e){
                throw  new StudentNotException("student not found");
            }

        //return service.getAllStudents();
    }
    @ExceptionHandler(StudentNotException.class)
    public ResponseEntity<String> handleException(StudentNotException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }



@PostMapping("/students")
    public Student1 addStudent(@RequestBody Student1 S) {
        return service.SaveStudent(S);
    }

    @PutMapping("students/{id}")
    public Student1 update(@PathVariable int id, @RequestBody Student1 S) {
        return service.updateStudent(id, S);
    }

    @DeleteMapping("students/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}


