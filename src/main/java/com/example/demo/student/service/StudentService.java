package com.example.demo.student.service;

import com.example.demo.student.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student getSingleStuentBySid(String sid);

    boolean addStudent(Student stduent);
}
