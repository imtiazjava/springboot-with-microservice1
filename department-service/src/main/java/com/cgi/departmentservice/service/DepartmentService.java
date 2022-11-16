package com.cgi.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.departmentservice.entity.Department;
import com.cgi.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return this.departmentRepository.save(department);
	}

	public Department getDepartmentById(Long id) {
		 
		Optional<Department> op=this.departmentRepository.findById(id);
	
		if(op.isPresent()) {
			return op.get();
		}else {
			return null;
		}
	}
}
