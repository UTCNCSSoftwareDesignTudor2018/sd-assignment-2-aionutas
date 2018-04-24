package com.studentmanagement.studentmanagement.controller;

import com.studentmanagement.studentmanagement.model.entity.Enrollment;
import com.studentmanagement.studentmanagement.model.entity.Student;
import com.studentmanagement.studentmanagement.model.entity.Teacher;
import com.studentmanagement.studentmanagement.service.EnrollmentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "Enrollments")
@RestController
@RequestMapping("/enrollments")


public class EnrollmentController {
    @Autowired
    EnrollmentService enrollmentService;

    @RequestMapping(value="/addEnrollment",method = RequestMethod.POST)
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
            return enrollmentService.addEnrollment(enrollment);
    }
    @RequestMapping(value = "/enrollments", method = RequestMethod.GET)
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }


}
