package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
  public static List<Student> students = Arrays.asList(new Student(
      1L,
      "example@gmail.com",
      "Example",
      21,
      LocalDate.of(1999, 3, 28)
  ), new Student(
      2L,
      "hoangnguyen@gmail.com",
      "Hoang Nguyen",
      21,
      LocalDate.of(1999, 3, 28)
  ));

  public List<Student> getStudents() {
    return students;
  }

  public Student getStudentById(Integer id) {
    return students.stream().filter(student -> id.equals(student.getId().intValue()))
        .findFirst().orElseThrow();
  }
}
