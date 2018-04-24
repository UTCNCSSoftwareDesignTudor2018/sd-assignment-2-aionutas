package com.studentmanagement.studentmanagement.model.repository;

import com.studentmanagement.studentmanagement.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query("SELECT s from Student s where s.name = :name")
    public List<Student> findAllByName(@Param("name")String name);
}
