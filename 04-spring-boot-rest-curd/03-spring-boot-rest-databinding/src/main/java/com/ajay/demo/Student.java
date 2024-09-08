package com.ajay.demo;

import java.util.Arrays;

public class Student {
	private String firstName;

	private String lastName;

	private String email;
	private Boolean isActive;
	private Address address;
	String languages[];
	public Student() {
	}
	
	public Student(String firstName, String lastName, String email, Boolean isActive, Address address,
			String[] languages) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.isActive = isActive;
		this.address = address;
		this.languages = languages;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", isActive="
				+ isActive + ", address=" + address + ", languages=" + Arrays.toString(languages) + "]";
	}

}
