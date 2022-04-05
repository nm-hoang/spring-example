package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hoangnguyen = new Student(
                    "hoangnguyen@gmail.com",
                    "Hoang Nguyen",
                    LocalDate.of(1999, 3, 28)
            );
            Student curry = new Student(
                    "curry@gmail.com",
                    "Stephen Curry",
                    LocalDate.of(2000, 1, 1)
            );

            repository.saveAll(
                    List.of(hoangnguyen, curry)
            );
        };
    }
}
