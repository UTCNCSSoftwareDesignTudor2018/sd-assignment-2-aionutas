package com.studentmanagement.studentmanagement.models;

import com.studentmanagement.studentmanagement.model.entity.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class StudentListTestBuilder {
    public static List<Student> createStudentsList(){
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Andreea Ionutas", Long.valueOf(2), "Dumbrava",3123,312, "aionutas");
        studentList.add(student);
        return studentList;
    }
}
