package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public Student getStudent(){
        Student student = new Student(
                1L,
                "Jay",
                21,
                LocalDate.of(2000, Month.OCTOBER, 16),
                "jaycabasag@gmail.com"
        );
        return student;
    }
}
