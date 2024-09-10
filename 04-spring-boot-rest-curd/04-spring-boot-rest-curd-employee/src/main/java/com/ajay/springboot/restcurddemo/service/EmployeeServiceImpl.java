package com.ajay.springboot.restcurddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.springboot.restcurddemo.dao.EmployeeDAO;
import com.ajay.springboot.restcurddemo.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	@Override
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}

}
