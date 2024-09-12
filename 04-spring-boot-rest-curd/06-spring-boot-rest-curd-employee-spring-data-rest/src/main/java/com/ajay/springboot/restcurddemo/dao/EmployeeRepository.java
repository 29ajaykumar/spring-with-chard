package com.ajay.springboot.restcurddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ajay.springboot.restcurddemo.entity.Employee;

@RepositoryRestResource(path="numbers")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
