package com.sai.CrudMongo.service;

import com.sai.CrudMongo.exception.NoSuchStudentExistsException;
import com.sai.CrudMongo.exception.StudentAlreadyExistsException;
import com.sai.CrudMongo.model.Student;
import com.sai.CrudMongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("No Student present with this id= " + id));
    }

    @Override
    public String addStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        if (existingStudent == null) {
            studentRepository.save(student);
            return "Student added successfully";
        } else {
            throw new StudentAlreadyExistsException("Student is already existed!!");
        }
    }



    @Override
    public String updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        if (existingStudent == null) {
            throw new NoSuchStudentExistsException("No such Student exists!!");
        } else {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());
            existingStudent.setMajor(student.getMajor());
            studentRepository.save(existingStudent);
            return "Record updated Successfully";
        }
    }

    @Override
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    @Override
    public void deleteStudent(Long studentId){
        if(studentRepository.findById(studentId).isPresent()){
            studentRepository.deleteById(studentId);
        }
    }








}
