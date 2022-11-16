package com.cgi.mg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.mg.entity.Department;
import com.cgi.mg.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/save")
	public Department storeDepartment(@RequestBody Department department)
	{
		return this.departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long id)
	{
			Department d=this.departmentService.getDepartmentById(id);
			System.out.println(d);
				return d;
	}
	
	@GetMapping("/")
	public List<Department> getDepartments()
	{
			return this.departmentService.getDepartments();
	}
	
}
