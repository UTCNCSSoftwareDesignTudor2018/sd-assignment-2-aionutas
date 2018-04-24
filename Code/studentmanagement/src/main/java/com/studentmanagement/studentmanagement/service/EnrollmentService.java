package com.studentmanagement.studentmanagement.service;


import com.studentmanagement.studentmanagement.model.repository.CourseRepo;
import com.studentmanagement.studentmanagement.model.repository.EnrollmentRepo;
import com.studentmanagement.studentmanagement.model.repository.StudentRepo;
import com.studentmanagement.studentmanagement.model.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    EnrollmentRepo enrollmentRepo;
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CourseRepo courseRepo;

    public Enrollment addEnrollment(Enrollment enrollment){
        if(studentRepo.findAllByName(enrollment.getStudentName()).size()!=0 && courseRepo.findAllByName(enrollment.getCourseName()).size()!=0){
        return enrollmentRepo.save(enrollment);}

        else {
            System.out.println("Could not enroll. Student or course do not exist in db.");
            return null;
        }
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }
}
