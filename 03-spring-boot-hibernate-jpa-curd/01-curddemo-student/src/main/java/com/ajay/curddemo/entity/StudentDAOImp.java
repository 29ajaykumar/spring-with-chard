package com.ajay.curddemo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImp implements StudentDAO {

	private EntityManager entityManager;
	
	@Autowired
	public StudentDAOImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);

	}
	
	@Override
	public Student findById(int id) {
		return entityManager.find(Student.class, id);

	}


	@Override
	public List<Student> findAll() {
		TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);
		return theQuery.getResultList();
	}
  

	@Override
	public List<Student> findStudentByClause(String input) {
		TypedQuery<Student> theQuery = entityManager.createQuery("from Student where firstName=:theData", Student.class);
		theQuery.setParameter("theData", input);
		return theQuery.getResultList();
	}


	@Override
	@Transactional
	public void updateSingleObject(Student s) {
		entityManager.merge(s);
		
	}


	@Override
	@Transactional
	public void updateMultipleObject(String updatedname,String firstname) {
		
		Query q = entityManager.createQuery("UPDATE Student SET firstName=:theData1 WHERE firstName=:theData2");
		q.setParameter("theData1", updatedname);
		q.setParameter("theData2", firstname);
		int rowsUpdated = q.executeUpdate();
		System.out.println("Total Updated Rows: "+rowsUpdated);
	}


	@Override
	@Transactional
	public void delete(int id ) {
		Student s = entityManager.find(Student.class,id);
		System.out.println("Deleting object");
		System.out.println(s);
		entityManager.remove(s);
		
	}

}
