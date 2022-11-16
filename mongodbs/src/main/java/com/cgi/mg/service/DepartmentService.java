package com.cgi.mg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.mg.entity.Department;
import com.cgi.mg.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return this.departmentRepository.save(department);
	}

	public Department getDepartmentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Department> d=this.departmentRepository.findById(id);
		if(d.isPresent()) {
			return d.get();
		}else {
			return null;
		}
	}

	public List<Department> getDepartments() {
		return this.departmentRepository.findAll();
	}
}
