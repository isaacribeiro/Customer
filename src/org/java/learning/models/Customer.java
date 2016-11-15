package org.java.learning.models;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	
	private String name;
	private LocalDate birthDate;
	private List<Address> addresses;
	private String maritalStatus;
	
	public Customer(){}
	
	public Customer(String name){
		this.name = name;
	}
	
	public Customer(String name, LocalDate birthDate, String maritalStatus){
		this.name = name;
		this.birthDate = birthDate;
		this.maritalStatus = maritalStatus;
	}
	
	public Customer(String name, LocalDate birthDate, String maritalStatus, List<Address> addresses){
		this.name = name;
		this.birthDate = birthDate;
		this.maritalStatus = maritalStatus;
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Birth Date: " + birthDate + ", Marital Status: " + maritalStatus;
	}	

}
