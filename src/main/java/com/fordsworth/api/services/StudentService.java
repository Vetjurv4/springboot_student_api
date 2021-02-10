package com.fordsworth.api.services;

import com.fordsworth.api.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Velile Vamba", "12A", 2000, 12));
        listOfStudents.add(new Student("Elon Musk", "6B", 2004, 8));
        listOfStudents.add(new Student("Bill Gates", "2D", 2000, 4));
        listOfStudents.add(new Student("Jack  Ma", "3D", 1923, 2));
        listOfStudents.add(new Student("Mark Zuckerburg", "8C", 1999, 12));
        listOfStudents.add(new Student("Jeff Bezos", "(9A)", 2000, 10));

        return listOfStudents;

    }

}
