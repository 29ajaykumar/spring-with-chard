package com.ajay.springboot.restcurddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.springboot.restcurddemo.dao.EmployeeRepository;
import com.ajay.springboot.restcurddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);

		Employee emp = null;
		if (result.isPresent())
			emp = result.get();
		else
			throw new RuntimeException("Did not find employee to the id: "+theId);
		return emp;
	}

	@Override
	public Employee save(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	public void delete(int theId) {
		employeeRepository.deleteById(theId);

	}

}
