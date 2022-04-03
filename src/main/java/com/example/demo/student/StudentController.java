package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {
  @GetMapping
  public List<Student> getStudents() {
    return List.of(
        new Student(
            2L,
            "hoangnguyen@gmail.com",
            "Hoang Nguyen",
            21,
            LocalDate.of(1999, 3, 28)
        )
    );
  }
}
