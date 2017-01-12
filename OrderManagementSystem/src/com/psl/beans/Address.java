package com.psl.beans;

public class Address {

	private String street;
	private String city;
	private String state;
	private Integer zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String street, String city, String state, Integer zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	@Override
	public String toString() {
		return street + "," + city + "," + state + "," + zip ;
	}
	
	
}
