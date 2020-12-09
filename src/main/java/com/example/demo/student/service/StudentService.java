package com.example.demo.student.service;

import com.example.demo.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student getSingleStuentBySid(String sid);

    boolean addStudent(Student stduent);
}
