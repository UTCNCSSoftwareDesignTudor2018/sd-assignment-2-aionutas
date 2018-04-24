package com.studentmanagement.studentmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private BigInteger teacherId;
    private String name;
    private String address;
    private int identityCardNumber;
    private int personalNumericalCode;
    private String username;

    public Teacher(){}
    public Teacher(BigInteger teacherId, String name, String address, int identityCardNumber, int personalNumericalCode, String username) {
        this.teacherId = teacherId;
        this.name = name;
        this.address = address;
        this.identityCardNumber = identityCardNumber;
        this.personalNumericalCode = personalNumericalCode;
        this.username = username;
    }

    public BigInteger getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigInteger teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        Teacher teacher = (Teacher) o;

        if (identityCardNumber != teacher.identityCardNumber) return false;
        if (personalNumericalCode != teacher.personalNumericalCode) return false;
        if (teacherId != null ? !teacherId.equals(teacher.teacherId) : teacher.teacherId != null) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
        if (address != null ? !address.equals(teacher.address) : teacher.address != null) return false;
        return username != null ? username.equals(teacher.username) : teacher.username == null;
    }

    @Override
    public int hashCode() {
        int result = teacherId != null ? teacherId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + identityCardNumber;
        result = 31 * result + personalNumericalCode;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", personalNumericalCode=" + personalNumericalCode +
                ", username='" + username + '\'' +
                '}';
    }
}
