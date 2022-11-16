package com.cgi.mg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cgi.mg.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department,Long>{

}
