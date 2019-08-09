package com.harshit.entity;

import java.sql.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String employeeAddress;
	private String dateOfBirth;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmpId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", empId=");
		builder.append(employeeId);
		builder.append(", employeeAddress=");
		builder.append(employeeAddress);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}
	public Employee(String firstName, String lastName, String empId, String employeeAddress, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = empId;
		this.employeeAddress = employeeAddress;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Employee() {
	}
	
	
}
