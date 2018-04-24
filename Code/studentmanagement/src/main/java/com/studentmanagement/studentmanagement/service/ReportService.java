package com.studentmanagement.studentmanagement.service;


import com.studentmanagement.studentmanagement.model.repository.EnrollmentRepo;
import com.studentmanagement.studentmanagement.model.repository.ReportRepo;
import com.studentmanagement.studentmanagement.model.repository.StudentRepo;
import com.studentmanagement.studentmanagement.model.repository.TeacherRepo;
import com.studentmanagement.studentmanagement.model.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Random;


@EnableMongoRepositories(basePackageClasses = ReportRepo.class)
@Configuration
public class ReportService {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    TeacherRepo teacherRepo;
    @Autowired
    EnrollmentRepo enrollmentRepo;
    @Autowired
    ReportRepo reportRepo;
    public Report showReport(String type) {

        if(type.equals("users")) {
            Report report = Report.builder()
                    .setId(new Random().nextLong()).setEnrollments(enrollmentRepo.findAll()).setStudents(studentRepo.findAll())
                    .setTeachers(teacherRepo.findAll())
                    .buildUsersReport();
            return reportRepo.save(report);


        }
        if(type.equals("enrollments")){
            Report report = Report.builder()
                    .setId(new Random().nextLong()).setEnrollments(enrollmentRepo.findAll()).setEnrollments(enrollmentRepo.findAll())
                    .buildEnrollmentsReport();
            return reportRepo.save(report);
        }
        else{
            System.out.println("Could not create report");
            return null;
        }
    }
}
