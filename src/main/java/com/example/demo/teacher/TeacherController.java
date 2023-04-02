package com.example.demo.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/teacher")
public class TeacherController {
    Teacher teacher1 = new Teacher(
            1L,
            "John",
            "Doe",
            "johndoe@gmail.com",
            "English"
    );
    Teacher teacher2 = new Teacher(
            2L,
            "Sarah",
            "Lee",
            "sarahlee@gmail.com",
            "Math"
    );
    Teacher teacher3 = new Teacher(
            3L,
            "Michael",
            "Johnson",
            "michaeljohnson@gmail.com",
            "Science"
    );
    Teacher teacher4 = new Teacher(
            4L,
            "Emily",
            "Chang",
            "emilychang@gmail.com",
            "History"
    );
    Teacher teacher5 = new Teacher(
            5L,
            "Alex",
            "Kim",
            "alexkim@gmail.com",
            "Art"
    );
    @GetMapping
    public List<Teacher> getTeachersList(){
        return List.of(
                teacher1, teacher2, teacher3, teacher4,teacher5
                );
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(){
        Teacher selectedTeacher = teacher1;
        return selectedTeacher;
    }
}
