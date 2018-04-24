package com.studentmanagement.studentmanagement.service;


import com.studentmanagement.studentmanagement.model.repository.CourseRepo;
import com.studentmanagement.studentmanagement.model.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course getById(BigInteger id) {
        return courseRepo.getOne(id);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}
