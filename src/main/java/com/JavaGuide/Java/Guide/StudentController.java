package com.JavaGuide.Java.Guide;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @GetMapping("/student")
    public Student getStudent (){
        return new Student("Noah", "TheWind");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", "Bond"));
        students.add(new Student("Tony", "Stark"));
        students.add(new Student("Captain", "America"));
        return students;
    }

    @GetMapping("{firstName}/{lastName}")
    public Student studentPathsVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
