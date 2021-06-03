package com.student.students.controllers;

import com.student.students.models.Student;
import com.student.students.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository studentRepository;
    @GetMapping("/all-students")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

}
