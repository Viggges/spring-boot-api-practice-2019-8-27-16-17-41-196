package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tw.apistackbase.model.Employee;

@Service
public class EmployeeService {
	private List<Employee> employeesList;
	public EmployeeService() {
		employeesList=new ArrayList<Employee>() {{
			this.add(new Employee("小张", "男", "002"));
			this.add(new Employee("小明", "男", "001"));
		}};
	}
	
	public List<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		return this.employeesList;
	}

	public Employee selectEmployeeById(String employeeId) {
		// TODO Auto-generated method stub、
		for(Employee employee:employeesList) {
			if(employee.getEmployeeId().equals(employeeId)) {
				return employee;
			}
		}
		return null;
	}


	public List<Employee> selectEmployeeListByGender(String gender) {
		// TODO Auto-generated method stub
		List<Employee> resultList = new ArrayList<Employee>();
		for(Employee employee:employeesList) {
			if(employee.getGander().equals(gender)) {
				resultList.add(employee);
			}
		}
		return resultList;
	}

	public List<Employee> selectDiviEmployeesList(String page, String pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeesList.add(employee);
	}

	public void updateEmployeeById(Employee employee) {
		// TODO Auto-generated method stub
		for(Employee employeeTemp:employeesList) {
			if(employee.getEmployeeId().equals(employee.getEmployeeId())) {
				employeesList.remove(employeeTemp);
				employeesList.add(employee);
			}
		}
	}

	public void deleteEmployeeById(Employee employee) {
		// TODO Auto-generated method stub
		this.employeesList.remove(employee);
	}

}
