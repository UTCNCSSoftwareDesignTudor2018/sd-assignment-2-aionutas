package com.studentmanagement.studentmanagement.service;


import com.studentmanagement.studentmanagement.model.repository.StudentRepo;
import com.studentmanagement.studentmanagement.model.entity.Student;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student getById(Long id) {
        return studentRepo.getOne(id);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long studentId) {

        Student removeStudent = studentRepo.getOne(studentId);

        if(removeStudent.getStudentId() != null) {
            studentRepo.delete(removeStudent);
        }
        else{
            System.out.println("Could not delete student!");
        }

    }
    public List<Student> getAllStudentsByName(String name)
    {
        List<Student> studentList = null;

        if (StringUtils.isEmpty(name))
        {
            studentList = studentRepo.findAll();
        }
        else
        {
            studentList = studentRepo.findAllByName(name);
        }

        return studentList;
    }
}
