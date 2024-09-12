package com.ajay.springboot.restcurddemo.dao;



import java.util.List;

import com.ajay.springboot.restcurddemo.entity.Employee;



public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById( int theId);
    Employee save(Employee employee);
    void delete(int theId);

}