package com.studentmanagement.studentmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger courseId;
    private String courseName;
    private String examLevel;
    //@ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "teacher_course", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "teacher_id"))
//    private Set<Teacher> teachers;

    public BigInteger getCourseId() {
        return courseId;
    }

    public void setCourseId(BigInteger courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getExamLevel() {
        return examLevel;
    }

    public void setExamLevel(String examLevel) {
        this.examLevel = examLevel;
    }

//    public Set<Teacher> getTeachers() {
//        return teachers;
//    }
//
//
//    public void setTeachers(Set<Teacher> teachers) {
//        this.teachers = teachers;
//    }


    public Course(BigInteger courseId,String courseName,String examLevel) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.examLevel = examLevel;
    }

    public Course() {
    }

    public Course(String courseName, String examLevel) {
        this.courseName = courseName;
        this.examLevel = examLevel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (courseId != null ? !courseId.equals(course.courseId) : course.courseId != null) return false;
        if (courseName != null ? !courseName.equals(course.courseName) : course.courseName != null) return false;
        return examLevel != null ? examLevel.equals(course.examLevel) : course.examLevel == null;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (examLevel != null ? examLevel.hashCode() : 0);
        return result;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private BigInteger courseId;
        private String courseName;
        private String examLevel;
        private Set<Teacher> teachers;

        public Builder() {
        }

        public BigInteger getCourseId() {
            return courseId;
        }

        public void setCourseId(BigInteger courseId) {
            this.courseId = courseId;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getExamLevel() {
            return examLevel;
        }

        public void setExamLevel(String examLevel) {
            this.examLevel = examLevel;
        }

        public Set<Teacher> getTeachers() {
            return teachers;
        }

        public void setTeachers(Set<Teacher> teachers) {
            this.teachers = teachers;
        }

        public Course build(){
            return new Course(courseId, courseName, examLevel);
        }
    }
}
