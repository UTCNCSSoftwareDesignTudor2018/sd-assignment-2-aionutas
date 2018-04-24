package com.studentmanagement.studentmanagement.model.repository;

import com.studentmanagement.studentmanagement.model.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, BigInteger>{

}
