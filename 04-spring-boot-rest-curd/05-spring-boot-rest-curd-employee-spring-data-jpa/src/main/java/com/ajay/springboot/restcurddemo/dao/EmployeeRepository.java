package com.ajay.springboot.restcurddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.springboot.restcurddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
