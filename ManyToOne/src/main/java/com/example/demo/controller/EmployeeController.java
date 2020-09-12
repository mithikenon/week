package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeSrevice;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeSrevice employeeService;

	@GetMapping(value="/employee")
	public List<Employee> getEmployee() {
		return employeeService.getEmployee();
	}
	@PostMapping(value="/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	@GetMapping(value="/employee/(id)")
	public Employee getEmployeeById(@PathVariable int id){
		return employeeService.getEmployeeById(id);
	}
	@DeleteMapping(value="/employee/(id)")
	public void deleteEmployeeById(@PathVariable int id){
		employeeService.deleteEmployee(id);
	}

}
