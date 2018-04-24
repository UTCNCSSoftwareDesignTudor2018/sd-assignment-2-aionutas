package com.studentmanagement.studentmanagement.model.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger enrollmentId;
    private String studentName;
    private String courseName;

    public Enrollment() {
    }

    public Enrollment(BigInteger enrollmentId, String studentName, String courseName) {
        this.enrollmentId = enrollmentId;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public Enrollment(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public BigInteger getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(BigInteger enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enrollment that = (Enrollment) o;

        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        return courseName != null ? courseName.equals(that.courseName) : that.courseName == null;
    }

    @Override
    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
