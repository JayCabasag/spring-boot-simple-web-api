package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jay = new Student(
                    "Jay",
                    LocalDate.of(2000, Month.OCTOBER, 16),
                    "jaycabasag@gmail.com"
            );
            Student jayson = new Student(
                    "Jayson",
                    LocalDate.of(1999, Month.OCTOBER, 16),
                    "jayson@gmail.com"
            );
            Student jack = new Student(
                    "Jack",
                    LocalDate.of(2004, Month.OCTOBER, 16),
                    "jack@gmail.com"
            );

            repository.saveAll(
                    List.of(jay, jayson, jack)
            );
        };
    }
}
