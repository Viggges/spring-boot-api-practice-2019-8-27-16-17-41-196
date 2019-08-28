package com.tw.apistackbase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeCtrl {
	@Autowired
	EmployeeService employeeService ;
	
	@GetMapping()
	public List<Employee> selectAllEmployee(){
		return employeeService.selectAllEmployee();
	}
	@GetMapping("/{employeeId}")
	public Employee selectemployeeById(@PathVariable String employeeId) {
		return employeeService.selectEmployeeById(employeeId);
	}

	@GetMapping("/{employeeId}/employees")
	public List<Employee> selectEmployeeListByemployeeId(@PathVariable String employeeId) {
		return employeeService.selectEmployeeListByGender(employeeId);
	}

//	@GetMapping()
//	public List<Employee> selectDiviCompaniesList(@RequestParam(name = "page") String page, String pageSize) {
//		return employeeService.selectDiviEmployeesList(page, pageSize);
//
//	}

	@PostMapping()
	public void addemployee(Employee employee) {
		employeeService.addEmployee(employee);
	}

	@PutMapping()
	public void updateemployeeById(@PathVariable Employee employee) {
		
		employeeService.updateEmployeeById(employee);
	}

	@DeleteMapping()
	public void deleteemployeeById(@PathVariable Employee employee) {
		employeeService.deleteEmployeeById(employee);
	}
}
