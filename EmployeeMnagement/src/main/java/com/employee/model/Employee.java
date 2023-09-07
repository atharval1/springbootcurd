package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeIdLong;
	private String name;
	private Long phoneNumber;
	private String email;

	public Employee() {
		super();
	}

	public Employee(Long employeeIdLong, String name, Long phoneNumber, String email) {
		super();
		this.employeeIdLong = employeeIdLong;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Long getEmployeeIdLong() {
		return employeeIdLong;
	}

	public void setEmployeeIdLong(Long employeeIdLong) {
		this.employeeIdLong = employeeIdLong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
