package com.studentmanagement.studentmanagement.model.repository;

import com.studentmanagement.studentmanagement.model.entity.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends MongoRepository<Report, Long> {

}
