package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;

import net.bytebuddy.asm.Advice.This;

@Service
public class CompanyService {
	private List<Company> companyList;

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	public CompanyService() {
		companyList = new ArrayList<Company>() {
			{
				this.add(new Company("001", new ArrayList<Employee>() {
					{
						this.add(new Employee("小明", "男", "001"));
						this.add(new Employee("小张", "男", "002"));
					}
				}, "三星"));
				this.add(new Company("002", new ArrayList<Employee>() {
					{
						this.add(new Employee("小明", "男", "001"));
						this.add(new Employee("小张", "男", "002"));
					}
				}, "华为"));
			}
		};
	}

	public Company selectCompanyById(String companyId) {
		// TODO Auto-generated method stub

		for (Company company : companyList) {
			if (company.getCompanyId().equals(companyId)) {
				return company;
			}
		}
		return null;
	}

	public List<Employee> selectEmployeeListBycompanyId(String companyId) {
		// TODO Auto-generated method stub
		for (Company company : companyList) {
			if (company.getCompanyId().equals(companyId)) {
				return company.getEmployeeList();
			}
		}
		return null;
	}

	public List<Company> selectDiviCompaniesList(String page, String pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		this.companyList.add(company);
	}

	public void updateCompanyById(Company company) {
		// TODO Auto-generated method stub
		for (Company companyTemp : companyList) {
			if (companyTemp.getCompanyId().equals(company.getCompanyId())) {
				companyList.remove(companyTemp);
				companyList.add(company);
			}
		}

	}

	public void deleteCompanyById(Company company) {
		// TODO Auto-generated method stub
		this.companyList.remove(company);
	}
}
