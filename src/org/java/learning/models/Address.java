package org.java.learning.models;

public class Address {

	private String street;
	private Integer houseNumber;
	private String complement;
	private String district;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public Address(){}
	
	public Address(String street, Integer houseNumber, String city, String state, String country){
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Address(String street, Integer houseNumber, String complement, String district,
				   String city, String state, String zipCode, String country){
		this.street = street;
		this.houseNumber = houseNumber;
		this.complement = complement;
		this.district = district;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address: " + street + ", " + houseNumber + " - " + complement + " - " + district +  " - " + 
				zipCode + " - "	+ city + " - " + state + " / " + country;
	}
	
}
