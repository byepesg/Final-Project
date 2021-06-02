package com.student.students.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Student")


public class Student {
    @Id
    private long id;
    private String name;
    private String password;
    private String birth_date;
    private String nameDegree;



    }
