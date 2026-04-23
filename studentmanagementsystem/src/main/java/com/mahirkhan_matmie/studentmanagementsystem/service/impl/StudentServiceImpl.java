package com.mahirkhan_matmie.studentmanagementsystem.service.impl;

import com.mahirkhan_matmie.studentmanagementsystem.entity.Student;
import com.mahirkhan_matmie.studentmanagementsystem.repository.StudentRepository;
import com.mahirkhan_matmie.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}