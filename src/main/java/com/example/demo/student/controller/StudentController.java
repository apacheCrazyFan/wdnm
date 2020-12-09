package com.example.demo.student.controller;

import com.example.demo.responseWrapper.StudentWarpper;
import com.example.demo.student.entity.Student;
import com.example.demo.student.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("/findAllStudent")
    @ResponseBody
    public StudentWarpper findAllStudent(){
        return  studentService.warpperResult(studentService.getAllStudent() );
    }


    @PostMapping("/addStudent")
    @ResponseBody
    public StudentWarpper addStudent(Student student){
        return studentService.warpperResult(studentService.addStudent(student) );
    }





}
