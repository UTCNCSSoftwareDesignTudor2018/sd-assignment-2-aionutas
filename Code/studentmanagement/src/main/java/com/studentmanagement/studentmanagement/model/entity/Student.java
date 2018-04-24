package com.studentmanagement.studentmanagement.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student{

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentId")
    private Long studentId;

    private String address;
    private int identityCardNumber;
    private int personalNumericalCode;
    private String username;

    public Student() {
    }

    public Student(String name, Long studentId, String address, int identityCardNumber, int personalNumericalCode, String username) {
        this.name = name;
        this.studentId = studentId;
        this.address = address;
        this.identityCardNumber = identityCardNumber;
        this.personalNumericalCode = personalNumericalCode;
        this.username = username;
    }

    public Student(String name, String address, int identityCardNumber, int personalNumericalCode, String username) {
        this.name = name;
        this.address = address;
        this.identityCardNumber = identityCardNumber;
        this.personalNumericalCode = personalNumericalCode;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPersonalNumericalCode() {
        return personalNumericalCode;
    }

    public void setPersonalNumericalCode(int personalNumericalCode) {
        this.personalNumericalCode = personalNumericalCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (identityCardNumber != student.identityCardNumber) return false;
        if (personalNumericalCode != student.personalNumericalCode) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        return (username != null ? !username.equals(student.username) : student.username != null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (studentId ^ (studentId >>> 32));
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + identityCardNumber;
        result = 31 * result + personalNumericalCode;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
