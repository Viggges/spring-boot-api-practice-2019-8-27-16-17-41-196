package com.tw.apistackbase.model;

import java.util.List;

public class Employee {

	private String employeeName;
	private String gander;
	private String employeeId;

	public Employee(String employeeName, String gander, String employeeId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gander = gander;

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getGander() {
		return gander;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
