package com.example.springBoot.controller;

import com.example.springBoot.model.Student;
import com.example.springBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    @PreAuthorize("hasRole('USER')")
    ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        Student student1= studentService.addStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    @PreAuthorize("hasRole('USER')")
    ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
