package com.ajay.springboot.restcurddemo.service;

import java.util.List;

import com.ajay.springboot.restcurddemo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
}
