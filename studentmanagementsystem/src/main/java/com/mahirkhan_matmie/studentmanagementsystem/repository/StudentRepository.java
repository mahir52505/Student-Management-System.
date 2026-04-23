package com.mahirkhan_matmie.studentmanagementsystem.repository;

import com.mahirkhan_matmie.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}