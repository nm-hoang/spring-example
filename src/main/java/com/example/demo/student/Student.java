package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String email;
    private String name;
    private Integer age;
    private LocalDate dob;

    public Student() {
    }

    public Student(Long id, String email, String name, Integer age, LocalDate dob) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public Student(String email, String name, Integer age, LocalDate dob) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
