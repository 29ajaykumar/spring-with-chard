package com.ajay.springboot.restcurddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ajay.springboot.restcurddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Employee> findAll() {

        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the results
        return employees;
    }


	@Override
	public Employee findById(int theId) {
		Employee emp = entityManager.find(Employee.class, theId);
		return emp;
	}


	@Override
	public Employee save(Employee employee) {
		Employee emp = entityManager.merge(employee);
		return emp;
	}


	@Override
	public void delete(int theId) {
		Employee emp = entityManager.find(Employee.class, theId);
		entityManager.remove(emp);
		
	}
}