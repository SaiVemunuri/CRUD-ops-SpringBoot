package com.sai.CrudMongo.controller;

import com.sai.CrudMongo.model.Student;
import com.sai.CrudMongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable("id") Long id){
        return studentService.getStudent(id);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);

    }


}
