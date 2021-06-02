package com.student.students.repositories;

import com.student.students.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
public interface StudentRepository extends MongoRepository<Student, Long> {
}
