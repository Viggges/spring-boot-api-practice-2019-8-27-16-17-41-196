package com.tw.apistackbase.model;

import java.util.List;

public class Company {
	private String companyName;
	private List<Employee> employeeList;
	private String companyId;
	public Company(String companyName,List<Employee> employeeList,String companyId) {
		this.companyId=companyId;
		this.companyName=companyName;
		this.employeeList=employeeList;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
