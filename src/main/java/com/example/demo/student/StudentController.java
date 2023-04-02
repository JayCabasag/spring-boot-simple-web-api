package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent(){
        Student student = new Student(
                1L,
                "Jay",
                21,
                LocalDate.of(2000, Month.OCTOBER, 16),
                "jaycabasag@gmail.com"
        );
        return List.of(
                student, student, student, student, student, student
        );
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){

        Student student = new Student(
                id,
                "Jay",
                21,
                LocalDate.of(2000, Month.OCTOBER, 16),
                "jaycabasag@gmail.com"
        );
        return student;
    }
}
