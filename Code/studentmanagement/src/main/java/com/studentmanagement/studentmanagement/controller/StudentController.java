package com.studentmanagement.studentmanagement.controller;

import com.studentmanagement.studentmanagement.model.entity.Student;
import com.studentmanagement.studentmanagement.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "Student Side")
@RestController
@RequestMapping("/student")

public class StudentController {


    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student) {
        if (student.getStudentId() == null) {
            return studentService.addStudent(student);
        }
        return null;
    }

    @RequestMapping(value = "seeStudentDetails/{id}", method = RequestMethod.GET)
    public Student getById(@PathVariable(value = "id") Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(value = "/studentsList", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/updateStudentAccount", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student) {
        Student existingStudent = studentService.getById(student.getStudentId());
        if (existingStudent.getStudentId() != null) {
            student.setStudentId(existingStudent.getStudentId());
            return studentService.updateStudent(student);
        }
        return null;
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudent(id);
    }


}
