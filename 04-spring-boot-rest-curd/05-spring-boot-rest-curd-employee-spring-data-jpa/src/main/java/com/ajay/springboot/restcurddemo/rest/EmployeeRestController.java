package com.ajay.springboot.restcurddemo.rest;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.springboot.restcurddemo.entity.Employee;
import com.ajay.springboot.restcurddemo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // quick and dirty: inject employee dao (use constructor injection)
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
    @GetMapping("/employees/{theId}")
    public Employee findById(@PathVariable("theId") int  theId) {
    	Employee emp = employeeService.findById(theId);
    	if(emp==null)
    		throw new RuntimeException("Employee not found for id: "+theId);
        return emp;
    }
    
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
    	employee.setId(0);
    	Employee dbEmp =  employeeService.save(employee);
        return dbEmp;
    }
    
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
    	Employee dbEmp =  employeeService.save(employee);
        return dbEmp;
    }
    
    @DeleteMapping("/employees/{theId}")
    public String deleteEmployee(@PathVariable("theId") int  theId) {
    	Employee emp = employeeService.findById(theId);
    	if(emp==null)
    		throw new RuntimeException("Employee not found for id: "+theId);
    	employeeService.delete(theId);
        return "Employee deleted id : "+theId;
    }

}







