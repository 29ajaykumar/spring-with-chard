package com.ajay.springboot.restcurddemo.dao;



import java.util.List;

import com.ajay.springboot.restcurddemo.entity.Employee;



public interface EmployeeDAO {

    List<Employee> findAll();

}