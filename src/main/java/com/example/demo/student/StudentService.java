package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
//       return students.stream().filter(student -> id.equals(student.getId().intValue()))
//                .findFirst().orElseThrow();
        return studentResponse.get();
    }

    public void addNewStudent(Student student) {
//        studentRepository.save(student);
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("email is taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean isExists = studentRepository.existsById(id);
        if(!isExists) {
            throw new IllegalStateException(
                    "student with id" + id + " does not exists"
            );
        }
        studentRepository.deleteById(id);
    }
}
