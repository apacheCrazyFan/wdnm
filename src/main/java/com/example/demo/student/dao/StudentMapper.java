package com.example.demo.student.dao;

import com.example.demo.student.entity.Student;

import java.util.List;

public interface StudentMapper {
    //
    List<Student> selectAllStudent();
    //
    Student selectSingleStudentById(String sid);
    //
    int insertStudent(Student student);
}
