package com.studentmanagement.studentmanagement.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class Report {
    @Id
    public Long id;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Enrollment> enrollments;

    public Report() {
    }

    public Report(Long id, List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        this.id = id;
    }
    public Report(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public Report(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public Report(Long id, List<Enrollment> enrollments) {
        this.id = id;
        this.enrollments = enrollments;
    }
    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
    public static ReportBuilder builder() {
        return new ReportBuilder();
    }


    public static class ReportBuilder{
        private Long id;
        private  List<Student> students;
        private  List<Teacher> teachers;
        private List<Enrollment>enrollments;

        public ReportBuilder() {

        }


        public ReportBuilder setTeachers(List<Teacher> teachers) {
            this.teachers = teachers;
            return this;
        }


        public ReportBuilder setStudents(List<Student> students) {
            this.students = students;
            return this;
        }

        public ReportBuilder setId(Long id) {
            this.id = id;
            return this;
        }
        public ReportBuilder setEnrollments(List<Enrollment> enrollments) {
            this.enrollments = enrollments;
            return this;
        }

        public Report buildUsersReport(){
            return new Report(id, students, teachers);
        }

        public Report buildEnrollmentsReport(){
            return new Report(id, enrollments);
        }

    }
}
