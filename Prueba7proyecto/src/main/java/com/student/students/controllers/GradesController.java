package com.student.students.controllers;

import com.student.students.models.Grades;
import com.student.students.models.Student;
import com.student.students.repositories.GradesRepository;
import com.student.students.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class GradesController {
    private final GradesRepository gradesRepository;
    @GetMapping("/get-all-grades")
    public List<Grades> getAllGrades(){
        return gradesRepository.findAll();
    }
    @PostMapping("/add-grades")
    public Grades addGrades(@RequestBody Grades grades){
        return gradesRepository.save(grades);
    }
}
