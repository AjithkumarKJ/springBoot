package com.example.springBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studName;
    private int marks;
    private String department;

    public Student() {
    }

    public Student(int studentId, String studName, int marks, String department) {
        this.studentId = studentId;
        this.studName = studName;
        this.marks = marks;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studName='" + studName + '\'' +
                ", marks=" + marks +
                ", department='" + department + '\'' +
                '}';
    }
}
