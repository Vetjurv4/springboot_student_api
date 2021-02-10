package com.fordsworth.api.controllers;

import com.fordsworth.api.models.Student;
import com.fordsworth.api.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(value ="/student", method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student){
        System.out.println(student.toString());
    }

}
