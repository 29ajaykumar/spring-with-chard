package com.ajay.springboot.restcurddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.springboot.restcurddemo.dao.EmployeeDAO;
import com.ajay.springboot.restcurddemo.entity.Employee;

import jakarta.transaction.Transactional;
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
	@Override
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}
	@Override
	@Transactional
	public Employee save(Employee employee) {
		Employee emp = employeeDAO.save(employee);
		return emp;
	}
	@Override
	@Transactional
	public void delete(int theId) {
		employeeDAO.delete(theId);
		
	}

}
