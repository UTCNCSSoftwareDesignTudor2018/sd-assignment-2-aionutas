package com.studentmanagement.studentmanagement.model.repository;


import com.studentmanagement.studentmanagement.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, BigInteger> {
    @Query("SELECT c from Course c where c.courseName = :name")
    public List<Course> findAllByName(@Param("name")String name);
}
