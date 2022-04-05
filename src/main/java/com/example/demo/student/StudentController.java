package com.example.demo.student;

import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController("/api/v1/student/")
@RestController
@Log4j2
@RequestMapping(path = "api/v1/student")
public class StudentController {
  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping()
  public List<Student> getStudents() {
    return studentService.getStudents();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
    log.info("getting student by id {}", id);
    return ResponseEntity.ok(studentService.getStudentById(id));
  }

  @PostMapping()
  public void registerNewStudent(@RequestBody Student student){
    studentService.addNewStudent(student);
  }

  @DeleteMapping(path="{id}")
  public void deleteStudent(@PathVariable("id") Long id){
    studentService.deleteStudent(id);
  }
}
