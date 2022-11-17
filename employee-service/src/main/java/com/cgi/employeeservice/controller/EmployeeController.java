package com.cgi.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cgi.employeeservice.entity.Employee;
import com.cgi.employeeservice.service.EmployeeService;
import com.cgi.employeeservice.vo.Department;
import com.cgi.employeeservice.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println("inside the saveEmployee method");
		return this.employeeService.saveEmployee(employee);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getEmployeeAndDepartment(@PathVariable("id") Long id) {
		// first get the employee details based on id
		Employee employee = this.employeeService.getEmployeeById(id);
		if (employee != null) {
			// Get the department details from the DEPARTMENT-SERVICE by using RestTemplate
			Department department = this.restTemplate
					.getForObject("http://DEPARTMENT-SERVICE/department/" + employee.getDepartmentId(), Department.class);
			ResponseTemplateVO rt = new ResponseTemplateVO();
			if (employee != null && department != null) {
				rt.setEmployee(employee);
				rt.setDepartment(department);
				return rt;
			} else {
				return new ResponseTemplateVO();
			}
		} else {
			return new ResponseTemplateVO();
		}
	}

}
