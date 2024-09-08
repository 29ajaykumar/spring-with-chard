package com.ajay.demo;

public class Address {

	private String state;
	private String city;
	private Long pincode;
	public Address() {
		
	}
	public Address(String state, String city, Long pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
