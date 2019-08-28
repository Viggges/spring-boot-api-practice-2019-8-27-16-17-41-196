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
import com.tw.apistackbase.service.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyCtrl {
	@Autowired
	CompanyService companyService;

	@GetMapping()
	public List<Company> selectAllcompany() {
		return companyService.getCompanyList();
	}

	@GetMapping("/{companyId}")
	public Company selectCompanyById(@PathVariable String companyId) {
		return companyService.selectCompanyById(companyId);
	}

	@GetMapping("/{companyId}/employees")
	public List<Employee> selectEmployeeListBycompanyId(@PathVariable String companyId) {
		return companyService.selectEmployeeListBycompanyId(companyId);
	}

//	@GetMapping()
//	public List<Company> selectDiviCompaniesList(@RequestParam(name = "page") String page, String pageSize) {
//		return companyService.selectDiviCompaniesList(page, pageSize);
//
//	}

	@PostMapping()
	public void addCompany(Company company) {
		companyService.addCompany(company);
	}

	@PutMapping()
	public void updateCompanyById(@PathVariable Company company) {
		companyService.updateCompanyById(company);
	}

	@DeleteMapping()
	public void deleteCompanyById(@PathVariable Company company) {
		companyService.deleteCompanyById(company);
	}
}
