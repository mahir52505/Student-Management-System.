package com.mahirkhan_matmie.studentmanagementsystem.service;

import com.mahirkhan_matmie.studentmanagementsystem.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}