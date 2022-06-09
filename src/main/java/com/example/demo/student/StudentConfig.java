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
            Student mariam = new Student(
                    "mariam",
                    "mariam.g.20@gmail.com",
                    LocalDate.of(2000, Month.APRIL,30));
            Student alex = new Student(
                    "alex",
                    "Alex.g.20@gmail.com",
                    LocalDate.of(2002, Month.JULY,20)
            );
            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
