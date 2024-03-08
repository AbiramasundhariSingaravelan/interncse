package com.example.demo;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String dept;
	private Address address;
	private List<String> courses;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String dept, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("DEPT: "+dept);
		System.out.println("Address: "+address);
		System.out.println("Courses:" +courses);
	}
}
