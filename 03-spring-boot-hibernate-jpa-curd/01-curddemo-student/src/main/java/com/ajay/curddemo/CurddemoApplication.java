package com.ajay.curddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ajay.curddemo.entity.Student;
import com.ajay.curddemo.entity.StudentDAO;

@SpringBootApplication
public class CurddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao) {
		return runner->{
			System.out.println("Hello-World");
			createStudent(studentDao);
			findStudent(studentDao);
			findAll(studentDao);
			findStudentByClause(studentDao);
			updateSingleObject(studentDao);
			updateMultipleObject(studentDao);
			deleteObject(studentDao);
			
		};
	}

	private void deleteObject(StudentDAO studentDao) {
		int id = (int)(Math.random()*10);
		
		studentDao.delete(id);
		
	}

	private void updateSingleObject(StudentDAO studentDao) {
		System.out.println("Updating single object");
		int id = (int)(Math.random()*10);
		Student s = studentDao.findById(id);
		System.out.println("Before Update: "+s);
		s.setFirstName("Vijay");
		studentDao.updateSingleObject(s);
		s = studentDao.findById(id);
		System.out.println("After Update:"+id);
		System.out.println(s);
		
	}
	private void updateMultipleObject(StudentDAO studentDao) {
		System.out.println("In updateMultipleObject before update");
		String firstname="vijay";
		String updatedname="Ajay";
		System.out.println("Befoure Update FindStudentByClause Student Presented In Records: "+firstname);
		List<Student> ls = studentDao.findStudentByClause(firstname);
		ls.forEach(s->{
			System.out.println(s);
		});
		studentDao.updateMultipleObject(updatedname,firstname);
		studentDao.findStudentByClause(updatedname);
		System.out.println("After Update FindStudentByClause Student Presented In Records: "+updatedname);
		ls = studentDao.findStudentByClause(updatedname);
		ls.forEach(s->{
			System.out.println(s);
		});
		
	}

	private void findAll(StudentDAO studentDao) {
		List<Student> ls = studentDao.findAll();
		System.out.println("List Of All Student Presented In Records");
		ls.forEach(s->{
			System.out.println(s);
		});
		
	}
	private void findStudentByClause(StudentDAO studentDao) {
		List<Student> ls = studentDao.findStudentByClause("Ajay");
		System.out.println("FindStudentByClause Student Presented In Records");
		ls.forEach(s->{
			System.out.println(s);
		});
		
	}

	private void findStudent(StudentDAO studentDao) {
		int id = (int)(Math.random()*10);
		Student s = studentDao.findById(id);
		System.out.println("Feched Student id:"+id);
		System.out.println(s);
		
	}

	private void createStudent(StudentDAO studentDao) {
		System.out.println("Creating object to student....");
		Student s = new Student("ajay","kumar","ajay@kumar.com");
		System.out.println("Saving student ...");
		studentDao.save(s);
		System.out.println("Student object saved!");
		System.out.println("Saved student ID:"+s.getId());
		
	}
}
