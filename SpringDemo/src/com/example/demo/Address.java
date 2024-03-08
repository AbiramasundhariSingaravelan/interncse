package com.example.demo;

public class Address {

	private int dno;
	private String street;
	private String city;
	private String state;
	private String country;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address(int dno, String street, String city, String state, String country) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String toString()
	{
		return "Dno:"+dno+"\nStreet:"+street+"\nCity:"+city+"\nState:"+state+"\nCountry"+country;
	}
}
