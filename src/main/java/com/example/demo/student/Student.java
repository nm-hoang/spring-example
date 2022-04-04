package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private Long id;
    private String email;
    private String name;
    private Integer age;
    private LocalDate dob;

}
