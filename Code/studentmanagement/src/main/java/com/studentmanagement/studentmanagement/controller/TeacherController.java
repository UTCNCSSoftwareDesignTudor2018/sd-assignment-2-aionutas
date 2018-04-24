package com.studentmanagement.studentmanagement.controller;

import com.studentmanagement.studentmanagement.model.entity.Course;
import com.studentmanagement.studentmanagement.model.entity.Student;
import com.studentmanagement.studentmanagement.model.entity.Teacher;
import com.studentmanagement.studentmanagement.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@Api(description = "Teacher Side")
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/addTeacher", method = RequestMethod.POST)
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        if (teacher.getTeacherId() == null) {
            return teacherService.addTeacher(teacher);
        }
        return null;
    }

    @RequestMapping(value = "seeTeacherDetails/{id}", method = RequestMethod.GET)
    public Teacher getById(@PathVariable(value = "id") BigInteger id) {
        return teacherService.getById(id);
    }

    @RequestMapping(value = "/teachersList", method = RequestMethod.GET)
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @RequestMapping(value = "/updateTeacherAccount", method = RequestMethod.PUT)
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        Teacher existingTeacher = teacherService.getById(teacher.getTeacherId());
        if (existingTeacher.getTeacherId() != null) {
            teacher.setTeacherId(existingTeacher.getTeacherId());
            return teacherService.updateTeacher(teacher);
        }
        return null;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable(value = "id") BigInteger id) {
        teacherService.deleteTeacher(id);
    }


}
