package com.example.springBoot.controller;

import com.example.springBoot.model.Student;
import com.example.springBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        Student student1= studentService.addStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }
}
