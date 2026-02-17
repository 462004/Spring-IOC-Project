package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private int cid;
	
	private String companyname;
	
	@Autowired
	private List<Employee> empList;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", companyname=" + companyname + ", empList=" + empList + "]";
	}
	
	

}
