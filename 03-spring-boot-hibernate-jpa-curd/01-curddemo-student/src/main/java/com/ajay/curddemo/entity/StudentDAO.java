package com.ajay.curddemo.entity;

import java.util.List;

public interface StudentDAO {
	void save(Student theStudent);

	Student findById(int id);

	List<Student> findAll();

	List<Student> findStudentByClause(String input);

	void updateSingleObject(Student s);

	void updateMultipleObject(String updatedname,String firstname);

	void delete(int id);
}
