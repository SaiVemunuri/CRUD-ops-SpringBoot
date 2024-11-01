package com.sai.CrudMongo.service;

import com.sai.CrudMongo.model.Student;

import java.util.List;


public interface IStudentService {
    Student getStudent(Long id);
    String addStudent(Student student);
    String updateStudent(Student student);
    List<Student> getStudents();
    void deleteStudent(Long studentId);
}
