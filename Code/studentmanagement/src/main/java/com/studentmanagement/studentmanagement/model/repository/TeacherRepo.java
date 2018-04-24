package com.studentmanagement.studentmanagement.model.repository;

import com.studentmanagement.studentmanagement.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, BigInteger> {

    public Teacher getByName(String name);
}
