package com.example.demo.student.serviceImpl;

import com.example.demo.responseWrapper.StudentWarpper;
import com.example.demo.student.dao.StudentMapper;
import com.example.demo.student.entity.Student;
import com.example.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;



    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public Student getSingleStuentBySid(String sid) {
        return studentMapper.selectSingleStudentById(sid);
    }

    @Override
    public boolean addStudent(Student stduent) {
        return studentMapper.insertStudent(stduent) > 0 ? true : false;
    }


    public StudentWarpper warpperResult(Object data){
        if(data == null){
            warpperResult("200","成功的操作",data);
        }else if(data.equals(true)){
            warpperResult("200","成功的操作",data);
        }else if(data.equals(false)){
            warpperResult("300","失败的操作",data);
        }else {
            warpperResult("200","成功的操作",data);
        }
        return warpperResult("400","无数据库交互", null);
    }

    public StudentWarpper warpperResult(String code, String msg, Object data){
        return new StudentWarpper(code, msg, data);
    }

}
