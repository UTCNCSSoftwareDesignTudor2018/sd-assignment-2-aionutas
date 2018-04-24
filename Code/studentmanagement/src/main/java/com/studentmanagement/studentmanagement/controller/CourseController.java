package com.studentmanagement.studentmanagement.controller;


import com.studentmanagement.studentmanagement.model.entity.Course;
import com.studentmanagement.studentmanagement.model.entity.Student;
import com.studentmanagement.studentmanagement.service.CourseService;
import com.studentmanagement.studentmanagement.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@Api(description = "Courses")
@RestController
@RequestMapping("/course")


public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    public Course addStudent(@RequestBody Course course) {
        if (course.getCourseId() == null) {
            return courseService.addCourse(course);
        }
        return null;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }


    @RequestMapping(value = "seeCourse/{id}", method = RequestMethod.GET)
    public Course getById(@PathVariable(value = "id") BigInteger id) {
        return courseService.getById(id);
    }
}
