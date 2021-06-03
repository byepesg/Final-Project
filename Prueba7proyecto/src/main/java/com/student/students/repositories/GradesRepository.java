package com.student.students.repositories;

import com.student.students.models.Grades;
import com.student.students.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GradesRepository extends MongoRepository<Grades, Long> {
}
