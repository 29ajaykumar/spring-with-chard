package com.ajay.springboot.restcurddemo.service;

import java.util.List;

import com.ajay.springboot.restcurddemo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	Employee findById( int theId);
    Employee save(Employee employee);
    void delete(int theId);
}
